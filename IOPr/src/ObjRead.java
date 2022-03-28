import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("objfile");
        ObjectInputStream ois=new ObjectInputStream(fis);
        try{
            Employee e;
            while((e=(Employee) ois.readObject())!=null){
                e.display();
            }
        }catch( IOException | ClassNotFoundException e){
            System.out.println("End of file Reached");
        }finally{
            ois.close();
            fis.close();
        }
    }
}
