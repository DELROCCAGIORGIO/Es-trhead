/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnablenani;

/**
 *
 * @author Giorgio Del Rocca
 */
public class Nani { 
     public static void main(String[] args) {
        Runnable t1 = new Run ("Mammolo");
        Runnable t2 = new Run ("Cucciolo");
        Runnable t3 = new Run ("Brontolo");
        Runnable t4 = new Run ("Dotto");
        Runnable t5 = new Run ("Eolo");
        Runnable t6 = new Run ("Gongolo");
        Runnable t7 = new Run ("Pisolo");
        Thread thr1 = new Thread (t1);
        Thread thr2 = new Thread (t2);
        Thread thr3 = new Thread (t3);
        Thread thr4 = new Thread (t4);
        Thread thr5 = new Thread (t5);
        Thread thr6 = new Thread (t6);
        Thread thr7 = new Thread (t7);
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
    }
}


    

