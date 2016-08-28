    /*Programmer :- Alam*/
package Assignment1;
    /*Program to PRINT MATRIX SEQUENCAL-DIAGONAL-WISE */
public class Q27
{
  /*Function to PRINT MATRIX SEQUENCAL-DIAGONAL-WISE*/
  public void SEQUENCE_DIAG_WISE(int[][] x)
  {
    int i=0,j=0,l=0,p=0,loc=1;
    System.out.print("\n\n\t\tTHE GIVEN MATRIX IS :-\n\n\t\t");
      /* Printing the array */
    for(i=0;i<x.length;i++)
     {
       for(j=0;j<x[i].length;j++)
          System.out.print(x[i][j]+"  ");
       System.out.print("\n\t\t"); 
     } 
   System.out.print("\n\n\t\tPRINTING THE MATRIX DIAGONAL WILSE :-\n\t\t");
   /*APPLYING ALGO. PRINT MATRIX SEQUENCAL-DIAGONAL-WISE*/
   for(int k=0;k<x.length;k+=2)
    {
       
      for(i=k,j=0;(i>=0);i--,j++)
         System.out.print(x[i][j]+"  ");
      System.out.print("\n\t\t");
      if(j==x.length)break;
      for(l=i+1,p=j;(p>=0);l++,p--)
         System.out.print(x[l][p]+"  ");
      System.out.print("\n\t\t");
    }
    
   for(int k=0;k<x.length;k+=2)
    {  
        j=j-1;i=i+1;     
        for(l=i+1,p=j;(l<x.length);l++,p--)
          System.out.print(x[l][p]+"  ");
        System.out.print("\n\t\t"); 
        for(i=x.length-1,j=p+2;j<x.length;i--,j++)
         System.out.print(x[i][j]+"  ");
      System.out.print("\n\t\t");    

    }
 
  }//closing of function 

public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
    Q27 q=new Q27();
    q.SEQUENCE_DIAG_WISE(new int[][]{ {1,2,3,4,5},
                                       {6,7,8,9,0},
                                       {2,4,5,6,7}, 
                                       {2,4,2,4,6},
                                       {0,1,1,1,1}  } );
  }//closing of main
/*ENDING OF CLASS*/
}