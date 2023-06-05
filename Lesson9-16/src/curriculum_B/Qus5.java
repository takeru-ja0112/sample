package curriculum_B;

public class Qus5 {

	public static void main(String[] args) {
		System.out.println(" 課題5\n");

		for (int i = 1; i <= 9; i++) {
			// 掛け算のもう一つの値
			for (int j = 1; j <= 20; j++) {
				// 掛け算の式
				int result = j * i;
				// 出力文
				System.out.printf("%03d * %03d = %03d", j, i, result);
				// 最後の掛け算（20をかける時）以外は||を表示
				if (j != 20) {
					// 出力文
					System.out.print(" || ");
				}
			}
			// 改行
			System.out.println();
		}
	}

}
