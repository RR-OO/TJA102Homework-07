package hw1;

// 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
// 5 + 5
// 5 + ‘5’
// 5 + “5”
// 並請用註解各別說明答案的產生原因
public class HW01_06 {
    public static void main(String[] args) {
        System.out.println(5 + 5);
        // 印出：10
        // 說明：兩個整數做加法運算，5 + 5 = 10

        System.out.println(5 + '5');
        // 印出：58
        // 說明：'5' 為字元型別（char）
        // 用 Unicode 編碼轉換'5'，是整數53
        // 兩個整數做加法運算，5 + 53 = 58

        System.out.println(5 + "5");   
        // 印出：55
        // 說明：5 是整數，"5" 是字串
        // 字串相加運算中，為"55"
    }
}
