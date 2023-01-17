/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman;

import iut.GameItem;
import iut.Vector;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Classe concernant les fonctionnalités du jeu
 * 
 * @author 3CD Industries le Retour
 */
public class Pacman extends iut.Game {    
    
    private Joueur joueur;
    
    /**
     * Constructeur de la classe
     */
    public Pacman() {
        super(1024,768, "Pacman, 3CD Industries");
        GameItem.DRAW_HITBOX = true;
    }

    /**
     * Opértaion permettant de générer des items dans le jeu
     */
    @Override
    protected void createItems() {
      
        joueur = new Joueur(this, 415,260);
        this.addItem(joueur);
        
        
        Fantome fant1 = new Fantome(this, 62, 75,"bleu");
        fant1.changeSprite("f1");
        this.addItem(fant1);
        
        Fantome fant2 = new Fantome(this, 463,550,"rouge");
        fant2.changeSprite("f2");
        this.addItem(fant2);
        
        Fantome fant3 = new Fantome(this, 862, 509,"violet");
        fant3.changeSprite("f3");
        this.addItem(fant3);
        
        Fantome fant4 = new Fantome(this, 750, 59,"orange");
        fant4.changeSprite("f4");
        this.addItem(fant4);
        
        
        Bonus fusee = new Bonus(this, 862, 509);
        fusee.changeSprite("bonus");
        this.addItem(fusee);
       

        //Création des murs de la map//
        ArrayList<Mur> listMur = new ArrayList<>();
        
        for(int i = 0 ;i<20 ; i++){
            listMur.add(new Mur(this, 12+i*50,9));
            this.addItem(listMur.get(i));
        }
        
        for(int i = 0 ;i<14 ; i++){
            listMur.add(new Mur(this, 12,59 + i*50));
            this.addItem(listMur.get(i+20));
        }
        
        for(int i = 0 ;i<14 ; i++){
            listMur.add(new Mur(this, 962,59 + i*50));
            this.addItem(listMur.get(i+34));
        }
        
        for(int i = 0 ;i<18 ; i++){
            listMur.add(new Mur(this, 62+i*50,709));
            this.addItem(listMur.get(i+48));
        }
        
        listMur.add(new Mur(this,412 ,59));
        this.addItem(new Mur(this,412 ,59));
        
        listMur.add(new Mur(this,112 ,109));
        this.addItem(new Mur(this,112 ,109));
        
        listMur.add(new Mur(this,162 ,109));
        this.addItem(new Mur(this,162 ,109));
        
        listMur.add(new Mur(this,212 ,109));
        this.addItem(new Mur(this,212 ,109));
        
        listMur.add(new Mur(this,312 ,109));
        this.addItem(new Mur(this,312 ,109));
        
        listMur.add(new Mur(this,412 ,109));
        this.addItem(new Mur(this,412 ,109));
        
        listMur.add(new Mur(this,512 ,109));
        this.addItem(new Mur(this,512 ,109));
        
        listMur.add(new Mur(this,562 ,109));
        this.addItem(new Mur(this,562 ,109));
        
        listMur.add(new Mur(this,612 ,109));
        this.addItem(new Mur(this,612 ,109));
        
        listMur.add(new Mur(this,662 ,109));
        this.addItem(new Mur(this,662 ,109));
        
        listMur.add(new Mur(this,762 ,109));
        this.addItem(new Mur(this,762 ,109));
        
        listMur.add(new Mur(this,812 ,109));
        this.addItem(new Mur(this,812 ,109));
        
        listMur.add(new Mur(this,862 ,109));
        this.addItem(new Mur(this,862 ,109));
        
        listMur.add(new Mur(this,112 ,159));
        this.addItem(new Mur(this,112 ,159));
        
        listMur.add(new Mur(this,412 ,159));
        this.addItem(new Mur(this,412 ,159));
        
        listMur.add(new Mur(this,512 ,159));
        this.addItem(new Mur(this,512 ,159));
        
        listMur.add(new Mur(this,562 ,159));
        this.addItem(new Mur(this,562 ,159));
        
        listMur.add(new Mur(this,862 ,159));
        this.addItem(new Mur(this,862 ,159));
        
        listMur.add(new Mur(this,112 ,209));
        this.addItem(new Mur(this,112 ,209));
        
        listMur.add(new Mur(this,212 ,209));
        this.addItem(new Mur(this,212 ,209));
        
        listMur.add(new Mur(this,262 ,209));
        this.addItem(new Mur(this,262 ,209));
        
        listMur.add(new Mur(this,362 ,209));
        this.addItem(new Mur(this,362 ,209));
        
        listMur.add(new Mur(this,412 ,209));
        this.addItem(new Mur(this,412 ,209));
        
        listMur.add(new Mur(this,512 ,209));
        this.addItem(new Mur(this,512 ,209));
        
        listMur.add(new Mur(this,562 ,209));
        this.addItem(new Mur(this,562 ,209));
        
        listMur.add(new Mur(this,662 ,209));
        this.addItem(new Mur(this,662 ,209));
        
        listMur.add(new Mur(this,762 ,209));
        this.addItem(new Mur(this,762 ,209));
               
        listMur.add(new Mur(this,862 ,209));
        this.addItem(new Mur(this,862 ,209));
        
        listMur.add(new Mur(this,212 ,259));
        this.addItem(new Mur(this,212 ,259));
        
        listMur.add(new Mur(this,262 ,259));
        this.addItem(new Mur(this,262 ,259));
        
        listMur.add(new Mur(this,662 ,259));
        this.addItem(new Mur(this,662 ,259));
        
        listMur.add(new Mur(this,762 ,259));
        this.addItem(new Mur(this,762 ,259));

        listMur.add(new Mur(this,112 ,309));
        this.addItem(new Mur(this,112 ,309));
        
        listMur.add(new Mur(this,262 ,309));
        this.addItem(new Mur(this,262 ,309));
        
        listMur.add(new Mur(this,362 ,309));
        this.addItem(new Mur(this,362 ,309));
        
        listMur.add(new Mur(this,462 ,309));
        this.addItem(new Mur(this,462 ,309));
        
        listMur.add(new Mur(this,512 ,309));
        this.addItem(new Mur(this,512 ,309));
        
        listMur.add(new Mur(this,612 ,309));
        this.addItem(new Mur(this,612 ,309));
        
        listMur.add(new Mur(this,662 ,309));
        this.addItem(new Mur(this,662 ,309));
        
        listMur.add(new Mur(this,762 ,309));
        this.addItem(new Mur(this,762 ,309));
        
        listMur.add(new Mur(this,812 ,309));
        this.addItem(new Mur(this,812 ,309));
        
        listMur.add(new Mur(this,862 ,309));
        this.addItem(new Mur(this,862 ,309));
        
        listMur.add(new Mur(this,112 ,359));
        this.addItem(new Mur(this,112 ,359));
        
        listMur.add(new Mur(this,162 ,359));
        this.addItem(new Mur(this,162 ,359));
        
        listMur.add(new Mur(this,262 ,359));
        this.addItem(new Mur(this,262 ,359));
        
        listMur.add(new Mur(this,362 ,359));
        this.addItem(new Mur(this,362 ,359));
        
        listMur.add(new Mur(this,462 ,359));
        this.addItem(new Mur(this,462 ,359));
        
        listMur.add(new Mur(this,512 ,359));
        this.addItem(new Mur(this,512 ,359));
        
        listMur.add(new Mur(this,862 ,359));
        this.addItem(new Mur(this,862 ,359));
        
        listMur.add(new Mur(this,112 ,409));
        this.addItem(new Mur(this,112 ,409));
        
        listMur.add(new Mur(this,362 ,409));
        this.addItem(new Mur(this,362 ,409));
        
        listMur.add(new Mur(this,462 ,409));
        this.addItem(new Mur(this,462 ,409));
        
        listMur.add(new Mur(this,512 ,409));
        this.addItem(new Mur(this,512 ,409));
        
        listMur.add(new Mur(this,612 ,409));
        this.addItem(new Mur(this,612 ,409));
        
        listMur.add(new Mur(this,662 ,409));
        this.addItem(new Mur(this,662 ,409));
        
        listMur.add(new Mur(this,762 ,409));
        this.addItem(new Mur(this,762 ,409));  
        
        listMur.add(new Mur(this,212 ,459));
        this.addItem(new Mur(this,212 ,459));
        
        listMur.add(new Mur(this,262 ,459));
        this.addItem(new Mur(this,262 ,459));
        
        listMur.add(new Mur(this,362 ,459));
        this.addItem(new Mur(this,362 ,459));
        
        listMur.add(new Mur(this,462 ,459));
        this.addItem(new Mur(this,462 ,459));
        
        listMur.add(new Mur(this,512 ,459));
        this.addItem(new Mur(this,512 ,459));
        
        listMur.add(new Mur(this,612 ,459));
        this.addItem(new Mur(this,612 ,459));
        
        listMur.add(new Mur(this,762 ,459));
        this.addItem(new Mur(this,762 ,459));
        
        listMur.add(new Mur(this,812 ,459));
        this.addItem(new Mur(this,812 ,459));
        
        listMur.add(new Mur(this,862 ,459));
        this.addItem(new Mur(this,862 ,459));
        
        listMur.add(new Mur(this,912 ,459));
        this.addItem(new Mur(this,912 ,459));

        listMur.add(new Mur(this,112 ,509));
        this.addItem(new Mur(this,112 ,509));
        
        listMur.add(new Mur(this,212 ,509));
        this.addItem(new Mur(this,212 ,509));
        
        listMur.add(new Mur(this,262 ,509));
        this.addItem(new Mur(this,262 ,509));
        
        listMur.add(new Mur(this,712 ,509));
        this.addItem(new Mur(this,712 ,509));
        
        listMur.add(new Mur(this,762 ,509));
        this.addItem(new Mur(this,762 ,509));
       
        listMur.add(new Mur(this,112 ,559));
        this.addItem(new Mur(this,112 ,559));
        
        listMur.add(new Mur(this,262 ,559));
        this.addItem(new Mur(this,262 ,559));
        
        listMur.add(new Mur(this,362 ,559));
        this.addItem(new Mur(this,362 ,559));
        
        listMur.add(new Mur(this,412 ,559));
        this.addItem(new Mur(this,412 ,559));
        
        listMur.add(new Mur(this,512 ,559));
        this.addItem(new Mur(this,512 ,559));
        
        listMur.add(new Mur(this,612 ,559));
        this.addItem(new Mur(this,612 ,559));
        
        listMur.add(new Mur(this,712 ,559));
        this.addItem(new Mur(this,712 ,559));
        
        listMur.add(new Mur(this,862 ,559));
        this.addItem(new Mur(this,862 ,559));

        listMur.add(new Mur(this,112 ,609));
        this.addItem(new Mur(this,112 ,609));
        
        listMur.add(new Mur(this,162 ,609));
        this.addItem(new Mur(this,162 ,609));
        
        listMur.add(new Mur(this,262 ,609));
        this.addItem(new Mur(this,262 ,609));
        
        listMur.add(new Mur(this,362 ,609));
        this.addItem(new Mur(this,362 ,609));
        
        listMur.add(new Mur(this,412 ,609));
        this.addItem(new Mur(this,412 ,609));
        
        listMur.add(new Mur(this,512 ,609));
        this.addItem(new Mur(this,512 ,609));
        
        listMur.add(new Mur(this,612 ,609));
        this.addItem(new Mur(this,612 ,609));
        
        listMur.add(new Mur(this,712 ,609));
        this.addItem(new Mur(this,712 ,609));
        
        listMur.add(new Mur(this,812 ,609));
        this.addItem(new Mur(this,812 ,609));
        
        listMur.add(new Mur(this,862 ,609));
        this.addItem(new Mur(this,862 ,609));
                
        listMur.add(new Mur(this,512 ,659));
        this.addItem(new Mur(this,512 ,659));

        
        
        //Création des objets à manger dans la map//
        ArrayList<Miam> listMiam = new ArrayList<>();
       
        for(int i = 0 ;i<7 ; i++){
            listMiam.add(new Miam(this, 62+i*50,59));
            this.addItem(listMiam.get(i));
        }

        for(int j = 8 ;j<18 ; j++){
            listMiam.add(new Miam(this, 62+j*50,59)); 
            this.addItem(listMiam.get(j-1));  
        }
        
        for(int j = 2 ;j<14 ; j++){
            listMiam.add(new Miam(this, 62,j*50+9)); 
            this.addItem(listMiam.get(j+15));  
        }
    
        for(int j = 2 ;j<10 ; j++){
            listMiam.add(new Miam(this,12+j*50,659)); 
            this.addItem(listMiam.get(j+27));  
        }
  
        for(int j = 11 ;j<19 ; j++){
            listMiam.add(new Miam(this,12+j*50,659)); 
            this.addItem(listMiam.get(j+26));  
        }
        
        for(int j = 0 ;j<7; j++){
           listMiam.add(new Miam(this,912,109+50*j)); 
           this.addItem(listMiam.get(j+45));  
        }

        for(int j = 8 ;j<11; j++){
           listMiam.add(new Miam(this,912,109+50*j)); 
           this.addItem(listMiam.get(j+44));  
        }

        for(int j = 0 ;j<4; j++){
           listMiam.add(new Miam(this,162,159+50*j)); 
           this.addItem(listMiam.get(j+55));  
        }
         
        for(int j = 5 ;j<9; j++){
           listMiam.add(new Miam(this,162,159+50*j)); 
           this.addItem(listMiam.get(j+54));  
        }
         
        for(int j = 0 ;j<10; j++){
           listMiam.add(new Miam(this,312,159+50*j)); 
           this.addItem(listMiam.get(j+63));  
        }
         
        for(int j = 0 ;j<6; j++){
           listMiam.add(new Miam(this,412,259+50*j)); 
           this.addItem(listMiam.get(j+73));  
        }
         
        for(int j = 0 ;j<5; j++){
            listMiam.add(new Miam(this,462,59+50*j)); 
            this.addItem(listMiam.get(j+79));  
        }
         
        for(int j = 9 ;j<13; j++){
            listMiam.add(new Miam(this,462,59+50*j)); 
            this.addItem(listMiam.get(j+74));  
        }
         
        for(int k = 0 ;k<8; k++){
           listMiam.add(new Miam(this,562,259+50*k)); 
           this.addItem(listMiam.get(k+88));  
        }

        for(int k = 0 ;k<3; k++){
            listMiam.add(new Miam(this,612,159+50*k)); 
            this.addItem(listMiam.get(k+96));  
        }
        
        for(int k = 0 ;k<4; k++){
            listMiam.add(new Miam(this,662,459+50*k)); 
            this.addItem(listMiam.get(k+99));  
        }
       
        for(int k = 0 ;k<8; k++){
            listMiam.add(new Miam(this,712,109+50*k)); 
            this.addItem(listMiam.get(k+103));  
        }
        
        for(int k = 0 ;k<2; k++){
            listMiam.add(new Miam(this,762,559+50*k)); 
            this.addItem(listMiam.get(k+111));  
        }
        
        for(int k = 0 ;k<3; k++){
            listMiam.add(new Miam(this,812,159+50*k)); 
            this.addItem(listMiam.get(k+113));  
        }

        for(int k = 4 ;k<6; k++){
            listMiam.add(new Miam(this,812,159+50*k)); 
            this.addItem(listMiam.get(k+112));  
        }
 
        for(int k = 7 ;k<9; k++){
            listMiam.add(new Miam(this,812,159+50*k)); 
            this.addItem(listMiam.get(k+111));  
        }
        
        for(int j = 0 ;j<3; j++){
            listMiam.add(new Miam(this,212,309+50*j)); 
            this.addItem(listMiam.get(j+120));  
        }
         
        for(int j = 5 ;j<7; j++){
            listMiam.add(new Miam(this,212,309+50*j)); 
            this.addItem(listMiam.get(j+118));  
        }
         
        for(int j = 0 ;j<2; j++){
           listMiam.add(new Miam(this,262,109+50*j)); 
           this.addItem(listMiam.get(j+125));  
        }
         
        for(int j = 0 ;j<2; j++){
           listMiam.add(new Miam(this,362,109+50*j)); 
           this.addItem(listMiam.get(j+127));  
        }
         
        listMiam.add(new Miam(this,112,259)); 
            this.addItem(listMiam.get(129));
            
        listMiam.add(new Miam(this,112,459)); 
           this.addItem(listMiam.get(130));
        
        listMiam.add(new Miam(this,212,159)); 
           this.addItem(listMiam.get(131));
           
        listMiam.add(new Miam(this,262,409)); 
           this.addItem(listMiam.get(132));
           
        listMiam.add(new Miam(this,362,259)); 
           this.addItem(listMiam.get(133));
        
        listMiam.add(new Miam(this,362,509)); 
           this.addItem(listMiam.get(134));
         
        listMiam.add(new Miam(this,512,259)); 
           this.addItem(listMiam.get(135));
           
        listMiam.add(new Miam(this,512,509)); 
           this.addItem(listMiam.get(136));
           
        listMiam.add(new Miam(this,612,509)); 
           this.addItem(listMiam.get(137));
           
        listMiam.add(new Miam(this,612,359)); 
           this.addItem(listMiam.get(138));
        
        listMiam.add(new Miam(this,662,359)); 
           this.addItem(listMiam.get(139));
        
        listMiam.add(new Miam(this,762,359)); 
           this.addItem(listMiam.get(140));
           
        listMiam.add(new Miam(this,662,159)); 
           this.addItem(listMiam.get(141));
           
        listMiam.add(new Miam(this,762,159)); 
           this.addItem(listMiam.get(142));
           
        listMiam.add(new Miam(this,862,259)); 
           this.addItem(listMiam.get(143));
                   
        listMiam.add(new Miam(this,862,409)); 
           this.addItem(listMiam.get(144));
    }
        
