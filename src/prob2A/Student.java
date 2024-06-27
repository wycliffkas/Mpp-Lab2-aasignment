package prob2A;

public class Student {
   private String name;
   private GradeReport gradeReport;

   public Student(String name) {
      this.name = name;
      gradeReport = new GradeReport(this);
   }

   public String getName() {
      return name;
   }

   public GradeReport getReport() {
      return gradeReport;
   }

   @Override
   public String toString() {
      return name;
   }
}
