package Programs;

public class RegExps_string {

	public static void main(String[] args) {

		String x="IS#$*H6&U_0(U";
		
		x = x.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(x); // ISHUU

	}

}
