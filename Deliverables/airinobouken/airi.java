package airinobouken;

import java.util.Random;

public class airi {
    // ステータス
    int level = 1;
    int hp = 10;
    int dex = 5;
    int mp = 12;
    int exp = 0;

    // 戦闘用
    int damage;

    // 攻撃
    
    public int attack() {
        if (mp >= 2) {
            mp -= 2;
            damage = new Random().nextInt(level + 4) + 1;
            System.out.println("あいりは呪文ファイヤを使用した");
            System.out.println("あいりは" + damage + "ダメージを与えた。");
            return damage;

        } else {
            System.out.println("あいりはMP切れだった");
            return damage = 0;
            
        }

    }

    public boolean run() {
        int nigeru = new Random().nextInt(hp + 4) + 1;
        if (nigeru > 3) {
            System.out.println("あいりは逃亡に成功した");
            return true;

        } else {
            System.out.println("あいりは逃亡に失敗した");
            return false;
        }

    }

    public void experienceValue(int expValue) {
        int levelUp = level * 2;
        exp += expValue;
        if (levelUp >= exp) {
            System.out.println("あいりはレべルアップした");
            level++;
        }

    }

}
