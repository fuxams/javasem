public class Trycatch {

    public static void main(String[] args) {
        try{
            int result = 2/0;
        }
        catch(ArithmeticException e){
            System.out.println("It is not possible to divide with zero");
        }
        finally{
            System.out.println("this always get executed");
        }
    }
}

