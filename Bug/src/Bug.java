import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bug {
    private String email;
    private PRIORITY priority;
    private STATUS status;
    private String projectOwner;
    private Date createdDate;
    private Date completedDate;
    private String description;
    private String attachedFile;



    public Bug(String email, PRIORITY priority, STATUS status,String projectOwner,
               Date createdDate, Date completedDate, String description, String attachedFile) {
        if (isValid(email)) {
            this.email = email;
        }else{
            throw new InvalidEmailException("Email is invalid!! Please enter a valid email");
        }
        this.priority = priority;
        this.status = status;
        this.projectOwner = projectOwner;
        this.createdDate = createdDate;
        this.completedDate = completedDate;
        this.description = description;
        this.attachedFile = attachedFile;
    }

    public Bug() {
    }

    public void setPriority(PRIORITY priority) {
        this.priority = priority;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public PRIORITY getPriority() {
        return priority;
    }

    public STATUS getStatus() {
        return status;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public String getDescription() {
        return description;
    }

    public String getAttachedFile() {
        return attachedFile;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "email='" + email + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                ", projectOwner='" + projectOwner + '\'' +
                ", createdDate=" + createdDate +
                ", completedDate=" + completedDate +
                ", description='" + description + '\'' +
                ", attachedFile='" + attachedFile + '\'' +
                '}';
    }

    public String displayBug(){
       /* System.out.println(this.toString());*/
        return this.toString();
    }

    static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
}
class Launch{
    public static void main(String[] args) {
        Bug bug1=new Bug("ab@gmail.com",PRIORITY.MEDIUM,STATUS.inProgress,"A",new Date(),null,"Bug 1 description",null);
        Bug bug2=new Bug("abd@gmail.com",PRIORITY.MEDIUM,STATUS.inProgress,"A",new Date(),null,"Bug 2 description",null);
        bug1.setPriority(PRIORITY.HIGH);
        List<Bug> list= new ArrayList<Bug>();
        list.add(bug1);
        list.add(bug2);

        for (Bug b:list){
            System.out.println(b.displayBug());
        }
    }
}
