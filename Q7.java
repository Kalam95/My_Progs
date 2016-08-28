		/* Programmer:- Alam*/
package Assignment1;
		/*PROGRAM IMPLIMENTING MERG SORT*/
public class Q7
{
   /*FUNCTION IMPLIMENTING MERG SORT*/
  public void merg_sort(int[] x,int[] y)
   {
     int[] z=new int[x.length+y.length];
     int k=0,i,j;
    /*PRINTING TEH ARRAYS */
    System.out.print("\n\n\t\tFIRST ARRAY IS\t\t\t   :-  {");
     for(i=0;i<y.length;i++)
       System.out.print(y[i]+", ");
    System.out.print("}\n\n\t\tSECOND ARRAY IS\t\t\t   :-  {");
    for(i=0;i<x.length;i++)
       System.out.print(x[i]+", ");       
 
     /*COPPING FIRST ARRAY IN Z*/
     for(i=0;i<x.length;i++,k++)
        z[k]=x[i]; 
         /*COPPYING SECOND ARRAY*/
     for(j=0;j<y.length;j++,k++)   
        z[k]=y[j]; 
    /*APPLYING SORTING IN RESULTED ARRAY*/
     new Q5().sort(z);
   }//closing of function
  public static void main(String... s)
   {
     System.out.print("\033[H\033[2J");
     Q7 q=new Q7();
     q.merg_sort(new int[]{3,2,1},new int[]{7,6,5,4});
   }//Closing of main()
}//closing of class