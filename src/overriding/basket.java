/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author ScupidC0des
 */
public class basket extends olahraga{
   @Override
   public String alat()
    {
        return "Bola Basket";
    }
   @Override
    public String bergerak ()
    {
        return "Melempar";
    }  
}
