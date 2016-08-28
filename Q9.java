              /* Programmer :-   Alam   */
package Assignment1;
     /*program to find intersection without using any 3rd array*/
public class Q9
{
/*Function to intersection the given arrays */
public void inter_sec(int x[],int y[])
 {
    int i,j;
    boolean flag;
   /* Printing the arrays */
    System.out.print("\n\n\t\tFIRST ARRAY IS\t\t\t\t :-  { ");
    for(i=0;i<x.length;i++)
       System.out.print(x[i]+", ");  
    System.out.print("}\n\n\t\tSECOND ARRAY IS\t\t\t\t :-  { ");
    for(i=0;i<y.length;i++)
        System.out.print(y[i]+", ");  
    /*applying algo to get the Intersection*/
    System.out.print("}\n\n\t\tTHE INTER-SECTION OF THE GIVEN ARRAYS IS :-  { ");
     for(i=0;i<x.length;i++)
        {
            flag=false;
            for(j=0;j<y.length;j++)
               {
                    if(x[i]==y[j])
                        flag=true;
                }  
            for(j=i+1;j<x.length;j++)
               if(x[i]==x[j])
                   flag=false;
            if(flag==true)
               System.out.print(x[i]+", ");      
        }
 System.out.print("}");
  }//closing of function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q9 q=new Q9(); //creating object of the class
      q.inter_sec(new int[]{1,2,3,3,4,5,7,6,8,9,-1},new int[]{1,3,3,2,11,12,14,-1});
 }//closing of main() 
/*closing of class*/
}