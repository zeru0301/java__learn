package airinobouken;

public class Main {
    public static void main(String[] ages) {
        int damage;
        // あいりのさくせい

        airi a = new airi();

        // エネミーの作成
        kurikuri kuri = new kurikuri();

        System.out.println("""
                ======================================
                           あいりの冒険！！
                ======================================
                あいりは冒険に出かけた
                草むらを歩いていると、モンスターに出くわした！！
                """);

        do {
            System.out.println("======================================");
            System.out.println("エネミー" + kuri.name);
            System.out.println("HP" + kuri.hp);

            System.out.println("あいり");
            System.out.println("HP" + a.hp);
            System.out.println("======================================");

            if (a.dex > kuri.dex) {
                damage = a.attack();
                kuri.hp -= damage;

                if(kuri.hp <= 0)break;

                damage = kuri.attack();
                a.hp -= damage;

            } else {

                damage = kuri.attack();
                a.hp -= damage;

                if(a.hp <= 0)break;

                damage = a.attack();
                kuri.hp -= damage;

            }
         

        } while (kuri.hp > 0 && a.hp > 0);
        
        if(a.hp <= 0){
            System.out.println("あいりは敗北し家に帰った");

        }else{

            System.out.println("あいりは勝利し冒険を進めた");

        }

    }

}
