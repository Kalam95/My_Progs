    /*programmer :- Alam*/
package Assignment1;
    /*PROGRAM TO APPLY SORTING ON 2D ARRAY*/
public class Q6
{
  /*FUNCTION TO SORT THE ARRAY OF ARRAYS*/
  public void sort(int x[][])
  {
    /*Printing the given array*/ 
    System.out.print("\n THE GIVEN ARRAY IS :\n\t");
    for(int i=0;i<x.length;i++)
     {
       for(int j=0;j<x[i].length;j++)
         System.out.print("  "+x[i][j]);   
       System.out.print("\n\t");
     }
     /*APPLYING SORTING ALGO*/
     for(int i=0;i<x.length;i++)
        for(int j=0;j<x[i].length;j++)
            for(int k=0;k<x.length;k++)
               for(int l=0;l<x[i].length;l++)
                  if(x[i][j]<x[k][l])
                   {
                      x[i][j]=x[i][j]+x[k][l];
                      x[k][l]=x[i][j]-x[k][l];
                      x[i][j]=x[i][j]-x[k][l];
                   }System.out.print("\n"); 
      /*Printing the sorted array*/ 
    System.out.print("\n THE SORTED ARRAY IS :\n\t");
    for(int i=0;i<x.length;i++)
     {
       for(int j=0;j<x[i].length;j++)
         System.out.print("   "+x[i][j]);   
       System.out.print("\n\t");
     }
  }//closing of function 
  public static void main(String s[])
   {
      System.out.print("\033[H\033[2J");
      Q6 q=new Q6();
      q.sort(new int[][]{
                         {7,4,8},
                         {4,1,3},
                         {1,9,10} }); 
   }//closing of main()
  /*ENDING OF CLASS*/
}