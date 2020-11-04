
public class Exerc3 implements Runnable{
    
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try{
                if(Thread.interrupted()){
                    return;
                }
                System.out.println("Linha:"+i);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                return;
            }
        }
    }

    public static void main(String args[]) {
        Thread myThread = new Thread(new Exerc3());
        myThread.start();
        
        int secs = Integer.parseInt(args[0])*1000;
        
        try{
            Thread.sleep(secs);
            myThread.interrupt();
        }catch(InterruptedException e){
            
        }
    }
}
