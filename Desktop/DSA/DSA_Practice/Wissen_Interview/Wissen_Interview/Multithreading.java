package Wissen_Interview;

import org.w3c.dom.css.Counter;

// multithreading code to print numbers sequentially using three threads:

public class Multithreading 
{
     static class Counter
    {
        private int count = 1;
        private final int maxcount = 10;

        public synchronized void printNumber(int threadnumber)
        {
            while (count <= maxcount) //while the count is less or equal to maxcount
            {
                // Check if it's this thread's turn to print
                if (count % 3 == threadnumber -1)  // we subtract 1 from the threadNumber to align with zero-based indexing typically 
                //used in array accesses. This adjustment allows the comparison to work correctly with the modulo operation, where 
                //the counter ranges from 0 to 2 
                {
                    System.out.println("Thread " + threadnumber + ": "); // printing the thread 
                    count++;
                    notifyAll(); // Notify other threads

                }
                else
                {
                    //if not threads turn then wait
                    try{
                        wait();
                    }catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
                
            }
            
        }

    }

    static class PrintThread implements Runnable
    {
        private final int threadnumber;
        private final Counter counter;

        public PrintThread(Counter counter,int threadnumber)
        {
            this.threadnumber =threadnumber;
            this.counter = counter;

        }

        @Override
        public void run()
        {
            counter.printNumber(threadnumber);
        }

    }


    public static void main(String[] args) 
    {

        Counter counter = new Counter();   
        
        //creating the threads
        Thread t1 = new Thread(new PrintThread(counter, 1)); //passing the counter object as well as threadnumber to printthread method
        Thread t2 = new Thread(new PrintThread(counter, 2));
        Thread t3 = new Thread(new PrintThread(counter, 3));

        //starting the threads 
        t1.start();
        t2.start();
        t3.start();

    }
    
}
