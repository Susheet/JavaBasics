package com.company;

class Sample{
  int count = 0;

  synchronized void increment(){
      this.count++;
  }
}


public class ThreadSynchro {
    public static void main(String[] args) throws Exception{
        Sample obj = new Sample();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                    obj.increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++)
                    obj.increment();
            System.out.println(obj.count);
            }

        });

        t1.start();
        t2.start();
//        t1.join();
//        t2.join();


        System.out.println(obj.count);
    }
}
