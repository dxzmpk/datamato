package thread.callRunOrStart;


public class CallStart implements Runnable {

    @Override
    public void run() {
        for(int i = 1;i<=3;i++){
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Thread th1 = new Thread(new CallStart(),"thread1");
        Thread th2 = new Thread(new CallStart(),"thread2");
        th1.start();
        th2.start();
        System.out.println(Thread.currentThread().getName());
    }
}

