package execution;

// 現在日時を取得するクラス
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import process.Pro;

public class Exe {

	public static void main(String[] args) {
		// クラスを呼び出して変数に代入
		Pro pro = new Pro();
		// 出力内容
		System.out.println("こんにちは！ここは" + pro.country + "です！");
		// 出力内容
		System.out.println("この" + pro.food + "はうまい");
		// 出力内容
		System.out.println(pro.food + "は" + pro.genre + "です");

		// 現在日時を取得
		LocalDateTime ldt = LocalDateTime.now();
		// フォーマットを設定
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		//　現在日時にフォーマットを設定
		String timeFormatt = ldt.format(dtf);

		// 出力内容
		System.out.println("今の現在日時は" + timeFormatt + "です");
	}
}
