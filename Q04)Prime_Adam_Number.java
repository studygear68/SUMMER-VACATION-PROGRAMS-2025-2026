/*
A Prime-Adam integer is a positive integer which is a prime as well as an Adam number. Prime number: A number which has
only two factors, i.e. 1 and the number itself. Example: 2, 3, 5, 7 … etc.
Adam number: The Square of a number and the square of its reverse are reverse to each other.
Example- 1. Input: m = 13
Output: Yes! Prime-Adam
*/

import java.util.*;
class Prime_Adam_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i ,c=0,rev1;
        if(isprime(n)==1)
        {
            rev1=reverse(n);
            if(n*n==reverse(rev1*rev1))
            System.out.println("Yes!Prime-Adam");
            else
            System.out.println("No!Prime-Adam");
        }
        else
        System.out.println("Not Prime");
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
    static int reverse(int a )
    {
        int i,rev=0,d;
        while(a!=0)
        {
            d=a%10;
            rev=rev*10+d;
            a=a/10;
        }
        return rev;
    }
}
/*
Terminal output:
Enter a number : 13
Yes!Prime-Adam
Enter a number : 21
Not Prime
Enter a number : 131
No!Prime-Adam
Enter a number : 31
Yes!Prime-Adam
*/
