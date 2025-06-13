package hw1;

// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
public class HW01_02 {
	public static void main(String[] args) {
        int totalEggs = 200;
        int dozen = 12;

        // 幾打
        int dozens = totalEggs / dozen;
        // 剩幾顆
        int remainEggs = totalEggs % dozen;

        System.out.println("總共有 " + dozens + " 打， " + remainEggs + " 顆蛋");
    }
}
