package execution;

// 入力するクラス
import java.util.Scanner;

// サブクラス
import process.SubClass;

public class Exe25 {

	public static void main(String[] args) {
		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください
		
			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24
		
			さあ冒険に出かけよう！
		 
		 */
		// スキャナークラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
		// 出力内容
		System.out.println("名前を入力してください");
		// 入力スペース
		String name = scanner.nextLine();
		scanner.close();

		// サブクラスのインスタンスを作成
		SubClass sub = new SubClass(name);

		// 以下出力内容
		System.out.println("こんにちは「 " + sub.getName() + " 」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + sub.getHp());
		System.out.println("MP：" + sub.getMp());
		System.out.println("攻撃力：" + sub.getPower());
		System.out.println("素早さ：" + sub.getSpeed());
		System.out.println("防御力：" + sub.getGuard());
		System.out.println("\nさあ冒険に出かけよう！");

	}

}
