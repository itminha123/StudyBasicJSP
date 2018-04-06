package kr.co.koreait;

public class Money {
	public final static int Price_type1 = 100;
	public final static int Price_type2 = 500;
	public final static int Price_type3 = 1000;
	public final static int Price_type4 = 5000;
	public final static int Price_type5 = 10000;
	public static void showMoneyList() {
		System.out.println("- 현금 주입 -");
		System.out.printf("1. %,6d원\n", Price_type1);
		System.out.printf("2. %,6d원\n", Price_type2);
		System.out.printf("3. %,6d원\n", Price_type3);
		System.out.printf("4. %,6d원\n", Price_type4);
		System.out.printf("5. %,6d원\n", Price_type5);
		System.out.println("6.  주입 완료");
	
	}

}
