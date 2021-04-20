/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author ScupidC0des
 */
public class try_catch {
    public static void main (String [] args)
    {
        int a = 0;
        int b = 10;
        int hasil;
        
        try 
        {
            hasil = b/a;
        }
        catch (Exception c)
        {
            System.out.println("TERJADI KESALAHAN");
        }
    }
    
}
