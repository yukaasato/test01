package test01;

public class Human {

	//メンバ　変数
	private String name; //名前
	private int height;  //身長
	private int weight;  //体重
    private int age;	 //年齢
    
	//コンストラクタ
	Human(String name, int height, int weight, int age){

		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//メソッド
	public void introduce() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("身長は" + height + "です");
		System.out.println("体重は"+ weight + "kgです");
		System.out.println("年齢は"+ age + "歳です");

	}

}
