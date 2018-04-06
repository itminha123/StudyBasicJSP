package kr.co.card.rule;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.card.Card;
import kr.co.card.CardDeck;
import kr.co.card.player.Gamer;

public class Rule {
	Scanner scan = new Scanner(System.in);
	CardDeck one_card;
	Gamer gamer;
	
	public void oneCard_get () {	
		while (true) {
			System.out.println("카드를 받겠습니까? \n1. 받기 \n2. 그만 ");
			int card_selck = scan.nextInt();
			if (card_selck == 1) {
				gamer.gamer_arr.add(one_card.Random_Card());
			} else if (card_selck == 2){
				break;
			} else {
				System.out.println("다시 입력해주세요");
				continue;
			}
		}
	}
//	public void dealer_card_get() {
//		while (true)
//	}
	
	public void card_print(ArrayList<Card> list) {
		for (Card p : list) {
			System.out.println(p);
		}
		
	}
	
	public void number_sum() {
		int sum = 0;
		


	
	}
}















