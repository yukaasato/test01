/*
 * 文字列の操作p25
 * */

/*
 * 作成日:2020/7/2
 * 学習内容:Stringクラス
 * キーワード：equals(Object o)/equalsIgnoreCase(String s)/length()/isEmpty
 * 		  toLowerCase()/toUppercase()/trim()/replace(String before, String after)
 * 		  contains(String s)/startSWith(String s)/endsWith(String s)/indexOf(int ch)/indexOf(String str)
 * 		  lastIndexOf(int ch)/lastIndexOf(String str)/charAt(int index)/sustring(int index)・substring(int index,int endIndex)
 * 		  matches()
 * */

/*
 * 役立つケース
 * 1.内容が等しいか調べる
 * 2.大文字、小文字を区別せずに内容が等しいか調べる
 * 3.文字列長を調べる
 * 4.空文字かを調べる
 * 5.大文字を小文字に変換
 * 6.小文字を大文字に変換
 * 7.前後の空白を除去する（全角スペースは除去されない）
 * 8.文字列を置きえる
 * 9.一部に文字列aを含むか調べる
 * 10.文字列aで始まるか調べる
 * 11.文字列aで終わるか調べる
 * 12.文字ch(または文字列str)が最初に登場する位置を調べる
 * 13..文字ch(または文字列str)を後ろから検索して最初に登場する位置を調べる
 * 14.指定の1文字を切り出す
 * 15.指定①から始まる文字列を任意の長さだけ切り出す
 * 16.matches()メソッドの活用
 * */

package test01;

