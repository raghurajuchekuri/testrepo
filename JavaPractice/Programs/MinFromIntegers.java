package Programs;



import java.util.Arrays;
import java.util.List;

public class MinFromIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

		Integer Min = list.stream().min(Integer::compare).get();
		System.out.println(Min);
		
		Integer Max = list.stream().max(Integer::compare).get();
		System.out.println(Max);
		
		
		


	}

}
