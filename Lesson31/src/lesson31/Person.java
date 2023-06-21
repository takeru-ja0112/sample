package lesson31;

public class Person {
	/*
	問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
	
	問題2：CarクラスとBicycleクラスを作成しましょう。
	
	問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
	
	問題4：MainクラスからsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
	
	問題5：セットできたら、ownerをコンソールに出力してください。
	
	問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	
	問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
	
	問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
	
	問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	
	問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
	*/
	// 名前のインスタンスフィールドを定義
	public String name;
	// 年齢のインスタンスフィールドを定義
	public int age;
	// 身長のインスタンスフィールドを定義
	public double height;
	// 体重のインスタンスフィールドを定義
	private double weight;
	// 合計人数のインスタンスフィールドを定義
	private static int totalCount = 0;

	// コンストラクタを定義
	public Person(String name, int age, double height, double weight) {
		// 値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		totalCount++;
	}

	// BMIのインスタンスメソッドを定義
	public double bmi() {
		// 計算式
		double bmi = weight / (height * height);
		// BMIの値を返す
		return bmi;
	}

	// 出力用のインスタンスメソッドを定義
	public void print() {
		// 出力内容
		System.out.println("名前は" + this.name + "です");
		System.out.printf("BMIは%.1fです\n", bmi());
		System.out.println("年は" + this.age + "才です");
	}

	// 合計人数を返すインスタンスメソッド
	public int getTotalCount() {
		// 値を返す
		return totalCount;
	}

	// Q6
	// 購入するインスタンスメソッドを定義
	public void buy(Car car) {
		// Q7
		// 名前をセット
		car.setOwner(this.name);
		// Q8
		// 出力内容
		System.out.println(car.getOwner() + "が購入しました");
	}

	// Q9
	// 購入するインスタンスメソッドを定義
	public void buy(Bicycle bicycle) {
		// 名前をセット
		bicycle.setOwner(this.name);
		// 出力内容
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

}
