                              /* Programmer :-   Alam   */
package Assignment1;
             /*Program to Transpose in array*/
public class Q12
{
/*Function to Transpose the given 2D array */
public void Transpose(int x[][])
 {
  System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :-\n\n\t\t");
  /* Printing the array */
  for(int i=0;i<x.length;i++)
   {  
     for(int j=0;j<x[i].length;j++)
        System.out.print(x[i][j]+"  ");  
     System.out.print("\n\t\t");
   }
   /*Algo to transpose the given matrix*/
   for(int i=0;i<x.length;i++)
      for(int j=0;j<+i;j++)   
           {x[i][j]=x[i][j]+x[j][i];
            x[j][i]=x[i][j]-x[j][i];
            x[i][j]=x[i][j]-x[j][i];}
   System.out.print("\n\n\t\tTHE RESULT OF THE TRANSPOSE ON GIVEN ARRAY IS :- \n\n\t\t");
   for(int i=0;i<x.length;i++)
    {  
      for(int j=0;j<x[i].length;j++)
         System.out.print(x[i][j]+"  ");  
      System.out.print("\n\t\t");
    }
   
 }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q12 q=new Q12(); //creating object of the class
   q.Transpose(new int[][]{ {1,2,3},
                            {4,5,6},
                            {7,8,-1} });
 }//closing of main() 
/*closing of class*/
}