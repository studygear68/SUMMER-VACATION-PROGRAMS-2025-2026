/*
Given a square matrix a [ ] [ ] of order n. Input the value for n and the positive integers in the matrix and perform the following
operations:
1. Display the original matrix.
2. Print the row and column position of the smallest element of the matrix.
3. Sort the elements of the rows in the descending order and display the new matrix.
Example- Input:
n = 3
a [ ] [ ]
3 1 7
4 6 9
8 2 5
Output:
Original Matrix is:
3 1 7
4 6 9
8 2 5
The smallest element 1 is in row 1 and column 2
Sorted Matrix is:
7 3 1
9 6 4
8 5 2
 */

 import java.util.*;
class matrix_smallest
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order : ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int i, j, s, si = 0, sj = 0,t;
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
        s = a[0][0];
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                if (a[i][j] < s) 
                {
                    s = a[i][j];
                    si = i;
                    sj = j;
                }
            }
        }
        System.out.println("The smallest element " + s + " is in row " + (si + 1) + " and column " + (sj + 1));
        // Sort each row of the ORIGINAL matrix
        for (i = 0; i < n; i++) 
        {
            for (int p = 0; p < n - 1; p++) 
            {
                for (j = 0; j < n - 1 - p; j++) 
                {
                    if (a[i][j] < a[i][j + 1]) 
                    {
                        t = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = t;
                    }
                }
            }
        }
        // Display sorted matrix
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
Terminal output:
Enter order : 3
Enter array elements : 
3
1
7
4
6
5
8
2
5
The Original Matrix : 
3	1	7	
4	6	5	
8	2	5	
The smallest element 1 is in row 1 and column 2
Sorted list:
7	3	1	
6	5	4	
8	5	2	
Enter order : 3
Enter array elements : 
1
2
54
8
4
-6
Retry with a positive number.
 */