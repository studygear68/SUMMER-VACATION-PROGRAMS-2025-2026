/*
Write a program to declare a matrix a[ ][ ] of order r x c, where r is the number of rows and c is the number of columns. Input
positive integers into this matrix. Perform the following tasks:
a) Display the original matrix
b) Check if the given matrix is Skew Symmetric or not. A square matrix is said to be Skew Symmetric if the element of
the ith row and jth column is equal to the negative value of the jth row and ith column.
c) Find the sum of the elements of left diagonal, sum of the elements of right diagonal and sum of border elements of
the matrix and display them.
Example: 1) Input: r=3, c=4
Output: Not a square matrix
2) Input: r=4, c=4
0 -1 -5 -3
1  0 6  9
5 -6 0 -2
3 -9 2  0
Output:
Original Matrix
0 -1 -5 -3
1  0  6  9
5 -6  0 -2
3 -9  2  0
The Given Matrix is Skew Symmetric.
The sum of the left diagonal = 0
The sum of the right diagonal = 0
The sum of the border elements = 0
*/

import java.util.*;
class Skew_symmetric
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int r = sc .nextInt();
        System.out.println("Enter no of columns : ");
        int c = sc .nextInt();
        int i , j ,f=0,sl=0,sr=0,sb=0,fo=0;
        int a [][]= new int[r][c];
        if(r==c)
        {
            System.out.println("Enter elements : ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<r;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("The Original Matrix : ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<r;j++)
                {
                    System.out.print(a[i][j] +"\t");
                }
                System.out.println();
            }
            for(i=0;i<r;i++)
            {
                for(j=0;j<r;j++)
                {
                    if(i!=j && a[i][j]+a[j][i]!=0)
                    f++;
                    if(i==j && a[i][j]==0)
                    fo++;
                }
            }
            if(f==0 && fo==r)
            {
            System.out.println("The Given Matrix is Skew Symmetric ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<r;j++)
                {
                    if(i==j)
                    sr=sr+a[i][j];
                    if(i+j==(r-1))
                    sl=sl+a[i][j];
                    if(i==0||i==(r-1)||j==0||j==(r-1))
                    sb=sb+a[i][j];
                }
            }
            System.out.println("The sum of the left diagonal elements = "+sl);
            System.out.println("The sum of the right diagonal elements = "+sr);
            System.out.println("The sum of the border diagonal elements = "+sb);
            }
            else
            System.out.println("The Given Matrix is Not Skew Symmetric ");
        }
        else
        System.out.println("Not a Square Matrix ");
    }
}

\*
Terminal output:
Enter no of rows : 3
Enter no of columns : 4
Not a Square Matrix 
nter no of rows : 3
Enter no of columns : 3
Enter elements : 
0
3
-2
-3
0
5
2
-5
0
The Original Matrix : 
0	3	-2	
-3	0	5	
2	-5	0	
The Given Matrix is Skew Symmetric 
The sum of the left diagonal elements = 0
The sum of the right diagonal elements = 0
The sum of the border diagonal elements = 0
Enter no of rows : 3
Enter no of columns : 3
Enter elements : 
1
3
-2
-3
1
5
2
-5
1
The Original Matrix : 
1	3	-2	
-3	1	5	
2	-5	1	
The Given Matrix is Not Skew Symmetric
Enter no of rows : 4
Enter no of columns : 4
Enter elements : 
0
-1
-5
3
1
0
6
9
5
-6
0
-2
-3
-9
2
0
The Original Matrix : 
0	-1	-5	3	
1	0	6	9	
5	-6	0	-2	
-3	-9	2	0	
The Given Matrix is Skew Symmetric 
The sum of the left diagonal elements = 0
The sum of the right diagonal elements = 0
The sum of the border diagonal elements = 0
Enter no of rows : 4
Enter no of columns : 4
Enter elements : 
1
-1
-5
3
1
1
6
9
5
-6
1
-2
-3
-9
2
1
The Original Matrix : 
1	-1	-5	3	
1	1	6	9	
5	-6	1	-2	
-3	-9	2	1	
The Given Matrix is Not Skew Symmetric 
*/