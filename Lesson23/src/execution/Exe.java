package execution;

import process.Pro;

public class Exe {

	public static void main(String[] args) {
		/*
		
		下記がコンソールに出力されるように作成してください
		※thisとsetterとgetterとフィールドを使ってください
		
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		
		*/
		// クラスを呼び出して変数に代入
		Pro pro = new Pro();
		
		// 値をセット
		pro.setName("ライオン");
		pro.setHeight(2.1);
		pro.setSpeed(80);

		// 変数にゲットした値を代入
		String animal = pro.getName();
		double height = pro.getHeight();
		int speed = pro.getSpeed();

		// 出力内容
		System.out.println("動物名：" + animal);
		System.out.println("体長：" + height + "m");
		System.out.println("速度：" + speed + "km/h");
	}

}
