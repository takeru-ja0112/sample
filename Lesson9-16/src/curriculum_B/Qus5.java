package curriculum_B;

public class Qus5 {

	public static void main(String[] args) {
		System.out.println(" 課題5\n");

		// かける数を最大10までとし、演算子で増やしていきます
		for (int i = 1; i <= 10; i++) {
			// 掛け算のもう一つの値
			for (int j = 1; j <= 10; j++) {
				// 掛け算の式
				int result = i * j;
				// 出力文
				System.out.printf("%03d * %03d = %03d", i, j, result);
				// 最後の掛け算（10をかける時）以外は||を表示
				if (j != 10) {
					// 出力文
					System.out.print(" || ");
				}
			}
			// 改行
			System.out.println();
		}
		// 空白をあけます
		System.out.println();
		// かける数は9までとし、演算子で増やしていきます
		for (int i = 1; i <= 9; i++) {
			// マイループ時最初に初期値に11をかけた数を表示します
			System.out.printf("%02d = %03d || ", i, i * 11);
			// 掛け算のもう一つの値
			for (int j = 12; j <= 20; j++) {
				// 掛け算の式
				int result2 = i * j;
				// 出力文
				System.out.printf("%03d * %03d = %03d ", j, i, result2);
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
