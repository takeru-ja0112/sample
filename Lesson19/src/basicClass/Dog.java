package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	public String name;
	// Q2：フィールドに動物の数の変数を定義してください。
	public int animalNum;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		// 値を代入
		this.name = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int animalNum) {
		// 値を代入
		this.animalNum = animalNum;
	}
}
