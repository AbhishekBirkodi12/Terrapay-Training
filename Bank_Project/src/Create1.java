import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Create1 {
    public static void main(String[] args) throws IOException {
        //Used to write Data into the file reads one character at a time
        //attach keyboard to DataInputStream
        System.out.println(Arrays.toString(args));
        DataInputStream dis=new DataInputStream(System.in);
        //attach file to the FileOutputStream
        FileOutputStream fout=new FileOutputStream(args[0]);
        //read data from DataInputStream and write into FileOutputStream
        char ch;
        System.out.println("Enter @ at end");
        while((ch=(char)dis.read())!='@'){
            System.out.println(ch);
            fout.write(ch);
        }
        fout.close();
    }
}
