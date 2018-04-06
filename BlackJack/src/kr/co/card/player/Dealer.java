package kr.co.card.player;

import java.util.ArrayList;

import kr.co.card.CardDeck;

public class Dealer {
	public ArrayList dealer_arr = new ArrayList();

	CardDeck cardDeck;
	public Dealer(CardDeck cd) {
		this.cardDeck = cd;
		dealer_arr.add(cardDeck.Random_Card());
		dealer_arr.add(cardDeck.Random_Card());
	
	}

}
