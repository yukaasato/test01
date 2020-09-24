/*
 * 演習07
 * 演習04のプログラムをつかって、２つの文字列の入力を受けつけ、
 *受け付けた文字列同士が等しいか判定してください。
 * */
package test01;

import java.util.Scanner;

public class Kadai07 {

	public static void main(String[] args) {

		//変数input_Text1を定義
		String input_Text1 ;

		//変数input_Text2定義
		String input_Text2 ;

		//スキャナーの初期化・インスタンスを作成し、標準入力を引数とする	
		Scanner scanner = new Scanner(System.in);



		//指示文を出力
		System.out.println("1つ目の文字列を入力してください。");

		//文字列をinput_Text1へ
		input_Text1 = scanner.next();

		//指示文を出力
		System.out.println("2つ目の文字列を入力してください。");

		//文字列をinput_Text2へ
		input_Text2 = scanner.next();


		//equalsメソッドで文字列を比較
		if(input_Text1.equals(input_Text2)) {

			//等しいと出力
			System.out.println("入力された文字列は等しいです。");

			//等しくなければ
		}else {

			//異なると出力
			System.out.println("入力された文字列は異なっています。");

		}

		//Scannerクラスのインスタンスをクローズ
		scanner.close();

	}

}
