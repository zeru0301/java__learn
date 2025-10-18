package airinobouken;

import java.util.ArrayList;

public class Item {

    // アイテムを格納する箱

    ArrayList<Integer> item = new ArrayList<>(); 
    int MPSeed;
    int HPPotion;

    Airi airi;
    public Item(Airi airi){
        this.airi = airi;
        item.add(MPSeed = 5);
        item.add(HPPotion = 5);


    }
    
    public void useMPSeed(){
        if(MPSeed == 0){
          System.out.println("アイテムがなかった！"); 
          return; 
        }
        System.out.println("あいりはMPシードを使用した");
        MPSeed--;
        System.out.println("あいりはMPを10回復した");
        airi.mp +=10;
        if(airi.mp > airi.maxMp){
            airi.mp = airi.maxMp;

        }
        System.out.println("現在値" + airi.mp);


    }

    public void useHPPotion(){
        if(MPSeed == 0){
          System.out.println("アイテムがなかった！");  
          return;
        }

        
        System.out.println("あいりはHPポーションを使用した");
        HPPotion--;
        System.out.println("あいりはHPを10回復した");
        airi.hp +=10;
        if(airi.hp > airi.maxHp){
            airi.hp = airi.maxHp;

        }
        System.out.println("現在値" + airi.hp);

    }

    
    
}
