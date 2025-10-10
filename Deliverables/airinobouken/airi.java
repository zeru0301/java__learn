package airinobouken;

import java.util.Random;

public class airi {
    int level = 1;
    int hp    = 10;
    int dex   = 5;
    int mp    = 8;

    // 攻撃
    public int attack(){
        if(mp <= 0){
            System.out.println("あいりはMP切れだった");
        }

        mp -= 3;
        int damage = new Random().nextInt(level+ 4) +1;
        System.out.println("あいりは"+ damage + "ダメージを与えた。");
        return damage;

    } 

    public void run(){
        int nigeru = new Random().nextInt(hp + 4) +1;
        if(nigeru > 3){
                System.out.println("あいりは逃亡に成功した");
        }else{
                System.out.println("あいりは逃亡に失敗した");
        }
        

    } 

    
    
}
