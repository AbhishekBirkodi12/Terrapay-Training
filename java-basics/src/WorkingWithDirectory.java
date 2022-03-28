import java.io.File;

public class WorkingWithDirectory {
    public static void main(String[] args) {
        File file =new File("myfile.txt");
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        File directory=new File("myFolder");
        directory.mkdir();
    }
}
