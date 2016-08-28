    /*Programmer :- Alam*/
package Assignment1;
    /*Program TO COVERT Array(having digits values) to numeriacal  value*/
public class Q25
{
  /*Function TO COVERT Array(having digits values) to numeriacal  value*/
  public void word_to_num(int[] x)
  {
    int i;
    int temp=1,no=0;
    System.out.print("\n\n\t\t\tTHE GIVEN ARRAY(BINARY VALE) IS      :-  [ ");
      /* Printing the array */
    for(i=0;i<x.length;i++)
       System.out.print(x[i]+" ");
    System.out.print(" ]\n\n");
      /*APPLYING ALGO. TO COVERT Array(having digits values) to numeriacal  value*/
    for(i=x.length-1;i>=0;i--)
      {
        if(i!=x.length-1)
           temp=temp*10;
        no=no+x[i]*temp;
      }
    System.out.println("\n\t\t\tTHE NUMBER REPRESENTED BY THE ARRAY  :-  "+no);
  }//closing of function 
  /*UNCTION TO REVERSE THE TASK OF FUNCTION ABOVE */ 
void num_to_word(int x)
  {
    System.out.print("\n\n\t\tTHE WORD(DIGIT) FORM OF GIVEN NO [ "+x+"] IS :- [");
    if(x==0||(x<10&&x>-10))
     {
       System.out.print(" "+x);
       return;
     }
    
    while(x!=0)
     {
      System.out.print((x%10)+" ");
     x/=10;
     } 
    System.out.print("]");
  }//closing of function
public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
  Q25 q=new Q25();
    q.word_to_num(new int[]{5,1});
    q.num_to_word(10); 
 }//closing of main
/*ENDING OF CLASS*/
}