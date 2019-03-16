package com.appian;

public class Main {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card[] cards = new Card[52];
		for (int i = 0; i < 52; i++) {
			cards[i] = deck.dealOneCard();
			
			System.out.printf("original %s of %s\n", cards[i].getRank(), cards[i].getSuit());
		}
	deck.reset();	
deck.shuffle();
		for (int i = 0; i < 52; i++) {
			cards[i] = deck.dealOneCard();
			
			System.out.printf("After first shuffle %s of %s\n", cards[i].getRank(), cards[i].getSuit());
		}
		
		deck.reset();
		
		

		for (int i = 0; i < 52; i++) {
			cards[i] = deck.dealOneCard();
			
			System.out.printf("After reset %s of %s\n", cards[i].getRank(), cards[i].getSuit());
		}
		
		deck.reset();
		deck.shuffle();
		
		
		
	Card card=	deck.dealOneCard();
		
		System.out.printf("After shuffle one card %s of %s\n", card.getRank(), card.getSuit());
		
		deck.shuffle();
		
		card=	deck.dealOneCard();
		
		System.out.printf("After re-shuffle one card %s of %s\n", card.getRank(), card.getSuit());
		
		for (int i = 0; i < 52; i++) {
			cards[i] = deck.dealOneCard();
			
			System.out.printf("After re-shuffle %s of %s\n", cards[i].getRank(), cards[i].getSuit());
		}
		
		
	}

}
