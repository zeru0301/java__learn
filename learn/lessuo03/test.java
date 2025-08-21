package learn.lessun03;
// ２次元配列

public class test {
    public static void main(String[] args) {

        int[][] tall = new int[3][4];

        tall[0] = new int[] { 173, 169, 176, 182 };
        tall[1] = new int[] { 170, 171, 175, 172 };
        tall[2] = new int[] { 180, 168, 167, 173 };

        for (int num = 0; num < tall.length; num++) {
            for (int i = 0; i < 4; i++) {
                if (i > 0)
                    System.out.print(",");
                System.out.print(tall[num][i]);

            }
            System.out.println();
        }
    }

}
