package curriculum_B;

// 標準の入力したデータを読み取るクラスを呼び出す
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// スキャナーオブジェクトを宣言し代入
		Scanner scanner = new Scanner(System.in);

		// 検索する用に変数を宣言
		String search = scanner.nextLine();

		// 入力した後、『、』を入れるとそこで区切って配列の中に入る処理
		String[] searchItems = search.split("、");

		// 配列の中にある要素をitem変数に代入
		for (String item : searchItems) {
			// 残りの数をランダムで出力する変数に代入
			int randomNum = (int) Math.floor(Math.random() * 12);
			// switch文でitemに何が入力されてるかによって分けて出力する処理
			switch (item) {
			// パソコンを入力した時の処理
			case "パソコン":
				// 出力される文章
				System.out.println("パソコンの残り台数は" + randomNum + "台です\n");
				// スイッチ文から処理の終了
				break;
			// 冷蔵庫と入力した時の処理
			case "冷蔵庫":
				// 出力される文章		
				System.out.println("冷蔵庫の残り台数は" + randomNum + "台です\n");
				// スイッチ文から処理の終了
				break;
			// 扇風機と入力した時の処理
			case "扇風機":
				// 出力される文章		
				System.out.println("扇風機の残り台数は" + randomNum + "台です\n");
				// スイッチ文から処理の終了		
				break;
			// 洗濯機と入力した時の処理
			case "洗濯機":
				// 出力される文章	
				System.out.println("洗濯機の残り台数は" + randomNum + "台です\n");
				// スイッチ文から処理の終了	
				break;
			// 加湿器と入力した時の処理
			case "加湿器":
				// 出力される文章
				System.out.println("加湿器の残り台数は" + randomNum + "台です\n");
				// スイッチ文から処理の終了	
				break;
			// テレビと入力した時の処理
			case "テレビ":
				// 出力される文章	
				System.out.println("テレビの残り台数は" + randomNum + "台です\n");
				// スイッチ文から処理の終了		
				break;
			// ディスプレイと入力した時の処理
			case "ディスプレイ":
				// 出力される文章
				System.out.println("ディスプレイの残り台数は" + randomNum + "台です\n");
				// スイッチ文から処理の終了
				break;
			// それ以外の入力の処理
			default:
				// 出力される文章
				System.out.println("『 " + item + " 』は指定の商品ではありません");
				// スイッチ文から処理の終了
				break;
			}
		}
	}

}
