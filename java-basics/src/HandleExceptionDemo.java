public class HandleExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            System.out.println("In try block");
            //throw new StackOverflowError();// can't recover using try catch

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {

            System.out.println("Divide by zero error");
        }finally{
            System.out.println("Always called");
        }
        System.out.println("This is some random line");
    }
}
