interface printable{
    void print();
}
interface showable{
    void show();

}
public class Mulinh implements printable,showable{

    @Override
    public void print(){
        System.out.println("This is printing");
    }
    @Override
    public void show(){
        System.out.println("This is showing");
    }

    public static void main(String[] args){
        Mulinh ob1 = new Mulinh();
        ob1.print();
        ob1.show();
    }
}