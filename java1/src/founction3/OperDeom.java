package founction3;

public class OperDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=23;
		if(a>0&&a<18){
			System.out.println("未成年");
		}else if(a>=18&&a<=50){
			System.out.println("成年");
		}else if(a>50){
			System.out.println("老年");
		}
		
		
		System.out.println(10+20+""+30);
		System.out.println(""+10+20+30);
		System.out.println(10+20+30+"");
		
		int b=8,c=5;
		int max=b;
		if(c>b){
			max=c;
		}
		System.out.println("max:"+max);
		max=c>b?c:b;
		System.out.println("max2:"+max);
		System.out.println(12+34+""+56);
	}
	
}
