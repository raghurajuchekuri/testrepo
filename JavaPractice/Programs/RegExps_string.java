package Programs;

public class RegExps_string {

	public static void main(String[] args) {

		String x="SA#$*N6&DEE0(P";
		
		x = x.replaceAll("[^a-zA-Z_]", "");
		
		System.out.println(x);

	}

}
