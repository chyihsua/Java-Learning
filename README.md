# Java-Learning

#JA1
```java

public class MyWork {

	public static void main(String[] args) {
		// This is my first program
		System.out.println("Welcome to Ming Chuan");
		System.out.println("I am a Computer");
		String x;
		x="David";
		System.out.println("My name is "+x);
		System.out.println("How are you?");
	}

}

```

#JA2
```java
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

```

#JA3
```java
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

```
