/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

/**
 *
 * @author csnd2342
 */
public class Simulateur {

    private int[][] valeurs;
    private Des de;
    private int nbJoueur;
    private int nbLancer;

    public Simulateur() {
        this.valeurs = new int[11][20];
        this.de = new Des();
        for (int indiceJoueur = 1; indiceJoueur < valeurs.length; indiceJoueur++) {
            for (int indiceLancer = 0; indiceLancer < valeurs[indiceJoueur].length; indiceLancer++) {
                this.valeurs[indiceJoueur][indiceLancer] = 0;
            }
        }
    }

    public Simulateur(int nbJoueur, int nbLancer) {
        this.nbJoueur = nbJoueur;
        this.nbLancer = nbLancer;
        this.de = new Des();
        this.valeurs = new int[nbJoueur + 1][nbLancer];
    }

    public int getNbJoueur() {
        return nbJoueur;
    }

    public void setNbJoueur(int nbJoueur) {
        this.nbJoueur = nbJoueur;
    }

    public int getNbLancer() {
        return nbLancer;
    }

    public void setNbLancer(int nbLancer) {
        this.nbLancer = nbLancer;
    }

    public void remplir() {
        for (int indiceJoueur = 1; indiceJoueur < valeurs.length; indiceJoueur++) {
            for (int indiceLancer = 0; indiceLancer < valeurs[indiceJoueur].length; indiceLancer++) {
                this.de.lancer();
                this.valeurs[indiceJoueur][indiceLancer] = de.getValeur();
            }
        }
    }

    public void afficheLancersJoueur(int numJoueur) {
        System.out.print("Joueur " + numJoueur + " : ");
        for (int i = 0; i < valeurs[numJoueur].length; i++) {
            System.out.print(valeurs[numJoueur][i] + " ");
        }
        System.out.println("");
    }

    public int totalJoueur(int numJoueur) {
        int total = 0;
        for (int i = 0; i < valeurs[numJoueur].length; i++) {
            total += valeurs[numJoueur][i];
        }
        return total;
    }

    public int totalSix(int numJoueur) {
        int totalSix = 0;
        for (int i = 0; i < valeurs[numJoueur].length; i++) {
            if (valeurs[numJoueur][i] == 6) {
                totalSix++;
            }
        }
        return totalSix;
    }

    @Override
    public String toString() {
        String res = "";
        for (int indiceJoueur = 1; indiceJoueur < valeurs.length; indiceJoueur++) {
            for (int indiceLancer = 0; indiceLancer < valeurs[indiceJoueur].length; indiceLancer++) {
                res += this.valeurs[indiceJoueur][indiceLancer] + " ";
            }
            res += "\n";
        }
        return res;
    }

}
