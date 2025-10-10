package airinobouken;

import java.util.Random;

public class enemy {
    String name ;
    int hp ;
    int level ;
    int dex ;
    int mp ;

    public enemy(String name,int hp, int level,int dex,int mp){
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.dex = dex;
        this.mp = mp;

    }

        public int attack(){
        int damage = new Random().nextInt(level+ 3) +1;
        System.out.println(name +"は、" + damage + "ダメージを与えた。");
        return damage;

    } 


    
    
}
