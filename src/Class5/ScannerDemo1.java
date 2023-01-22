package Class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double weight;
        /*
        Scanner is the name of the class
        scan is just a variable like we create primitive variable
        System.in=> telling the computer that we want to read data from keyboard.
         */

       /*
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" Years old");
        System.out.println("Please enter your weight");
        double weight1=scan.nextDouble();
        System.out.println(" Your weight is "+weight1);
        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);
        */



        /*System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);
*/

        System.out.println("Please enter your name");
        String name= scan.next(); //when we have to take only one word as input
        System.out.println("Your name is "+name);


        scan.nextLine();// trick to make next line method work after ww have used
        //any other method from Scanner class
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close(); //Good practise to close the program
    }
}
