/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM;

/**
 *
 * @author ScupidC0des
 */
 public class main {
 public static void main(String[] args) {
        barang brg = new barang(); 
        brg.setkode("MSI1"); 
        brg.setnama("MSI TIPE 1");
        brg.setstok("100");
        brg.setharga("16000000");
        
        System.out.println("Kode Barang ="+ brg.getkode());
        System.out.println("Nama Barang ="+ brg.getnama());
        System.out.println("Stok Barang ="+ brg.getstok());
        System.out.println("Harga Barang ="+ brg.getharga());
        //System.out.println("Diskon 10% = "+ brg.setdiskon());
    }
    
}

