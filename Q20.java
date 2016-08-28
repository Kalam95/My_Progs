                    /*Programmer :- Alam*/
package Assignment1;
      /*Program to apply shift operation on the given */
public class Q20
{
     /*FUNCTION TO APLLY SHIFT OPERATION*/
 public void SHIFT(int x[])
  {
    int i,j,temp=0;
       /*PRINTING THE GIVEN ARRAY*/
    System.out.print("\n\n\t\tTHE GIVEN ARRAY IS :- {");
    for(i=0;i<x.length;i++)
      System.out.print(" "+x[i]); 
    /*APPLYING SHIFT OPERATION :- */
    for(i=0;i<x.length;i++)
     {
       for(j=i+1;j<x.length;j++)   
         if(x[i]>x[j])
           {
              temp=x[i];
              x[i]=x[j];
              x[j]=temp; 
            }
        if(x[i]<0)
          temp=i;
      }
   for(i=0;i<temp;i++)
    {
       if(x[i]<0&&x[temp-1]<0)
         if(x[i]<x[temp-1])
           {
              x[i]=x[i]+x[temp-1];
              x[temp-1]=x[i]-x[temp-1];
              x[i]=x[i]-x[temp-1];
           }    
      temp--;
    }
        /*PRINTING THE GIVEN ARRAY*/
    System.out.print(" }\n\n\t\tTHE RESULTAND ARRAY AFTER SHIFTING IS :- { ");
    for(i=0;i<x.length;i++)
      System.out.print(" "+x[i]); 
    System.out.print(" }");
  }
 public static void main(String... s)
  {
    System.out.print("\033[H\033[2J");
    Q20 q=new Q20();
    q.SHIFT(new int[]{1,4,3,2,5,-1,-5,-2,-4,-3});
  }//closing main()
/*CLOSING OF CLASS*/
}