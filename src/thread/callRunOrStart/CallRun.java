package thread.callRunOrStart;

public class CallRun implements Runnable {

    @Override
    public void run() {
        for(int i = 1;i<=3;i++){
            try{
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Thread th1 = new Thread(new CallRun(),"thread1");
        Thread th2 = new Thread(new CallRun(),"thread2");
        System.out.println(Thread.currentThread().getName());
        th1.run();
        System.out.println(Thread.currentThread().getName());
        th1.run();
        System.out.println(Thread.currentThread().getName());
    }
}
