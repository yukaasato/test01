package test01;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*課題1*/
		//1から30まで順番に数をコンソールに表示してください。
		//ただし、その数が3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"、
		//両方で割り切れるなら"Fizzbuzz"と表示してください。
		
		//for宣言する、()内ではi（整数）の初期化と1を代入、
		//繰り返し条件は1～30まで
		//iは1ずつ増加する
		for(int i =1 ; i <= 30; i++ ) {
			
			//iが3で割り切れる　かつ　5で割り切れたらtrue
			if(i % 3 == 0 && i% 5 ==0) {
				//上の条件がtrueであれば"Fizzbuzz"とコンソールに出力
				System.out.println("Fizzbuzz");
			//iが3で割り切れて、5で割り切れなかったらtrue	
			}else if (i % 3 ==0 && i % 5 != 0) {
				//上の条件がtrueであれば"Fizz"とコンソールに出力
				System.out.println("Fizz");
			//iが3で割り切れなくて、5で割り切れたらtrue	
			}else if(i % 3 !=0 && i % 5 == 0) {
				//上の条件がtrueであれば"Buzz"とコンソールに出力
				System.out.println("Buzz");
			}else {
				//上記の条件どれにも当てはまらなけれ数字を出力
			System.out.println(i);
			}
		}
		
		
		/*課題2*/
		//整数型の配列「numbers」を宣言して、{10,4,340,180,79}を代入してください。
		//また、配列の中から最大値をコンソールに表示するプログラムを作成してください。
		
		//配列を宣言して中に数字を入れる
		int numbers[] = {0,4,340,180,79};
		//最大値を入れる変数を宣言して0で初期化
		int Maxnumber = 0;
		
		//拡張for文
		for(int number : numbers) {
			//配列の中身とMaxnumberの中身を比較（初期値は0）
			if (Maxnumber < number) {
				//Maxnumberに代入
				Maxnumber = number;
			}
		}
		//Maxnumberを出力
		System.out.println(Maxnumber);
	}

}
