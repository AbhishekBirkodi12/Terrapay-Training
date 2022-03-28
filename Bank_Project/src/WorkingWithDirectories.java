import java.io.File;
import java.io.IOException;

public class WorkingWithDirectories {
    public static void main(String[] args) {
        File file =new File("myfile.txt");
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        File directory=new File("myFolder");
        directory.mkdir();


        try {
            File file2=new File(directory,"some.txt");
            boolean result=file2.createNewFile();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
