import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
		if(a+b==c||a==b-c||a*b==c)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
