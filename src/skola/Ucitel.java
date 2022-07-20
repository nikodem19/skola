/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skola;
/**
 *
 * @author Nikodém Babirád
 */
public class Ucitel extends Osoba{
     private double uvazok;

    public Ucitel(String meno, String priezvisko, double uvazok) {
        super(meno, priezvisko);
        this.uvazok = uvazok;
    }

    public void vypisOsobu(){
        System.out.println("volám sa " + meno + " " + priezvisko + " a učím " + uvazok + " hodín týždenne.");
    }
}
