/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
public class Exerc2 implements Runnable{
    
    private final int id;
    
    Exerc2(int id){
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Eu sou uma Thread!!!!");
    }
    
    public static void main(String args[]) {
        if(args.length!=1){
            System.err.println("USO: java Exerc2");
            System.exit(0);
        }
        
        final int count = Integer.parseInt(args[0]);
        
        Thread[] th = new Thread[count];
        
        for(int i=0;i<count;i++){
            Exerc2 ex2 = new Exerc2(i);
            th[i] = new Thread(ex2,"[th"+i+"]");
            th[i].start();
        }
    }

    
}
