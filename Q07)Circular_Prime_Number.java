/*
A Circular Prime is a prime number that remains prime under cyclic shifts of its digits. When the leftmost digit is removed and
replaced at the end of the remaining string of digits, the generated number is still prime. The process is repeated until the
original number is reached again.
A number is said to be prime if it has only two factors 1 and itself.
Example: 131
311
113
Hence, 131 is a circular prime.
Input a positive number n and check whether it is a circular prime or not. The new numbers formed after the shifting of the
digits should also be displayed.
Example 1- Input n=197
Output: 197
971
719
197 is a Circular Prime.
Example 2- Input n=29
Output: 29
92
29 is not a Circular Prime.
 */

import java.util.*;
class circular_prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : " );
        int n = sc.nextInt();
        int i;
        String str;
        if(n<0)
        {
            System.out.println("Retry with a positive number.");
            System.exit(0);
        }
        if (isprime(n)==0) 
        {
            System.out.println(n + " is not a Circular Prime.");
            System.exit(0);
        }
        int f=1;
        String s = Integer.toString(n);
        int l = s.length();
        System.out.println(s);
        for(i=0;i<l-1;i++)
        {
            str = s.substring(1)+s.charAt(0);
            System.out.println(str);
            if(isprime(Integer.parseInt(str))==1)
            f++;
            s=str;
        }
        if(f==l)
        System.out.println(n+" is a Circular Prime ");
        else
        System.out.println(n+" is not a Circular Prime ");
    }
    static int isprime(int a)
    {
        int i,c=0;
        for(i=1;i<=a;i++)
        {
        if(a%i==0)
        c++;
        }
        if(c==2)                         
        return 1;
        else 
        return 0;
    }
}

/*
Terminal output:
Enter a number : 197
197
971
719
197 is a Circular Prime 
Enter a number : 29
29
92
29 is not a Circular Prime 
Enter a number : 121
121 is not a Circular Prime.
Enter a number : 11
11
11
11 is a Circular Prime 
Enter a number : 111
111 is not a Circular Prime.
Enter a number : 1331
1331 is not a Circular Prime.
*/
