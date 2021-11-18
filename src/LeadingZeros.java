import java.util.Scanner;

public class LeadingZeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String regex = "^0+(?!$)";
		 
        System.out.println(str.replaceAll(regex, ""));

	}

}
