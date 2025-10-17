package airinobouken;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] ages) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        // あいりのさくせい
        Airi airi = new Airi();

        // 今回登場する敵の取得
        Kurikuri kuri = new Kurikuri();
        Panpan pan = new Panpan();

        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(kuri);
        enemies.add(pan);

        // エネミーの中から最も早いエネミーを探す。

        Enemy fastEnemy = enemies.get(0);
        for (Enemy e : enemies) {
            if (e.dex > fastEnemy.dex) {
                fastEnemy = e;
            }
        }

        System.out.println("""
                ======================================
                           あいりの冒険！！
                ======================================
                あいりは冒険に出かけた
                草むらを歩いていると、モンスターに出くわした！！
                """);
        Thread.sleep(1000);

        do {
            System.out.println("======================================");
            System.out.println("エネミー" + kuri.name);
            System.out.println("HP" + kuri.hp);
            System.out.println("エネミー" + pan.name);
            System.out.println("HP" + pan.hp);

            System.out.println("あいり");
            System.out.println("HP" + airi.hp);
            System.out.println("======================================");
            Thread.sleep(2000);

            if (airi.dex > fastEnemy.dex) {

                System.out.println("どう行動しますか？");
                System.out.println("1,魔法");
                System.out.println("2,逃亡");
                int actMain = scan.nextInt();
                if (actMain == 1) {

                    System.out.println("魔法");
                    System.out.println("1,ファイアー");
                    System.out.println("2,ヒール");
                    int actSab1 = scan.nextInt();

                    if (actSab1 == 1) {
                        System.out.println("対象を選択してください>>");
                        int i = 1;
                        for (Enemy e : enemies) {
                            System.out.println(i + "." + e.name);
                            i++;

                        }
                    }

                    switch (actSab1) {
                        case 1:
                            // 攻撃対処の選択
                            int actSab2 = scan.nextInt() - 1;
                            airi.attack(enemies.get(actSab2));
                            break;

                        case 2:
                            airi.heal();
                            break;

                        default:
                            break;

                    }

                }

                if (airi.hp <= 0) {
                    break;
                }

                if (kuri.isAlive()) {
                    kuri.attack(airi);
                }
                if (pan.isAlive()) {
                    pan.attack(airi);
                }
   
            } else {

                 if (kuri.isAlive()) {
                    kuri.attack(airi);
                }
                if (pan.isAlive()) {
                    pan.attack(airi);
                }

                if (airi.hp <= 0) {
                    break;
                }

                System.out.println("どう行動しますか？");
                System.out.println("1,魔法");
                System.out.println("2,逃亡");

                int actMain = scan.nextInt();
                if (actMain == 1) {

                    System.out.println("魔法");
                    System.out.println("1,ファイアー");
                    System.out.println("2,ヒール");
                    int actSab1 = scan.nextInt();

                    if (actSab1 == 1) {
                        System.out.println("対象を選択してください>>");
                        int i = 1;
                        for (Enemy e : enemies) {
                            System.out.println(i + "." + e.name);
                            i++;

                        }
                    }

                    switch (actSab1) {
                        case 1:
                            // 攻撃対処の選択
                            int actSab2 = scan.nextInt() - 1;
                            airi.attack(enemies.get(actSab2));
                            break;

                        case 2:
                            airi.heal();
                            break;

                        default:
                            break;

                    }

                }

                // 逃亡
                if (actMain == 2) {
                    boolean failed = airi.run();
                    if (failed) {
                        break;
                    }

                }

            }

        } while (airi.hp > 0 && (kuri.hp > 0 || pan.hp > 0));

        if (airi.hp <= 0) {
            System.out.println("あいりは敗北し家に帰った");

        } else {

            System.out.println("あいりは冒険を進めた");

        }

    }

}
