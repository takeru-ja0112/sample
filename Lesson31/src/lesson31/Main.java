package lesson31;

public class Main {
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
	
	public static void main(String[] args) {
		// インスタンスオブジェクトを作成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("斉藤匠", 25, 1.8, 65);

		// 車と自転車のインスタンスオブジェクトを作成
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// 名前をセット
		car.setOwner(person1.name);
		// 名前をセット
		bicycle.setOwner(person2.name);
		// 出力内容
		System.out.println(car.getOwner());
		// 出力内容
		System.out.println(bicycle.getOwner());

		// 購入メソッド
		person1.buy(car);
		// 購入メソッド
		person2.buy(bicycle);
		// 出力内容
		//		System.out.println(person1.name);
		//		System.out.println(person1.age);
		//		System.out.println(person1.height);

		// 出力用インスタンスメソッド
		//		person1.print();

		// 合計人数の値を変数に代入
		//		int totalCount = person1.getTotalCount();
		//		// 出力内容
		//		System.out.println("合計" + totalCount + "人です");
	}

}
