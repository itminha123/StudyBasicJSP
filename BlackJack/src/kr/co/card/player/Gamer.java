package kr.co.card.player;

import java.util.ArrayList;

import kr.co.card.Card;
import kr.co.card.CardDeck;

public class Gamer {
	public ArrayList<Card> gamer_arr = new ArrayList<Card>();
	
	CardDeck cardDeck;
	public Gamer(CardDeck cd) {
		this.cardDeck = cd;
		gamer_arr.add(cardDeck.Random_Card());
		gamer_arr.add(cardDeck.Random_Card());
	}
}
