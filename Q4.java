                              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to find min in array*/
public class Q4
{
/*Function to find minimum value in the given 2D array */
public int min(int x[][])
 {
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-\n\n\t\t\t\t\t");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
   {  
     for(int j=0;j<x[i].length;j++)
        System.out.print(x[i][j]+"  ");  
     System.out.print("\n\t\t\t\t\t");
   }
   int min_val=0;  // Assumed Min Value
   /*Calculating Minimum Value*/
   for(int i=0;i<x.length;i++)
      for(int j=0;j<x[i].length;j++)   
            if(x[i][j]<min_val)
               min_val=x[i][j];
   System.out.print("\n\n\t\tTHE MINIMUM VALE IN THE GIVEN ARRAY IS :- ");
   return min_val;
 }//closing of max function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q4 q=new Q4(); //creating object of the class
   System.out.print(q.min(new int[][]{
                                      {1,2,3},
                                      {4,5,6},
                                      {7,8,-1} }));
 }//closing of main() 
/*closing of class*/
}