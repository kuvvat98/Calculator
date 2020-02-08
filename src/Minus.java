public class Minus {
	private String[] numbers;
    private int first_number = 0;
    private int second_number = 0;
    private int result = 0;
    private boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i))  
            == false) 
            return false; 

        return true; 
    } 
	public void MinusNumbers(String data)
	{
		numbers = data.split( "[-]" );//разделяет строку по этому знаку
        if(isNumber(numbers[0])==true && isNumber(numbers[1])==true)
	    {
            first_number = Integer.parseInt( numbers[0] );
	        second_number = Integer.parseInt( numbers[1] );	   
	        if(first_number < 1 || first_number > 10 || second_number < 1 || second_number >10)
	        {
	        	System.out.println("Используйте числа от 0 до 10");
	        }else 
	        {
	        	result = first_number - second_number;
	        	System.out.println(result);	
	        }
	    }else
	    {
	    	RomanNumber number = new RomanNumber();
	    	first_number = number.Convert(numbers[0]);
	    	second_number = number.Convert(numbers[1]);
	    	result = first_number - second_number;
	    	System.out.println(number.toRoman(result));
	    }
	}
}
