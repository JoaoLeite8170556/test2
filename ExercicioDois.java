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
    public int numUm;
    public int numDois;
    
    public ExercicioDois(){
        this.numDois=numDois;
        this.numUm=numUm;
    }
    
    public void calculadora(int numUm, int numDois){
        
        String aux = null;
        
        if(aux == "/"){
            System.out.println(numUm/numDois);
        }else if(aux == "*"){
            System.out.println(numUm*numDois);
        }else if(aux =="+"){
            System.out.println(numUm+numDois);
        }else if(aux == "-"){
            System.out.println(numUm-this.numDois);
        }
    }
    
    public static void main(String[] args) {
        ExercicioDois ex = new ExercicioDois();
        ex.calculadora(0, 0);
        
    }
    
}
