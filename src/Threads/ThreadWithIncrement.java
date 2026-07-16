package Threads;

class Counter {
    int count;
    //fixed synchronized vlaue
    public synchronized void  incrment(){
        count++;
    }
}

public class ThreadWithIncrement {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

  Runnable obj=()->
  {
      for(int i=1;i<=10000;i++){
          counter.incrment();
      }
  };

        Runnable obj2=()->
        {
            for(int i=1;i<=3000;i++){
                counter.incrment();
            }
        };
  Thread thread1=new Thread(obj);
  Thread thread2=new Thread(obj2);

       thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.count);
    }
}
