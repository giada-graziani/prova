package es2_graziani;

public class Mio_Thread extends Thread{
    
    private int contatore;

    Mio_Thread(int n){
        contatore =n;
    }

    public void run(){
        for(int i =0; i<contatore; i++){
            System.out.println("Ciao sono il "+Thread.currentThread().getName()+ " "+ i);
        }
    }
    

}
