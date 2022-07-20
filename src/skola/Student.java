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
public class Student extends Osoba{
    private  double priemer;

    public Student(String meno, String priezvisko, double priemer) {
        super(meno, priezvisko);
        this.priemer = priemer;
    }
    public void vypisOsobu(){
        System.out.println("volám sa " + meno + " " + priezvisko + " a mám študíjny priemer " + priemer);
    }
}
