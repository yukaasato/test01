package test01;

public class Human {

	//�����o�@�ϐ�
	private String name; //���O
	private int height;  //�g��
	private int weight;  //�̏d
    private int age;	 //�N��
    
	//�R���X�g���N�^
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

	//���\�b�h
	public void introduce() {
		System.out.println("���̖��O��" + name + "�ł�");
		System.out.println("�g����" + height + "�ł�");
		System.out.println("�̏d��"+ weight + "kg�ł�");
		System.out.println("�N���"+ age + "�΂ł�");

	}

}
