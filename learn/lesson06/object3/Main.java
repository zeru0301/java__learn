package object3;

//コンストラクタ
//objectを作成と同時に初期化をするもの
public class Main {
	public static void main(String[] ages) {
		ConstructorDog[]  dogs = { 
				new ConstructorDog("メリ", 4),
				new ConstructorDog("犬", 3),
				new ConstructorDog("tori", 3),
		
		};
		
		for(ConstructorDog dog : dogs) {
			dog.introduce();
            dog.bark(4);
		}
		
	}

}
