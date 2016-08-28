                              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to find sum of upper triangle  in A MATRIX*/
public class Q14
{
/*Function to find SUM of the upper triangle of the given 2D array */
public void matrix_A_sum(int x[][])
 {
   int sum=0;//variable to calculate sum 
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-\n\n\t\t");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
   {  
     for(int j=0;j<x[i].length;j++)
        System.out.print(x[i][j]+"  ");  
     System.out.print("\n\t\t");
   }
   /*Calculating MATRIX A SUM*/
   System.out.print("\n\n\tTHE ELEMENTS UNDER UPPER TRIANGLE OF MATRIX ARE :-");
   for(int i=0;i<x.length;i++)
    {  
       for(int j=i;j<x[i].length;j++)   
         {
           sum=sum+x[i][j];
           System.out.print(" "+x[i][j]);
         }  
     }
      
   System.out.print("\n\n\t\tTHE THE A SUM OF UPER TRIANGLE OF THE GIVEN MATRIX IS :- "+sum);
   
 }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q14 q=new Q14(); //creating object of the class
   q.matrix_A_sum(new int[][]{  {1,2,3},
                                {4,5,6},
                                {7,8,-1} });
 }//closing of main() 
/*closing of class*/
}