                        /* Programmer :-   Alam   */
package Assignment1;
                   /*Program to find max in 2D-array*/
public class Q3
{
/*Function to find maximum value in the given 2D array */
public int max(int x[][])
 {
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-\n\n\t\t\t\t\t");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
   {  
     for(int j=0;j<x[i].length;j++)
        System.out.print(x[i][j]+"  ");  
     System.out.print("\n\t\t\t\t\t");
   }
   int max_val=0;  // Assumed Max Value
   /*Calculating Maximum Value*/
   for(int i=0;i<x.length;i++)
      for(int j=0;j<x[i].length;j++)   
            if(x[i][j]>max_val)
               max_val=x[i][j];
   System.out.print("\n\n\t\tTHE MAXIMUM VALE IN THE GIVEN ARRAY IS :- ");
   return max_val;
 }//closing of max function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q3 q=new Q3(); //creating object of the class
   System.out.print(q.max(new int[][]{
                                      {1,2,3},
                                      {4,5,6},
                                      {7,8,-1} }));
 }//closing of main() 
/*closing of class*/
}