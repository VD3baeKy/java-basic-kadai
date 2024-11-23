package kadai_018;

//【クラス】
public class KatoExec_Chapter18 {
	
	public static void main(String[] args) {
		
		//各子クラスのインスタンスを生成する
		KatoTaro_Chapter18 katotaro_chapter18 = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 katoichiro_chapter18 = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 katohanako_chapter18 = new KatoHanako_Chapter18();
		
		//setGiveNameメソッドを実行する
		katotaro_chapter18.setGivenName();
		katoichiro_chapter18.setGivenName();
		katohanako_chapter18.setGivenName();
		
		//execIntroduceメソッドを実行する
		katotaro_chapter18.execIntroduce();
		katoichiro_chapter18.execIntroduce();
		katohanako_chapter18.execIntroduce();
	}

}