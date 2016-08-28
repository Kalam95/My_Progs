 /*Programer :- Alam*/
 package Assignment1;
  /*Program to find mode for given array*/
 public class Q34
 {     
    /*FUNCTION to find mode for given array*/
  public void mode(int x[])
  {
     int i,f=0,c=0,mode=0;
    System.out.print("\n\n\t\tTHE GIVEN ARRAY IS\t\t:- [ " );
    for(i=0;i<x.length;i++)
        System.out.print(x[i]+"  ");
    for(i=0;i<x.length;i++)
     {
      for(int j=i+1;j<x.length;j++)
        if(x[i]==x[j])
          c++;
      if(f<c)
       {
         f=c;
         mode=i;
       }
      }       
     if(f!=0)
      System.out.print("]\n\n\t\tTHE MODE FOR THE ARRAY IS    \t:- "+x[mode]); 
     else
      System.out.print("]\n\n\t!!!!OPPs THERE IS NO MODE FOR THE LIST, HAVING NO REPEATED VALUE");
   }//closing of function
  public static void main(String... s)
  {

    Q34 q=new Q34();
    q.mode(new int[]{2,4,7,5});
  }//closing of main()
 
 /*END OF CLASS*/
 }
 