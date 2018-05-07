package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateofIntegers_Lambdas {

	public static void main(String[] args) {
		
		
				// Create List of square of all distinct numbers
				List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
				
				
				// Printing duplicates using lambdas
				Set<Integer> duplicated = numbers.stream()
												 .filter(n -> numbers.stream()
												 .filter(x -> x == n).count() > 1)
												 .collect(Collectors.toSet());
				
				System.out.println("Found Duplicate Integers" + duplicated);
				
				//Printing Distinct values
				List<Integer> distinct = numbers.stream().map( i -> i).distinct().collect(Collectors.toList());
				
				System.out.println("Below is Distinct List");		
				System.out.printf("Original List : %s, Without duplicates : %s %n", numbers, distinct); 

	}

}
