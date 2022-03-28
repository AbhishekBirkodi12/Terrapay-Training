import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Read2BufferedInput {
    public static void main(String[] args) throws IOException {
        //attach the file to the FileInputStream
        FileInputStream fin=new FileInputStream("myfile");
        BufferedInputStream bin=new BufferedInputStream(fin);
        //read data from FileInputStream and display it on monitor
        int ch;
        while((ch=bin.read())!=-1){
            System.out.print((char)ch);

        }
        bin.close();
        fin.close();

    }
}