public class HowToMoveStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//使い方
		String s1 ="ギターが好きだ";
		String s2 ="guitar";
		String s3 ="Guitar";
		String s4 =" ";
		String s5 ="";
		String s6 ="     LOVePiaNo";
		String s7 ="　　　　　LOVePiaNo";
		String s8 ="ピチュー　ピカチュウ　ライチュウ";
		
		//文字列比較
		if(s2.equals(s3)) {
			System.out.println("まったく同じだよ");
		}else {
			System.out.println("小文字大文字違うけど、それ以外は同じだよ");
		}
		
		//キャメルケース含み文字列比較
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("小文字大文字違うけど、それ以外は同じだよ");
		}
		
		//文字の長さ
		System.out.println("s1の長さは"+s1.length()+"だよ");
		
		//空かスペース
		if(s4.isBlank()) {
			System.out.println("ブランクだよ");
		}
		
		//lengthが0
		if(s5.isEmpty()) {
				System.out.println("空だよ");
		}
		
		//加工
		System.out.println("◇◇◇◇◇◇◇◇◇◇◇");
		System.out.println("加工");
		
		//大文字化
		System.out.println(s2.toUpperCase());
		
		//小文字化
		System.out.println(s2.toLowerCase());
		
		//空白除去trim
		System.out.println(s6);
		System.out.println(s6.trim());
		System.out.println(s7);
		
		//置き換え
		//System.out.println(s6.replace());
		
		//含むか検索
		if(s8.contains("ピカチュウ")) {
			System.out.println("ピカチュウを含んでいます。");
		}
		
		//で始まるか検索
		if(s8.startsWith("ピチュー")) {
			System.out.println("最初はピチューで始まります。");
		}
		//で終わるか検索
		if(s8.endsWith("ライチュウ")) {
			System.out.println("ライチュウで終わります");
		}
		//何文字目で登場するか
		System.out.println("ピカチュウが登場する位置は"+s8.indexOf("ピカチュウ")+"です"+"、（元の文字列は"+s8+"。)");
		
		//後ろから何文字目で登場するか
		System.out.println("ライチュウが最後に登場する位置は、前から数えて"+s8.lastIndexOf("ライチュウ")+"です"+"、（元の文字列は"+s8+"。)");
		
		//指定位置の1文字より後ろを切りだす
		System.out.println(s8.substring(0));
		
		//〇文字目～〇文字目を切り取る 〇以上〇未満？
		System.out.println(s8.substring(0,4));
		
		//文字列の連結の注意
		//たいていはStringBuilderを使う。ごくまれに使えない時はStringBufferクラス
		/*
		 *文字列を連続して連結する場合に最も高い性能を
		 *発揮するのはStringBuilderクラスを用いた連結です。
		 *StringBuilderインスタンスは、内部に連続した文字列を蓄えるメモリ領域（バッファ）を持っています。
		 *このクラスを用いて連結を行うときは、
		 *①append()メソッドをよんでバッファにっ文字列を塚していく（必要に応じた回数を呼び出す）＞
		 *②最後に1回だけtoString()を呼び、完成した連結済みの文字列を取り出す。
		 *という手順が一般的です。
		 * */	
		
		/*
		 * +演算子が遅い理由
		 * Stringインスタンスの不変性
		 * +演算子で連結が行われた場合、古いインスタンスは捨てられ、
		 * 連結後の情報をもつ新しいインスタンスがnewにより生成、格納される。
		 * */
		
		/*
		 * StringBuilderやStringBufferクラスは可変クラス。
		 * 
		 * なお、数個程度の文字連結であれば、性能に大差はないので、タイピング量が少なく見やすい+演算子を使うよよいでしょう。
		 * */
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< 5; i++){
			sb.append("イーブイ"+i+"回目");
		}
		String s = sb.toString();
		System.out.println(s);
		
		String str = "こんにちはchar";
		char[] data1 = str.toCharArray();
		//byte[] data3 = str.getBytes("utf-8");
		byte[] data2 = str.getBytes();
		
		System.out.println(data1);
		System.out.println(data2);
	}
	
	//正規化表現の活用
	//必ず8文字、使える文字はA-Zと0～9だけ。　最初の文字に数字は使えない
	boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	
	/*
	 * matches()のメモ
	 * 
	 * 引数内の文字の意味
	 * 
	 * 普通の文字→その文字でなければならない
	 * ピリオド[.]→任意の1文字であればよい
	 * アスタリスク[*]→直前の文字の0回以上の繰り返し
	 * ".*"→すべての文字列を許す
	 * s.matches("Ma.*");→Maで始まって、以下何文字でなんでもok＝startsWith()と同じ
	 * s.matches(".*ful");→fullで終わる任意の文字=endsWithと同じ
	 * 波カッコ→指定回数の繰り返し
	 * {n}→直前の文字のn回の繰り返し
	 * {n,}→直前の文字のn回以上の繰り返し
	 * {n,m}→直前の文字のn回以上m回以下の繰り返し
	 * ?→直前の文字の0回または1回の繰り返し
	 * !→直前の文字の1回以上の繰り返し
	 * 角カッコ→いずれかの文字
	 * [abc]
	 * 角カッコ内のハイフン→指定範囲のいずれかの文字
	 * [a-z]
	 * "url".matches("[a-z]{3}") //true
	 * [0-9]等パターンで多用されるものは、￥で始まる文字クラスとして定義されている
	 * ￥d いずれかの数字[0-9]と同じ
	 * ￥w　英字・数字・アンダーバー[a-zA-Z_0-9]と同じ
	 * ￥s空白文字（スペース　タブ文字　改行文字など
	 * ￥を含めたい場合は￥￥等　￥[や￥*を調べて使う　特殊文字も
	 * ハット（^)とダラー($)→先頭と末尾　"^j.*p$"→先頭がjで始まってpで終わる任意の長さの文字、split()やreplaceAll()で明示的に先頭や末尾を示すために使う
	 * */
	
	
	
///////同じメソッド↑↓
	boolean isValidPlayerName2(String name) {
		///NG条件だった場合falseを返す
		
		
		if(name.length()!=8) {//8桁じゃなかったらNG
			return false;
		}
		char first = name.charAt(0);
		if(!(first >= 'A' && first <= 'Z')) {//最初の文字がA~Z満たさなかったらNG
			return false;
		}
		for(int i = 1; i<8; i++) {
			char c = name.charAt(i);//0~7番目の文字を取り出して
			if(!((c >='A' && c <='Z') || (c >= '0' && c <= '9')) ){//A~Z,0~9じゃなかったらNG
				return false;
			}
		}
		return true;
	}
}
