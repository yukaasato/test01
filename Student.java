package test01;

public class Student extends Human{
	
	
	//���k��field
	
	private int BirthMonth;
	private int BirthDate;
	private String SchoolName;
	
	//student�N���X�̃R���X�g���N�^	
	Student(String name, int height, int weight, int age, int BirthMonth, int BirthDate, String SchoolName){	
		//super�R���X�g���N�^�ɓn��
		super(name, height, weight,age);
		
		//student�N���X��field�ɒl���Z�b�g����
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
	
	
	//���ȏЉ�̃��\�b�h
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("�a������" + BirthMonth + "��" + BirthDate + "���ł�");
		System.out.println("�w�Z����" + SchoolName + "�ł�");
	}
	
}
