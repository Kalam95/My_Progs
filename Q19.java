                              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to MINIMUM IN  in LOWER TRIANGLE of MATRIX*/
public class Q19
{
/*Function to find min in LOWER triangular elements in the given 2D array */
public void matrix_B_min(int x[][])
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
   /*Calculating Min in the LOWER triangular of given matrix*/
   System.out.print("\n\n\tTHE ELEMENTS UNDER LOWER TRIANGLE OF MATRIX ARE :- {");
   for(int i=0;i<x.length;i++)
    {  
       for(int j=0;j<=i;j++)   
         {
           if(min>x[i][j])
              min=x[i][j];
           System.out.print(" "+x[i][j]);
         }  
     }
      
   System.out.print(" }\n\n\t\t\t\tAND THE MINIMUM VALUE IS :- "+min);
   
 }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q19 q=new Q19(); //creating object of the class
   q.matrix_B_min(new int[][]{  {1,2,3},
                                {4,5,6},
                                {7,8,-1} });
 }//closing of main() 
/*closing of class*/
}