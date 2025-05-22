/*
Write a program to input a number and check whether it is a Fascinating No. or not.
(Fascinating Numbers: Some numbers of 3 digits or more exhibit a very interesting property. The property is such that, when
the number is multiplied by 2 and 3, and both these products are concatenated with the original number, all digits from 1 to 9
are present exactly once, regardless of the number of zeroes.)
Example:
192x1=192
192x2=384
192x3=576
Concatenating the results: 192 384 576
 */

import java.util.*;
class fascinating_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of 3 digit or above : ");
        int n = sc.nextInt();
        if(n<99)
        {
            System.out.println("The number is less than 3 digit");
            System.exit(0);
        }
        int n2,n3,c=0,d,j,c2=0,c3=0,m=n,co=n;
        char i;
        String nn;
        n2=n*2;
        n3=n*3;
        System.out.println(n+" * 1 = "+ n);
        System.out.println(n+" * 2 = "+ n2);
        System.out.println(n+" * 3 = "+ n3);
        System.out.println("Concatenating the results : "+n+" "+n2+" "+n3);
        nn=Integer.toString(n)+Integer.toString(n2)+Integer.toString(n3);
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        if(c%3==0)
        {
            for(i='1';i<='9';i++)
            {
                for(j=0;j<nn.length();j++)
                {
                    char ch = nn.charAt(j);
                    if(i==ch)
                    c2++;
                }
                if(c2==1)
                c3++;
                c2=0;
            }
        }
        if( c3!=9)
        {
        System.out.println(m+ " is NOT a Fascinating Number");
        System.exit(0);
        }
        System.out.println(m+ " is a Fascinating Number");
    }
}

/*
Terminal output :
Enter a number of 3 digit or above : 192
192 * 1 = 192
192 * 2 = 384
192 * 3 = 576
Concatenating the results : 192 384 576
192 is a Fascinating Number
Enter a number of 3 digit or above : 1902
1902 * 1 = 1902
1902 * 2 = 3804
1902 * 3 = 5706
Concatenating the results : 1902 3804 5706
1902 is NOT a Fascinating Number
*/
