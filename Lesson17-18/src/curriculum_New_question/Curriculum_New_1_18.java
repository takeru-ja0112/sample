package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void textMethod(String str, int num) {
		// 出力文
		System.out.println(str + " " + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiNum(int num01, int num02) {
		// 計算して出力
		System.out.println(num01 * num02);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void arrays(int[] arr) {
		// 配列の要素を順番に取り出す
		for (int num : arr) {
			// 出力内容
			System.out.println(num);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void add(double num01, double num02) {
		// 計算結果を出力
		System.out.println(num01 + num02);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] random(int count) {
		// ランダムオブジェクトを作成
		Random random = new Random();
		// 格納する数を決める
		int numbers[] = new int[count];
		// 引数として受け取った数まで処理を行う
		for (int i = 0; i < count; i++) {
			// 1〜100の数をランダムで代入
			numbers[i] = random.nextInt(100) + 1;
		}
		// 格納した値を代入
		return numbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double average(int[] aveNumbers) {
		// 合計値を代入する変数を宣言し初期化
		int sum = 0;
		// 配列の要素を順番に取り出す
		for (int num : aveNumbers) {
			// 合計値の計算
			sum += num;
		}
		// 平均値の計算
		double avg = (double) sum / aveNumbers.length;
		// 出力内容
		System.out.println(avg);
		return avg;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean boolCheck(double avg) {
		// 平均値が50以上の処理
		if (avg >= 50) {
			// trueを返す
			return true;
		}
		// それ以外はfalseを返す
		return false;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// Q1
		System.out.println("\nQ1");
		// 引数を指定する
		textMethod("Hello JavaSE", 11);

		// Q2
		System.out.println("\nQ2");
		// 引数を指定する
		multiNum(23, 21);

		// Q3
		System.out.println("\nQ3");
		// 配列変数に代入
		int arr[] = { 1, 2, 3, 4, 5 };
		// 引数を指定する
		arrays(arr);

		// Q4
		System.out.println("\nQ4");
		// 引数を指定する
		add(2.5, 3.5);

		// 05
		System.out.println("\nQ5");
		// 引数を指定して、配列に格納
		int[] randomMain = random(4);
		// 配列の要素を順番に取り出す
		for (int randomNum : randomMain) {
			// 出力内容
			System.out.println(randomNum);
		}

		// Q6
		System.out.println("\nQ6");
		// 引数を指定する
		average(randomMain);

		// Q7
		System.out.println("\nQ7");
		// 引数を指定して、値を変数に代入
		boolean result = boolCheck(average(randomMain));
		// 出力内容
		System.out.println(result);
	}
}
