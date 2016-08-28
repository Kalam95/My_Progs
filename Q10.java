              /* Programmer :-   Alam   */
package Assignment1;
     /* PROGRAM TO ADD GIVEN MATRIX*/
public class Q10
{
/*Function to Add the given Matrix */
public void mat_add(int x[][],int y[][])
 {
    int i;
     /* Printing the Matrices */
    System.out.print("\n\n\t\tFIRST MATRIX IS :-\n");
    for(i=0;i<x.length;i++)
       {
          for(int j=0;j<x[i].length;j++)
             System.out.print(x[i][j]+"  ");
          System.out.print("\n");
      } 
    System.out.print("\n\n\t\tSECOND MATRIX IS :-\n");
    for(i=0;i<y.length;i++)
       {
          for(int j=0;j<y[i].length;j++)
             System.out.print(y[i][j]+"  ");
          System.out.print("\n");
      } 
    /*applying algo to Add given matrices */
    System.out.print("\n\n\t\tTHE RESULT OF ADDITION IS  :- \n");
     for(i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
                System.out.print((x[i][j]+y[i][j])+"  ");      
            System.out.print("\n"); 
      }
 
  }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q10 q=new Q10(); //creating object of the class
      q.mat_add(new int[][]{{1,2,3},{4,5,7},{6,8,9}},new int[][]{{1,3,2},{11,12,14,},{-1,2,3}});
 }//closing of main() 
/*closing of class*/
}