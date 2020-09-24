/*課題4
		 * キーボードから読み込んだ文字列を出力するプログラムを作成してください。
		       入力にはいくつかやり方がありますが、Scannerを利用してください
		      上記に加えて入力時には
		      文字列を入力してください。（Enterで終了）
*/
package test01;
import java.util.Scanner;
public class Kadai04 {
	public static void main(String[] args) {
		//スキャナーを作成し初期化
		Scanner scanner = new Scanner(System.in);
		//文字列を～とコンソールに出力
		System.out.println("文字列を入力してください。");
		// 文字列を受け取るのでscanner.next()
		//受けとった文字列を変数wordsに格納
		String words = scanner.next();
		//コンソールへ変数の中身を出力
		System.out.println(words+"と入力されました。");
		//Scannerクラスのインスタンスをクローズ
		scanner.close();

	}

}
