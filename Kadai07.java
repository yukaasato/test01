/*
 * ���K07
 * ���K04�̃v���O�����������āA�Q�̕�����̓��͂��󂯂��A
 *�󂯕t���������񓯎m�������������肵�Ă��������B
 * */
package test01;

import java.util.Scanner;

public class Kadai07 {

	public static void main(String[] args) {

		//�ϐ�input_Text1���`
		String input_Text1 ;

		//�ϐ�input_Text2��`
		String input_Text2 ;

		//�X�L���i�[�̏������E�C���X�^���X���쐬���A�W�����͂������Ƃ���	
		Scanner scanner = new Scanner(System.in);



		//�w�������o��
		System.out.println("1�ڂ̕��������͂��Ă��������B");

		//�������input_Text1��
		input_Text1 = scanner.next();

		//�w�������o��
		System.out.println("2�ڂ̕��������͂��Ă��������B");

		//�������input_Text2��
		input_Text2 = scanner.next();


		//equals���\�b�h�ŕ�������r
		if(input_Text1.equals(input_Text2)) {

			//�������Əo��
			System.out.println("���͂��ꂽ������͓������ł��B");

			//�������Ȃ����
		}else {

			//�قȂ�Əo��
			System.out.println("���͂��ꂽ������͈قȂ��Ă��܂��B");

		}

		//Scanner�N���X�̃C���X�^���X���N���[�Y
		scanner.close();

	}

}
