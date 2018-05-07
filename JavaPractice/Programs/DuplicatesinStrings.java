package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesinStrings {

	public static void main(String[] args) {
		// Create List of square of all distinct numbers
				List<String> numbers = Arrays.asList("Raghu", "Raghu1", "Raghu2", "Raghu3", "Raghu1", "Raghu4", "Raghu3");
				
				// Printing duplicates using lambdas
				Set<String> duplicated = numbers.stream()
												 .filter(n -> numbers.stream()
												 .filter(x -> x == n).count() > 1)
												 .collect(Collectors.toSet());
				
				System.out.println("Found Duplicate Integers" + duplicated);
				
				//Printing Distinct values
				List<String> distinct = numbers.stream().map( i -> i).distinct().collect(Collectors.toList());
				
				System.out.println("Below is Distinct List");		
				System.out.printf("Original List : %s, Without duplicates : %s %n", numbers, distinct); 


		

		
		

	}

}
