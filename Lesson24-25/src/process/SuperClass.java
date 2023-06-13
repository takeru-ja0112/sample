package process;

public class SuperClass {
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
	// フィールドに名前の変数を定義
	private String name;
	// フィールドにHPの変数を定義
	private int hp;
	// フィールドにMPの変数を定義
	private int mp;
	// フィールドに攻撃力の変数を定義
	private int power;
	// フィールドに素早さの変数を定義
	private int speed;
	// フィールドに名前の変数を定義
	private int guard;

	// コンストラクトを定義
	public SuperClass(String name, int hp, int mp, int power, int speed, int guard) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.power = power;
		this.speed = speed;
		this.guard = guard;
	}

	// 名前
	// セッターメソッドを使用
	public void setName(String name) {
		// 値を代入
		this.name = name;
	}

	// ゲッターメソッドを使用
	public String getName() {
		// 値を返す
		return this.name;
	}

	// HP
	// セッターメソッドを使用
	public void setHp(int hp) {
		// 値を代入
		this.hp = hp;
	}

	// ゲッターを使用
	public int getHp() {
		// 値を返す
		return this.hp;
	}

	// MP
	// セッターを使用
	public void setMp(int mp) {
		// 値を代入
		this.mp = mp;
	}

	// ゲッターを使用
	public int getMp() {
		// 値を返す
		return this.mp;
	}

	// 攻撃力
	// セッターを使用
	public void setPower(int power) {
		// 値を代入
		this.power = power;
	}

	// ゲッターを使用
	public int getPower() {
		// 値を返す
		return this.power;
	}

	//素早さ 
	// セッターを使用
	public void setSpeed(int speed) {
		// 値を代入
		this.speed = speed;
	}

	// ゲッターを使用
	public int getSpeed() {
		// 値を返す
		return this.speed;
	}

	// 防御力
	// セッターを使用
	public void setGuard(int guard) {
		// 値を代入
		this.guard = guard;
	}

	// ゲッターを使用
	public int getGuard() {
		// 値を返す
		return this.guard;
	}
}
