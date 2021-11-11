import java.util.Scanner;
public class MyTest3 {

	public static void main(String[] args) {
		// This is my third program
		//以下程式在輸出標題
		System.out.println("***********");
		System.out.println("愛情心理測驗");
		System.out.println("***********");
		//以下程式在提問
		System.out.println("請問你最喜歡");
		System.out.println("1.春天的花");
		System.out.println("2.夏天的流水");
		System.out.println("3.秋天的楓葉");
		System.out.println("4.冬天的太陽");
		System.out.println("5.都不喜歡");
		System.out.print("請輸入數字: ");
		Scanner scn = new Scanner(System.in);
		int Ans = scn.nextInt();
		System.out.println("謝謝回答");
		//以下程式在分析答案
		if ((Ans <1)||(Ans >5))
		{
			System.out.println("選錯數字");
		}
		if (Ans == 5)
		{
			System.out.println("你喜歡無拘束的自由");
		}
		if (Ans == 4)
		{
			System.out.println("你喜歡浪漫的感動");
		}
		if (Ans == 3)
		{
			System.out.println("你喜歡溫暖的氛圍");
		}
		if (Ans == 2)
		{
			System.out.println("你喜歡快樂的氣氛");
		}
		if (Ans == 1)
		{
			System.out.println("你喜歡漂亮的感覺");
		}
	}

}
