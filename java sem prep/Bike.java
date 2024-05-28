class Bike{
    void run(){
        System.out.println("Running");
    }
}
class Splender extends Bike{
    void run(){
        System.out.println("splendor running at 60");
    }

    public static void main(String[] args) {
        Bike b = new Splender();
        b.run();

    }
}
