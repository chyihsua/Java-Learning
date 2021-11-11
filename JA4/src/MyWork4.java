import java.util.Scanner;
public class MyWork4 {

	public static void main(String[] args) {
		// 我的第4個程式
		System.out.println("我是Siri，您好！");
		System.out.println("請問你今年幾歲？");
		Scanner scn = new Scanner(System.in);
		int x1=scn.nextInt();
		System.out.println("你今年"+x1+"歲。");
		if (x1==20)
		{
			System.out.println("你跟我同年耶！");
		}
		else 
		{
			System.out.println("我們不同年齡！");
		}
		System.out.println("你是男生(m)或女生(f)？");
		Scanner scn2 =new Scanner(System.in);
		String x2= scn2.nextLine();
		System.out.println("你回答"+x2);
		if ((x2.equals("f"))|| (x2.equals("F")))
		{
			System.out.println("我跟你都是女生。");
		}
		else if ((x2.equals("m"))|| (x2.equals("M")))
		{
			System.out.println("你是異性！");
		}
		else
		{
			System.out.println("？？？");
		}
		System.out.println("請問你身高幾公分？");
		Scanner scn3=new Scanner(System.in);
		Float x3=scn3.nextFloat();
		System.out.println("你身高"+x3+"公分。");
		if (x3==173.5)
		{
			System.out.println("你跟我同身高耶！");
		}
		else 
		{
			System.out.println("我們不同身高！");
		}
		System.out.println("你的體重多少？");
		Scanner scn4 =new Scanner(System.in);
		Float x4= scn4.nextFloat();
		System.out.println("你的體重是"+x4+"公斤");
	}

}
