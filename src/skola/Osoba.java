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
public abstract class Osoba {
    protected String meno;
    protected String priezvisko;

    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }
    public abstract void vypisOsobu();
}
