import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private int id;
    private String name;
    private float sal;
    private Date doj;

    public Employee(int id, String name, float sal, Date doj) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.doj = doj;
    }

    void display() {
        System.out.println(this.id + "\t" + this.name + "\t" + this.sal + "\t" + this.doj);
    }

    static Employee getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter employ id");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter employee name");
        String name = br.readLine();
        System.out.println("Enter Employee salary");
        float sal = Float.parseFloat(br.readLine());
        Date d = new Date();
        Employee e = new Employee(id, name, sal, d);
        return e;
    }
}

