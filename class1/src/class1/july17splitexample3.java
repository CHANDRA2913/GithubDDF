package class1;

public class july17splitexample3 {

	public static void main(String[] args) {
		// split3
		String com="TATA@MAHINDRA@DELOTE@GOOGLE@AMAZON@TATALIQ@INFOSYS";
		String x[]=com.split("@");
		System.out.println(x[3]); 
		for (String each:x) {
			System.out.println(each);
		}
		}

	}


