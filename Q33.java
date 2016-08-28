 /*Programer :- Alam*/
 package Assignment1;
  /*Program to find mean for given array*/
 public class Q33
 {     
    /*FUNCTION to find mean for given array*/
  public void mean(int x[])
  {
     int i,mean=0;
    System.out.print("\n\n\t\tTHE GIVEN ARRAY IS\t\t:- [ " );
    for(i=0;i<x.length;i++)
      {
        System.out.print(x[i]+"  ");
         mean+=x[i];
      }    
    System.out.print("]\n\n\t\tTHE MEAN FOR THE ARRAY IS    \t:- "+(float)mean/x.length); 
   }//closing of function
  public static void main(String... s)
 {
  Q33 q=new Q33();
  q.mean(new int[]{2,4,7,5});
 
 }//closing of main()
 
 /*END OF CLASS*/
 }
 