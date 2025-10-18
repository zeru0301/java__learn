package airinobouken;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionAiri {
    Scanner scan = new Scanner(System.in);


    // あいりをメインから取得
    Airi airi;

    // アイテムをItemから取得
    Item item;

    // battlエネミーネミーを取得
    Battle enemies;

    public ActionAiri(Airi airi ,Item item, Battle battle){
        this.airi = airi;
        this.item = item;
        this.enemies = battle;
    }

    


    public void actionAiri(){
        System.out.println("どう行動しますか？");
                System.out.println("1,魔法");
                System.out.println("2,アイテム");
                System.out.println("3,逃亡");
                int actMain = scan.nextInt();
    
                if (actMain == 1) {

                    // battleから敵の情報を取得
                    ArrayList<Enemy> enemyList = enemies.getEnemies();

                    System.out.println("魔法");
                    System.out.println("1,ファイアー:mp -2");
                    System.out.println("2,ヒールmp -3");
                    int actMagic = scan.nextInt();

                    if (actMagic == 1) {
                        System.out.println("対象を選択してください>>");
                        int i = 1;

                        
                        
                        for (Enemy e : enemyList) {
                            System.out.println(i + "." + e.name);
                            i++;

                        }
                    }

                    switch (actMagic) {
                        case 1:
                            // 攻撃対処の選択
                            int actsubject = scan.nextInt() - 1;
                            airi.attack(enemyList.get(actsubject));
                            break;

                        case 2:
                            airi.heal();
                            break;

                        default:
                            break;

                    }

                }

                // アイテムを使用
                if (actMain == 2) {
                    System.out.println("アイテム");
                    System.out.println("1,MPシード" + item.MPSeed);
                    System.out.println("2,HPポーション" + item.HPPotion);
                    int ItemSubject = scan.nextInt();
                    switch (ItemSubject) {
                        case 1:
                            item.useMPSeed();

                            break;

                        case 2:
                            item.useHPPotion();
                            break;

                        default:
                            break;
                    }

                }
                // 逃亡
                if (actMain == 3) {
                    boolean failed = airi.run();
                    if (failed) {
                        return;
                    }

                }

    }


    
    
    
    
}
