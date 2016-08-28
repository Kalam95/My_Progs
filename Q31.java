 /*Programer :- Alam*/
 package Assignment1;
  /*Program to find 3rd largest element in the given array*/
 public class Q31
 {
     
    /*FUNCTION to find 3rd largest element in the given array*/
  public void THIRD_LARGEST(int x[])
  {
     int t=0,f=0,s=0,i;
    System.out.print("\n\n\t\t THE LCM FOR THE GIVEN ARRAY                     :- [ " );
    for(i=0;i<x.length;i++)
      System.out.print(x[i]+"  ");
    System.out.print(" ]");  
    for(i=0;i<x.length;i++)
      if(x[i]>f)
        f=x[i];
    for(i=0;i<x.length;i++)
      if(x[i]>s&&x[i]<f)
        s=x[i];
    for(i=0;i<x.length;i++)
      if(x[i]>t&&x[i]<s)
        t=x[i];
    System.out.print("\n\n\t\t THE 3rd LARGEST ELEMNT IN THE ARRAY ABOVE IS   :- "+t); 
   }//closing of function
  public static void main(String... s)
 {
  Q31 q=new Q31();
  q.THIRD_LARGEST(new int[]{2,4,7,5});
 
 }//closing of main()
 
 /*END OF CLASS*/
 }
 