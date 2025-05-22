/*
A prime number is said to be twisted prime, if the new number obtained after reversing the digits is also a prime number.
Given two positive integers m and n, where m<n, Write a program to determine how many twisted primes are there in the
range between m and n (both inclusive) and output them.
Input: m = 100, n =200
Output: The Twisted Prime Numbers are: 101 107 113 131 149 151 157 167 179 181 191 199
Frequency of Twisted Prime Numbers is: 12
*/

import java.util.*;
class Q1_Twisted_prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lower limit : ");
        int m = sc.nextInt();
        System.out.print("Enter Upper limit : ");
        int n = sc.nextInt();
        int c=0,rev,f=0;
        String out="";
        for(int i = m; i<=n;i++)
        {
            c=i;
            if(isprime(c)==1) 
            {
                rev=reverse(c);;  
                if(isprime(rev)==1)
                {
                out+=i+ " ";
                f++;
                }
            }
        }
        if(f<1)
        {
            System.out.println("No Twisted prime numbers in given range ");
            System.exit(0);
        }
        System.out.print("The Twisted prime numbers are : "+out.trim());
        System.out.println("\nFrequency of twisted prime numbers = " + f);
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
Terminal output :
Enter Lower limit : 100
Enter Upper limit : 200
The Twisted prime numbers are : 101 107 113 131 149 151 157 167 179 181 191 199
Frequency of twisted prime numbers = 12
Enter Lower limit : 200
Enter Upper limit : 300
No Twisted prime numbers in given range 
*/