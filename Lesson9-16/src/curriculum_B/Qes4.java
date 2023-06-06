package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		System.out.println(" 課題4\n");

		// 九九のシステム
		for (int i = 1; i <= 9; i++) {
			// 掛け算のもう一つの値
			for (int j = 1; j <= 9; j++) {
				// 掛け算の式
				int result = i * j;
				// 出力文
				System.out.printf("%02d * %02d = %02d", i, j, result);
				// 9をかける時以外は||を表示
				if (j != 9) {
					// 出力内容
					System.out.print(" || ");
				}
			}
			// 改行
			System.out.println();
		}
	}

}
