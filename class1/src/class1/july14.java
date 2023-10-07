package class1;

public class july14 {

	public static void main(String[] args) {
		Object x[]=new Object [5];
		x[0]="CHANDRAS";
		x[1]=1234;
		x[2]=14.5;
		x[3]='c';
		x[4]=true;
		System.out.println(x.length);
		for(Object each:x) {
			System.out.println(each);
		}
	}

}
