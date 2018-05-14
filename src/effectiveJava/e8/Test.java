package effectiveJava.e8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	enum Suit{
		CLUB,DIAMOND,HEART,SPADE
	}
	enum Rank{
		ACE,DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,
		NINE,TEN,JACK,QUEEN,KING
	}
	
	class Card{
		Suit suit;
		Rank rank;
		Card(Suit suit,Rank rank){
			this.suit = suit;
			this.rank = rank;
		}
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,5,67);
		list.remove(4);
		System.out.println(list);
//		for(int i = 0; i < list.size();i++){
//			list.remove(4);
//			System.out.println(i);
//		}
		
//		for(Iterator<Integer> iter = list.iterator();iter.hasNext();){
//			Integer a = iter.next();
//			list.remove(4);
//			System.out.println(a);
//		}
		
		
		/*
		Collection<Suit> suits = Arrays.asList(Suit.values());
		Collection<Rank> ranks = Arrays.asList(Rank.values());
		List<Card> deck = new ArrayList<Card>();
		for(Iterator<Suit> i = suits.iterator(); i.hasNext();){
			Suit s = i.next();
			for(Iterator<Rank> j = ranks.iterator(); j.hasNext();){
				Rank c = j.next();
				deck.add(new Test().new Card(s,c));
			}
		}
		System.out.println(deck.size());
		*/
		
		
		
	}
}

