/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
public class ExercicioDois {

    /**
     * @param args the command line arguments
     */
    public static void main(int numUm, int numDois) {
        String aux=null;
        
        if("/".equals(aux)){
            System.out.println(numUm/numDois);
        }else if("+".equals(aux)){
            System.out.println(numUm+numDois);
        }else if("*".equals(aux)){
            System.out.println(numUm*numDois);
        }else if("-".equals(aux)){
            System.out.println(numUm-numDois);
        }
    }
    
}
