package airinobouken;

import java.util.Random;

public class actionAiri {
    Random rand = new Random();
    airi a;
    kurikuri kuri;

    public actionAiri(airi a, kurikuri kuri) {
        this.a = a;
        this.kuri = kuri;

    }

    public boolean act1(int act0) {
        int judg = rand.nextInt(100) + 1;

        switch (act0) {
            case 1:
                if (judg >= 60) {
                    int damage = a.attack();
                    kuri.hp -= damage;

                } else {
                    System.out.println("あいりの攻撃は失敗した");
                }
                return true;

            case 2:
                if (judg >= 60) {
                    System.out.println("あいりは戦闘から逃げ出した！");
                    return false;

                } else {
                    System.out.println("あいりは逃亡に失敗した");
                    return true;

                }
            default:
                System.out.println("無効な入力です");
                return true;

        }

    }

}
