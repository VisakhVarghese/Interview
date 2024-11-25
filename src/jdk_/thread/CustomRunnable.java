package jdk_.thread;

public class CustomRunnable{
    public static void main(String[] args) {
//        CustomRunnable myRunnable = new CustomRunnable();
//        Thread thread = new Thread(myRunnable);

//        Thread thread = new Thread(new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("Thread is running using runnable interface");
//            }
//        });

//        Runnable task1 = () -> System.out.println("Thread is running using runnable interface");

        Thread thread = new Thread(() ->{
            System.out.println("Thread is running using runnable interface");
        });
        thread.start();


    }

//    @Override
//    public void run() {
//        System.out.println("Thread is running using runnable interface");
//    }
}
