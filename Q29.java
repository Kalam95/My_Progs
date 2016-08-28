 /*Programer :- Alam*/
 package Assignment1;
  /*Program to find lcm of the given array*/
 public class Q29
 {
     /*FUNCTION CALCULATING THE LCM OF 2 No.s*/
  public int lcm(int a,int b)
   {
    int l;
    for(l=a>b?a:b;l<a*b;l+=a>b?a:b)
      if(l%a==0&&l%b==0)
       break;
          
    return l;   
   }//closing of function
    /*FUNCTION Accessing array and calling above to find lcm*/
  public void lcm1(int x[])
  {
     
    System.out.print("\n\n\t\t THE LCM FOR THE GIVEN ARRAY    :- [ " );
    for(int i=0;i<x.length;i++)
      System.out.print(x[i]+"  ");
    System.out.print("]");  
    int l=lcm(x[0],x[1]);
    for(int i=0;i<x.length;i++)
      l=lcm(x[i],l);
    System.out.print("\n\n\t\t THE LCM FOR THE GIVEN ARRAY IS :- "+l); 
   }//closing of function
  public static void main(String... s)
 {
  Q29 q=new Q29();
  q.lcm1(new int[]{2,4,7,5});
 
 }//closing of main()
 
 /*END OF CLASS*/
 }
 