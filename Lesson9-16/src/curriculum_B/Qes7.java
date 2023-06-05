package curriculum_B;

// 標準の入力したデータを読み取るクラスを呼び出す
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// スキャナーオブジェクトを作成します
		Scanner scanner = new Scanner(System.in);

		// 生徒の人数を入力するように促す
		System.out.print("生徒の人数を入力してください(2以上):");
		// 生徒の人数を入力
		int num = scanner.nextInt();
		// 生徒の人数を2未満が入力されたらメッセージが表示される
		if (num < 2) {
			// 出力内容
			System.out.println("2以上で入力してください");
			// 処理の終了
			return;
		}
		// 人数を出力するための変数を宣言し代入
		int number = 0;
		// 英語の点数を入れる配列を宣言し代入
		int eng[] = new int[num];
		// 数学の点数を入れる配列を宣言し代入
		int math[] = new int[num];
		// 理科の点数を入れる配列を宣言し代入
		int sci[] = new int[num];
		// 社会の点数を入れる配列を宣言し代入
		int soc[] = new int[num];

		// 入力された人数分繰り返される処理
		for (int i = 0; i < num; i++) {
			// 人数を表示する部分を演算子で増やしていきます。
			number++;
			// 指示文
			System.out.print(number + "人目の『英語』の点数を入力してください：");
			// 英語の数値を代入
			eng[i] = scanner.nextInt();
			// 指示文		
			System.out.print(number + "人目の『数学』の点数を入力してください：");
			// 数学の数値を代入
			math[i] = scanner.nextInt();
			// 指示文
			System.out.print(number + "人目の『理科』の点数を入力してください：");
			// 理科の数値を代入
			sci[i] = scanner.nextInt();
			// 指示文
			System.out.print(number + "人目の『社会』の点数を入力してください：");
			// 社会の数値を代入
			soc[i] = scanner.nextInt();
			// 改行
			System.out.println();

		}
		// 人数リセット
		number = 0;
		// 人数分の平均点を出す処置
		for (int j = 0; j < num; j++) {
			// 人数を増やしていく
			number++;
			// 各教科合計の変数を宣言し代入
			int sum = eng[j] + math[j] + sci[j] + soc[j];
			// 平均を計算する変数
			double avg = (double) sum / 4;
			// 平均点の文章を出力
			System.out.printf("%d人目の平均点は%.2f点です。\n" , number , avg);
		}
		// 改行
		System.out.println();

		// 英語の平均値を出す変数
		double avgEng = subAverage(eng);
		// 出力内容
		System.out.printf("英語の平均点は%.2f点です。\n" , avgEng);
		// 数学の平均値を出す変数
		double avgMath = subAverage(math);
		// 出力内容
		System.out.printf("数学の平均点は%.2f点です。\n" , avgMath);
		// 理科の平均値を出す変数
		double avgSci = subAverage(sci);
		// 出力内容
		System.out.printf("理科の平均点は%.2f点です。\n" , avgSci);
		// 社会の平均値を出す変数
		double avgSoc = subAverage(soc);
		// 出力内容
		System.out.printf("社会の平均点は%.2f点です。\n" , avgSoc);
		// 教科の平均値を計算した変数
		double totalScore = (avgEng + avgMath + avgSci + avgSoc) / 4;
		// 出力内容
		System.out.printf("全体の平均点は%.2f点です。\n" , totalScore);

	}

	// 平均値を計算する関数
	public static double subAverage(int[] array) {
		// 合計値を代入する変数を初期化
		int total = 0;
		// 配列内の要素を合計する処理
		for (int k = 0; k < array.length; k++) {
			// 合計値変数に配列の要素を足す
			total += array[k];
		}
		// 配列の要素数で合計値を割る計算式
		double average = (double) total / array.length;
		// 計算された平均値を返す
		return average;
	}
}
