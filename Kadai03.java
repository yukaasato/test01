package test01;

public class Kadai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�ۑ�3
		 *  �R���\�[���ɋ��̕\��\���B
		 *  �\���͌��h���ǂ����𑵂��Ă��������B
		 */

		//�J��Ԃ������w�� : 1�`9
		for( int i=1; i<10; i++ ) {
			//	    	�J��Ԃ�����:1�`9
			for( int j=1; j<10; j++ ){

				//���ʂ��i�[����
				int result = i*j ; 

				//�y�\���z�𐮂��鏈���@
					
				    //d(�f�V�}���j��10�i���̈Ӗ�
				    
				    //�@String.format()�Ō�����2�ɂ���
					//System.out.print(String.format("%2d",result)+" ");
				
				    //�ASystem.out.printf()�͕�����̒���%~�Ƃ�������������𖄂ߍ���Ŏg���B
					//result�̒l��3���̐��l�ŕ\��
					System.out.printf("%3d",result);
					
			//�i���؂�ւ��^�C�~���O�ŉ��s
			}System.out.println("");
		}
	}

}
