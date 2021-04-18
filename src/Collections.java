import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/// Q1 arraylist
		
		List<String> employeeNames = new ArrayList<>();
		
	
		
   /// Q2 hashSet
		
		Set<Integer> ids = new HashSet<>();
		
	/// Q3 HashMAp
		
		Map<Integer, String> employeeMap = new HashMap<>();
		
		/// Q4
		
		employeeNames.add("Nick");
		employeeNames.add("John");
		employeeNames.add("Tom");
		employeeNames.add("Sally");
		employeeNames.add("Tim");
		
		ids.add(12);
		ids.add(8);
		ids.add(13);
		ids.add(2);
		ids.add(6);
		
		// Q5 
		
		int i = 0;
		
		for ( int id : ids) {
			
		employeeMap.put(id, employeeNames.get(i++));
		
		}
		
		//Q6
		
		
		for (int key : employeeMap.keySet() ) {
			System.out.println(employeeMap.get(key));
		}
		
		//q7
		StringBuilder idsBuilder = new StringBuilder();
		
		//Q8
		
	    for (int id : ids) {
	    	idsBuilder.append(id + "-"); 
	    
	    }
	    
	  //Q9	
	    System.out.println(idsBuilder.toString());
	    
	   //Q10
	    
	    StringBuilder namesBuilder = new StringBuilder();
	    
	    //Q11
	     
	    for (int j = 0; i< employeeNames.size(); i++) {
	         namesBuilder.append(employeeNames.get(j));
	         	
	    }
	    	
		//Q12
	    	System.out.println(namesBuilder.toString());
		
		
		}
}
