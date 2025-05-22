/*
Write a program to check whether the array is in sorted order or not.
Example- Input: a [ ] = {1, 2, 4, 7, 10, 12, 13} Yes, Ascending Order
Input: a [ ] = {13, 10, 7, 4} Yes, Descending Order
Input: a [ ] = {6, 9, 2, 5, 8} Not sorted
 */

import java.util.*;
class sorted_or_not 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i,asc = 1,desc = 1;
        System.out.println("Enter array elements : ");
        for (i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n - 1; i++) 
        {
            if (a[i] > a[i + 1]) 
            {
                asc = 0;
            }
            if (a[i] < a[i + 1]) 
            {
                desc = 0;
            }
        }
        if (asc == 1)
            System.out.println("Yes, Ascending Order");
        else if (desc == 1)
            System.out.println("Yes, Descending Order");
        else
            System.out.println("Not sorted");
    }
}

/*
Terminal output:
Enter size of array : 8
Enter array elements : 
1
2
4
7
10
12
13
19
Yes, Ascending Order
Enter size of array : 5
Enter array elements : 
13
10
7
4
1
Yes, Descending Order
Enter size of array : 7
Enter array elements : 
1
2
3
5
9
4
10
Not sorted
*/
