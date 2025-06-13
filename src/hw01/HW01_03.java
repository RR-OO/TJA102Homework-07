package hw1;

// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class HW01_03 {
	public static void main(String[] args) {
        int totalSecond = 256559;

        // 一天秒數
        int secondInDay = 86400;
        // 一小時秒數
        int secondInHour = 3600;
        // 一分鐘秒數
        int secondInMinute = 60;

        int day = totalSecond / secondInDay;
        int remainSecondByDay = totalSecond % secondInDay;

        int hour = remainSecondByDay / secondInHour;
        int remainSecondByHour = remainSecondByDay % secondInHour;

        int minute = remainSecondByHour / secondInMinute;
        int second = remainSecondByHour % secondInMinute;

        System.out.println("共 " + day + " 天 " + hour + " 小時 " + minute + " 分 " + second + " 秒");
    }
}
