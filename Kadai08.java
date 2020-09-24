/*[演習08] 
 * キーボードから5人分の点数の入力を受け付け、
 * 5人の合計点数、平均点数、最高点数を表示してください。
 * さらに、小さい順に並べて表示してください。
 */

package test01;
import java.util.*;
public class Kadai08 {

	public static void main(String[] args) {



		//配列を作成
		int scores[] = new int [5];

		//変数scoreの宣言と初期化
		int score = 0;

		//変数sumの宣言と初期化
		int sum = 0;

		//変数avgの宣言と初期化
		double avg = 0;
		
		//変数maxの宣言と初期化
		int max= 0;


		//スキャナーを作成し初期化
		Scanner sc = new Scanner(System.in);

		//配列の幅分の入力
		for(int i = 0 ; i<scores.length;i++) {
			
			//i回目の入力
			System.out.println(i + 1 + "人目の点数を入力してください。");
			
			//入力値をscoreへ
			score = sc.nextInt();
			
			//入力値をscoresのi番目へ
			scores[i] =score ;

			//sumへ加算
			sum += score;

			//maxと比較、大をmaxへ
			max = Math.max(max, scores[i]);
			
		}
		
		//Scannerクラスのインスタンスをクローズ
		sc.close();

		//平均を計算、avgへ
		//小数点以下が切り上げられないように(double)をつける
		avg = (double)sum / scores.length;

		//配列を並替（昇順）
		Arrays.sort(scores);

		//「合計点」「平均点」「最高点」「並替」結果の出力

		//合計点を出力
		System.out.print("合計点は" + sum + "点です。");

		//平均点を出力、小数点以下は2桁で統一
		System.out.print("平均点数は" + String.format("%.2f", avg) + "です。");

		//最高点を出力
		System.out.println("最高点数は" + max + "点です。");

		//小さい順に出力
		System.out.print("点数は小さい順に");

		//拡張for文
		//配列値を一つ取り出す
		for(int result : scores) {
		
			//書式設定（文字間を開け）と出力
			System.out.print(String.format("%d ",result));
		
		}

	}

}
