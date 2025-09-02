package kaitouyousi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class kamoku {
    public static void generateFile(String folderPath,String filePrefix,int AandB) {

                // ファイル名を決定
                 String fileName;
                if(AandB == 20){
                    fileName = folderPath + "\\" + filePrefix + "mondaiA.txt";
 
                }else{
                    fileName = folderPath + "\\" + filePrefix + "mondaiB.txt";

                }

                File folder = new File(folderPath);
                if (!folder.exists()) folder.mkdirs();
           
            try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {

                out.println("問題の答えを右に入力してください");
                for (int i = 1; i < (AandB + 1); i++) {
                    if (i % 6 == 0) {
                        out.println("問" + i + "   "+"|");

                    } else {
                        out.print("問" + i + "   " +"|");
                    }

                }
                out.println("お疲れさまでした！！");

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("作成が完了しました");
        }

    }

