/*
Design a program to accept a day number (between 1 and 366), year (in 4 digits) from the user to generate and display and
corresponding date. Also accept another number ‘n' from the user to compute and display the past date corresponding to ‘n’
days before the generated date. Display an error message if the value of the day number, year and n are not within the limit
or not according to the condition specified.
Example 1: Input: Day Number = 64
Year = 2010
Date before (n) = 17
Output:
5th Mar 2010
Date before 17 days = 16th Feb 2010
Example 2: Input: Day Number = 99
Year = 2008
Date before (n) = 45
Output:
8thApr 2008
Date before 45 days = 23rd Feb 2008
Example 3: Input: Day Number = 20
Year =2011
Date before (n) = 24
Output:
20th Jan 2011
Date before 24 days does not lie in the same year.
Example 4: Input: Day Number = 366
Year =2009
Output:
Invalid Day Number!
 */

import java.util.*;

class DayNumberDateProg 
{
    public boolean isLeapYear(int year) 
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public String checkDate(int dayNumber, int year) 
    {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"0", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};

        if (isLeapYear(year)) 
        {
            months[2] = 29;
        }

        String month = "";
        for (int i = 1; i < months.length; i++) 
        {
            if (dayNumber <= months[i]) 
            {
                month = monthNames[i];
                break;
            } 
            else 
            {
                dayNumber -= months[i];
            }
        }

        String suffix;
        if (dayNumber >= 11 && dayNumber <= 13)
            suffix = "th";
        else 
        {
            switch (dayNumber % 10) 
            {
                case 1: suffix = "st"; break;
                case 2: suffix = "nd"; break;
                case 3: suffix = "rd"; break;
                default: suffix = "th";
            }
        }

        return dayNumber + suffix + " " + month + " " + year;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day Number = ");
        int dayNumber = sc.nextInt();
        System.out.print("Year = ");
        int year = sc.nextInt();

        if (year < 1000 || year > 9999) 
        {
            System.out.println("Invalid year");
            System.exit(0);
        }

        DayNumberDateProg obj = new DayNumberDateProg();
        boolean isLeap = obj.isLeapYear(year);

        if ((isLeap && dayNumber > 366) || (!isLeap && dayNumber > 365) || dayNumber < 1) 
        {
            System.out.println("Invalid Day Number!");
            System.exit(0);
        }

        System.out.print("Date before (n) = ");
        int n = sc.nextInt();

        if (n > dayNumber) 
        {
            System.out.println("Date before " + n + " days does not lie in the same year.");
            System.exit(0);
        }

        String output1 = obj.checkDate(dayNumber, year);
        System.out.println("Date = " + output1);
        int newDayNumber = dayNumber - n;
        String output2 = obj.checkDate(newDayNumber, year);
        System.out.println("Date before " + n + " days = " + output2);
    }
}

/*
Terminal output:
Day Number = 64
Year = 2010
Date before (n) = 17
Date = 5th Mar 2010
Date before 17 days = 16th Feb 2010
Day Number = 99
Year = 2008
Date before (n) = 45
Date = 8th Apr 2008
Date before 45 days = 23rd Feb 
Day Number = 366
Year = 1900
Invalid Day Number!
Day Number = 20
Year = 2011
Date before (n) = 24
Date = 20th Jan 2011
Date before 24 days does not lie in the same year.
Day Number = 366
Year = 2009
Invalid Day Number!
*/
