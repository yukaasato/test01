package test01;

public class Student extends Human{
	
	
	//生徒のfield
	
	private int BirthMonth;
	private int BirthDate;
	private String SchoolName;
	
	//studentクラスのコンストラクタ	
	Student(String name, int height, int weight, int age, int BirthMonth, int BirthDate, String SchoolName){	
		//superコンストラクタに渡す
		super(name, height, weight,age);
		
		//studentクラスのfieldに値をセットする
		this.BirthMonth = BirthMonth;
		this.BirthDate = BirthDate;
		this.SchoolName = SchoolName;
	}
	
	 
	/*getter setter Str*/
	public int getBirthMonth() {
		return BirthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		BirthMonth = birthMonth;
	}
	public int getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(int birthDate) {
		BirthDate = birthDate;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	
	
	
	/*getter setter End*/
	
	
	//自己紹介のメソッド
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("誕生日は" + BirthMonth + "月" + BirthDate + "日です");
		System.out.println("学校名は" + SchoolName + "です");
	}
	
}
