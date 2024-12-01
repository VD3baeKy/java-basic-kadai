package kadai_021;
import java.util.Arrays;//Arraysを使用する
import java.util.Collections;//コレクションを使用する
import java.util.List;//Listを使用する

public class DictionaryExec_Chapter21 { //辞書クラス
	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary_chapter21 = new Dictionary_Chapter21();
		//dictionary_chapter21.putToMap();
		//dictionary_chapter21.jishoChecker();
		final List<String> chechWorrds = Collections.unmodifiableList(Arrays.asList("apple", "banana", "grape", "orange"));
		for(String checkerWord : chechWorrds) {
			dictionary_chapter21.jishoChecker(checkerWord);
			/*
			try {
				String y = dictionary_chapter21.getJisho().get(checkerWord);
				//throw new Exception();
				//int a = 1/0;
				if(y!=null) {
					System.out.println("「" + checkerWord + "」の意味は、\"" + y + "\"です。");
				}else {
					System.out.println("「" +checkerWord + "」の意味は、辞書に記載されていません。");
				}
			}catch(Exception e){
				System.out.println("エラーが発生しました: "+ e.getMessage());
			}
			*/
		}
	}
	
}