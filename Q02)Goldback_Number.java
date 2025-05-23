/*
 A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.
Example: 6 = 3 + 3
10 = 3 + 7
16 = 5 + 11
Write a program to input an even integer n where n> 9 and n< 100. Find all the odd prime pairs whose sum is equal to the
number n.
Test your program with the following sample data.
Example 1- Input n = 22
Output: Prime pairs are: 3, 19
                         5, 17
                         11, 11
Example 2- Input n = 25
Output: Invalid Input. Number is Odd.
Example 3- Input n = 128
Output: Invalid Input. Number out of range.
 */

import java.util.*;
class Goldback_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        int n = sc.nextInt();
        int i, t;
        if(n > 9 && n < 100)
        {
            if(n % 2 == 0)
            {
                System.out.print("Prime pairs are : ");
                for(i = 3; i <= n/2; i += 2)
                {
                    t = n - i;
                    if(isprime(i) == 1 && isprime(t) == 1)
                        System.out.print(i + "," + t + "\n\t\t  ");
                }
            }
            else
                System.out.println("Invalid Input. Number is Odd.");
        }
        else
             System.out.println("Invalid Input. Number out of range.");
    }
    static int isprime(int a)
    {
        int i, c = 0;
        for(i = 1; i <= a; i++)
        {
            if(a % i == 0)
                c++;
        }
        if(c == 2)
            return 1;
        else 
            return 0;
    }
}

/*
Terminal output:

Enter a number : 22
Prime pairs are : 3,19
                  5,17
                  11,11
		  
Enter a number : 25
Invalid Input. Number is Odd.

Enter a number : 128
Invalid Input. Number out of range.
*/
