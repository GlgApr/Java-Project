/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM;

/**
 *
 * @author ScupidC0des
 */
public class n_transaksi extends transaksi {
    public n_transaksi (){
       super();
    }
      public String getid()
    {
        return id;
    }
       public double getharga ()
    {
        return (harga);
    }
       public double getjumlah ()
    {
        return (jumlah);
    }
        public double getpembayaran ()
    {
        return (pembayaran);
    }
    double total()
    {
        return (getharga()*getjumlah());
    }
    double kembali ()
    {
        return (getpembayaran()-total());
    }
    
}
