package test01;


public class HumanMain {

	public static void main(String[] args) {
	//コンストラクタ　クラスを初期化している
//	Human human1 = new Human();
//	human1.setName("tanaka");
//	human1.setAge(20);
//	human1.setHeight(175);
//	human1.setWeight(63);
//	
//	System.out.println(human1.getName());
//	System.out.println(human1.getAge());
//	System.out.println(human1.getHeight());
//	System.out.println(human1.getWeight());
//	
//	
//	//コンストラクタ　クラスを初期化している
//	Human human2 = new Human();
//	//satoを名nameに格納
//	human2.setName("sato");
//	human2.setAge(10);
//	human2.setHeight(140);
//	human2.setWeight(30);
//	
//	System.out.println(human2.getName());
//	System.out.println(human2.getName());
//	System.out.println(human2.getAge());
//	System.out.println(human2.getHeight());
//	System.out.println(human2.getWeight());
	
		
	Student student = new Student("マエカワさん",130,30,10,1,5,"狛江");
	student.introduce();
	
	}

}
