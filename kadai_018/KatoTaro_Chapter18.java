package kadai_018;

//【クラス】
public class KatoTaro_Chapter18 extends Kato_Chapter18{ //子クラス
	
	// 【メソッド】
	public void setGivenName() { //名を表すフィールドの値をセットする
		this.givenName = "太郎";
	}
	
	// 【メソッド】
	public void eachIntroduce() {  //抽象メソッドに具体的な処理を記述
		System.out.println("名前は" + familyName + this.givenName + "です");
		commonIntroduce();
		System.out.println("私はJavaが得意です\n");
	}
}
