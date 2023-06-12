package basicClass;

// 現在の日時を取得するクラス
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		// 出力内容
		System.out.println(dog.name);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(3);
		// 出力内容
		System.out.println(dog2.animalNum);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在の日時を取得
		LocalDateTime ldt = LocalDateTime.now();
		// フォーマットを設定
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// 現在日時にフォーマットを設定
		String formatteDateTime = ldt.format(dtf);
		// 出力内容
		System.out.println(formatteDateTime);

	}
}
