package hw1;

// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class HW01_04 {
    public static void main(String[] args) {
        final double PI = 3.1415;
        double radius = 5.0;

        // 圓面積 = PI * 半徑 * 半徑
        double circleArea = PI * radius * radius;
        // 圓周長 = 2 * PI * 半徑
        double  circleLong = 2 * PI * radius;

        System.out.println("圓面積為: " + circleArea);
        System.out.println("圓周長為: " + circleLong);
    }
}
