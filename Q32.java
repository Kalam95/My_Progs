 /*Programer :- Alam*/
 package Assignment1;
  /*Program to find median for given array*/
 public class Q32
 {     
    /*FUNCTION to find median for given array*/
  public void median(int x[])
  {
     int i;float median=0.0f;
    System.out.print("\n\n\t\tTHE GIVEN ARRAY IS\t\t:- [ " );
    for(i=0;i<x.length;i++)
      System.out.print(x[i]+"  ");
    System.out.print(" ]");  
    for(i=0;i<x.length;i++)
      for(int j=i+1;i<x.length;i++)
         if(x[i]>x[j])
           {
             x[i]=x[i]+x[j];
             x[j]=x[i]-x[j];
             x[i]=x[i]-x[j];
           }    
    System.out.print("\n\n\t\tTHE SORTED ARRAY IS\t\t:- [ " );
    for(i=0;i<x.length;i++)
      System.out.print(x[i]+"  ");
    median=((x.length%2)==0)?((float)(x[x.length/2]+x[(x.length/2)-1]))/2:x[x.length/2];
    System.out.print("]\n\n\t\tTHE MEDIAN FOR THE ARRAY IS  \t:- "+median); 
   }//closing of function
  public static void main(String... s)
 {
  Q32 q=new Q32();
  q.median(new int[]{2,4,7,5});
 
 }//closing of main()
 
 /*END OF CLASS*/
 }
 