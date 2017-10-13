/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import java.util.Scanner;

/**
 *
 * @author csnd2342
 */
public class jeu421 {

    private Des de1;
    private Des de2;
    private Des de3;
    boolean quatre = false;
    boolean deux = false;
    boolean un = false;

    public jeu421() {
        this.de1 = new Des();
        
        this.de2 = new Des();
        
        this.de3 = new Des();
        
    }

    public Des getDe1() {
        return de1;
    }

    public void setDe1(Des de1) {
        this.de1 = de1;
    }

    public Des getDe2() {
        return de2;
    }

    public void setDe2(Des de2) {
        this.de2 = de2;
    }

    public Des getDe3() {
        return de3;
    }

    public void setDe3(Des de3) {
        this.de3 = de3;
    }
    public void lancer(){
        de1.lancer();
        de2.lancer();
        de3.lancer();
    }
    public boolean partieGagne(){
        quatre = false;
        deux = false;
        un = false;
        if (this.de1.getValeur() == 4 || this.de2.getValeur() == 4 || this.de3.getValeur() == 4) {
            quatre = true;
        }
        if (this.de1.getValeur() == 2 || this.de2.getValeur() == 2 || this.de3.getValeur() == 2) {
            deux = true;
        }
        if (this.de1.getValeur() == 1 || this.de2.getValeur() == 1 || this.de3.getValeur() == 1) {
            un = true;
        }
        return(quatre&&deux&&un);
    }
    public void jouer() {
        int cpt = 1;
        de1.lancer();
        de2.lancer();
        de3.lancer();
        System.out.println("dé 1 : " + de1.getValeur());
        System.out.println("dé 2 : " + de2.getValeur());
        System.out.println("dé 3 : " + de3.getValeur());
        if (this.de1.getValeur() == 4 || this.de2.getValeur() == 4 || this.de3.getValeur() == 4) {
            quatre = true;
        }
        if (this.de1.getValeur() == 2 || this.de2.getValeur() == 2 || this.de3.getValeur() == 2) {
            deux = true;
        }
        if (this.de1.getValeur() == 1 || this.de2.getValeur() == 1 || this.de3.getValeur() == 1) {
            un = true;
        }
        Scanner sc = new Scanner(System.in);
        while (quatre == false || deux == false || un == false) {
            System.out.println("Quel dé relancer ? ");
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    de1.lancer();
                    break;
                case "2":
                    de2.lancer();
                    break;
                case "3":
                    de3.lancer();
                    break;
                default:
                    System.out.println("Vous n'avez pas rentré un paramètre valide");
                    break;
            }
            System.out.println("dé 1 : " + de1.getValeur());
            System.out.println("dé 2 : " + de2.getValeur());
            System.out.println("dé 3 : " + de3.getValeur());
            if (this.de1.getValeur() == 4 || this.de2.getValeur() == 4 || this.de3.getValeur() == 4) {
                quatre = true;
            }
            if (this.de1.getValeur() == 2 || this.de2.getValeur() == 2 || this.de3.getValeur() == 2) {
                deux = true;
            }
            if (this.de1.getValeur() == 1 || this.de2.getValeur() == 1 || this.de3.getValeur() == 1) {
                un = true;
            }
            cpt++;
        }
        System.out.println("Gagné en " + cpt + " coup !");
    }

    @Override
    public String toString() {
        return "jeu421{" + "de1=" + de1 + ", de2=" + de2 + ", de3=" + de3 + ", quatre=" + quatre + ", deux=" + deux + ", un=" + un + '}';
    }

}
