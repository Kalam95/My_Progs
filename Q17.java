                              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to find sum of upper triangle  in A MATRIX*/
public class Q17
{
/*Function to find SUM of the lower triangle of the given 2D array */
public void matrix_B_sum(int x[][])
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
   System.out.print("\n\n\tTHE ELEMENTS UNDER LOWER TRIANGLE OF MATRIX ARE :- {");
   for(int i=0;i<x.length;i++)
    {  
       for(int j=0;j<=i;j++)   
         {
           sum=sum+x[i][j];
           System.out.print(" "+x[i][j]);
         }  
     }
      
   System.out.print(" }\n\n\t\t\t\t\t AND THEIR SUM  :- "+sum);
   
 }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q17 q=new Q17(); //creating object of the class
   q.matrix_B_sum(new int[][]{  {1,2,3},
                                {4,5,6},
                                {7,8,-1} });
 }//closing of main() 
/*closing of class*/
}