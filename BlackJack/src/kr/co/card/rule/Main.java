package kr.co.card.rule;

import kr.co.card.CardDeck;
import kr.co.card.player.Dealer;
import kr.co.card.player.Gamer;

public class Main {
	
	public static void main(String args[]) {
		CardDeck carddeck = new CardDeck();
		Gamer gamer_play = new Gamer(carddeck);
		Dealer dealer_play = new Dealer(carddeck);
		Rule rule = new Rule();
		
		System.out.println("딜러카드");
		System.out.println(dealer_play.dealer_arr.get(0));
		System.out.println("\n");
		System.out.println("사용자 카드");
		rule.card_print(gamer_play.gamer_arr);
		rule.number_sum();
		
		
		
		
	
		
	}

}
