

public class Evenodd {
    public static void main(String[] args) {
        Thread e = new Thread(new even());
        Thread o = new Thread(new odd());
        
        
        e.start();
        o.start();
        
    }
}

class even implements Runnable{
    @Override
    public void run(){
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("Even:"+i);
        }
    }
}

class odd implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <= 9; i+=2) {
            System.out.println("Odd:"+i);
        }
    }
}