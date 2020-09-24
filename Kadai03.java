package test01;

public class Kadai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*課題3
		 *  コンソールに九九の表を表示。
		 *  表示は見栄え良く桁を揃えてください。
		 */
/*aaa*/
		//繰り返し条件指定 : 1～9
		for( int i=1; i<10; i++ ) {
			//	    	繰り返し条件:1～9
			for( int j=1; j<10; j++ ){

				//結果を格納する
				int result = i*j ; 

				//【表示】を整える処理　
					
				    //d(デシマル）は10進数の意味
				    
				    //①String.format()で桁数を2つにする
					//System.out.print(String.format("%2d",result)+" ");
				
				    //②System.out.printf()は文字列の中に%~という書式文字列を埋め込んで使う。
					//resultの値を3桁の数値で表す
					System.out.printf("%3d",result);
					
			//段が切り替わるタイミングで改行
			}System.out.println("");
		}
	}

}
