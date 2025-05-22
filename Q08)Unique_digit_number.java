/*
Write a program to input two positive integer’s m and n. print the unique digit numbers in the specified range along with their
values in the following format:
Example- Input:
m = 100
n = 115
Output:
The Unique digit numbers are:
102, 103, 104, 105, 106, 107, 108, 109
Frequency of unique digit numbers is: 8
 */

import java.util.*;
class unique_digit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit : ");
        int m = sc.nextInt();
        System.out.print("Enter Upper limit : ");
        int n = sc.nextInt();
        int i,co,k,c=0,f=0,fr=0;
        char j;
        String nnew;
        String result = ""; // To collect output
        for(i = m; i <= n; i++)
        {
            co = i;
            nnew = Integer.toString(co);
            f = 0; // Reset flag for unique check
            for(j = '0'; j <= '9'; j++)
            {
                c = 0; // Reset counter for each digit
                for(k = 0; k < nnew.length(); k++)
                {
                    char ch = nnew.charAt(k);
                    if(ch == j)
                        c++;
                }
                if(c > 1)
                {
                    f = 1;
                    break;
                }
            }
            if(f == 0)
            {
                result += co + ","; // Collect valid number
                fr++;
            }
        }
        // Print the final string without the last comma
        if(result.length() > 0)
        {
            System.out.println("The Unique Digits are : \n" + result.substring(0, result.length() - 1));
            System.out.println("Frequency of unique digit number number is:"+fr);
        }
        else
            System.out.println("No numbers with unique digits found.");
    }
}

/*
Terminal output:
Enter lower limit : 100
Enter Upper limit : 115
The Unique Digits are : 
102,103,104,105,106,107,108,109
Frequency of unique digit number number is:8
Enter lower limit : 100
Enter Upper limit : 150
The Unique Digits are : 
102,103,104,105,106,107,108,109,120,123,124,125,126,127,128,129,130,132,134,135,136,137,138,139,140,142,143,145,146,147,148,149,150
Frequency of unique digit number number is:33
*/
