/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
public class Ficha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Numero de argumentos: "+args.length);
        int i=0;
        for(String s:args){
            System.out.println("Argumentos: "+i++ + ":"+s);
        }
    }
    
}
