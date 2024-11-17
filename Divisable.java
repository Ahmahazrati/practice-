package divisable;

import java.util.Scanner;

public class Divisable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter a year :");
        int year = input.nextInt();
        if (year%4==0 && year%100!= 0||year%400==0){
            System.out.println("That year is a leap year");
 
        }
        else
            System.out.println("This year is not a leap year");
//        int x, y;
//        x = (int) (Math.random() * 10);
//        y = (int) (Math.random() * 10);
//        System.out.println("pleas Enter first digit :" + x + y);
//        int a = input.nextInt();
//        System.out.println("pleas Enter 2nd digit :");
//        int b = input.nextInt();
//
//        if (a == x && b == y) {
//            System.out.println("Congratuletion You win $10000 ");}
//        else if(a==y&& b==x){
//                System.out.println("Good you win $3000");}
//         else if(a==x  || b==y) 
//            System.out.println("Not bad you win $1000");
//        else
//             System.out.println("This digit isn't found");
        

//        System.out.print("please Enter a year :");
//        int year = input.nextInt();
//        if (year%4==0 && year%100!= 0||year%400==0){
//            System.out.println("That year is a leap year");
// 
//        }
//        else
//            System.out.println("This year is not a leap year");
//        System.out.print("please Enter a number :");
        //        int x = input.nextInt();
        //        if(x==0)
        //            System.out.println("Your entered number is Zero");
        //       else if(x % 2==0 && x%3==0)
        //            System.out.println("This number is divisable by 2 and 3");
        //        else if(x%2==0&& x%3!=0)
        //            System.out.println("This number is divisable by 2 not by 3");
        //        else if(x%2!=0 && x%3==0)
        //            System.out.println("This number is divisable by 3 not by 2");
        //        else 
        //            System.out.println("This number is not divisable by 3 and 2");
        {

        }
    }

}
