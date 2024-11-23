package kadai_018;

//【クラス】
public class KatoIchiro_Chapter18 extends Kato_Chapter18{ //子クラス
	
	// 【メソッド】
	public void setGivenName() { //名を表すフィールドの値をセットする
		this.givenName = "一郎";		
	}
	
	// 【メソッド】
	public void eachIntroduce() {  //抽象メソッドに具体的な処理を記述
		//System.out.println("名前は" + familyName + this.givenName + "です");
		commonIntroduce(this.givenName);
		System.out.println("好きな食べ物はリンゴです\n");
	
	}
}
