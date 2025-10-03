import java.util.Scanner;

public class Cheating {
    public static void main(String[] args) {
        String choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("bot:じゃんけんをしましょう!");
        System.out.println("bot:・グー・チョキ・パー");
        System.out.println("bot:の中からどれかを選択してね!");

        while (true) {

            System.out.println("bot:じゃあいくよ!");
            System.out.println("bot:ジャン ケン!");
            System.out.println("bot:候補 グー チョキ パー");
            choice = scan.nextLine();
            scan.close();
        
            try {
                switch (choice) {
                    case "グー":
                        System.out.println("bot:パー");
                        System.out.println("bot:僕の勝ち！！");
                        return;

                    case "チョキ":
                        System.out.println("bot:・グー");
                        System.out.println("bot:僕の勝ち！！");
                        return;

                    case "パー":
                        System.out.println("bot:チョキ");
                        System.out.println("bot:僕の勝ち！！");
                        return;

                    default:
                        throw new IllegalArgumentException("無効な入力です");

                }
    

            } catch (IllegalArgumentException e) {
                System.out.println("bot:入力エラー" + e.getMessage() + "じゃあ、もう一回行くよ");

            }
        }
        

    }
    
}
