package current.thread.test;

public class CancelThreadTest {
         public static void main(String[] args) throws Exception{
                   PrimeGenerator gen = new PrimeGenerator();
                   new Thread(gen).start();
                   try
                   {
                            Thread.sleep(3000);
                   }finally{
                            gen.cancel();
                   }
         }
}

class PrimeGenerator implements Runnable{
         private volatile	boolean cancelled;      
         @Override
         public void run() {
                   while(!cancelled)
                   {
                            System.out.println("Running...");
                            //doingsomething here...
                   }                
         }       
         public void cancel(){cancelled = true;}
}