package lesson32;

public class Person {
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
	public String name;
	public int age;
	public double height;
	public double weight;
	// Q1
	// クラスフィールドの定義
	public static int count = 0;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// Q2
		// 増加演算子を使用
		count++;
	}

	// Q4
	// クラスメソッドの定義
	public static void printCount() {
		// Q5
		// 出力内容
		System.out.println("合計" + count + "人です");
	}

	// 名前を返すメソッド
	public String name() {
		// 値を返す
		return name;
	}

	// 年齢の値を返すメソッド
	public int age() {
		// 値を返す
		return age;
	}

	// BMIの計算メソッド
	public double bmi() {
		// 計算式を返す
		return this.weight / this.height / this.height;
	}

	// 出力用メソッド
	public void print() {
		// 出力内容
		System.out.println("名前は" + this.name() + "です");
		System.out.println("年は" + this.age() + "です");
	}
}
