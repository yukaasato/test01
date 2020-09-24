/*
 * 課題5
 * 演習04のプログラムをつかって、月を表す文字列を入力して、その月の日数を表示する
 * プログラムを作成。
 * 2月は一律28日とする。
 * また1～12以外が入力された場合には"入力が間違っています"と表示する。
 * 入力が間違っていた場合正しい入力がなされるまで再入力を催促する。
 * */
package test01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai05 {

	public static void checkError() {

	}
	public static void main(String args[]) {
		//monthの宣言
		int month = 0 ; 
		//スキャナーの初期化
		Scanner scanner = new Scanner(System.in);
		//コンソールに出力
		System.out.println("月を1～12で入力してください。");
		
		//整数以外が入力された場合の処理
	
			//正数入力かチェック
			try {
				//入力値を変数monthに格納
				month = scanner.nextInt();
				//正数以外の場合
			} catch (InputMismatchException e) {
				System.out.println(e);
				System.out.println("型が違います。");
				System.exit(0);
			}		
		//monthには整数が入っている状態
		// monthが1～12でなければ再入力を促す
		if (month < 1 || month >12) {
			//コンソールに出力
			System.out.println("入力が間違っています。");
		}
		//スキャナーを閉じる
		scanner.close();
		//switch文
		switch(month) {
		//monthが「1,3,5,7,8,10,12」のいずれかだった場合
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			//「(monthの値）月は31日です。」と出力。
			System.out.println(month + "月は、" + "31日です。");
			//switch文から抜け出す
			break;			
			//monthが「2」だった場合
		case 2:
			//「(monthの値）月は31日です。」と出力。
			System.out.println(month + "月は、" + "28日です。");
			//switch文から抜け出す
			break;
			//monthが「4,6,9,11」のいずれかだった場合	
		case 4:
		case 6:
		case 9:
		case 11:
			//「(monthの値）月は31日です。」と出力。
			System.out.println(month + "月は、" + "30日です。");
			//switch文から抜け出す
			break;
		}
	}
}