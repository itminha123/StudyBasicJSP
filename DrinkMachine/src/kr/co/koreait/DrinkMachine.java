package kr.co.koreait;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.koreait.drink.Cider;
import kr.co.koreait.drink.Cola;
import kr.co.koreait.drink.Drink;
import kr.co.koreait.drink.Oranc;
import kr.co.koreait.drink.Procari;

public class DrinkMachine {
	
	private int count = 50;

	static ArrayList ColaList = new ArrayList();
	static ArrayList CiderList = new ArrayList();
	static ArrayList OrancList = new ArrayList();
	static ArrayList ProcariList = new ArrayList();
	
	public DrinkMachine() {
		for (int i=0; i<count; i++) {
			ColaList.add(new Cola());
			CiderList.add(new Cider());
			OrancList.add(new Oranc());
			ProcariList.add(new Procari());
		}	
	}
	
	Drink cola = new Cola();
	Drink cider = new Cider();
	Drink oranc = new Oranc();
	Drink procari = new Procari();

	public void showMenu() {
		System.out.println("- 메 뉴 -");
		System.out.println(Cola.Cola_Index+". "+cola);
		System.out.println(Cider.Cider_Index+". "+cider);
		System.out.println(Oranc.Oranc_Index+". "+oranc);
		System.out.println(Procari.Procari_Index+". "+procari);
		System.out.println("5. 종료");
	}
	
	public void buyMenu(int My_money) {
		Scanner scan = new Scanner(System.in);
		int drink_choice = 0;

		while (true) {
			System.out.print("\n메뉴 선택: ");
			drink_choice = scan.nextInt();
			
			if (drink_choice == 1 && My_money>=Cola.Cola_price) {
				System.out.println(cola);
				My_money -= Cola.Cola_price;
				ColaList.remove(0);
			}
			else if (drink_choice == 2 && My_money>=Cider.Cider_price) {
				System.out.println(cider);
				My_money -= Cider.Cider_price;
				CiderList.remove(0);
			}
			else if (drink_choice == 3 && My_money>=Oranc.Oranc_price) {
				System.out.println(oranc);
				My_money -= Oranc.Oranc_price;
				OrancList.remove(0);
			}
			else if (drink_choice == 4 && My_money>=Procari.Procari_price) {
				System.out.println(procari);
				My_money -= Procari.Procari_price;
				ProcariList.remove(0);
			}
			else if (drink_choice == 5) {
				System.out.println("- 재고 출력 -");
				System.out.printf("콜라 %d\n", ColaList.size());
				System.out.printf("사이다 %d\n", CiderList.size());
				System.out.printf("오란씨 %d\n", OrancList.size());
				System.out.printf("포카리 %d\n", ProcariList.size());
				break;
			}
			else {
				System.out.println("금액이 부족하여 구매 할 수 없습니다.");
			}	
			
			System.out.printf("남은돈 %,d입니다.\n", My_money);
		}
	}
}
