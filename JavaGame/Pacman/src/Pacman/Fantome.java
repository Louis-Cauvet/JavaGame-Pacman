/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman;

import static Pacman.TypeMouvement.BOTTOM;
import static Pacman.TypeMouvement.LEFT;
import static Pacman.TypeMouvement.RIGHT;
import static Pacman.TypeMouvement.TOP;
import iut.Game;
import iut.GameItem;


/**
 * Classe concernant les fantômes présents dans le jeu
 * 
 * @author 3CD Industries le Retour
 */
public class Fantome extends iut.BoxGameItem{

    private double vitesse = 0.6;
    private String couleur = null;
    private TypeMouvement move = null;
    
    /**
     * Constructeur de la classe
     * @param g qui correspond au jeu auquel appartient le fantôme
     * @param x qui correspond à la coordonnée en abscisses du fantôme dans la fenêtre de jeu 
     * @param y qui correspond à la coordonnée en ordonnées du fantôme dans la fenêtre de jeu 
     * @param couleur qui correspond à la couleur de chaque fantôme
     */
    public Fantome(Game g, int x, int y, String couleur) {
        super(g,"fantome", x, y);
        this.couleur = couleur;
        switch(this.couleur){
                case "bleu":
                    this.move = LEFT;
                    break;
       
                case "rouge":
                    this.move = RIGHT;
                    break;
                    
                case "violet":
                    this.move = TOP;
                    break;
                    
                case "orange":
                    this.move = BOTTOM;
                    break;
            }
    }
    

    /**
     * Opération concernant les collisions entre un fantôme et un autre item du jeu
     * @param gi qui correspond à l'item entrant en collision avec le fantôme
     */
    @Override
    public void collideEffect(GameItem gi) {
        if(gi.getItemType() == "Mur"){
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
            this.changeMove();
            this.move(this.move);
        }
    }

    
    /**
     * Opération permettant de récupérer le type de l'item 
     * @return le type de l'item (içi Fantôme)
     */
    @Override
    public String getItemType() {
       return "Fantome";
    }

    
    /**
     * Opération implémentant l'évolution automatique du fantôme au fil du temps
     * @param l 
     */
    @Override
    public void evolve(long l) {
        move(this.move);          
    }
    
    
    /**
     * Opération décrivant le mouvement du fantôme selon le type passé en paramètres
     * @param type qui correspond au type de mouvement effectué par le fantôme
     */
    public void move(TypeMouvement type){
        switch(type){
            case LEFT:
                this.moveXY(this.vitesse*(-2),0);
                break;
                
            case RIGHT:
                this.moveXY(this.vitesse*(+2),0);
                break;
                
            case TOP:
                this.moveXY(0,this.vitesse*(-2));
                break;
                
            case BOTTOM:
                this.moveXY(0,this.vitesse*(+2));
                break;
        }
    }
    
    
    /**
     * Opération permettant de changer le type de mouvement du fantôme
     */
    private void changeMove(){
        switch(this.move){
            case RIGHT:
                int a  =(int) ((Math.random()*2));
                switch(a){
                    case 0:
                        this.move = TOP;
                        break;
                    case 1:
                        this.move = BOTTOM;
                        break;
                }
            break;
            
            case LEFT:
                int b  =(int) ((Math.random()*2));
                switch(b){
                    case 0:
                        this.move = TOP;
                        break;
                    case 1:
                        this.move = BOTTOM;
                        break;
                }
            break;
            
            case TOP:
                int c  =(int) ((Math.random()*2));
                switch(c){
                    case 0:
                        this.move = RIGHT;
                        break;
                    case 1:
                        this.move = LEFT;
                        break;
                }
            break;
            
            case BOTTOM:
                int d  =(int) ((Math.random()*2));
                switch(d){
                    case 0:
                        this.move = RIGHT;
                        break;
                    case 1:
                        this.move = LEFT;
                        break;
                }
            break;
        }
    }
    
}
    
   
