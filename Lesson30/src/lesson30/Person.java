package lesson30;

public class Person {
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

	// Q1
	// 名前のインスタンスフィールドを定義
	public String name;
	// 年齢のインスタンスフィールドを定義
	public int age;
	// 身長のインスタンスフィールドを定義
	public double height;
	//Q4
	// 体重のインスタンスフィールドを定義
	private double weight;
	// Q10
	// 合計人数のインスタンスフィールドを定義
	private static int totalCount = 0;

	// Q2
	// コンストラクタを定義
	public Person(String name, int age, double height, double weight) {
		// 値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		totalCount++;
	}

	// Q6
	// BMIのインスタンスメソッドを定義
	public double bmi() {
		// 計算式
		double bmi = weight / (height * height);
		// Q7
		// BMIの値を返す
		return bmi;
	}

	// Q8
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

}
