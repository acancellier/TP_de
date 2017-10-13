/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import view.fenetreDeADeviner;
import view.fenetre_421;

/**
 *
 * @author csnd2342
 */
public class GestionDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Des d1 = new Des();
        Des d2 = new Des();
        Des d3 = new Des();
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        d1.lancer();
        d2.lancer();
        d3.lancer();
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        d1.piper();
        d3.piper();
        
        d1.lancer();
        d2.lancer();
        d3.lancer();
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        
        
        
        Simulateur sim = new Simulateur();
        System.out.println("Après construction");
        System.out.println(sim);
        sim.remplir();
        System.out.println(sim);
        sim.afficheLancersJoueur(5);
        
        
        

        Simulateur s1 = new Simulateur(3,10); // le constructeur est appelé
        s1.remplir();
        for (int i = 1; i <= s1.getNbJoueur(); i++) {
            s1.afficheLancersJoueur(i);
        }
        System.out.println("Total joueur numéro 3: "+s1.totalJoueur(3)+" (dont "+s1.totalSix(3)+" six)");
        
        
        jeu421 jeu = new jeu421();
        jeu.jouer();
        
        deAdeviner deviner = new deAdeviner();
        deviner.jouer();
        
        fenetre_421 f = new fenetre_421();
        f.setVisible(true);*/
        
        fenetreDeADeviner f = new fenetreDeADeviner();
        f.setVisible(true);
    }
}
