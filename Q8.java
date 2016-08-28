              /* Programmer :-   Alam   */
package Assignment1;
        
             /*Program to union 2 arrays Without using any 3rd array*/
public class Q8
{
/*Function to union the given arrays */
public void union(int x[],int y[])
 {
    int i,j,k;
     i=j=k=0;
    boolean flag=false,flag2=false;  
      /* Printing the arrays */
    System.out.print("\n\n\t\tFIRST ARRAY IS\t\t\t   :-  {");
     for(i=0;i<y.length;i++)
       System.out.print(y[i]+", ");
    System.out.print("}\n\n\t\tSECOND ARRAY IS\t\t\t   :-  {");
    for(i=0;i<x.length;i++)
       System.out.print(x[i]+", ");       
    /*applying algo to get the union*/
    System.out.print("}\n\n\t\tTHE UNION OF THE GIVEN ARRAYS IS   :-  {");
    System.out.print(y[0]+", ");
    for(i=1;i<y.length;i++)
       {
         flag=true;  
         for(j=i-1;j>=0;j--)
              if(y[i]==y[j])
                 { flag=false;} 
         if(flag==true)
            System.out.print(y[i]+", ");
       }
    for(i=0;i<x.length;i++)
     {
        flag=true;flag2=true;  
        for(j=0;(j<y.length);j++)
             if((x[i]==y[j]))
                {flag=false;} 
        for(k=i+1;k<x.length;k++)
           if(x[i]==x[k])
              {flag2=false;}
        if((flag==true)&&(flag2==true))
           System.out.print(x[i]+", ");
     }    
   System.out.print(" }");
  }//closing of union function
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q8 q=new Q8(); //creating object of the class
      q.union(new int[]{1,3,2,11,12,1,14,-1},new int[]{2,4,4,3,5,7,6,8,9,-1});
 }//closing of main() 
/*closing of class*/
}