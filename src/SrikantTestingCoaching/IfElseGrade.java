package SrikantTestingCoaching;

public class IfElseGrade {

    int marks;
    String grade;

    IfElseGrade(int marks, String grade) {
        this.marks = marks;
        this.grade = grade;
    }

    void result11() {

        if (marks > 90 && marks < 100) {
            System.out.println("You have achieved Grade A:"+ marks+ "%");

        } else if (marks > 70 && marks < 89) {
            System.out.println("You have achieved Grade B:"+ marks+ "%");

        } else if (marks > 37 && marks < 69) {
            System.out.println("You have achieved Grade C:"+ marks+ "%");

        } else if (marks == 36) {
            System.out.println(" You are just pass");

        } else {

            System.out.println(" You are fail");
        }
    }


    public static void main(String[] args) {
        IfElseGrade exam = new IfElseGrade( 38, "A" );
        exam.result11();
    }
}
