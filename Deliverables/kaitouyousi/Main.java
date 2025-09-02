package kaitouyousi;
import java.io.File;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        // 今日の日付を取得
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        String timestamp = now.format(dtf);

        String filePrefix = "mondai_" + timestamp;

        // フォルダの作成位置を固定するための設定
        String userName = System.getProperty("user.home");
        String desktopPath = userName + "\\Desktop";

        // 令和何年の過去問化を取得
        Scanner scan = new Scanner(System.in);
        System.out.println("bot:基本情報過去問の年度を令和で教えてください>>");
        String name =  scan.nextLine();
        scan.close();

        // ディレクトリがなければ作成
        String folderPath =  desktopPath +"\\mondai\\reiwa" + name;
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs(); //（存在しなければ作成）
        }
       
        kamoku.generateFile(folderPath, filePrefix, 20);
        kamoku.generateFile(folderPath, filePrefix, 6);
    }
}