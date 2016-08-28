    /*Programmer :- Alam*/
package Assignment1;
    /*Program to find frequency of each element*/
public class Q21
{
 public void frequency(int[] x)
  {
    int i,j,k,count;
    boolean flag=false;
    System.out.print("\n\n\t\t\tTHE GIVEN ARRAY IS :-  { ");
      /* Printing the array */
    for(i=0;i<x.length;i++)
       System.out.print(x[i]+" ");
    System.out.print("}");
      /*APPLYING ALGO. TO FIND FREQUENCY OF EACH ELEMENT*/
    for( i=0;i<x.length;i++)
      {
         flag=true;count=1;
         for(k=i-1;k>=0;k--)
           if(x[i]==x[k])
             flag=false;
         for(j=i+1;j<x.length;j++)
           if(x[i]==x[j])
             count++;
         if(flag)
          System.out.print("\n\n\t\t\t[ "+x[i]+" ] COMES [ "+count+" ] TIMES IN THE GIVEN ARRAY "); 
     
      }

  } 
 public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
    Q21 q=new Q21();
    q.frequency(new int[]{1,1,3,3,4,5,6,1,3,3});
    
  }//closing of main
/*ENDING OF CLASS*/
}