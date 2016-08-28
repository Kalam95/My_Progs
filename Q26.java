    /*Programmer :- Alam*/
package Assignment1;
    /*Program to PRINT MATRIX DIAGONALWISE */
public class Q26
{
  /*Function to PRINT MATRIX DIAGONALWISE*/
  public void DIAGONAL_WISE_PRINT(int[][] x)
  {
    int i,j,loc=1;
    System.out.print("\n\n\t\tTHE GIVEN MATRIX IS :-\n\n\t\t");
      /* Printing the array */
    for(i=0;i<x.length;i++)
     {
       for(j=0;j<x[i].length;j++)
          System.out.print(x[i][j]+"  ");
       System.out.print("\n\t\t");
     } 
   System.out.print("\n\n\t\tPRINTING THE MATRIX DIAGONAL WILSE :-\n\t\t");
   /*APPLYING ALGO. PRINT MATRIX DIAGONALWISE*/
   for(int k=0;k<x.length;k++)
    {
      for(i=k,j=0;(i>=0);i--,j++)
         System.out.print(x[i][j]+"  ");
      System.out.print("\n\t\t");
    }
  for(int k=0;k<x.length;k++)
    {
      for(i=x.length-1,j=loc;(j<x[k].length);i--,j++)
         System.out.print(x[i][j]+"  ");
      System.out.print("\n\t\t");
      loc++;
    }
  }//closing of function 

public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
    Q26 q=new Q26();
    q.DIAGONAL_WISE_PRINT(new int[][]{ {1,2,3,4,5},
                                       {6,7,8,9,0},
                                       {2,4,5,6,7}, 
                                       {2,4,2,4,6},
                                       {0,1,1,1,1}  } );
  }//closing of main
/*ENDING OF CLASS*/
}