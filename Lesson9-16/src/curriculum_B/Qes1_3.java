package curriculum_B;

//標準の入力したデータを読み取るクラスを呼び出す
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		// 1 ログイン時の入力チェックシステム

		Scanner scanner = new Scanner(System.in);

		// 入力した値が正常だった場合「ユーザー名を登録しました」と出力
		// 入力フォームの作成
		String userName = scanner.nextLine();

		// 何も入力されなかった時の処理
		if (userName == null || userName.isEmpty()) {
			// 出力内容
			System.out.println("「名前を入力してください」");

			// 入力数が10字を超えた場合の処理
		} else if (userName.length() > 10) {
			// 出力内容
			System.out.println("「名前を10文字以内にしてください」");

			// 入力内容に半角英数字以外が合った場合の処理
		} else if (!userName.matches("[a-z0-9]+")) {
			//出力内容
			System.out.println("「半角英数字のみで名前を入力してください」");

			// 入力オブジェクト終了			
		} else {
			scanner.close();

			// 登録した名前の出力
			System.out.println("ユーザー名「" + userName + "」を登録しました");

			// じゃんけん配列のコメントアウト
			String[] janken = { "グー", "チョキ", "パー" };
			// 手の整数型を宣言し、代入
			int userHand = 2;
			// 勝つまでの回数を数える変数を宣言し、代入
			int countToWin = 1;
			// 終了するための変数を宣言し、代入
			int countFin = 0;

			// 勝つまで繰り返す文
			while (countFin <= 1) {
				int enemyHand = (int) (Math.random() * 3);
				// 自分の手を出力
				System.out.println(userName + "の手は「" + janken[userHand] + "」");
				// 相手の手を出力
				System.out.println("相手の手は「" + janken[enemyHand] + "」" + "\n");

				// グーに負けた時の処理
				if (userHand == 1 && enemyHand == 0) {
					System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n");
					countToWin++;

					// チョキに負けた時の処理				
				} else if (userHand == 2 && enemyHand == 1) {
					// メッセージ内容
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
					countToWin++;

					// パーに負けた時の処理
				} else if (userHand == 0 && enemyHand == 2) {
					// メッセージ内容
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです。\n");
					countToWin++;

					// あいこだった場合の処理
				} else if (userHand == enemyHand) {
					// メッセージ内容
					System.out.println("DRAW あいこ もう一回しましょう！\n");
					countToWin++;

					// 勝った場合の処理				
				} else {
					System.out.println("やるやん。\n次は俺にリベンジさせて");

					// 繰り返し処理の終了
					countFin++;
				}
			}
			//勝つまでにかかった合計回数の出力
			System.out.println("\n" + "勝つまでにかかった合計回数は" + countToWin + "回です");

		}

	}

}
