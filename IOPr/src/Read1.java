import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read1 {
    public static void main(String[] args) throws IOException {
        //attach file to FileInputStream
        FileInputStream fin=new FileInputStream("myfile");
        //read data from FileInputStream and display it on the monitor
        int ch;
        while((ch=fin.read())!=-1){
            System.out.print((char)ch);
        }
        fin.close();
    }
}
