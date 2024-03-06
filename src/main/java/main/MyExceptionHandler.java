package main;

public class MyExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        if (e instanceof IllegalArgumentException) {
            System.out.println("runtime error");
        }
    }
    
}
