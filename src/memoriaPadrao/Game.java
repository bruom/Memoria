package memoriaPadrao;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
	
	private ArrayList<Integer> key;
	private ArrayList<Card> cards;
	private Card card1;
	private Card card2;
	private boolean gg = false;


	public Game(int nPairs){
		this.key = createKey(nPairs);
		this.cards = createCards(key,nPairs);
	}
	
	
	
	
	public ArrayList<Integer> createKey(int nPairs){
		ArrayList<Integer> key = new ArrayList<Integer>();
		for(int i=1; i<=nPairs; i++){
			key.add(i);
			key.add(0 - i);

		}
		return key;
	}
	
	
	
	
	public ArrayList<Card> createCards(ArrayList<Integer> key, int nPairs){
		ArrayList<Card> cards = new ArrayList<Card>();
		ArrayList<Integer> key2 = (ArrayList<Integer>)key.clone();
		Collections.shuffle(key2);
		//System.out.println(key2);
		for(int i=0;i<key2.size();i++){
			cards.add(new Card(key2.get(i),i+1));
			//System.out.print(cards.get(i).getValue() + "  ");
			//System.out.println(cards.get(i).getIndex());
		}
		
		return cards;
	}
	
	
	
	public void showOptions(){
		System.out.println("Cartas disponíveis:");
		for(int i=0;i<cards.size();i++){
			System.out.print(cards.get(i).getIndex() + "  ");
		}
	}
	
	public void pickCard(int index){
		for(Card c:cards){
			if(c.getIndex()==index)
				if(card1==null){
					card1=c;
					System.out.println("A carta " + card1.getIndex() + " tem o valor " + Math.abs(card1.getValue()));
					break;
				}
				else if(card2==null){
						card2=c;
						System.out.println("A carta " + card2.getIndex() + " tem o valor " + Math.abs(card2.getValue()));
						break;
				}
				else
					System.out.println("ALERT ALERT ALERT");
		}
		System.out.println("");

		
	}
	
	public void checkPair(){
		if(card1!=null && card1.getValue()==(card2.getValue())*-1){
			System.out.println("Você encontrou o par do valor " + Math.abs(card1.getValue()));
			cards.remove(card1);
			cards.remove(card2);
			if(cards.isEmpty()){
				System.out.println("A WINNER IS YOU");
				gg = true;
			}
		}
		else{
			System.out.println("ERROU!");
		}
		System.out.println("");
		card1=null;
		card2=null;
			
			
	}




	public ArrayList<Integer> getKey() {
		return key;
	}




	public void setKey(ArrayList<Integer> key) {
		this.key = key;
	}




	public ArrayList<Card> getCards() {
		return cards;
	}




	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public boolean GG(){
		return gg;
	}


	
}
	
	


