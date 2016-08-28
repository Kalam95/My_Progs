 /*Programer :- Alam*/
 package Assignment1;
  /*Program to find hcf of the given array*/
 public class Q30
 {
     /*FUNCTION CALCULATING THE HCF OF 2 No.s*/
  public int hcf(int a,int b)
   {
    int h=0;
    for(h=a<b?a:b;h>1;h--)
      if(a%h==0&&b%h==0)
       break;
          
    return h;   
   }//closing of function
    /*FUNCTION Accessing array and calling above to find hcf*/
  public void hcf1(int x[])
  {
     
    System.out.print("\n\n\t\t THE LCM FOR THE GIVEN ARRAY     :- [ " );
    for(int i=0;i<x.length;i++)
      System.out.print(x[i]+"  ");
    System.out.print("]");  
    int h=hcf(x[0],x[1]);
    for(int i=0;i<x.length;i++)
      h=hcf(x[i],h);
    System.out.print("\n\n\t\t THE LCM FOR THE GIVEN ARRAY IS  :- "+h); 
   }//closing of function
  public static void main(String... s)
 {
  Q30 q=new Q30();
  q.hcf1(new int[]{2,4,7,5});
 
 }//closing of main()
 
 /*END OF CLASS*/
 }
 