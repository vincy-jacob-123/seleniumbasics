package first_basics;

public class FindDoubleValue {
	
	public static void main(String[] args) {
		
		int valueToBeDoubled = 10 ;
		FindDoubleValue obj = new FindDoubleValue();
		int doubleValue = obj.findDouble(valueToBeDoubled);
		System.out.println("doubleValue : " +  doubleValue);	

	}
	
	public int findDouble(int valueToBeDoubled) {		
		return valueToBeDoubled * 2;
	}

}
