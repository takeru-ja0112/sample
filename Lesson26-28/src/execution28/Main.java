package execution28;

import java.util.Scanner;

/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/
// 抽象クラスを作成
abstract class AnimalBase {
	// フィールドに動物の名前の変数を定義
	protected String name;
	// フィールドに体長の変数を定義
	protected double height;
	// フィールドに速度の変数を定義
	protected int speed;

	// コンストラクタを定義
	public AnimalBase(String name, double height, int speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	};

	// 抽象メソッドを作成
	public abstract String sciName();

	// 出力用メソッドを定義
	public void information() {
		// 出力内容
		System.out.println("動物名：" + name);
		System.out.println("体長：" + height + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + sciName());
		System.out.println();
	}
}

// 動物のベース情報を継承したクラス
class Lion extends AnimalBase {
	// コンストラクタを定義
	public Lion(String name, double height, int speed) {
		// 親のコンストラクタを呼び出す
		super(name, height, speed);
	}

	// オーバーライド
	@Override
	public String sciName() {
		// 学名を返す
		return "パンテラ レオ";
	}
}

//動物のベース情報を継承したクラス
class Elephant extends AnimalBase {
	// コンストラクタを定義
	public Elephant(String name, double height, int speed) {
		// 親のコンストラクタを呼び出す
		super(name, height, speed);
	}

	// オーバーライド
	@Override
	public String sciName() {
		// 学名を返す
		return "ロキソドンタ・サイクロティス";
	}
}

//動物のベース情報を継承したクラス
class Panda extends AnimalBase {
	// コンストラクタを定義
	public Panda(String name, double height, int speed) {
		// 親のコンストラクタを呼び出す
		super(name, height, speed);
	}

	// オーバーライド
	@Override
	public String sciName() {
		// 学名を返す
		return "アイルロボダ・メラノレウカ";
	}
}

//動物のベース情報を継承したクラス
class Chimpanzee extends AnimalBase {
	// コンストラクタを定義
	public Chimpanzee(String name, double height, int speed) {
		// 親のコンストラクタを呼び出す
		super(name, height, speed);
	}

	// オーバーライド
	@Override
	public String sciName() {
		// 学名を返す
		return "パン・トゥログロディテス";
	}
}

//動物のベース情報を継承したクラス
class Zebra extends AnimalBase {
	// コンストラクタを定義
	public Zebra(String name, double height, int speed) {
		// 親のコンストラクタを定義
		super(name, height, speed);
	}

	// オーバーライド
	@Override
	public String sciName() {
		// 値を返す
		return "チャップマンシマウマ";
	}
}

//動物のベース情報を継承したクラス
class Parakeet extends AnimalBase {
	// コンストラクタを定義
	public Parakeet(String name, double height, int speed) {
		// 親のコンストラクタを呼び出す
		super(name, height, speed);
	}

	// オーバーライド
	@Override
	public String sciName() {
		// 学名を返す
		return "不明";
	}
}

// メイン処理
public class Main {
	public static void main(String[] args) {
		// 入力クラスをインスタンス化
		Scanner scanner = new Scanner(System.in);

		// 入力文
		System.out.println("コンソールに動物名、体長、速度を入力してください");
		// 入力フォーマット
		String input = scanner.nextLine();
		// 『,』で区切り、配列に格納する
		String animalData[] = input.split(",");

		// 配列のサイズを要素数にする
		AnimalBase animals[] = new AnimalBase[animalData.length];

		// 入力された要素数まで処理
		for (int i = 0; i < animalData.length; i++) {
			// 配列の要素を:で区切り格納
			String animalInfo[] = animalData[i].split(":");
			// 配列に格納する変数と順番
			String name = animalInfo[0];
			double length = Double.parseDouble(animalInfo[1]);
			int speed = Integer.parseInt(animalInfo[2]);

			// 条件で分けた処理
			switch (name) {
			// 名前がライオンの処理
			case "ライオン":
				// インスタンスを作成し、それぞれの値を配列に格納
				animals[i] = new Lion(name, length, speed);
				// 抜け出す
				break;
			// 名前がゾウの処理
			case "ゾウ":
				// インスタンスを作成し、それぞれの値を配列に格納
				animals[i] = new Elephant(name, length, speed);
				// 抜け出す
				break;
			// 名前がパンダの場合
			case "パンダ":
				// インスタンスを作成し、それぞれの値を配列に格納
				animals[i] = new Panda(name, length, speed);
				// 抜け出す
				break;
			// 名前がチンパンジーの場合
			case "チンパンジー":
				// インスタンスを作成し、それぞれの値を配列に格納
				animals[i] = new Chimpanzee(name, length, speed);
				// 抜け出す
				break;
			// 名前がシマウマの場合
			case "シマウマ":
				// インスタンスを作成し、それぞれの値を配列に格納
				animals[i] = new Zebra(name, length, speed);
				// 抜け出す
				break;
			// 名前がインコの場合
			case "インコ":
				// インスタンスを作成し、それぞれの値を配列に格納
				animals[i] = new Parakeet(name, length, speed);
				// 抜け出す
				break;
			// それ以外の場合
			default:
				// 出力内容
				System.out.println("不明な動物名: " + name);
				// 抜け出す
				break;
			}
		}

		// 格納された値を出力する
		for (AnimalBase animal : animals) {
			// 出力用メソッドを使用
			animal.information();
		}
	}
}
