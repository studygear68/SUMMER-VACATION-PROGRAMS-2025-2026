/*
Given a square matrix a [ ] [ ] of order n. Input the value for n and the positive integers in the matrix and perform the following
operations:
1. Display the original matrix.
2. Print the row and column position of the largest element of the matrix.
3. Print the row and column position of the second largest element of the matrix.
4. Sort the elements of the rows in the ascending order and display the new matrix.
Example- Input: n = 3
a [ ] [ ]
5 8 3
7 4 6
9 1 2
Output:
5 8 3
7 4 6
9 1 2
The largest element 9 is in row 3 and column 1
The second largest element 8 is in row 1 and column 2
Sorted list:
3 5 8
4 6 7
1 2 9
 */

import java.util.*;
class matrix_greatest
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order : ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int i, j, g, si = 0, sj = 0;
        System.out.println("Enter array elements : ");
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                a[i][j] = sc.nextInt();
                if (a[i][j] < 0) 
                {
                    System.out.println("Retry with a positive number.");
                    System.exit(0);
                }
            }
        }
        System.out.println("The Original Matrix : ");
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        g = a[0][0];
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                if (a[i][j] > g) 
                {
                    g = a[i][j];
                    si = i;
                    sj = j;
                }
            }
        }
        System.out.println("The largest element " + g + " is in row " + (si + 1) + " and column " + (sj + 1));
        int largest = g;
        g = a[0][0];
        si = 0;
        sj = 0;
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                if (a[i][j] > g && a[i][j]<largest) 
                {
                    g = a[i][j];
                    si = i;
                    sj = j;
                }
            }
        }
        System.out.println("The second largest element " + g + " is in row " + (si + 1) + " and column " + (sj + 1));
        // Sort each row of the ORIGINAL matrix
        for (i = 0; i < n; i++) 
        {
            for (int p = 0; p < n - 1; p++) 
            {
                for (j = 0; j < n - 1 - p; j++) 
                {
                    if (a[i][j] > a[i][j + 1]) 
                    {
                        int t = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = t;
                    }
                }
            }
        }
        System.out.println("Sorted list:");
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/*
Terminal output :

*/