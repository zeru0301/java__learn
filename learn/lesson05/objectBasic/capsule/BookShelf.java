package objectBasic.capsule;

public class BookShelf {
	private Book[] books;
	
	public BookShelf(Book[] books) {
		this.books = books;
		
	}
	
	public double getAveragePrise() {
		double sum = 0;
		for(Book b :books) {	
		sum += b.getPrice();
		
		}
		return sum / books.length;
	
	}
		
	
	public int getMaxPrise() {
		int max = Integer.MIN_VALUE;
		for(Book b:books) {
			if(b.getPrice() > max) max = b.getPrice();
		}
		return max;
	}
	
	public int getMinPrise() {
		int min = Integer.MAX_VALUE;
		for(Book b : books) {
			if(b.getPrice() < min) min = b.getPrice();
		
			}
			return min;
	}
	
	public void printAllbooks() {
		for(Book b : books) {
			b.printInfo();
		}
	}
}
