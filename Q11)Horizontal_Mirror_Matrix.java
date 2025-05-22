/*
Write a program to declare a matrix a[ ][ ] of order r x c, where r is the number of rows and c is the number of columns. Input
positive integers into this matrix. Perform the following tasks:
a) Create another matrix b[ ][ ] to store mirror image of the inputted matrix.
b) Display the input and mirror image matrix.
Example: Input: r=3, c=4
4 16 12 7
8 2 14 5
6 1 3 9
Output:
Original Matrix
4 16 12 7
8 2 14 5
6 1 3 9
- - - - - - - - - - - - - - - - - - - - -
Mirror Image Matrix
6 1 3 9
8 2 14 5
4 16 12 7
 */

import java.util.*;
class Mirrors_matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter no of columns : ");
        int c = sc.nextInt();
        int i ,j,k=0;
        int b[][]=new int[r][c];
        int a[][]=new int[r][c];
        System.out.println("Enter Array elements : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=r-1;i>=0;i--)
        {
            for(j=0;j<c;j++)
            {
                b[k][j]=a[i][j];
            }
            k++;
        }        
        System.out.println("Mirror Image : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

/*
Terminal output:
Enter no of rows : 3
Enter no of columns : 4
Enter Array elements : 
4
16
12
7
8
2
14
5
6
1
3
9
Original Matrix : 
4	16	12	7	
8	2	14	5	
6	1	3	9	
Mirror Image : 
6	1	3	9	
8	2	14	5	
4	16	12	7	
Enter no of rows : 3
Enter no of columns : 5
Enter Array elements : 
6
4
5
8
12
19
6
3
14
8
7
12
14
3
3
Original Matrix : 
6	4	5	8	12	
19	6	3	14	8	
7	12	14	3	3	
Mirror Image : 
7	12	14	3	3	
19	6	3	14	8	
6	4	5	8	12	
*/
