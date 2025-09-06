package object4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ConstructorDog> dogList = new ArrayList<>();
        dogList.add(new ConstructorDog("ポチ", 4));
        dogList.add(new ConstructorDog("タロ", 2));
        dogList.add(new ConstructorDog("ハチ", 5));

        for (ConstructorDog dog : dogList) {
            dog.introduce();
            dog.bark(2);
        }
 
    }
}