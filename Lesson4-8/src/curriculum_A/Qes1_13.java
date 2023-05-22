package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// 1
		// バイト型
		byte myByte;
		// 短整数型
		short myShort;
		// 整数型
		int myInt;
		// 長整数型
		long myLong;
		// 単精度浮動小数点数型
		float myFloat;
		// 倍精度浮動小数点数型
		double myDouble;
		// 文字型
		char myChar;
		// 文字列型
		String myString;
		// ブーリアン型
		boolean myBoolean;

		// 2
		// バイト型に初期値を代入
		myByte = 0;
		// 短整数型に初期値を代入
		myShort = 0;
		// 整数型に初期値を代入
		myInt = 0;
		// 長整数型に初期値を代入
		myLong = 0L;
		// 単精度浮動小数点数型に初期値を代入
		myFloat = 0.0f;
		// 倍精度浮動小数点数型に初期値を代入
		myDouble = 0.0;

		// 文字型に初期値を代入
		myChar = 'a';
		// 文字列型に初期値を代入
		myString = null;

		// ブーリアン型に初期値を代入
		myBoolean = false;

		// 3
		// バイト型に値を代入
		myByte = 10;
		// 短整数型に値を代入
		myShort = 100;
		// 整数型に値を代入
		myInt = 1000;
		// 長整数型に値を代入
		myLong = 10000L;
		// 単精度浮動小数点数型に値を代入
		myFloat = 9.5f;
		// 倍精度浮動小数点数型に値を代入
		myDouble = 10.5;

		// 文字型に値を代入
		myChar = 'a';
		// 文字列型に値を代入
		myString = "ハロー";

		// ブーリアン型に値を代入
		myBoolean = true;

		// 4
		// 11110の出力
		System.out.println(myByte + myShort + myInt + myLong);
		// 20を出力
		System.out.println(myByte + myByte);
		// aハローtrueを出力
		System.out.println(myChar + " " + myString + " " + myBoolean);
		// 11130を出力
		System.out.printf("%.0f\n", myByte + myShort + myInt + myLong + myFloat + myDouble);
		// 10000000000を出力する
		System.out.println(myByte * myShort * myInt * myLong);
		// 0.105を出力する
		System.out.println(myDouble / myShort);
		// -90を出力する
		System.out.println(myByte - myShort + "\n");

		// 5
		// String型とint型に代入している値が"20"と23でこれを修正する必要があります。
		// 今回は表示したい43を”4”と3にわけて出力します。
		// 20を4に変更
		String num = "4";
		// 23を3に変更
		int num1 = 3;
		// 出力
		System.out.println("ハローJAVA" + (num + num1) + "\n");

		// 6
		// String型変数 nameを宣言
		String name;
		// int型変数 ageを宣言
		int age;
		// double型変数 heightを宣言
		double height;
		// 体重変数を宣言
		double weight;
		// 食べ物変数を宣言
		String food;

		// 名前の値を代入
		name = "山田太郎";
		// 年齢を代入
		age = 18;
		// 身長を代入
		height = 170.5;
		// 体重を代入
		weight = 62.2;
		// 食べ物の値を代入
		food = "寿司";

		System.out.println("年齢は" + age + "歳です");
		// 身長を出力する
		System.out.println("身長は" + height + "cmです");
		// 体重を出力する
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物を出力する
		System.out.println("好きな食べ物は" + food + "です" + "\n");

		// 7
		// 身長の表記をmに変換する
		double heightInMeters = height / 100;
		// BMIを計算します
		double BMI = weight / (heightInMeters * heightInMeters);
		// BMIを出力します
		System.out.printf("BMIは%.1fです" + "\n", BMI);

		// 8
		// 名前変数を代入
		name = "鈴木一郎";
		// 年齢変数を代入
		age = 24;
		// 身長変数を代入
		height = 168.5;
		// 体重変数を代入
		weight = 64.2;
		// 食べ物変数を代入
		food = "オムライス";
		// BMI変数を
		heightInMeters = height / 100;
		BMI = weight / (heightInMeters * heightInMeters);

		// フォーマット
		// 名前を出力する
		System.out.println("\n初めまして" + name + "です");
		// 年齢を出力する
		System.out.println("年齢は" + age + "歳です");
		// 身長を出力する
		System.out.println("身長は" + height + "cmです");
		// 体重を出力する
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物を出力する
		System.out.println("好きな食べ物は" + food + "です");
		// BMIを出力する
		System.out.printf("BMIは%.1fです" + "\n", BMI);

		// 9
		// 年齢、身長、体重を自己代入する
		age = age + age;
		height = height + height;
		weight = weight + weight;

		// BMIを再計算
		heightInMeters = height / 100;
		BMI = weight / (heightInMeters * heightInMeters);

		// フォーマット
		// 名前を出力する
		System.out.println("\n初めまして" + name + "です");
		// 年齢を出力する
		System.out.println("年齢は" + age + "歳です");
		// 身長を出力する
		System.out.println("身長は" + height + "cmです");
		// 体重を出力する
		System.out.println("体重は" + weight + "kgです");
		// 好きな食べ物を出力する
		System.out.println("好きな食べ物は" + food + "です");
		// BMIを出力する
		System.out.printf("BMIは%.2fです\n", BMI);

		// 10
		// ifを使わずに三項演算子を使用します
		boolean overAge = age >= 25;
		System.out.println("\n" + overAge + "\n");

		// 11
		// 年齢、身長、体重を文字列に変換
		String strAge = String.valueOf(age);
		String strHeight = String.valueOf(height);
		String strWeight = String.valueOf(weight);

		// 文字列を繋げます
		System.out.println(strAge + strHeight + strWeight + "\n");

		// 12
		// 文字列型を整数型に変換します
		int intAge = Integer.parseInt(strAge);
		// 小数点を消すためにdouble型にいったん返還してから整数型に変換します
		double douHeight = Double.parseDouble(strHeight);
		int intHeight = (int) Math.floor(douHeight);

		// それぞれを出力する
		System.out.println(intAge);
		System.out.println(intHeight + "\n");

		// 13
		// if文を使わずに年齢が25もしくは身長が160以上であればtrueを出力する
		System.out.println(intAge == 25 || intHeight >= 160 ? myBoolean : false);
	}

}
