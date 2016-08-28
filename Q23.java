    /*Programmer :- Alam*/
package Assignment1;
    /*Program TO COVERT Array(having binary values) to decimal value*/
public class Q23
{
  /*Function TO COVERT Array(having binary values) to decimal value*/
  public void B_to_D(int[] x)
  {
    int i,j;
    int temp=1,no=0;
    System.out.print("\n\n\t\t\tTHE GIVEN ARRAY(BINARY VALE) IS                     :-  [ ");
      /* Printing the array */
    for(i=0;i<x.length;i++)
       System.out.print(x[i]+"");
    System.out.print(" ]\n\n");
      /*APPLYING ALGO. TO COVERT Array(having binary values) to decimal value*/
    for( i=x.length-1;i>=0;i--)
      {
         if(i!=x.length-1)
           temp*=2;     
         no=no+x[i]*temp;
       } 
      System.out.println("\n\t\t\tTHE DECIMAL NO IS EQUIVALENT TO THE BINARY VALE IS  :-  "+no);
  }//closing of function 
void D_to_B(int x)
{
 if(x!=0&x!=1){
 
  int a=x%2;
   D_to_B(x/2);   
   System.out.print(a);
  return;
  }
 else{
    System.out.print(x); 
    return;
}  }
public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
  Q23 q=new Q23();
    q.B_to_D(new int[]{1,1,1,1});
  System.out.print("\n\n\t\t\tThe BINARY NO. CORROSPONDING TO GIVEN DECIMAL VALUE :- [ "); 
   q.D_to_B(15);
    System.out.print(" ]");
  }//closing of main
/*ENDING OF CLASS*/
}