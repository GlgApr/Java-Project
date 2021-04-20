/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3.Latihan;

/**
 *
 * @author ScupidC0des
 */
public class latihan_enkapsulasi {
    public String nama;
    private String kode;
    
    public String setnama (String nama)
    {
        this.nama=nama;
    }
    public void getnama ()
    {
        return nama;
    }
    void getkode()
    {
        return kode;
    }
    void setkode(String kode)
    {
        this.kode=kode;
}
    void hasil ()
    {
        return "#"+nama+kode;
    }
}
