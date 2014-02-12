package memoriaPadrao;

public class Card {
	
	private int value;
	private int index;
	
	public Card(int value, int index){
		this.value = value;
		this.index = index;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	

}
