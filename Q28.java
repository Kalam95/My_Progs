    /*Programmer :- Alam*/
package Assignment1;
    /*Program TO PRINT THE ARRY TRIANGLE-WISE*/
public class Q28
{
  /*Function TO TO PRINT THE ARRY TRIANGLE-WISE*/
  public void TRIANGLE_WISE_PRINT(int[] x)
  {
    int i,k=0;
    int loc=1,no=0;
    System.out.print("\n\n\t\tTHE GIVEN ARRAY IS                    :-  [ ");
      /* Printing the array */
    for(i=0;i<x.length;i++)
       System.out.print(x[i]+" ");
    System.out.print(" ]\n\n");
      /*APPLYING ALGO. TO TO PRINT THE ARRY TRIANGLE-WISE*/
    System.out.print("\n\n\t\tTHE TRIANGLE-WISE PRINT WILL BE AS    :-\n\t\t\t");
   for(no=0;no<=(x.length/2);no++)
    {
      for(i=loc;i<(no+loc);i++)
        {
          if(i==x.length)break;
          System.out.print(x[i]+"  ");
        }
      loc=i;
      
      System.out.print("\n\t\t\t");
    }
  }//closing of function 
public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
  Q28 q=new Q28();
    q.TRIANGLE_WISE_PRINT(new int[]{5,1,2,4,3,6,7,8,9,10,11});
 }//closing of main
/*ENDING OF CLASS*/
}