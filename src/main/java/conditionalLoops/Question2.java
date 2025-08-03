package conditionalLoops;

public class Question2 {
    public static void main(String[] args) {
        //declare AND initalize the variables
        int score=73;
        char grade;

        if (score>=90){
            grade='A';


        }else if (score>=75){
            grade='B';


        }else if (score>=60){
            grade='C';


        }else {
            grade='D';

        }
        //print the result
        System.out.println("Grade: " + grade);

    }
}
