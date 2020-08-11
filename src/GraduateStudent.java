
public class GraduateStudent extends Student{

    private String studyLevel;
    private String thesisAdviser;

    public void oralExamination() {
        System.out.println("graduatestudent oralexamination");
    }
    public void thesisExamination() {
        System.out.println("graduatestudent thesisexamination");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        GraduateStudent cheer = new GraduateStudent();
        System.out.println("Objecr = "+cheer);
        cheer.oralExamination();
        cheer.thesisExamination();
        //call sperclass method
        cheer.enrollment();
        cheer.payment();
        cheer.addCourse();
        cheer.dropCourse();
       
    }

}
