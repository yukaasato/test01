/*�ۑ�4
		 * �L�[�{�[�h����ǂݍ��񂾕�������o�͂���v���O�������쐬���Ă��������B
		       ���͂ɂ͂���������������܂����AScanner�𗘗p���Ă�������
		      ��L�ɉ����ē��͎��ɂ�
		      ���������͂��Ă��������B�iEnter�ŏI���j
*/
package test01;
import java.util.Scanner;
public class Kadai04 {
	public static void main(String[] args) {
		//�X�L���i�[���쐬��������
		Scanner scanner = new Scanner(System.in);
		//��������`�ƃR���\�[���ɏo��
		System.out.println("���������͂��Ă��������B");
		// ��������󂯎��̂�scanner.next()
		//�󂯂Ƃ����������ϐ�words�Ɋi�[
		String words = scanner.next();
		//�R���\�[���֕ϐ��̒��g���o��
		System.out.println(words+"�Ɠ��͂���܂����B");
		//Scanner�N���X�̃C���X�^���X���N���[�Y
		scanner.close();

	}

}