    /**
     * Opération permettant changer l'arrière-plan de la fenêtre de jeu
     * @param grphcs qui correspond au contexte graphique de la fenêtre
     */
    @Override
    protected void drawBackground(Graphics grphcs) {
        grphcs.setColor(Color.black);
        grphcs.fillRect(00, 0, getWidth(),getHeight());
    }

    /**
     * Opération intervenant lorque la partie est perdue
     */
    @Override
    protected void lost() { 
    }

    /**
     * Opération intervenant lorque la partie est gagnée
     */
    @Override
    protected void win() {
    }

    /**
     * Opération permettant de renvoyer si le joueur à gagné la partie ou non
     * @return true si le joueur à gagné, false sinon
     */
    @Override
    protected boolean isPlayerWin() {
        return false;
    }

    /**
     * Opération permettant de renvoyer si le joueur à perdu la partie ou non
     * @return false si le joueur à gagné, true sinon
     */
    @Override
    protected boolean isPlayerLost() {
        return false;
    }

    /**
     * Opération permettant de faire ntervenir la gravité dans la jeu 
     * @return un vecteur représentant l'effet de la gravité 
     */
    @Override
    public Vector getGravity() {
        return null;
    }

    /**
     * getter de l'attribut joueur
     * @return l'attribut joueur de la classe
     */
    public Joueur getJoueur() {
        return joueur;
    }
    
}
