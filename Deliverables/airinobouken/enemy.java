package airinobouken;

import java.util.Random;

public class Enemy {
    String name;
    int hp;
    int level;
    int dex;
    int mp;
    int expValue;

    Random random = new Random();

    // あいりの情報をメインから取得
    Airi airi;

    public void setAiri(Airi airi){
        this.airi = airi;
    }

    public Enemy(String name, int hp, int level, int dex, int mp, int expValue) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.dex = dex;
        this.mp = mp;
        this.expValue = expValue;

    }

    public void attack(Airi airi) {
        int judg = random.nextInt(100) + 1;
        if (judg + level >= 60) {
            int damage = random.nextInt(level + 3) + 1;
            System.out.println(name + "は、" + damage + "ダメージを与えた。");
            airi.hp -= damage;
            
        }else{
            System.out.println(name + "は、攻撃を外した");
           

        }


    }

}
