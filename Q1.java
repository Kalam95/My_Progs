              /* Programmer :-   Alam   */
package Assignment1;
            /*Program to find max in array*/
public class Q1
{
/*Function to find maximum value in the given array */
public int max(int x[])
 {
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-  {");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
     System.out.print(x[i]+", ");  
   int max_val=0;  // Assumed Max Value
   System.out.print("}");
  /*Calculating Maximum Value*/
   for(int i=0;i<x.length;i++)
         if(x[i]>max_val)
               max_val=x[i];
   System.out.print("}\n\n\t\tTHE MAXIMUM VALE IN THE GIVEN ARRAY IS :- ");
   return max_val;
 }//closing of max function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q1 q=new Q1(); //creating object of the class
   System.out.print(q.max(new int[]{1,2,3,4,5,6,7,8,9,-1}));
 }//closing of main() 
/*closing of class*/
}