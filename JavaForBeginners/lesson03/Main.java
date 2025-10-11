package JavaForBeginners.lesson03;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] ages) {
        Scanner scan = new Scanner(System.in);

        // if分の練習
        int weight = 60;
        if (weight == 60) {
            System.out.println("成功");

        }

        int age1 = 15;
        int age2 = 30;
        if ((2 * (age1 + age2)) > 60) {
            System.out.println("成功");

        }

        int age = 45;
        if (age % 2 == 1) {
            System.out.println("成功");
        }

        String name = "湊";
        if (name.equals("湊")) {
            System.out.println("成功");

        }

        // ラーメン屋さん
        int isHumgry = 0;
        
        String food = "らーめん";

        System.out.println("こんにちは");
        
        do {
            System.out.println("今おなかがいっぱいですか？YorN");
            String stomach = scan.nextLine();
            if(stomach.equals("Y")){
                isHumgry = 0;

            }else{
                isHumgry = 1;

            }
           

            if (isHumgry == 0) {
                System.out.println("おなかがいっぱいです");
                break;
            } else {
                System.out.println("腹ペコです");
                System.out.println(food + "をいただきます");
                isHumgry--;

            }
        } while (isHumgry == 0);
        System.out.println("ごちそうさまでした");

        System.out.print("「メニュー」");
        System.out.print("1検索:");
        System.out.print("2登録:");
        System.out.print("3削除:");
        System.out.print("4変更>");
        
        int selected = scan.nextInt();
        switch (selected) {
            case 1:
            System.out.println("検索します:");
                break;
            case 2:
            System.out.println("登録します");
                break;
            case 3:
            System.out.println("削除します");
                break;
            case 4:
            System.out.println("変更します");
                break;
            default:
                break;
        }

        // 数あてゲーム
        System.out.println("数あてゲーム");
        int ans  = new Random().nextInt(10); 
        
        for(int i  = 5; i > 0; i--){        
           System.out.println("0 ~ 9の文字を選んでね!!"); 
           int num = scan.nextInt();
           if(num == ans){
            System.out.println("正解");
            break;

           }else if((i - 1) == 0){
            System.out.println("残念でした！");
           }else{

            System.out.println("残念あと" + (i-1) + "回挑戦できるよ！");
           }

        }
        


        scan.close();

    }

}
