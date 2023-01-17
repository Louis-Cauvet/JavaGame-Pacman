/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman;

import iut.Game;
import iut.GameItem;

/**
 * Classe concernant les bonus présents dans le jeu
 * 
 * @author 3CD Industries le Retour
 */
public class Bonus extends iut.BoxGameItem {

    /**
     * Constructeur de la classe
     * @param g qui correspond au jeu auquel appartient le bonus
     * @param x qui correspond à la coordonnée en abscisses du bonus dans la fenêtre de jeu 
     * @param y qui correspond à la coordonnée en ordonnées du bonus dans la fenêtre de jeu 
     */
    public Bonus(Game g,int x, int y) {
        super(g,"bonus", x, y);
    }

    
    /**
     * Opération concernant les collisions entre le bonus et un autre item du jeu
     * @param gi qui correspond à l'item entrant en collision avec le bonus
     */
    @Override
    public void collideEffect(GameItem gi) {
        switch(gi.getItemType()){
            case "Joueur" : 
                this.getGame().remove(this);
                break;
        }
    }

    
    /**
     * Opération permettant de récupérer le type de l'item 
     * @return le type de l'item (içi Bonus)
     */
    @Override
    public String getItemType() {
       return "Bonus";
    }
    

    /**
     * Opération implémentant l'évolution automatique du bonus au fil du temps
     * @param l 
     */
    @Override
    public void evolve(long l) {
    }
    
}
