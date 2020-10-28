/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
public class Exer1 implements Runnable{

    /**
     * @param args the command line arguments
     */
    @Override
    public void run() {
        System.out.println("Eu sou um thread, dude....");
    }
    public static void main(String args[]) {
        
        final int count = Integer.parseInt(args[0]);
        
        Thread[] th = new Thread[count];
        
        for(int i=0;i<count;i++){
            Exer1 ex1 = new Exer1();
            th[i]=new Thread(ex1);
            th[i].start();
        }
    }

    
}
