package curriculum_B;

//標準の入力したデータを読み取るクラスを呼び出す
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		// 1 ログイン時の入力チェックシステム

		Scanner scanner = new Scanner(System.in);

		// 見本の写真が一行ずつ条件を試していくという流れなので、順番にテストしていましたが、
		// それは条件なので、最終的なチェックシステムだけ実行するようにしました。

		// 入力した値が正常だった場合「ユーザー名を登録しました」と出力するようにしています。
		// 入力フォームの作成
		String userName = scanner.nextLine();

		// 何も入力されなかった時の処理
		if (userName.isEmpty()) {
			// 出力内容
			System.out.println("「名前を入力してください」");

			// 入力数が10字を超えた場合の処理
		} else if (userName.length() > 10) {
			// 出力内容
			System.out.println("「名前を10字以内にしてください」");

			// 入力内容に半角英数字以外が合った場合の処理
		} else if (!userName.matches("[a-z0-9]+")) {
			//出力内容
			System.out.println("「半角英数字のみで名前を入力してください」");

			// 名前を登録する処理			
		} else {
		scanner.close();

			// 登録した名前の出力
			System.out.println("ユーザー名「" + userName + "」を登録しました");

			// じゃんけんシステムを制作します
			// じゃんけん配列のコメントアウト
			String[] janken = { "グー", "チョキ", "パー" };
			// 自分の手を出力
			System.out.println(userName + "の手は「" + janken[2] + "」");
			// 相手の手を出力
			System.out.println("相手の手は「" + janken[0] + "」" + "\n");
			// 手の整数型を宣言し、代入します
			int userHand = 2;
			int enemyHand = 0;
			// 勝つまでのカウント変数を宣言し、初期化しています
			int countToWin = 0;

			// 勝つまで繰り返す文
			for (int i = 1; countToWin < 1; i++) {

				// 勝った時の処理
				if ((userHand == 0 && enemyHand == 1) || (userHand == 1 && enemyHand == 2)
						|| (userHand == 2 && enemyHand == 0)) {
					// メッセージ内容
					System.out.println("やるやん。\n次は俺にリベンジさせて");
					//勝利時に演算子で1増加
					countToWin++;

					// 自分が負けた時の処理
				} else if (userHand == 2 && enemyHand == 1) {
					// メッセージ内容
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
					// ループから抜ける
					break;

					// 自分が負けた時の処理
				} else if (userHand == 0 && enemyHand == 2) {
					// メッセージ内容
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです。");
					// ループから抜ける
					break;

					// あいこだった場合の処理
				} else {
					// メッセージ内容
					System.out.println("DRAW あいこ もう一回しましょう！");
					// ループから抜け出す
					break;
				}
				;
				//勝つまでにかかった合計回数の出力
				System.out.println("\n" + "勝つまでにかかった合計回数は" + i + "回です");
				// ループから抜ける
				break;
			}

		}

	}

}
