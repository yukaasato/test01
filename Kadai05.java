/*
 * �ۑ�5
 * ���K04�̃v���O�����������āA����\�����������͂��āA���̌��̓�����\������
 * �v���O�������쐬�B
 * 2���͈ꗥ28���Ƃ���B
 * �܂�1�`12�ȊO�����͂��ꂽ�ꍇ�ɂ�"���͂��Ԉ���Ă��܂�"�ƕ\������B
 * ���͂��Ԉ���Ă����ꍇ���������͂��Ȃ����܂ōē��͂��Ñ�����B
 * */
package test01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai05 {

	public static void checkError() {

	}
	public static void main(String args[]) {
		//month�̐錾
		int month = 0 ; 
		//�X�L���i�[�̏�����
		Scanner scanner = new Scanner(System.in);
		//�R���\�[���ɏo��
		System.out.println("����1�`12�œ��͂��Ă��������B");
		
		//�����ȊO�����͂��ꂽ�ꍇ�̏���
	
			//�������͂��`�F�b�N
			try {
				//���͒l��ϐ�month�Ɋi�[
				month = scanner.nextInt();
				//�����ȊO�̏ꍇ
			} catch (InputMismatchException e) {
				System.out.println(e);
				System.out.println("�^���Ⴂ�܂��B");
				System.exit(0);
			}		
		//month�ɂ͐����������Ă�����
		// month��1�`12�łȂ���΍ē��͂𑣂�
		if (month < 1 || month >12) {
			//�R���\�[���ɏo��
			System.out.println("���͂��Ԉ���Ă��܂��B");
		}
		//�X�L���i�[�����
		scanner.close();
		//switch��
		switch(month) {
		//month���u1,3,5,7,8,10,12�v�̂����ꂩ�������ꍇ
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			//�u(month�̒l�j����31���ł��B�v�Əo�́B
			System.out.println(month + "���́A" + "31���ł��B");
			//switch�����甲���o��
			break;			
			//month���u2�v�������ꍇ
		case 2:
			//�u(month�̒l�j����31���ł��B�v�Əo�́B
			System.out.println(month + "���́A" + "28���ł��B");
			//switch�����甲���o��
			break;
			//month���u4,6,9,11�v�̂����ꂩ�������ꍇ	
		case 4:
		case 6:
		case 9:
		case 11:
			//�u(month�̒l�j����31���ł��B�v�Əo�́B
			System.out.println(month + "���́A" + "30���ł��B");
			//switch�����甲���o��
			break;
		}
	}
}