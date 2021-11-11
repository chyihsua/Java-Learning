import java.util.Scanner;
public class MyTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****");
		int choice;
		int money;
		money=0;
		Scanner S=new Scanner(System.in);
		do {
		System.out.println("網路文具店");
		System.out.println("1.鉛筆（每支10元)");
		System.out.println("2.橡皮擦（每支8元)");
		System.out.println("3.原子筆（每支15元）");
		System.out.println("4.鉛筆盒（每個100元）");
		System.out.println("5.離開");
		System.out.println();
		System.out.println("請選擇");
		choice=S.nextInt();
		System.out.println("你選擇"+choice);
		if (choice==1)
		{
			money=money+10;
			System.out.println("你買了一支鉛筆");
		}
		else if (choice==2)
		{
			money=money+8;
			System.out.println("你買了一個橡皮擦");
		}
		else if (choice==3)
		{
			money=money+15;
			System.out.println("你買了一支原子筆");
		}
		else if (choice==4)
		{
			money=money+100;
			System.out.println("你買了一個鉛筆盒");
		}
		}
		while (choice !=5);
		System.out.println("謝謝使用，再見！");
		System.out.println("你總共要付"+money+"元");
	}

}
