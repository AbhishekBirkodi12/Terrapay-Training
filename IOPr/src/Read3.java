import java.io.FileReader;
import java.io.IOException;

public class Read3 {
    public static void main(String[] args) throws IOException {
        //attach file to FileReader
        FileReader fr=new FileReader("textfile");
        //read data from fr and display
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
