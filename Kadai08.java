/*[���K08] 
 * �L�[�{�[�h����5�l���̓_���̓��͂��󂯕t���A
 * 5�l�̍��v�_���A���ϓ_���A�ō��_����\�����Ă��������B
 * ����ɁA���������ɕ��ׂĕ\�����Ă��������B
 */

package test01;
import java.util.*;
public class Kadai08 {

	public static void main(String[] args) {



		//�z����쐬
		int scores[] = new int [5];

		//�ϐ�score�̐錾�Ə�����
		int score = 0;

		//�ϐ�sum�̐錾�Ə�����
		int sum = 0;

		//�ϐ�avg�̐錾�Ə�����
		double avg = 0;
		
		//�ϐ�max�̐錾�Ə�����
		int max= 0;


		//�X�L���i�[���쐬��������
		Scanner sc = new Scanner(System.in);

		//�z��̕����̓���
		for(int i = 0 ; i<scores.length;i++) {
			
			//i��ڂ̓���
			System.out.println(i + 1 + "�l�ڂ̓_������͂��Ă��������B");
			
			//���͒l��score��
			score = sc.nextInt();
			
			//���͒l��scores��i�Ԗڂ�
			scores[i] =score ;

			//sum�։��Z
			sum += score;

			//max�Ɣ�r�A���max��
			max = Math.max(max, scores[i]);
			
		}
		
		//Scanner�N���X�̃C���X�^���X���N���[�Y
		sc.close();

		//���ς��v�Z�Aavg��
		//�����_�ȉ����؂�グ���Ȃ��悤��(double)������
		avg = (double)sum / scores.length;

		//�z�����ցi�����j
		Arrays.sort(scores);

		//�u���v�_�v�u���ϓ_�v�u�ō��_�v�u���ցv���ʂ̏o��

		//���v�_���o��
		System.out.print("���v�_��" + sum + "�_�ł��B");

		//���ϓ_���o�́A�����_�ȉ���2���œ���
		System.out.print("���ϓ_����" + String.format("%.2f", avg) + "�ł��B");

		//�ō��_���o��
		System.out.println("�ō��_����" + max + "�_�ł��B");

		//���������ɏo��
		System.out.print("�_���͏���������");

		//�g��for��
		//�z��l������o��
		for(int result : scores) {
		
			//�����ݒ�i�����Ԃ��J���j�Əo��
			System.out.print(String.format("%d ",result));
		
		}

	}

}
