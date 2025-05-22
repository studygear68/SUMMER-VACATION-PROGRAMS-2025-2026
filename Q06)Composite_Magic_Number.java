/*
A composite Magic number is a positive integer which is composite as well as a magic number.
Composite Number : A composite number is a number that has more than two factors.
Example- 10, 12 etc.
Magic Number : A magic number is a number in which the eventual sum of the digits is equal to 1.
Example- 37 = 3 + 7 = 10 = 1 + 0 = 1
Accept two positive integers m and n (assume m<n). Display the number of Composite Magic integers that are in the range
between m and n and output them along with frequency, in the format specified below.
Example- Input: m=20, n=95
Output: The Composite Magic integers are: 28, 46, 55, 64, 82, 91  
Frequency of Composite Magic integers is = 6 
 */

import java.util.*;
class Magic_number 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lower limit: ");
        int m = sc.nextInt();
        System.out.print("Enter Upper limit: ");
        int n = sc.nextInt();
        System.out.print("The Magic numbers are: ");
        int f=0;
        String out="";
        for (int i = m; i <= n; i++) 
        {
            int num = i;
            int sum = digitSum(num);
            while (sum > 9) 
            {
                sum = digitSum(sum);
            }
            if (sum == 1 && isprime(i)==0 && i!=1) 
            {
                out+=i+",";
                f++;
            }
        }
        System.out.print(out.substring(0,(out.length())-1));
         System.out.println("\nFrequency of Composite Magic Numbers is = "+f);
    }
     public static int digitSum(int num) 
    {
        int sum = 0;
        while (num > 0) 
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
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
Enter Lower limit: 10
Enter Upper limit: 100
The Magic numbers are: 10,28,46,55,64,82,91,100
Frequency of Composite Magic Numbers is = 8
Enter Lower limit: 100
Enter Upper limit: 200
The Magic numbers are: 100,118,136,145,154,172,190
Frequency of Composite Magic Numbers is = 7
Enter Lower limit: 10
Enter Upper limit: 200
The Magic numbers are: 10,28,46,55,64,82,91,100,118,136,145,154,172,190
Frequency of Composite Magic Numbers is = 14
*/
