package conditionalLoops;

public class Question3 {
    public static void main(String[] args) {
        //Print numbers 1 to 5 using three loop types
        //for loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        //while loop

        System.out.print("While Loop: ");
        //initalize and declare the variables
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println(); // New line


        //do whileloop
        System.out.print("do While Loop: ");
        int k= 1;
        do {
            System.out.print(k + " ");
            k++;
        }while(k<=5);






    }
}
