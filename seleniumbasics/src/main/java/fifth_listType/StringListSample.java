package fifth_listType;

import java.util.ArrayList;
import java.util.List;

public class StringListSample {
	
	public static void main(String[] args) {

		List<String> locations = new ArrayList<String>();
		locations.add("Kannur");
		locations.add("Alappuzha");
		locations.add("idukki");
		//List<String> locationList = Arrays.asList("Kannur", "Alappuzha", "idukki");
		System.out.println(locations.toString());

//		for (String location : locations) {
//			System.out.println("Vincy is from " + location + " district in kerala");
//		}
		
		locations.forEach(location -> System.out.println("Vincy is from " + location + " district in kerala"));

	}
}
