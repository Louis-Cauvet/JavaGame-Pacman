/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman;

import iut.Game;
import iut.GameItem;

/**
 * Classe concernant les murs présents dans le jeu
 * 
 * @author 3CD Industries le Retour
 */
public class Mur extends iut.BoxGameItem {

    /**
     * Constructeur de la classe
     * @param g qui correspond au jeu auquel appartient le mur
     * @param x qui correspond à la coordonnée en abscisses du mur dans la fenêtre de jeu 
     * @param y qui correspond à la coordonnée en ordonnées du mur dans la fenêtre de jeu
     */
    public Mur(Game g, int x, int y) {
        super(g,"mur", x, y);
    }
    
    
    /**
     * Opération concernant les collisions entre un mur et un autre item du jeu
     * @param gi qui correspond à l'item entrant en collision avec le mur
     */
    @Override
    public void collideEffect(GameItem gi) {   
    }
    

    /**
     * Opération permettant de récupérer le type de l'item 
     * @return le type de l'item (içi Mur)
     */
    @Override
    public String getItemType() {
        return "Mur";
    }

    /**
     * Opération implémentant l'évolution automatique du mur  au fil du temps
     * @param l 
     */
    @Override
    public void evolve(long l) { 
    }
    
}
