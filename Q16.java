                              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to MINIMUM IN  in UPPER TRIANGLE of MATRIX*/
public class Q16
{
/*Function to find min in upper triangular elements in the given 2D array */
public void matrix_A_min(int x[][])
 {
   int min=0;//Assumed min value 
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-\n\n\t\t");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
   {  
     for(int j=0;j<x[i].length;j++)
        System.out.print(x[i][j]+"  ");  
     System.out.print("\n\t\t");
   }
   /*Calculating Min in the upper triangular of given matrix*/
   System.out.print("\n\n\tTHE ELEMENTS UNDER UPPER TRIANGLE OF MATRIX ARE :-");
   for(int i=0;i<x.length;i++)
    {  
       for(int j=i;j<x[i].length;j++)   
         {
           if(min>x[i][j])
              min=x[i][j];
           System.out.print(" "+x[i][j]);
         }  
     }
      
   System.out.print("\n\n\tTHE MINIMUM VALUE IN THE UPPER TRIANGLE OF THE GIVEN MATRIX :- "+min);
   
 }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q16 q=new Q16(); //creating object of the class
   q.matrix_A_min(new int[][]{  {1,2,3},
                                {4,5,6},
                                {7,8,-1} });
 }//closing of main() 
/*closing of class*/
}