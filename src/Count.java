import java.util.Scanner;
public class Count 
{
	public static long countOccurences(String s, char c){
	    return s.chars().filter(ch -> ch == c).count();
	}
	public static void main(String args[])
	{	
	    Scanner in = new Scanner( System.in);
	    while(true) 
	    {
	    	String str = in.next();
	    	
	    	if(countOccurences(str,'+')>1 || countOccurences(str,'-')>1 || countOccurences(str,'/')>1
	    		|| countOccurences(str,'*')>1){//���� ���������� ������ ������ 1 �� ������ ������
	    		System.out.println("������������ ������ ������");
	    		System.exit(0);
	    		in.close();
	    		}else if(str.indexOf( '+' )>0)//���� � ������ �� ������ ���� "+"
	    		{
	    			Plus plus = new Plus();//��� �������� ���������� ������ ������
	    			plus.PlusNumbers(str);
	    		}else if(str.indexOf( '-' )>0)
	    		{
	    			Minus minus = new Minus();
	    			minus.MinusNumbers(str);
	    		}else if(str.indexOf( '/' )>0)
	    		{
	    			Divide divide = new Divide();
	    			divide.DivideNumbers(str);	    				
	    		}else if(str.indexOf( '*' )>0)
	    		{
	    			Multiply multiply = new Multiply();
	    			multiply.MultiplyNumbers(str);
	    		}
	    }
	    
	}
}