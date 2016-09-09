    /*Programmer :- Alam*/
package Assignment1;
    /*Program TO COVERT Array(having digits values) TO WORDS
       for eg array is :- {1,2,3}
         ans will be ="one hundred three"*/
   /*here the program i made is in accordance with INDIAN PLACES VALUE SYSTEM 
      and does its task up to "arab places "*/
public class Q25
{
  /*Function TO COVERT Array(having digits values) to digits*/
  public String word_to_num(int[] a)
  {
       System.out.print("\n\nTHE GIVEN VALUE IS\t\t:- [ ");
       for(int k=0;k<a.length;k++)
       System.out.print(a[k]);
        String no[]={""," ONE "," TWO "," THREE "," FOUR "," FIVE "," SIX "," SEVEN "," EIGHT "," NINE "};
	String no1[]={" TEN "," ELEVEN "," TWELVE "," THIRTEEN "," FOURTEEN "," FIFTEEN "," SIXTEEN "," SEVENTEEN "," EIGHTEEN "," NINTEEN "};
	String no3[]={"",""," TWENTY "," THIRTY "," FOURTY "," FIFTY "," SIXTY "," SEVENTY "," EIGHTY "," NINTY "};
	String places[]={" ARAB "," CAROR ","  LAKH "," THOUSAND "};
	String word="";
	//int a[]={0};
	int j=places.length,i=a.length-5;
        if(a.length==1)
         word=no[a[0]]+word; 
        else if(a.length==2)
         switch(a[0]){
            case 1:word=no1[a[1]]+word;break;
            case 2:word=no3[a[0]]+no[a[0]]+word;
        }
        else{
        switch(a[a.length-1])
	  {
	  	case 0:word=no[a[a.length-1]]+word;break;
	  	case 1:word=no1[a[a.length-1]]+word;break;
	  	default :word=no3[a[a.length-2]]+no[a[a.length-1]]+word;break;
	  }
	  
	
	switch(a[a.length-3]){
		case 0:break;
	default : word=no[a[a.length-3]]+" HUNDRED "+word;
    }
    while(i>=0)
    {
    	j--;
    	switch(a[i])
    	{
    	            case 0:if(a[i+1]!=0)word=no[a[i+1]]+places[j]+word;break;
	  	    case 1:word=no1[a[i+1]]+places[j]+word;break;
	  	    default :word=no3[a[i]]+no[a[i+1]]+places[j]+word;break;
		}
	i-=2;}
        if((a.length%2==0)&&(a[0]!=0))
         word=no[a[0]]+places[--j]+word;
        }
        if(word.equals(""))word="OPPS!!! ";
     return word;
  }//closing of function
public static void main(String... s) 
  {
    System.out.print("\033[H\033[2J");
    Q25 q=new Q25();
    /**the function is called and returns a string calculated for the corrosponding no*/
    System.out.println(" ]\n\nTHE NO IN WORDS IS\t\t:- "+q.word_to_num(new int[]{0,0,0})+"\n\n");
     }//closing of main
/*ENDING OF CLASS*/
}