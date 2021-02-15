/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.thread;

/**
 *
 * @author Giorgio Del Rocca
 */
public class EsThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread thr1 = new ContaINani2 ("Mammolo");
        Thread thr2 = new ContaINani2 ("Cucciolo");
        Thread thr3 = new ContaINani2 ("Brontolo");
        Thread thr4 = new ContaINani2 ("Dotto");
        Thread thr5 = new ContaINani2 ("Eolo");
        Thread thr6 = new ContaINani2 ("Gongolo");
        Thread thr7 = new ContaINani2 ("Pisolo");
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
    }
    
}
