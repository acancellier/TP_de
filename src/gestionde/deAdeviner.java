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
public class deAdeviner {

    private Des de;

    public deAdeviner() {
        de = new Des();
        this.de.setNbFaces(100);
    }

    public void jouer() {
        de.lancer();
        int cpt = 0;
        Scanner sc = new Scanner(System.in);
        int num=0;
        while (num != de.getValeur()) {
            System.out.print("Veuillez entrer une valeur: ");
            num = sc.nextInt();
            if (de.getValeur() > num) {
                System.out.println("C'est plus");
            } else if (de.getValeur() < num) {
                System.out.println("C'est moins");
            }
            cpt++;
        }

        System.out.println("Bravo, trouvé en " + cpt + " essais");

    }

    @Override
    public String toString() {
        return "deAdeviner{" + "de=" + de + '}';
    }

}
