package airinobouken;

import java.util.Random;

public class Airi {

    Random random = new Random();
    // ステータス
    int level;
    int hp;
    int dex;
    int mp;
    int exp;
    int maxHp;
    int maxMp;

    // コンストラクター
    // これをすることによって複数の人数を呼ぶだけで作成可能
    public Airi() {
        this.hp = 10;
        this.dex = 5;
        this.mp = 15;
        this.exp = 0;
        this.maxHp = 10;
        this.maxMp = 15;

    }

    // 戦闘用
    int damage;

    // 敵の情報をメインから取得
    Enemy enemy;
    
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    // 行動

    // 攻撃
    public void attack(Enemy enemy) {
        if (mp >= 2) {
            // 命中率判定
            int judg = random.nextInt(100) + 1;
            if (judg <= level + 60) {
                mp -= 2;
                damage = random.nextInt(level + 4) + 1;
                System.out.println("あいりは呪文ファイヤを使用した");
                System.out.println("あいりは" + damage + "ダメージを与えた。");
                enemy.hp -= damage;
                

            } else {
                System.out.println("あいりは攻撃を外した");
               
            }

        } else {
            System.out.println("あいりはMP切れだった!!");
                

        }

    }
    // 回復
    public void heal() {
        if(mp >= 3){
            mp -=3;
            System.out.println("あいりは回復魔法を使用した");
            int damage = random.nextInt(level + 4)+1;
            hp += damage;

            System.out.println("あいりは" + damage +"点回復した"); 
            if(maxHp <= hp){
                hp = maxHp;      
            }
            
        }else{
            System.out.println("あいりはMP切れだった"); 
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

