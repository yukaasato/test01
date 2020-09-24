/*
 * 演習06
 * 演習05のプログラムを以下のように変更する。
 * 1~12以外が入力された場合には、入力が間違っています、再度入力してください。と表示し、再入力を受け付ける。
 */
package test01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai06 {

	public static void main(String args[]) {
		
		//入力値を格納する変数monthの宣言
		int month = 0 ;
		
		//ループをコントロールするinputの宣言　
		boolean  input = true ;

		//スキャナーの初期化
		Scanner scanner = new Scanner(System.in);
		
		//コンソールに出力
		System.out.println("月を1～12で入力してください。");

		//input がtrueな限りループする
		while(input) {
			
				//正数入力かチェック
				try {
		
					//入力値を変数monthに格納
					month = scanner.nextInt();
					
					//正数以外の場合
				} catch (InputMismatchException e) {
					
					//バッファをクリア
					scanner.next();
		
				}	

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
				
				//falseを代入し以降ループ出来ないようにする
				input = false ;
				
				//switch文から抜け出す
				break;			

				//monthが「2」だった場合
			case 2:
				
				//「(monthの値）月は31日です。」と出力。
				System.out.println(month + "月は、" + "28日です。");
				
				//falseを代入し以降ループ出来ないようにする
				input = false ;
				
				//switch文から抜け出す
				break;
				
				//monthが「4,6,9,11」のいずれかだった場合	
			case 4:
			case 6:
			case 9:
			case 11:
				
				//「(monthの値）月は31日です。」と出力。
				System.out.println(month + "月は、" + "30日です。");
				
				//falseを代入し以降ループ出来ないようにする
				input = false;
				
				//switch文から抜け出す
				break ;
				
				//上記以外の値だったら
			default:
				
				//再入力を促す
				System.out.println("入力が間違っています、再度入力してください。");
				
				//switch文から抜け出しループへ
				break;
			} 
		}
		
		//ループが終わった段階でスキャナーを閉じる
		scanner.close();
	}
}