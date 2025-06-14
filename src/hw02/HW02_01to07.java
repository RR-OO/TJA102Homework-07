package hw02;

public class HW02_01to07 {
	public static void main(String[] args) {
		evenNumberSum();
		continuousProductForLoop();
		continuousProductWhileLoop();
		regularOutput();
		lotteryChoise();
		numberTriangleOutput();
		englishTriangleOutput();
;	}
	
	// 一、請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void evenNumberSum(){
		int sum = 0;
		for(int initNum = 1; initNum <= 1000; initNum++) {
			if(initNum % 2 == 0) {
				sum += initNum;
			}
		}
		System.out.println("1~1000 的偶數和為: " + sum);
	}
	
	// 二、請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
	public static void continuousProductForLoop (){
		// 宣告初始值為1；不宣告初始值為0，因為0 * 任何數字都是0
		int product = 1;
		for(int initNum = 1; initNum <= 10; initNum++) {
			if(initNum % 2 == 0) {
				product = product * initNum;
			}
		}
		System.out.println("1~10 的連乘積為(用for迴圈): " + product);		
	}

	// 三、請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	public static void continuousProductWhileLoop (){
		// 宣告初始值為1；不宣告初始值為0，因為0 * 任何數字都是0
		int product = 1;
		int initNum = 1;
		while(initNum <= 10) {
			if(initNum % 2 == 0) {
				product = product * initNum;
			}
			initNum++;
		}
		System.out.println("1~10 的連乘積為(用while迴圈): " + product);			
	}

	// 四、請設計一隻Java程式,輸出結果為以下:
	// 1 4 9 16 25 36 49 64 81 100
	public static void regularOutput(){
		// while迴圈
		int currentNumber = 1;
		int plusNumber = 3;
		while(currentNumber <= 100) {
				System.out.printf(currentNumber + " ");
				currentNumber += plusNumber;
				plusNumber = plusNumber + 2;
		}
		
//		// do...while迴圈
//		int currentNumber = 1;
//		int plusNumber = 3;
//		do {
//			System.out.printf(currentNumber + " ");
//			currentNumber += plusNumber;
//			plusNumber = plusNumber + 2;
//		} while(currentNumber <= 100);
		
//		// for迴圈
//		int currentNumber = 1;
//		for(int plusNumber = 3; currentNumber <= 100; plusNumber += 2) {
//			System.out.printf(currentNumber + " ");
//			currentNumber += plusNumber;
//		}
	}

	// 五、阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
	// 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	public static void lotteryChoise(){
		// 換行 & 分隔線
		System.out.println("\n" + "=========");
		System.out.println("阿文可以選擇的數字有下列數字: ");
		int count = 0;
		for(int currentNumber = 1; currentNumber <= 49; currentNumber++) {
			// 取餘數為個位數
			int singleDigit = currentNumber % 10;
			// 除以十，取整數為十位數
			int tensDigit = currentNumber / 10;
			
			// 個位數、十位數皆不為4
			if(singleDigit != 4 && tensDigit != 4) {
				System.out.printf(currentNumber + " ");
				// 計數加1
				count++;
			}
		}
		System.out.println("\n" + "阿文有共 " + count + " 個數字可選擇");
		System.out.println("=========");
	}

	// 六、請設計一隻Java程式,輸出結果為以下:
	// 1 2 3 4 5 6 7 8 9 10
	// 1 2 3 4 5 6 7 8 9
	// 1 2 3 4 5 6 7 8
	// 1 2 3 4 5 6 7
	// 1 2 3 4 5 6
	// 1 2 3 4 5
	// 1 2 3 4
	// 1 2 3
	// 1 2
	// 1
	public static void numberTriangleOutput(){
		// 直向數
		int vertical = 0;
		// 橫向數
		int horizontal = 0;
		for(vertical = 10; vertical >= 1; vertical--) {
			for(horizontal = 1; horizontal <= vertical; horizontal++) {
				System.out.printf(horizontal + " ");
			}
			// 換行
			System.out.println();
		}		
	}

	// 七、請設計一隻Java程式,輸出結果為以下:
	// A
	// BB
	// CCC
	// DDDD
	// EEEEE
	// FFFFFF
	public static void englishTriangleOutput(){
		// 錯誤想法
		
		// 印出結果為:
		// A
		// AB
		// ABC
		// ABCD
		// ABCDE
		// ABCDEF
		
//		// 直向數
//		int vertical = 0;
//		// 橫向數
//		int horizontal = 0;
//		// 英文字母與索引值對照表
//		String[] alphabetMapping = {"A", "B", "C", "D", "E", "F"};
//		
//		for(vertical = 1; vertical <= 6; vertical++) {
//			for(horizontal = vertical; horizontal <= vertical; horizontal++) {
//				String str = "";
//				String targetAlphabet = alphabetMapping[horizontal - 1];
//				for(int conbine = horizontal; conbine <= horizontal; conbine++) {
//					str += targetAlphabet;
//				}
//				System.out.printf(str);
//			}
//			// 換行
//			System.out.println();
//		}
		
		// ====================================================
		
		// 正確想法
		
		// 直向數
		 int vertical = 0;
		// 英文字母與索引值對照表
		 String[] alphabetMapping = {"A", "B", "C", "D", "E", "F"};
		
		for(vertical = 1; vertical <= 6; vertical++) {
			String str = "";
			String targetAlphabet = alphabetMapping[vertical - 1];
			
			// 組合字串
			for(int conbineCount = 1; conbineCount <= vertical; conbineCount++) {
				str += targetAlphabet;
			}
			
			System.out.printf(str + "\n");
		}	
	}
}
