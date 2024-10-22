package U3T1;
public class LetterGradeRunner {
    public static void main(String[] args) {
      LetterGrade grader = new LetterGrade();
      String grade1 = grader.gradeV1(80);
      System.out.println(grade1);
      String grade2 = grader.gradeV2(80);
      System.out.println(grade2);  
    }
}
