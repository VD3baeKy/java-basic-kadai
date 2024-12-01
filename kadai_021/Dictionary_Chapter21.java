package kadai_021;
import java.util.HashMap; //コレクションのHashMapクラスを使用する。

//【クラス】
public class Dictionary_Chapter21 { //辞書クラス
	
	//フィールド
	private HashMap<String,String> jisho; //辞書として機能するHashMapを宣言
	
	//コンストラクタ（初期化処理）
	public Dictionary_Chapter21() {
		this.jisho = new HashMap<String,String>(); //インスタンス化
		
	//}
	
	// 【メソッド】
	//public void  putToMap(){
		this.jisho.put("apple","りんご");
		this.jisho.put("peach","桃");
		this.jisho.put("banana","バナナ");
		this.jisho.put("lemon","レモン");
		this.jisho.put("pear","梨");
		this.jisho.put("kiwi","キウィ");
		this.jisho.put("strawberry","いちご");
		this.jisho.put("grape","ぶどう");
		this.jisho.put("muscat","マスカット");
		this.jisho.put("cherry","さくらんぼ");
	}

	/*
	public HashMap<String, String> getJisho() {
		return jisho;
	}

	public void setJisho(HashMap<String, String> jisho) {
		this.jisho = jisho;
	}
	*/

	public void jishoChecker(String check) {
		//this.putToMap();
		//for( var x : jisho.entrySet() ) {
		//	System.out.println(x.getKey() + ":" + x.getValue());
		//}
		try {
			String y = this.jisho.get(check);			
			if(y!=null) {
				System.out.println("「" + check + "」の意味は、\"" + y + "\"です。");
				//System.out.println(y);
			}else{
				System.out.println(check + "の意味は辞書に追加されていません。");
			}
			//throw new Exception();
			//int a = 1/0;
		}catch(Exception e){
			System.out.println("「" + check + "」の調査中にエラーが発生しました: "+ e.getMessage());
		}
	}	
	
}
