              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to sort in array*/
public class Q5
{
/*Function to Sort the given array */
public void sort(int x[])
 {
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-  {");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
     System.out.print(x[i]+", ");  
   /*applying Bubble Sort algo*/
  for(int i=0;i<x.length;i++)
       for(int j=1;j<(x.length);j++)
         if(x[j-1]>x[j])
           {
    /*Swapping without using 3rd variable*/
              x[j]=x[j-1]+x[j];
              x[j-1]=x[j]-x[j-1];
              x[j]=x[j]-x[j-1];            
           }  
   System.out.print("}\n\n\t\tTHE SORTED  ARRAY IS :- {");
    /* Printing the sorted array */
  for(int i=0;i<x.length;i++)
     System.out.print(x[i]+", ");
  System.out.print("}");
 }//closing of max function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q5 q=new Q5(); //creating object of the class
      q.sort(new int[]{1,2,3,4,5,7,6,8,9,-1});
 }//closing of main() 
/*closing of class*/
}