package test01;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*�ۑ�1*/
		//1����30�܂ŏ��Ԃɐ����R���\�[���ɕ\�����Ă��������B
		//�������A���̐���3�Ŋ���؂��Ȃ�"Fizz"�A5�Ŋ���؂��Ȃ�"Buzz"�A
		//�����Ŋ���؂��Ȃ�"Fizzbuzz"�ƕ\�����Ă��������B
		
		//for�錾����A()���ł�i�i�����j�̏�������1�����A
		//�J��Ԃ�������1�`30�܂�
		//i��1����������
		for(int i =1 ; i <= 30; i++ ) {
			
			//i��3�Ŋ���؂��@���@5�Ŋ���؂ꂽ��true
			if(i % 3 == 0 && i% 5 ==0) {
				//��̏�����true�ł����"Fizzbuzz"�ƃR���\�[���ɏo��
				System.out.println("Fizzbuzz");
			//i��3�Ŋ���؂�āA5�Ŋ���؂�Ȃ�������true	
			}else if (i % 3 ==0 && i % 5 != 0) {
				//��̏�����true�ł����"Fizz"�ƃR���\�[���ɏo��
				System.out.println("Fizz");
			//i��3�Ŋ���؂�Ȃ��āA5�Ŋ���؂ꂽ��true	
			}else if(i % 3 !=0 && i % 5 == 0) {
				//��̏�����true�ł����"Buzz"�ƃR���\�[���ɏo��
				System.out.println("Buzz");
			}else {
				//��L�̏����ǂ�ɂ����Ă͂܂�Ȃ��ꐔ�����o��
			System.out.println(i);
			}
		}
		
		
		/*�ۑ�2*/
		//�����^�̔z��unumbers�v��錾���āA{10,4,340,180,79}�������Ă��������B
		//�܂��A�z��̒�����ő�l���R���\�[���ɕ\������v���O�������쐬���Ă��������B
		
		//�z���錾���Ē��ɐ���������
		int numbers[] = {0,4,340,180,79};
		//�ő�l������ϐ���錾����0�ŏ�����
		int Maxnumber = 0;
		
		//�g��for��
		for(int number : numbers) {
			//�z��̒��g��Maxnumber�̒��g���r�i�����l��0�j
			if (Maxnumber < number) {
				//Maxnumber�ɑ��
				Maxnumber = number;
			}
		}
		//Maxnumber���o��
		System.out.println(Maxnumber);
	}

}
