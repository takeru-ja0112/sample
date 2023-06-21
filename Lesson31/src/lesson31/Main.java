package lesson31;

public class Main {

	public static void main(String[] args) {
		/*		問題1：インスタンスフィールドを定義してください
		
				フィールド名	データ型
				name	string
				age	int
				height	double
				問題2：コンストラクタを定義してください（下記それぞれの引数）
		
				name,age,height
		
				問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
		
				インスタンスメソッド
				問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
		
				問題5：Main.javaの引数にweightの60を入れてください
		
				問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
		
				問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
		
				問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
		
				問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		
				問題10：人数の合計を「合計○人です」と出力してください。*/
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
