    /*Programmer :- Alam*/
package Assignment1;
    /*Program to FInd row having maximun no of 1s, in a given ,matrix */
public class Q24
{
  /*Function to FInd row having maximun no of 1s, in a given ,matrix*/
  public void ROW_IN_MAX_1s(int[][] x)
  {
    int i,j,loc=0;
    int max_one=0,one_count=0;
    System.out.print("\n\n\t\tTHE GIVEN MATRIX IS :-\n\n\t\t");
      /* Printing the array */
    for(i=0;i<x.length;i++)
     {
       for(j=0;j<x[i].length;j++)
          System.out.print(x[i][j]+"  ");
       System.out.print("\n\t\t");
     } /*APPLYING ALGO. to FInd row having maximun no of 1s, in a given ,matrix*/
   System.out.print("\n"); 
   for(i=0;i<x.length;i++)
     {
       for(j=0;j<x[i].length;j++)
         if(x[i][j]==1)
            one_count++;
        if(one_count>max_one)
          {
              max_one=one_count;
              loc=i;
          } 
       System.out.print("\n\t\tTHE ["+(i+1)+"]th ROW IS HAVING ["+one_count+"] No OF ONES");
     }
   
       System.out.print("\n\n\t\tTHE ["+(loc+1)+"]th ROW IS HAVING [ MAXIMUM ] No OF ONES");
  }//closing of function 

public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
    Q24 q=new Q24();
    q.ROW_IN_MAX_1s(new int[][]{ {0,0,0,0,0},
                                 {0,0,0,0,1},
                                 {0,0,0,1,1}, 
                                 {0,0,1,1,1},
                                 {0,1,1,1,1}  } );
  }//closing of main
/*ENDING OF CLASS*/
}