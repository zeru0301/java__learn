package airinobouken;

import java.util.Scanner;

public class Main {
    public static void main(String[] ages) {

        Scanner scan = new Scanner(System.in);
        // あいりのさくせい
        airi a = new airi();

        // エネミーの作成
        kurikuri kuri = new kurikuri();
     

        // 行動
        actionAiri actAiri = new actionAiri(a, kuri);
        actionEnemy actEnemy = new actionEnemy(a, kuri);

        System.out.println("""
                ======================================
                           あいりの冒険！！
                ======================================
                あいりは冒険に出かけた
                草むらを歩いていると、モンスターに出くわした！！
                """);

        do {
            System.out.println("======================================");
            System.out.println("エネミー" + kuri.name);
            System.out.println("HP" + kuri.hp);

            System.out.println("あいり");
            System.out.println("HP" + a.hp);
            System.out.println("======================================");

            if (a.dex > kuri.dex) {
                System.out.println("どう行動しますか？");
                System.out.println("1,攻撃");
                System.out.println("2,逃亡");
                int act0 = scan.nextInt();

                boolean continueBattle = actAiri.act1(act0); // 行動実行
                if (!continueBattle)
                    break;

                if (kuri.hp <= 0)
                    break;

                actEnemy.act1(1);

            } else {
                actEnemy.act1(1);

                if (a.hp <= 0)
                    break;

                System.out.println("どう行動しますか？");
                System.out.println("1,攻撃");
                System.out.println("2,逃亡");
                int act0 = scan.nextInt();
                actAiri.act1(act0);

            }

        } while (kuri.hp > 0 && a.hp > 0);

        if (a.hp <= 0) {
            System.out.println("あいりは敗北し家に帰った");

        } else {
            a.experienceValue(kuri.expValue);

            System.out.println("あいりは勝利し冒険を進めた");

        }

    }

}
