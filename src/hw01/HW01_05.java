package hw1;

// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢
// (用複利計算，公式請自行google)
public class HW01_05 {
    public static void main(String[] args) {
    	// 存入金額
        double startMoney = 1500000;
        // 年利率
        double rate = 0.02;
        // 存幾年
        int years = 10;

        // 最終金額 = 本金 * (1 + 年利率)^年數
        double result = startMoney * Math.pow(1 + rate, years);

        System.out.printf("10年後的本金加利息共有： %.2f 元%n", result);
    }
}
