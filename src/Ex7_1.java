class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang =  (i < 10)&&(num==1||num==3||num==8);
			
			SutdaCard2 sutdaCard = new SutdaCard2(num,isKwang);
			
			cards[i] = sutdaCard;
		}
	}
	
	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random() * 20);
			
			SutdaCard2 tmp;
			tmp = cards[j];
			cards[j] = cards[i];
			cards[i] = tmp;
		}
	}
	
	public SutdaCard2 pick(){
		int randomNumber = (int) (Math.random() * 20);
		return cards[randomNumber];
	}
	
	public SutdaCard2 pick(int index) {
		if (index < 0 || index >= CARD_NUM) {
			return null;
		}
		return cards[index];
	}
}
class SutdaCard2 {
	int num;
	boolean isKwang;
	
	SutdaCard2() {
		this(1, true);
	}
	
	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Ex7_1 {

	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick(21));
	}
}