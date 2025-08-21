package learn.lessun01;

public class Sav1{
    private String moji;

    //値を保存
    public void SetSav1(String echo) {
        this.moji = echo;
    }

    public void echo() {
        System.out.println("あなたは" + moji + "と入力しました。");
    }
}