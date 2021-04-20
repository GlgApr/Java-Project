/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM;

/**
 *
 * @author ScupidC0des
 */
public class barang {
    public String harga, kode, nama, stok;
    double hrg, diskon;
    public barang ()
    {
        kode = "FF01";
        nama = " Speaker";
        stok = "100";
        harga = "150000";
    }
    
    public void setkode(String code)
    {
        this.kode=code;
    }
    public void setnama(String name)
    {
        this.nama=name;
    }
    public void setstok(String stock)
    {
        this.stok=stock;
    }
    public void setharga(String price)
    {
        this.harga=price;
    }
   public double setdiskon ()
    {
        diskon = hrg - (hrg * 10/100);
        return diskon;
    }
    public String   getkode()
    {
        return kode;
    }
    public String   getnama()
    {
        return nama;
    }
    public String   getstok()
    {
        return stok;
    }
    public String   getharga()
    {
        return harga;
    }

}