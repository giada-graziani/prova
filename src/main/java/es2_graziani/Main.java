package es2_graziani;

public class Main {
    public static void main(String[] args) {    
        Mio_Thread t1 = new  Mio_Thread(100);
        Mio_Thread t2 = new  Mio_Thread(200);
        t1.start();
        t2.start();
    }

}