/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM;

/**
 *
 * @author ScupidC0des
 */
public abstract class transaksi {
    public double harga, jumlah, pembayaran;
    public String id;
    
    public transaksi ()
    {
        id="Tr12";
        harga=5000;
        jumlah=2;
        pembayaran=20000;
    }
    public void setid (String id)
    {
        this.id=id;
    }
    public void setharga (double harga)
    {
        this.harga=harga;
    }
    public void setjumlah (double jumlah)
    {
        this.jumlah=jumlah;
    }
     public void setpembayaran (double pembayaran)
    {
        this.pembayaran=pembayaran;
    }
}
