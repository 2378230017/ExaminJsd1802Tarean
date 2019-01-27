package founction2;

import java.util.Scanner;

public class scannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年龄");
		int age=scan.nextInt();
		System.out.println("请输入价格");
		double price=scan.nextDouble();
		scan.close();
		System.out.println(age);
		System.out.println(price);
	}

}
