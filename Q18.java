                              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to MAXIMUM IN  in Lower TRIANGLE of MATRIX*/
public class Q18
{
/*Function to find max in Lower triangular elements in the given 2D array */
public void matrix_B_Max(int x[][])
 {
   int max=0;//Assumed max value 
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-\n\n\t\t");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
   {  
     for(int j=0;j<x[i].length;j++)
        System.out.print(x[i][j]+"  ");  
     System.out.print("\n\t\t");
   }
   /*Calculating Max in the Lower triangular of given matrix*/
   System.out.print("\n\n\tTHE ELEMENTS UNDER UPPER TRIANGLE OF MATRIX ARE :- {");
   for(int i=0;i<x.length;i++)
    {  
       for(int j=0;j<=i;j++)   
         {
           if(max<x[i][j])
              max=x[i][j];
           System.out.print(" "+x[i][j]);
         }  
     }
      
   System.out.print(" }\n\n\t\t\t\t\tAND THEIR SUM IS :- "+max);
   
 }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q18 q=new Q18(); //creating object of the class
   q.matrix_B_Max(new int[][]{  {1,2,3},
                                {4,5,6},
                                {7,8,-1} });
 }//closing of main() 
/*closing of class*/
}