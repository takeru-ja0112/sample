package curriculum_B;

// ランダムクラスを呼び出す
import java.util.Random;
// 標準の入力したデータを読み取るクラスを呼び出す
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// スキャナーオブジェクトを宣言し代入
		Scanner scanner = new Scanner(System.in);
		// ランダムオブジェクトを宣言し代入
		Random rnd = new Random();

		// 検索する用に変数を宣言
		String search = scanner.nextLine();

		// 入力した後、『、』を入れるとそこで区切って配列の中に入る処理
		String[] searchItems = search.split("、");

		// 最大個数の変数を宣言し代入
		int maxNum = 11;
		int randomTV = rnd.nextInt(maxNum + 1);
		int dhis = maxNum - randomTV;
		// 配列の中にある要素を代入
		scanner.close();
		for (String item : searchItems) {
			// switch文で何が入力されてるかによって分けて出力する処理
			switch (item) {

			case "パソコン":

			case "冷蔵庫":

			case "扇風機":

			case "洗濯機":

			case "加湿器":

				// 0〜11の間で乱数を生成し代入
				int randomNum = rnd.nextInt(maxNum + 1);

				// 入力された家電の残り台数を出力
				System.out.println(item + "の残りの台数は" + randomNum + "台です\n");

				break;
			// テレビと入力した時の処理
			case "テレビ":

				// ディスプレイと入力した時の処理
			case "ディスプレイ":

				// 条件演算子で入力された値を代入
				int tv = (item.equals("テレビ")) ? randomTV : dhis;

				// テレビかディスプレイの残り台数を出力
				System.out.println(item + "の残りの台数は" + tv + "台です\n");

				break;
			// それ以外の入力の処理
			default:
				// 出力される文章
				System.out.println("『 " + item + " 』は指定の商品ではありません\n");
				// スイッチ文から処理の終了
				break;
			}
		}
	}
}
