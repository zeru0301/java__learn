package airinobouken;

import java.util.Scanner;

public class Main {
    public static void main(String[] ages) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        // あいりのさくせい
        Airi airi = new Airi();

        // バトルメソッドの生成
        Battle battle = new Battle(airi);

        // 将来的に使うかも
        Item item = new Item(airi);



        
        System.out.println("""
                ======================================
                           あいりの冒険！！
                ======================================
                あいりは冒険に出かけた
                草むらを歩いていると、モンスターに出くわした！！
                """);
        Thread.sleep(1000);
        battle.start();



    }  

}
