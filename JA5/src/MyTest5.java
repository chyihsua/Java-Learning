import java.util.Scanner;
public class MyTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S =new Scanner(System.in);
		String Ans;
		int i,j;
		i=0;
		j=0;
		do {
		System.out.println("我是Siri，您好！");
		System.out.println("請問你愛我嗎？(y/n)");
		Ans=S.nextLine();
		if (Ans.equals("y"))
		{
			System.out.println("我也愛你");
		}
		else if (Ans.equals("n"))
		{
			i=i+1;
			System.out.println("你說了"+i+"次不愛我了");
			System.out.println("敢說不愛我，再問你一次");
		}
		else 
		{
			j=j+1;
			System.out.println("你已經按錯"+j+"次鍵了");
			System.out.println("笨蛋，連鍵都按錯");
		}
		}
		while (!Ans.equals("y"));
	}

}
