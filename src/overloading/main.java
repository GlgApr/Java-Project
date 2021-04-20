/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author ScupidC0des
 */
public class main {
    public static void main (String[] args)
    {
        Hitung obj = new Hitung();
        System.out.println("Hasil dari Method no parameter=" +obj.penjumlahan());
        System.out.println("Hasil dari method non parameter=" +obj.penjumlahan(5, 5));
    
    }
}
