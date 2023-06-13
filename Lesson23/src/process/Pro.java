package process;

public class Pro {
	/*
		
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	
	*/
	// フィールドに動物の名前の変数を定義
	private String name;
	// フィールドに体長の変数を定義
	private double height;
	// フィールドに速度の変数を定義
	private int speed;

	// セッターメソッドを使用
	public void setName(String name) {
		// 値を代入
		this.name = name;
	}

	// セッターメソッドを使用
	public void setHeight(double height) {
		// 値を代入
		this.height = 2.1;
	}

	// セッターメソッドを使用
	public void setSpeed(int speed) {
		// 値を代入
		this.speed = 80;
	}

	// ゲッターメソッドを使用
	public String getName() {
		// 値を代入
		return this.name;
	}

	// ゲッターメソッドを使用
	public double getHeight() {
		// 値を代入
		return this.height;
	}

	// ゲッターメソッドを使用
	public int getSpeed() {
		// 値を代入
		return this.speed;
	}
}
