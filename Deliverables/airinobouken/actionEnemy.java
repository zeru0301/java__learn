package airinobouken;

import java.util.Random;

public class actionEnemy {
    Random rand = new Random();
    airi a;
    kurikuri kuri;

    public actionEnemy(airi a, kurikuri kuri) {
        this.a = a;
        this.kuri = kuri;

    }

    public boolean act1(int act0) {
        int judg = rand.nextInt(100) + 1;

        switch (1) {
            case 1:
                if (judg >= 60) {
                    int damage = a.attack();
                    System.out.println(kuri.name + "はクリクリアタックをくりだした");
            System.out.println(kuri.name + damage + "ダメージを与えた。");
                    a.hp -= damage;

                } else {
                    System.out.println(kuri.name+"攻撃は失敗した");
                }
                return true;
            default:
                System.out.println("無効な入力です");
                return true;

        }

    }

}
