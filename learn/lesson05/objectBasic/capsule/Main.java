package objectBasic.capsule;

public class Main {
	public static void main(String[] args) {
		
		Book[] books = {
				new Book("赤ずきん",500),
				new Book("白雪姫",800),
				new Book("ぐりとぐら",750),
				new Book("桃太郎",700)
		};
		
		BookShelf sherlf = new BookShelf(books);
		
		System.out.println("=== 本屋の情報 ===");
		sherlf.printAllbooks();
		
		
		System.out.println("bot:本屋の平均価格は"+sherlf.getAveragePrise() + "円です。");
		System.out.println("bot:本屋の最高価格は"+ sherlf.getMaxPrise() + "円です。");
		System.out.println("bot:本屋の最低価格は"+ sherlf.getMinPrise() +" 円です。");
		
	}

}
