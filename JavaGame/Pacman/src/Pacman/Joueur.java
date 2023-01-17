/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman;

import iut.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static Pacman.TypeMouvement.BOTTOM;
import static Pacman.TypeMouvement.LEFT;
import static Pacman.TypeMouvement.RIGHT;
import static Pacman.TypeMouvement.TOP;
import javax.swing.JOptionPane;


/**
 * Classe concernant le PacMan controlé par le joueur 
 * 
 * @author 3CD Industries le Retour
 */
public class Joueur extends iut.BoxGameItem implements KeyListener {
    
    private double vitesse = 1;
    private int score=0;
    private TypeMouvement move = null;

    
    /**
     * Constructeur de la classe
     * @param g qui correspond au jeu auquel appartient le PacMan
     * @param x qui correspond à la coordonnée en abscisses du PacMan dans la fenêtre de jeu 
     * @param y qui correspond à la coordonnée en ordonnées du PacMan dans la fenêtre de jeu 
     */
    public Joueur(Game g, int x, int y) {
        super(g,"joueur", x, y);
        this.changeSprite("p1");
        this.score = 0;
    }
    
    
    /**
     * Opération concernant les collisions entre le joueur et un autre item du jeu
     * @param gi qui correspond à l'item entrant en collision avec le joueur 
     */
    @Override
    public void collideEffect(GameItem gi) {
        switch(gi.getItemType()){
            case "Mur" :
                switch(this.move){
                    case RIGHT:
                        this.moveXY(this.vitesse*(-3),0);
                        break;
                    case LEFT:
                        this.moveXY(this.vitesse*(+3),0);
                        break;
                    case TOP:
                        this.moveXY(0,this.vitesse*(+3));
                        break;
                    case BOTTOM:
                       this.moveXY(0,this.vitesse*(-3));
                       break;                        
                } 
                break;
                
            case "Fantome" : 
                gi.getGame().die();
                JOptionPane.showMessageDialog(null, "Mince, vous vous êtes fait attraper ! Réessayez encore !");
                break;
                
            case "Miam" : 
                this.score += 1;
                if (this.score== 259){
                    gi.getGame().stop();
                    JOptionPane.showMessageDialog(null, "Bravo, vous avez gagné ! Quel champion !");
                }
                System.out.println(this.score);
                break;
                
            case "Bonus" : 
                this.vitesse += 0.4;
                break;     
        }  
    }
    

    /**
     * Opération permettant de récupérer le type de l'item 
     * @return le type de l'item (içi Joueur)
     */
    @Override
    public String getItemType() {
        return "Joueur"; 
    }
    
    
    /**
     * Opération implémentant l'évolution automatique du joueur au fil du temps
     * @param l 
     */
    @Override
    public void evolve(long l) {
    }
    
    
    /**
     * Opération permettant de déterminer une action pour le joueur lorque le caractère unicode d'une touche du clavier est envoyé à l'entrée système
     * @param ke qui correspond à l'évenement survenant depuis le clavier
     */
    @Override
    public void keyTyped(KeyEvent ke) { 
    }
    
    
    /**
     * Opération permettant de déterminer une action pour le joueur lorsqu'une touche du clavier est appuyée
     * @param ke qui correspond à l'évenement survenant depuis le clavier
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        try{
            switch(ke.getKeyCode())
            {
                case KeyEvent.VK_LEFT:
                    this.changeSprite("p3");
                    if (this.getLeft()>0){
                        this.moveXY(this.vitesse*(-2),0);
                        this.move = LEFT;
                    }
                    break;
       
                case KeyEvent.VK_RIGHT:
                    this.changeSprite("p2");
                    if (this.getRight()<this.getGame().getWidth()){
                        this.moveXY(this.vitesse*(+2),0);
                        this.move = RIGHT;
                    }
                    break;
                    
                case KeyEvent.VK_UP:
                    this.changeSprite("p4");
                    if (this.getTop()>0){
                        this.moveXY(0,this.vitesse*(-2));
                        this.move = TOP;
                    }
                    break;
                    
                case KeyEvent.VK_DOWN:
                    this.changeSprite("p5");
                    if (this.getBottom()<this.getGame().getHeight()){
                        this.moveXY(0,this.vitesse*(+2));
                        this.move = BOTTOM;
                    }
                    break;
            }
        }
        catch (Exception x){}
    }

    
    /**
     * Opération permettant de déterminer une action pour le joueur lorsqu'une touche du clavier est relâchée
     * @param ke qui correspond à l'évenement survenant depuis le clavier
     */
    @Override
    public void keyReleased(KeyEvent ke) {  
    }

}
