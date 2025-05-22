/*
A Smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors (excluding 1).
The first few such numbers are 4, 22, 27. . .
Example- 1. Input: 58
Prime factors are: 2, 29
Sum of the digits are 5 + 8 = 13
Sum of the digits of the factors 2 + (2 + 9) =13

2. Input: 666
Prime factors are: 2, 3, 3, 37
Sum of the digits are 6 + 6 + 6 = 18
Sum of the digits of the factors 2 + 3 + 3 + (3 + 7) =18
Write a program to input a number and display whether the number is a Smith number or not.
 */

import java.util.*;  
class smith_number 
{  
   public static void main(String args[]) 
   {  
      Scanner sc = new Scanner(System.in);  
      System.out.print("Enter a number:");  
      int n = sc.nextInt();  
      int i, d, s = 0, m = n, co = n, d1, sd = 0;  
      while (m != 0) 
      {  
        d1 = m % 10;  
        sd += d1;  
        m = m / 10;  
      }  
      int c1 = 0;  
      for (i = 1; i <= n; i++) 
      {  
        if (n % i == 0)  
          c1++;  
      }  
      if (c1 == 2) 
      {
        System.out.println(co + " is NOT a Smith number");  
        System.exit(0);
      } 
      for (i = 2; i <= n; i++) 
      {  
        while (n % i == 0) // Handle repeated prime factors
        {  
           int k = i; 
           while (k != 0) 
           {  
             d = k % 10;  
             s += d;  
             k = k / 10;  
           }  
           n /= i;  
        }  
      }
      if (sd == s)  
        System.out.println(co + " is a Smith number");  
      else  
        System.out.println(co + " is NOT a Smith number");  
   }  
}  

/*
sample outputs from 1 to 1000 :
4 22 27 58 85 94 121 166 202 265 274 319 346 355 378 382 391 
438 454 483 517 526 535 562 576 588 627 634 636 645 648 654 663 
666 690 706 728 729 762 778 825 852 861 895 913 915 922 958 985

Terminal output :
Enter a number:58
58 is a Smith number
Enter a number:73
73 is NOT a Smith number
*/
