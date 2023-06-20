package home_java1;

import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of numbers: ");
        System.out.println("Result = " + SumPositiveNumbers(sc));
    }
public static int SumPositiveNumbers(Scanner in) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Please, enter your first number: ");
    int first_num =in.nextInt();
    int countSumPosNumb = 0;
    while (first_num !=0) {
        System.out.print("Please, enter your next number: ");
        int number = in.nextInt();
        if (number < 0 && first_num >0) {
            countSumPosNumb += first_num;
        }
        first_num = number;
    }
    return countSumPosNumb;
}
}