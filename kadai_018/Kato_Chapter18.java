package kadai_018;

//【クラス】
abstract public class Kato_Chapter18 { //親クラス
	
	//フィールド
	public String familyName;	//姓を表す
	public String givenName;	//名を表す
	public String address;		//住所を表す

	// 【メソッド】
	public void commonIntroduce() { //共通の紹介を出力する
		
	}
	
	// 【抽象メソッド】
	abstract public void eachIntroduce();//個別の紹介を出力する
	
	// 【メソッド】
	public void execIntroduce() { //紹介を実行する
		this.eachIntroduce();	
	}
}