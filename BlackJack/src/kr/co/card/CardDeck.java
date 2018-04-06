package kr.co.card;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck extends Card{
	Card c; //abc

	private ArrayList card_arrlist = new ArrayList();
	public ArrayList int_card = new ArrayList();
	public CardDeck() {
		for (int i=0; i<4; i++) {
			for (int j=0; j<13; j++) {
				c = new Card();
				if (j == 0) {
					c.setNumber("A");
					int_card.add(j+1);
				}
				else if(j>0 && j<10) {
					c.setNumber(Integer.toString(j+1));	
					int_card.add(j+1);
				}
				else if (j == 10) {
					c.setNumber("J");
					int_card.add(10);
				}
				else if (j == 11) {
					c.setNumber("Q");
					int_card.add(10);
				}
				else if (j == 12) {
					c.setNumber("K");
					int_card.add(10);
				}
				switch(i) {
				case 0:
					c.setShape("스페이스");
					break;
				case 1:
					c.setShape("하트");
					break;
				case 2:
					c.setShape("클로버");
					break;
				case 3:
					c.setShape("다이아");
					break;
				}
				
				card_arrlist.add(c);
//				System.out.println(card_arrlist);
			}
		}
	
	}
	
	public int card_index;
	public Card Random_Card() {
		Random r = new Random();
		int card_listindex = r.nextInt(card_arrlist.size());
		Card RCard = (Card) card_arrlist.get(card_listindex);
		card_arrlist.remove(card_listindex);
		int_card.remove(card_listindex);
		card_index = card_listindex;
		return RCard;
	}

}
