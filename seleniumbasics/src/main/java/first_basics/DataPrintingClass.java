package first_basics;

public class DataPrintingClass {
	
	public static void main(String[] args) {
		
		int valueToBeDoubled = 15 ;
		
		FindDoubleValue obj = new FindDoubleValue();
		int value = obj.findDouble(valueToBeDoubled);
	
		System.out.println("doubleValue : " +  value);	

	}

}
