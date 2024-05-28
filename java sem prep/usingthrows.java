public class usingthrows {
    public static void main(String[] args) {
        try {
            validateage(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void validateage(int age) throws Exception{
        if (age<18) {
            throw new Exception("cant vote");
        }
        else{
            System.out.println("can vote");
        }
    }
}
