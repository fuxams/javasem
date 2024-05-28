import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Filereading {
    public static void main(String[] args) {
        
        try{

            
            FileReader fr = new FileReader("files1.txt");
            FileWriter fw = new FileWriter("files2.txt");

            int i;
            String str = "";

            while ((i=fr.read())!=-1) {
                str+=(char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();

            System.out.println("Done");

        }
        catch(IOException e){
            System.out.println("some io exception");
        }


    }
}
