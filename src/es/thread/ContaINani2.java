package es.thread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import RunnableNani.*;
/**
 *
 * @author Giorgio Del Rocca
 */
public class ContaINani2 extends Thread {

    public ContaINani2(String name) {
        super(name);
    }
    
    @Override
    public void run()
    {
        for (int i=1;i<8;i++)
        {
            System.out.println(i+""+getName());
        }
    }
    
}