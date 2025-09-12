// NAME                 :   Lucy Cronin
// GROUP                :   APCS-A
// LAST MODIFIED        :   September 8th, 2025
// PROBLEM ID           :   Deitel 1.23 Arithmetic Program
// PROBLEM DESCRIPTION  :   Write a program that asks the user to enter three
//                      :   floating point, obtains the three numbers from
//                      :   the user and prints the sum, product,
//                      :   and average of the three numbers.
// SOURCES I USED       :   APCS Textbook and Mr.H
// PEOPLE I HELPED      :   Lizzie
// PEOPLE WHO HELPED ME :   Lizzie Bippley

// import scanner
import java.util.Scanner;
public class SumProductAverage
{

    public static void main(String[] args)
    {
        // create scanner object and read in variables
        Scanner sc = new Scanner(System.in);

        // signature block
        System.out.print("Lucy Cronin\nAPCS-A\nLewis 2.2-2.3 Arithmetic Program\n\n\n");

        // read in the number of runs
        System.out.print("Number of Runs: ");
        int numRuns = sc.nextInt();
        System.out.print("\n\n");

        // repeat the run the amount of times provided by the user
        for(int j = 0;j < numRuns;j++)
        {
            // read in the 3 numbers
            System.out.print("Type 3 Floating point decimals: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            System.out.print("\n");

            // find the sum and return it
            System.out.print("Sum: ");
            System.out.println(num1 + num2 + num3);

            // find the product and return it
            System.out.print("Product: ");
            System.out.println(num1 * num2 * num3);

            // find the average and return it
            System.out.print("Average: ");
            System.out.println((num1 + num2 + num3)/3);
            System.out.print("\n\n");
        }
    }
}

/*
Lucy Cronin
APCS-A
Lewis 2.2-2.3 Arithmetic Program


Number of Runs: 3


Type 3 Floating point decimals: 222.2 222.2 222.2

Sum: 666.5999999999999
Product: 1.0970645047999999E7
Average: 222.19999999999996


Type 3 Floating point decimals: 3.14159 25.6 17

Sum: 45.74159
Product: 1367.219968
Average: 15.247196666666667


Type 3 Floating point decimals: 100 0 55.5

Sum: 155.5
Product: 0.0
Average: 51.833333333333336
*/