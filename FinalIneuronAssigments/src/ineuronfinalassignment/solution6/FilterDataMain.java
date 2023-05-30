package ineuronfinalassignment.solution6;
import java.util.*;
public class FilterDataMain {

	public static void main(String[] args) {
		   List<FilterData> productsList = new ArrayList<FilterData>();  
	        //Adding Products  
	        productsList.add(new FilterData(1,"HP Laptop",25000f));  
	        productsList.add(new FilterData(2,"Dell Laptop",30000f));  
	        productsList.add(new FilterData(3,"Lenevo Laptop",28000f));  
	        productsList.add(new FilterData(4,"Sony Laptop",28000f));  
	        productsList.add(new FilterData(5,"Apple Laptop",90000f));  
	        productsList.stream()  
	                    .filter(p ->p.price> 30000)   // filtering price  
	                    .map(pm ->pm.price)          // fetching price  
	                    .forEach(System.out::println);  // iterating price  
	}

}
