package execution29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import process29.Pro29;

public class Exe29 {
	/*
	 	
	 	0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"
	 	
	 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2
	
	都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2
	
	都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2
		
	 */
	public static void main(String[] args) {

		// 都道府県のリストを作成
		List<Pro29> info = new ArrayList<>();
		info.add(new Pro29("北海道", "札幌市", 83424));
		info.add(new Pro29("青森県", "青森市", 9646));
		info.add(new Pro29("岩手県", "盛岡市", 15275));
		info.add(new Pro29("宮城県", "仙台市", 7282));
		info.add(new Pro29("秋田県", "秋田市", 11638));
		info.add(new Pro29("山形県", "山形市", 9323));
		info.add(new Pro29("福島県", "福島市", 13784));
		info.add(new Pro29("茨城県", "水戸市", 6097));
		info.add(new Pro29("栃木県", "宇都宮市", 6408));
		info.add(new Pro29("群馬県", "前橋市", 6362));
		info.add(new Pro29("埼玉県", "さいたま市", 3798));

		//　入力クラスをインスタンス化
		Scanner scanner = new Scanner(System.in);

		// 入力フォーム
		System.out.println("数字を入力してください");
		String input = scanner.nextLine();

		// 『,』で分割する
		String infos[] = input.split(",");

		// ソート用のリストを作成
		List<Pro29> sort = new ArrayList<>();
		// 各要素を反復処理
		for (String choice : infos) {
			// 文字列を整数型に変換し空白を削除
			int index = Integer.parseInt(choice.trim());
			// 条件を満たした数字を格納
			if (index >= 0 && index < info.size()) {
				sort.add(info.get(index));
			}
		}
		// 数字を比較し、昇順に並び替える処理
		Collections.sort(sort, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		
		// 配列の要素の反復処理
		for (Pro29 test : sort) {
			System.out.println("都道府県名：" + test.getName());
			System.out.println("県庁所在地：" + test.getCityName());
			System.out.println("面積：" + test.getArea() + "km2");
			System.out.println();
		}
	}

}
