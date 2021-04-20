/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

/**
 *
 * @author ScupidC0des
 */
public class mobil implements lampu{
    public void gas ()
    {
        System.out.println("Mobil Berjalan");
    }
    public void rem ()
    {
        System.out.println("Kecepatan Mobil Berkurang");
    }
    public void klakson ()
    {
        System.out.println("Bel Mobil Berbunyi");
    }
    //lampu
    @Override
    public String seton()
    {
       return "Menyala";
    }
    
    @Override
    public String setoff()
    {
        return "Mati";
    }
    public static void main (String [] args)
    {
        mobil obj = new mobil ();
        obj.gas();
        obj.rem();
        obj.klakson();
        obj.seton();
        obj.setoff();
    }
}
