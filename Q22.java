    /*Programmer :- Alam*/
package Assignment1;
    /*Program to find first non repeating element*/
public class Q22
{
  /*Function to first non repeating elemnt in the given array*/
 public void firstNonRepeatingElement(int[] x)
  {
    int i,j;
    boolean flag=false;
    System.out.print("\n\n\t\t\tTHE GIVEN ARRAY IS :-  { ");
      /* Printing the array */
    for(i=0;i<x.length;i++)
       System.out.print(x[i]+" ");
    System.out.print("}");
      /*APPLYING ALGO. TO FIND first non repeating ELEMENT*/
    for( i=0;i<x.length;i++)
      {
         flag=true;
         for(j=i+1;j<x.length;j++)
           if(x[i]==x[j])
             flag=false;
         if(flag)
          {
             System.out.print("\n\n\t\t\tTHE FIRST NON REPEATING ELEMENT IN THE ARRAY IS :- [ "+x[i]+" ]"); 
             break; 
          }
      }
  }//closing of function 
 public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
    Q22 q=new Q22();
    q.firstNonRepeatingElement(new int[]{1,1,3,3,4,5,6,1,3,3});
    
  }//closing of main
/*ENDING OF CLASS*/
}