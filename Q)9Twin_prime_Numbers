/*
Write a program to input a positive integer, find twin prime no’s closer to number.
Example- Input: n = 22
Output: Twin prime after number = (29, 31)
Twin prime before number = (17, 19)
Nearest twin prime number = (17, 19)
 */

import java.util.*;
class twin_prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int i,j;
        if(n<0)
        {
            System.out.println("Enter a positive number.");
            System.exit(0);
        }
        for(i=n; ; i++)
        {
            if(isprime(i)==1&&isprime(i+2)==1)
            break;
        }
        System.out.println("Twin prime after number = ("+i+","+(i+2)+")");
        for(j=n;j>=0;j--)
        {
            if(isprime(j)==1&&isprime(j-2)==1)
            break;
        }
        System.out.println("Twin prime before number = ("+(j-2)+","+(j)+")");
        int dist1 = i-n;  
        int dist2 = n-j;  
        if (dist1 < dist2)
            System.out.println("Nearest twin prime number = (" + i + "," + (i + 2) + ")");
        else if (dist2 < dist1)
            System.out.println("Nearest twin prime number = (" + (j - 2) + "," + j + ")");
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
terminal output :
Enter a number : 53
Twin prime after number = (59,61)
Twin prime before number = (41,43)
Nearest twin prime number = (59,61)
Enter a number : 101
Twin prime after number = (101,103)
Twin prime before number = (71,73)
Nearest twin prime number = (101,103)
 */
