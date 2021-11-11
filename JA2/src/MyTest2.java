import java.util.Scanner;
public class MyTest2 {

	public static void main(String[] args) {
		// My second program
		System.out.println("你家有多少人？");
		Scanner scn = new Scanner(System.in);
		int x1;
		x1 = scn.nextInt();
		System.out.println("你家有"+x1+"人");
		if ((x1<8)&&(x1>2))
		{
			System.out.println("人不多不少");
		}
		if (x1>7)
		{
			System.out.println("你家好擠");
		}
		if (x1==2)
		{
			System.out.println("你是單親");
		}
		if (x1==1)
		{
			System.out.println("你是孤兒");
		}
	int x2;
	x2=4;
	System.out.println("我家有"+x2+"人");
	int x3;
		if (x2>x1)
		{
		x3=x2-x1;
		System.out.println("我家比你家多"+x3+"人");
		}
		else if(x2<x1)
		{
			x3=x1-x2;
			System.out.println("你家比我家多"+x3+"人");
		}
		else 
		{
			System.out.println("我們家人口一樣多");
		}
		System.out.println("你母親幾歲？");
		Scanner scn2 = new Scanner(System.in);
		int y1;
		y1=scn2.nextInt();
		if (y1>60)
		{
			System.out.println("太老了");
		}
		if ((y1>40)&&(y1<60))
		{
			System.out.println("一般");
		}
		if (y1<40)
		{
			System.out.println("好年輕");
		}
	}
}
