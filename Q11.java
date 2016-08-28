              /* Programmer :-   Alam   */
package Assignment1;
     /* PROGRAM TO Multiply GIVEN MATRICES*/
public class Q11
{
/*Function to multiply the given Matrices */
public void mat_mult(int x[][],int y[][])
 {
    int i,j=0,k;
    int[][] c=new int[x.length][y[0].length];
     /* Printing the Matrices */
    System.out.print("\n\n\t\tFIRST MATRIX IS :-\n\t\t");
    for(i=0;i<x.length;i++)
       {
          for(j=0;j<x[i].length;j++)
             System.out.print(x[i][j]+"   ");
          System.out.print("\n\t\t");
      } 
    System.out.print("\n\n\t\tSECOND MATRIX IS :-\n\t\t");
    for(i=0;i<y.length;i++)
       {
          for(j=0;j<y[i].length;j++)
             System.out.print(y[i][j]+"   ");
          System.out.print("\n\t\t");
      } 
    /*applying algo to multiply given matrices */
    
     for(i=0;i<x.length;i++)
       for(j=0;j<x[i].length;j++)
         for(k=0;k<y[j].length;k++)
            c[i][k]=c[i][k]+x[i][j]*y[j][k];
     System.out.print("\n\n\t\tTHE RESULT OF MULTIPLICATION IS  :- \n\t\t ");
     for(i=0;i<c.length;i++)
       {
          for(j=0;j<c[i].length;j++)
             System.out.print(c[i][j]+"   ");
          System.out.print("\n\t\t");
      }  
}//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q11 q=new Q11(); //creating object of the class
      q.mat_mult(new int[][]{{1,2},{3,4}},new int[][]{{1,2,3},{4,5,6}});
 }//closing of main() 
/*closing of class*/
}