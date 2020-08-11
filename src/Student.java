
public class Student {

    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major;

    public void enrollment() {
        System.out.println("student enrollment");
    }

    public void payment() {
        System.out.println("student payment");
    }

    public void addCourse() {
        System.out.println("student addcourse");
    }

    public void dropCourse() {
        System.out.println("student dropcourse");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Student asia = new Student();
        System.out.println("Object = "+asia);
        asia.enrollment();
        asia.payment();
        asia.addCourse();
        asia.dropCourse();
    }
    
  
}//end class
