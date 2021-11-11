import java.util.Scanner;
public class MyTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,day;
		for (year=102;year<105;year++)
		{
			for (month=4;month<7;month++)
			{
				for (day=25;day<30;day++)
				{
					System.out.print(year+"年"+month+"月"+day+"日");
					if ((year==104)&&(month==6)&&(day==27))
					{
						System.out.print("今年八仙彩虹派對");
					}
					if ((month==5)&&(day==26))
					{
						System.out.println("八仙樂園夏季開放日");
					}
					else 
					{
						System.out.println();
					}
				}
			}
		System.out.println("八仙樂園歡迎您");
		String Answer="n";
		System.out.println("要參加今年彩虹派對嗎？（y/n)");
		int asktimes =1;
		Scanner scn=new Scanner(System.in);
		Answer = scn.nextLine();
		while (Answer.equals("n")&&(asktimes<3))
		{
			System.out.println("別擔心安全，有美國FDA保證");
			System.out.print("我已問了"+asktimes+"次，");
			System.out.println("再問一次，要參加嗎？(y/n)");
			asktimes =asktimes +1;
			Answer=scn.nextLine();
		}
		if (Answer.equals("y"))
		{
			System.out.println("爆炸！爆炸！");
		}
		else 
		{
			System.out.println("恭喜逃過一劫。");
		}
		}
	}

}
