package conditionalLoops;

public class Question4 {
    public static void main(String[] args) {
            //initilaze and declare variables
        int num=6;
//        check if num is even or odd using switch case
        switch (num % 2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Ivalid input");


        }
    }
}
