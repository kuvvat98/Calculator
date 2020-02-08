import java.util.TreeMap;;

public class RomanNumber {
	int Convert(String number)
	{
		int num = 0;
		switch(number)
		{
		case("I"): num = 1;
		break;
		case("II"): num = 2;
		break;
		case("III"): num = 3;
		break;
		case("IV"): num = 4;
		break;
		case("V"): num = 5;
		break;
		case("VI"): num = 6;
		break;
		case("VII"): num = 7;
		break;
		case("VIII"): num = 8;
		break;
		case("IX"): num = 9;
		break;
		case("X"): num = 10;
		break;
		default:
			System.out.println("Неверный формат");
			System.exit(0);
			break;
		}
		return num;
	}
	
	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        map.put(0,"Число 0 отсутсвует");
    }

    public String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
}
