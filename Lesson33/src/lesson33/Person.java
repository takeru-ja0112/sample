package lesson33;

public class Person {
	/*
	インスタンスフィールドの追加
	問題1：インスタンスフィールドに「lastName」を追加しましょう
	
	コンストラクタのオーバーロード
	問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
	※順番はfirstNameの次
	
	問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
	 */
	// インスタンスフィールドを定義
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	// Q1
	// インスタンスフィードを定義
	public String lastName;

	// コンストラクタを定義
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// Q2
	// 追加でコンストラクタを定義
	Person(String lastName) {
		// Q3
		Person.count++;
		this.lastName = lastName;
	}

	// インスタンスメソッドを定義
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// 出力メソッドを定義
	public void print() {
		// 出力内容
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	//BMIを計算するメソッドを定義
	public double bmi() {
		// 計算を返す
		return this.weight / this.height / this.height;
	}

	// 人数を出力するメソッドを定義
	public static void printCount() {
		// 出力内容
		System.out.println("合計" + Person.count + "人です");
	}
}
