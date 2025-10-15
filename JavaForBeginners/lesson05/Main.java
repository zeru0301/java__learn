package lesson05;

public class Main {

    // 自己紹介メソッド
    public static void introduceOneself(String name, int age, double hight, String zodiac){
        System.out.print("私の名前は"+name+"です。"); 
        System.out.print("年は"+age+"歳です。"); 
        System.out.println("身長は"+hight+"cmです。"); 
        System.out.println("十二支は"+zodiac+"です。"); 
                                                           
    }
    // メールメソッド
    public static void email(String title,String address,String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);

    } 
    // オーバーロード
    public static void email( String address,String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:無題");
        System.out.println("本文:" + text);


    }

    

    public static void main(String[] args){
        introduceOneself("ゼル", 25, 170.2, "辰");
        email(null, null, null);

    }
    
}
