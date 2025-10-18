package airinobouken;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Battle {
    // 今回登場する敵の取得
    Scanner scan = new Scanner(System.in);

    // あいりをメインから取得
    Airi airi;

    // アイテムをItemから取得
    Item item;

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
    ActionAiri actionAiri;

    // 敵の生成
    Kurikuri kuri = new Kurikuri();
    Panpan pan = new Panpan();

    ArrayList<Enemy> enemies = new ArrayList<>();

    public Battle(Airi airi) {
        this.airi = airi;
        this.item = new Item(airi);
        enemies.add(kuri);
        enemies.add(pan);

        // battle用のメソッドを取得を取得
        actionAiri = new ActionAiri(airi, item, this);
    }

    // エネミーの中から最も早いエネミーを探す。
    public void start() throws InterruptedException {

        Enemy fastEnemy = enemies.get(0);
        for (Enemy e : enemies) {
            if (e.dex > fastEnemy.dex) {
                fastEnemy = e;
            }
        }

        do {

            System.out.println("======================================");

            for (int i = 0; enemies.size() > i; i++) {
                System.out.print("エネミー" + enemies.get(i).name);
                System.out.println(" HP" + enemies.get(i).hp);

            }

            System.out.println("");
            System.out.print("あいり");
            System.out.print(" HP" + airi.hp);
            System.out.println(" MP" + airi.mp);
            System.out.println("======================================");
            Thread.sleep(2000);

            if (airi.dex > fastEnemy.dex) {
                actionAiri.actionAiri();


                // 敵のターン
                Iterator<Enemy> it = enemies.iterator();
                while (it.hasNext()) {
                    Enemy e = it.next();
                    if (e.isAlive()) {
                        e.attack(airi);
                    }
                    if (!e.isAlive()) {
                        System.out.println(e.name + "は倒れた");
                        it.remove();
                    }

                }

                if (airi.hp <= 0) {
                    break;
                }

            } else {
                Iterator<Enemy> it = enemies.iterator();
                while (it.hasNext()) {
                    Enemy e = it.next();
                    if (e.isAlive()) {
                        e.attack(airi);
                    }
                    if (!e.isAlive()) {
                        System.out.println(e.name + "は倒れた");
                        it.remove();
                    }

                }

            }

            if (airi.hp <= 0) {
                break;
            }

            actionAiri.actionAiri();

        } while (airi.hp > 0 && (kuri.hp > 0 || pan.hp > 0));

        if (airi.hp <= 0) {
            System.out.println("あいりは敗北し家に帰った");

        } else {

            System.out.println("あいりは冒険を進めた");

        }
    }
}