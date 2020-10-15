
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
public class ExercioUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        String operation;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduza os Valores que deseja:");
        
        firstNumber = keyboard.nextInt();
        secondNumber= keyboard.nextInt();
        
        System.out.println("Escolha a operação que deseja realizar.");
        operation = keyboard.next();
        
        if("*".equals(operation)){
            System.out.println("A multiplicação é: "+ firstNumber*secondNumber);
        }else if("-".equals(operation)){
            System.out.println("A subtração é: "+ (firstNumber - secondNumber));   
        }else if("+".equals(operation)){
            System.out.println("A Soma é: "+ (firstNumber+secondNumber));
        }else if("/".equals(operation)){
            System.out.println("A Divisão é: "+ (firstNumber/secondNumber));
        }
        
        
    }
    
}
