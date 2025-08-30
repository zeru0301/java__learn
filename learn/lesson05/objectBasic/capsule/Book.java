package objectBasic.capsule;

//問題1: コンストラクタ
//Book クラスを作りなさい。
//フィールド: title (本のタイトル: String), price (価格: int)
//コンストラクタで title と price をセットできるようにする
//メソッド: printInfo() → 「タイトル: ○○, 価格: ○○円」と出力する
//Mainクラス で、3冊の本を作って printInfo() を呼び出しなさい

//問題2: 平均・最高・最低
//問題1の Book クラスを使って、3冊の平均価格・最高価格・最低価格を求めなさい

//問題3: カプセル化
//問題1の Book クラスを修正して、フィールドを private にする。
//代わりに getTitle() と getPrice() を使って値を取り出せるようにしなさい。

//問題4: クラス分け
//複数の Book を管理する BookShelf クラスを作りなさい。
//ClassRoom は Student[] を持ち、
//「全員の平均点」「最高点」「最低点」を求めるメソッドを用意する。
//Mainで実際に3人の学生を作って ClassRoom に渡し、結果を出力しなさい。
public class Book{
	
//	カプセル化
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void printInfo() {
		System.out.println("bot:" + title + "は" + price +"円です。");
	}
	
	

}
