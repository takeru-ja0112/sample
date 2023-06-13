package process;

// ランダムクラス
import java.util.Random;

// スーパークラスを継承
public class SubClass extends SuperClass {
	// コンストラクトを定義
	public SubClass(String name) {
		// スーパーメソッドを使用
		super(name, random(), random(), random(), random(), random());
	}

	// ランダムメソッドを作成
	private static int random() {
		// ランダムクラスのインスタンスを作成
		Random random = new Random();
		// 1から1000をランダムに返す
		return random.nextInt(1000) + 1;
	}
}
