/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author celio
 */
public class Ex1 {
   private int valor1;
   private int valor2;
   
   public Ex1(){
       valor1=0;
       valor2=0;
   }
   
   public int soma(int valor1, int valor2){
       return valor1+valor2;
   }
   
  
    public static void main(String[] args) {
        Ex1 calcular = new Ex1();
        System.out.println(calcular.soma(12, 22));
    }
            
    
}
