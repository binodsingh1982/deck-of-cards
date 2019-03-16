package com.appian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private static final int deckSize = 52;
	private static final int numRanks = 13;
	private static final int numSuits = 4;
	
	
	private List<Card> deck;

	private static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

	private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

	public Deck() {
		init();
	}

	/*
	 * Initialize 52  deck of cards
	 */
	private void init() {
		deck=new ArrayList<Card>(deckSize);
		
		for (int j = 0; j < numSuits; j++) {
			for (int k = 0; k < numRanks; k++) {
				deck.add(new Card(RANKS[k], SUITS[j])) ;
			
			}
		}
	}

	/*
	 * Shuffle  cards based on Fisher-Yates algorithm
	 */
	protected void shuffle() {
		
		
		Random rand = new Random();
		
		Card[] tempDeckArray= deck.toArray( new Card[deck.size()]);
		for ( int i=(tempDeckArray.length-1); i>0; i--) {
            int j = rand.nextInt( i+1);
            Card tmp = tempDeckArray[i];
            tempDeckArray[i] = tempDeckArray[j];
            tempDeckArray[j] = tmp;
        }
		
		 deck.clear();
	        deck.addAll( Arrays.asList( tempDeckArray));

	}

	/*
	 * Return top card
	 * Throws an error if trying to get 53 card
	 */
	protected Card dealOneCard() {
		
		
		 if ( deck.isEmpty()) {
			 throw new Error("There are only 52 cards and you are trying to take 53rd card, please reset first");
	        }
	        return deck.remove( 0);
	}

	/*
	 * Resets the deck of cards to original position
	 */
	protected void reset() {
		deck.clear();
		init();
	}

	

}
