package kr.co.koreait;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Money.showMoneyList();
		
		int My_money = 0;
		int money_choice = 0;
		int drink_choice = 0;
		while (true) {
			System.out.print("\n입금 선택 : ");
			money_choice = scan.nextInt();
			if (money_choice == 1) {
				My_money += Money.Price_type1;
			}
			if (money_choice == 2) {
				My_money += Money.Price_type2;
			}
			if (money_choice == 3) {
				My_money += Money.Price_type3;
			}
			if (money_choice == 4) {
				My_money += Money.Price_type4;
			}
			if (money_choice == 5) {
				My_money += Money.Price_type5;
			}
			if (money_choice == 6) {
				break;
			}
			System.out.printf("입금액 : %,d\n", My_money);
		} 
		DrinkMachine machine = new DrinkMachine();
		machine.showMenu();
		machine.buyMenu(My_money);
	}

}
