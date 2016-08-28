                              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to FIND matrix sum*/
public class Q13
{
/*Function to TO FIND MATRIX SUM(sum of each row and colomun) the given 2D array */
public void matrix_sum(int x[][])
 {
   int col_sum,row_sum;
   System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-\n\n\t\t");
   /* Printing the array */
   for(int i=0;i<x.length;i++)
    {  
      for(int j=0;j<x[i].length;j++)
         System.out.print(x[i][j]+"  ");  
      System.out.print("\n\t\t");
    }
    /*Algo to to find matrix sum the given matrix*/
    for(int i=0;i<x.length;i++)
     {
        col_sum=0;row_sum=0;
        for(int j=0;j<x[i].length;j++)   
          {
            row_sum=row_sum+x[i][j];
            col_sum=col_sum+x[j][i];
          }
        System.out.print("\n\n\t\tTHE SUM OF "+(i+1)+" row = [ "+row_sum+" ] AND COLUMN = [ "+col_sum+" ];");
      }
   
 }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q13 q=new Q13(); //creating object of the class
   q.matrix_sum(new int[][]{ {1,2,3},
                            {4,5,6},
                            {7,8,-1} });
 }//closing of main() 
/*closing of class*/
}