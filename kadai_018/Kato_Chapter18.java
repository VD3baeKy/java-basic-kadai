package kadai_018;

//【クラス】
abstract public class Kato_Chapter18 { //親クラス
	
	//フィールド
	public String familyName = "加藤";	//姓を表す
	public String givenName;	//名を表す
	public String address = "東京都中野区〇×";	//住所を表す

	// 【メソッド】
	public void commonIntroduce(String name) { //共通の紹介を出力する
		this.givenName = name; 
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	// 【抽象メソッド】
	abstract public void eachIntroduce();//個別の紹介を出力する
	
	// 【メソッド】
	public void execIntroduce() { //紹介を実行する
		this.eachIntroduce();
	}
}
