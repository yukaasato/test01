/*
 * ���K06
 * ���K05�̃v���O�������ȉ��̂悤�ɕύX����B
 * 1~12�ȊO�����͂��ꂽ�ꍇ�ɂ́A���͂��Ԉ���Ă��܂��A�ēx���͂��Ă��������B�ƕ\�����A�ē��͂��󂯕t����B
 */
package test01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai06 {

	public static void main(String args[]) {
		
		//���͒l���i�[����ϐ�month�̐錾
		int month = 0 ;
		
		//���[�v���R���g���[������input�̐錾�@
		boolean  input = true ;

		//�X�L���i�[�̏�����
		Scanner scanner = new Scanner(System.in);
		
		//�R���\�[���ɏo��
		System.out.println("����1�`12�œ��͂��Ă��������B");

		//input ��true�Ȍ��胋�[�v����
		while(input) {
			
				//�������͂��`�F�b�N
				try {
		
					//���͒l��ϐ�month�Ɋi�[
					month = scanner.nextInt();
					
					//�����ȊO�̏ꍇ
				} catch (InputMismatchException e) {
					
					//�o�b�t�@���N���A
					scanner.next();
		
				}	

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
				
				//false�������ȍ~���[�v�o���Ȃ��悤�ɂ���
				input = false ;
				
				//switch�����甲���o��
				break;			

				//month���u2�v�������ꍇ
			case 2:
				
				//�u(month�̒l�j����31���ł��B�v�Əo�́B
				System.out.println(month + "���́A" + "28���ł��B");
				
				//false�������ȍ~���[�v�o���Ȃ��悤�ɂ���
				input = false ;
				
				//switch�����甲���o��
				break;
				
				//month���u4,6,9,11�v�̂����ꂩ�������ꍇ	
			case 4:
			case 6:
			case 9:
			case 11:
				
				//�u(month�̒l�j����31���ł��B�v�Əo�́B
				System.out.println(month + "���́A" + "30���ł��B");
				
				//false�������ȍ~���[�v�o���Ȃ��悤�ɂ���
				input = false;
				
				//switch�����甲���o��
				break ;
				
				//��L�ȊO�̒l��������
			default:
				
				//�ē��͂𑣂�
				System.out.println("���͂��Ԉ���Ă��܂��A�ēx���͂��Ă��������B");
				
				//switch�����甲���o�����[�v��
				break;
			} 
		}
		
		//���[�v���I������i�K�ŃX�L���i�[�����
		scanner.close();
	}
}