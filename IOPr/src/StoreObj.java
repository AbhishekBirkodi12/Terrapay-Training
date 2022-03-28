import java.io.*;

public class StoreObj {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos= new FileOutputStream("objfile");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        System.out.println("Enter how many objects");
        int n=Integer.parseInt(br.readLine());
        for (int i=0;i<n;i++){
            Employee e1=Employee.getData();
            oos.writeObject(e1);
        }
        oos.close();
        fos.close();

    }
}
