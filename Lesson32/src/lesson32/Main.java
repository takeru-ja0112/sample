package lesson32;

public class Main {
	/*
	クラスフィールド
	問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	
	問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
	
	問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
	
	クラスメソッド
	問題4：クラスメソッド「printCount」を定義してください（データ型：void）
	
	問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
	
	問題6：クラスメソッド「printCount」を呼び出してください
	*/

	public static void main(String[] args) {
		// クラスのインスタンス化
		Person person1 = new Person("鈴木太郎", +20, 1.7, 60);
		// 出力メソッドを呼び出す
		person1.print();

		// クラスのインスタンス化
		Person person2 = new Person("山田花子", +22, 1.5, 40);
		// 出力メソッドを呼び出す
		person2.print();

		// Q3
		// 人数を数える変数にアクセス
		int count = Person.count;
		// 出力内容
		System.out.println("合計" + count + "人です");

		// Q6
		// クラスメソッドを呼び出す
		Person.printCount();
	}
}
