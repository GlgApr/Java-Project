/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author ScupidC0des
 */
public class Latihan_Overloading {
    private int hasil, x, y;
    public void setx (int x)
    {
        this.x=x;
    }
    public int getx ()
    {
        return x;
    }
    public void sety (int y)
    {
        this.y=y;
    }
    public int gety ()
    {
        return y;
    }
    int penjumlahan ()
    {
        return hasil =x+y;
    }
    int penjumlahan (int a, int b)
    {
        return hasil = a+b;
    }
}
