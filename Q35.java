   /*PROGRAMMER :- ALAM*/
package Assignment1;
 /*Program to make given(initially of all zeros) to a desired array in minimum no fo operations:
    and allowed operations are :- 
    1.INCRIMENT :- any elemnt when requred can be incrimented
    2. DOUBLE   :- multiply each and every element of array by 2*/
class Q35
{
 int count=0;
 int[] y;
 /*THE FUNCTION TO PERFORM THE TASK AND GOES IN RECURSION */
 void makeEqualsToDesired(int x[])
 {
    boolean flag=true;
    int i;
    int n[]=new int[x.length];
    for(i=0;i<x.length;i++)
     {
       n[i]=-1;
       if(x[i]!=0)
	flag=false;
     }
    if(!flag)
     {
       for(i=0;i<x.length;i++)
         if(x[i]%2!=0)
          {
            n[i]=i;
	    x[i]--;
          }
       flag=true;
       for(i=0;i<x.length;i++)
	 if(x[i]!=0)flag=false;
       if(flag)
       {
         for(i=0;i<x.length;i++)
	   if(n[i]!=-1)
            {
	      y[n[i]]++;
              count++;     	
            }
	 return;
       }
       for(i=0;i<x.length;i++)
         x[i]/=2;
       flag=true;
       for(i=0;i<x.length;i++)
	 if(x[i]!=0)
           flag=false;
       if(flag)
        {
          for(i=0;i<x.length;i++)
	   {
	     ++y[i];
             ++y[i];
             count+=2;
	   } 
         return;   	     	
        }
      makeEqualsToDesired(x);
      for(i=0;i<x.length;i++)
        y[i]*=2;
      count++;
      for(i=0;i<x.length;i++)
	if(n[i]!=-1)
         {
	  ++y[n[i]];
          count++;
         }	 	  
     }
    System.err.print("\n\tSTEP :- "+count+"\n\t\t\tCHANGE IN GIVEN ARRAY IS \t\t\t :- [ ");
    for(i=0;i<x.length;i++)
       System.out.print(y[i]+" ");
    System.out.print("]");
  }//closing of functon
 public static void main(String... s)
 {
    System.out.print("\033[H\033[2J");
    Q35 q=new Q35();
    int x[]={16,16,16};
    q.y=new int[x.length];
    System.out.print("\n\n\t\t\tTHE DESIRED ARRAY IS \t\t\t\t :- [ ");
    for(int i=0;i<x.length;i++)
      System.out.print(x[i]+" ");
    System.out.print("]\n\n\t\t\tTHE GIVEN ARRAY IS \t\t\t\t :- [ ");
    for(int i=0;i<q.y.length;i++)
      System.out.print(q.y[i]+" ");
    q.makeEqualsToDesired(x);
    System.out.print("\n\n\t\t\tTHE TOTAL NO OF OPERATIONS DONE OF ARRAY ARE \t :- [ "+q.count+" ]"); 
  }//closing of main()
/**ENDING OF THE CLASS*/
}