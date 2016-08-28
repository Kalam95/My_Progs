                           /* Programmer :-   Alam   */
package Assignment1;
                        /*Program to find min in array*/
public class Q2
{
/*Function to find minimum value in the given array */
public int min(int x[])
 {
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS                      :-  {");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
    System.out.print(x[i]+", ");
  System.out.print("}");  
   int min_val=0;  // Assumed Minimum Value
   /*Calculating Minimum Value*/
   for(int i=0;i<x.length;i++)
         if(x[i]<min_val)
               min_val=x[i];
   System.out.print("\n\n\t\tTHE MINIMUM VALUE IN THE GIVEN ARRAY IS :- ");
   return min_val;
 }//closing of max function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J"); //THIS IS THE AScii CODE for clearing console
    Q2 q=new Q2(); //creating object of the class
   System.out.print(q.min(new int[]{1,2,3,4,5,6,7,8,9,-1}));
 }//closing of main() 
/*closing of class*/
}