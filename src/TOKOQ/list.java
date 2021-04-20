/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TOKOQ;

/**
 *
 * @author ScupidC0des
 */
public class list {
    public String kode, nama, stok, harga;
    int diskon;
    public list()
    {
        kode = "MSI1";
        nama = "MSI";
        stok = "10";
        harga = "16000000";
        
    }
    
    public void setkode(String kode)
    {
        this.kode=kode;
    }
    public void setnama(String nama)
    {
        this.nama=nama;
    }
    public void setstok(String stok)
    {
        this.stok=stok;
    }
    public void setharga(String harga)
    {
        this.harga=harga;
    }
    /*public int setdiskon ()
    {
        diskon = harga - (harga * 10/100);
        return diskon;
    }*/
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
