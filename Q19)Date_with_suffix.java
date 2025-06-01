/*
Write a program to input a date in the string format dd/ mm/ yyyy and print the date in the following format:
Example- 1. Input:
Date: 14/ 5/ 2024
Output:
Date: 14th/ May/ 2024
2. Input:
Date: 15/ 13/ 2024
Output:
Invalid Date!!!
 */

import java.util.*;
class Day_suffix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Date : ");
        String s = sc.next();
        int nd[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String mn[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        try
        {
        int p = s.indexOf('/');
        int q = s.lastIndexOf('/');
        int d = Integer.parseInt(s.substring(0,p));
        int m = Integer.parseInt(s.substring(p+1,q));
        int y = Integer.parseInt(s.substring(q+1));
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
                nd[2] = 29;
        if(y<1000 || y>9999)
                System.out.println("Invalid Date!!!");
        else if(m<=0 || m>12)
                System.out.println("Invalid Date!!!");
        else if(d<=0 || d>nd[m])
                System.out.println("Invalid Date!!!");
        else
            {
            String sf;
            if(d==1 || d==21 || d==31)
                    sf="st";
            else if(d==2 || d==22)
                    sf="nd";
            else if(d==3 || d==23)
                    sf="rd";
            else
                    sf="th";
            System.out.println("Date : " +d+sf+"/"+mn[m-1]+"/"+y);
            }
        } 
        catch(Exception e) 
        {
            System.out.println("Invalid Format!!!");
        }    
    }
}


/*
Terminal output:
Date : 19/19/2019
Invalid Date!!!
Date : 29/2/2024
Date : 29th/Feb/2024
Date : 16/11/2024
Date : 16th/Nov/2024
*/
