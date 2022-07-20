/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skola;

import java.util.LinkedList;
/**
 *
 * @author Nikodém Babirád
 */
public class Hlavna {
    public static void main(String[] args) {
        LinkedList<Osoba> osoba= new LinkedList<>();
        //pridanie ucitelov
        osoba.add(new Ucitel("Adam","Danko",30));
        osoba.add(new Ucitel("Petra","Dlhá",12));
        
        //pridanie studentov
        osoba.add(new Student("Michal", "Stranek", 1.2));
        osoba.add(new Student("Peter", "Dubak", 2));
        osoba.add(new Student("Vladko", "Pucik", 2.3));

        //vypis osoby
        for (Osoba o : osoba){
            o.vypisOsobu();
        }
    }
    
}
