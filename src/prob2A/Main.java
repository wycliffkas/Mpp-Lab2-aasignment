package prob2A;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Wycliff");
        GradeReport gradeReport = new GradeReport(student);

        System.out.println("Student "+ student.getName());
        System.out.println("Report of "+ gradeReport.getStudent());
    }
}
