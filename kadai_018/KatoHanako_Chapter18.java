package kadai_018;

//【クラス】
public class KatoHanako_Chapter18 extends Kato_Chapter18{ //子クラス
		
	// 【メソッド】
	public void setGivenName() { //名を表すフィールドの値をセットする
		this.givenName = "花子";
	}
	
	// 【メソッド】
	public void eachIntroduce() {  //抽象メソッドに具体的な処理を記述
		System.out.println("趣味は読書です");	
	}
}