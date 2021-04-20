/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3;

/**
 *
 * @author ScupidC0des
 */
public class enkapsulasi {
    public static void main (String[] args)
    {
        hewan h = new hewan ();
        h.setnama("Sapi");
        System.out.println("Hewan: "+h.getnama());
        h.setbernafas("Paru paru");
        System.out.println("Bernafas Dengan: "+h.getbernafas());
    }
}
