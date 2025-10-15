package lesson04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] points = new int[4];
        double[] weights = new double[5];
        boolean[] answers = new boolean[3];
        String[] names = new String[3];

        int[] moneyList = { 121902, 8302, 55100 };

        for (int i : moneyList) {
            System.out.println(i);

        }

        for (int j = 0; j < moneyList.length;j++){
            System.out.println(moneyList[j]);

        }

        // 数あてゲーム
        int[] numbers = {3,4,9};
        Scanner scan = new Scanner(System.in);
        System.out.println("一桁の数字を入力してください>>");
        int inputNum = scan.nextInt();

        for(int i: numbers){
                                                                                                                                                                                                                                                                                                                                                                                                      
            if(i == inputNum){
                System.out.println("あたり");
                break;
            }  
        }

    }

}
