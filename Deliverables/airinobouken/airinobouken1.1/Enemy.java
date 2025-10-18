package airinobouken;

import java.util.Random;

public abstract class Enemy {
    String name;
    int hp;
    int level;
    int dex;
    int mp;
    int expValue;
    int maxExpValue;

    Random random = new Random();

    // あいりの情報をメインから取得
    Airi airi;

    public void setAiri(Airi airi){
        this.airi = airi;
    }

// 生存していたら行動を実行
    public boolean isAlive() {
        return this.hp > 0;
    }

    public Enemy(String name, int hp, int level, int dex, int mp, int expValue) {
        this.name = name;
        this.hp = hp + level;
        this.level = level;
        this.dex = dex + level;
        this.mp = mp + level;
        this.expValue = expValue;


    }

    public void attack(Airi airi) {
        int judg = random.nextInt(100) + 1;
        if (judg  >= 40 + level) {
            int damage = random.nextInt(level + 3) + 1;
            System.out.println(name + "は、" + damage + "ダメージを与えた。");
            airi.hp -= damage;
            
        }else{
            System.out.println(name + "は、攻撃を外した");
           

        }


    }

}
