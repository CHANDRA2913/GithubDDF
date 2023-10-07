package class1;

public class Rowsjuly14 {

	public static void main(String[] args) {
		// store login data into two dimension
	String str  [][]=new String [5][2];// five rows and two cells
	// first row first cell
	str[0][0]="Admin1";
	//first row second cell
	str[0][1]="tes1";
	// second row first cell
	str[1][0]="Admin2";
	//second row second cell
	str[1][1]="test2";
	//third row first cell
	str[2][0]="admin3";
	//third row second cell
	str[2][1]="test3";
	//fourth row first cell
	str[3][0]="Admin4";
	//fourth row second cell
	str[3][1]="test4";
	//fourth first cell
	str[4][0]="Admin5";
	//fourth row second cell
	str[4][1]="test5";
	System.out.println(str[2][1]);
	System.out.println("=======================================");
	                    //print cell length in first row
	System.out.println(str[0].length);
	System.out.println("=====================");
	                                              //iterate all rows
	for (int i=0;i<str.length;i++) {          //int=num//string=names/char c=s,boolean=true/false
	for (int j = 0; j<str[0].length; j++)
	{
		System.out.print(str[i][j]+"\t");
	}
	  System.out.println("===============");
		
	
	}
	}
	}


