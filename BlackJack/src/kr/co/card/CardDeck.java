package kr.co.card;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck extends Card{
	public final static String spade = "스페이드";
	public final static String heart = "하트";
	public final static String daimond = "다이아몬드";
	public final static String claver = "클로버";
	Card c = new Card();
	
	static Card card_arr[][] = new Card[4][13];	
	private ArrayList card_arrlist = new ArrayList();
	public CardDeck() {
		for (int i=0; i<4; i++) {
			for (int j=0; j<13; j++) {
				c = new Card();
				if (j == 0) {
					c.setNumber("A");
				}
				else if(j>0 && j<10) {
					c.setNumber(Integer.toString(j+1));	
				}
				else if (j == 10) {
					c.setNumber("J");
				}
				else if (j == 11) {
					c.setNumber("Q");
				}
				else if (j == 12) {
					c.setNumber("K");
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
				card_arr[i][j] = c;
				card_arrlist.add(card_arr[i][j]);
//				System.out.println(card_arrlist);
			}
		}
	
	}
	public String Random_Card() {
		Random r = new Random();
		int card_listindex = r.nextInt(card_arrlist.size());
		Card RCard = (Card) card_arrlist.get(card_listindex);
		card_arrlist.remove(card_listindex);
		return String.format("%s", RCard);
		
	}

}
