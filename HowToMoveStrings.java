/*
 * ������̑���p25
 * */

/*
 * �쐬��:2020/7/2
 * �w�K���e:String�N���X
 * �L�[���[�h�Fequals(Object o)/equalsIgnoreCase(String s)/length()/isEmpty
 * 		  toLowerCase()/toUppercase()/trim()/replace(String before, String after)
 * 		  contains(String s)/startSWith(String s)/endsWith(String s)/indexOf(int ch)/indexOf(String str)
 * 		  lastIndexOf(int ch)/lastIndexOf(String str)/charAt(int index)/sustring(int index)�Esubstring(int index,int endIndex)
 * 		  matches()
 * */

/*
 * �𗧂P�[�X
 * 1.���e�������������ׂ�
 * 2.�啶���A����������ʂ����ɓ��e�������������ׂ�
 * 3.�����񒷂𒲂ׂ�
 * 4.�󕶎����𒲂ׂ�
 * 5.�啶�����������ɕϊ�
 * 6.��������啶���ɕϊ�
 * 7.�O��̋󔒂���������i�S�p�X�y�[�X�͏�������Ȃ��j
 * 8.�������u������
 * 9.�ꕔ�ɕ�����a���܂ނ����ׂ�
 * 10.������a�Ŏn�܂邩���ׂ�
 * 11.������a�ŏI��邩���ׂ�
 * 12.����ch(�܂��͕�����str)���ŏ��ɓo�ꂷ��ʒu�𒲂ׂ�
 * 13..����ch(�܂��͕�����str)����납�猟�����čŏ��ɓo�ꂷ��ʒu�𒲂ׂ�
 * 14.�w���1������؂�o��
 * 15.�w��@����n�܂镶�����C�ӂ̒��������؂�o��
 * 16.matches()���\�b�h�̊��p
 * */

package test01;

public class HowToMoveStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//�g����
		String s1 ="�M�^�[���D����";
		String s2 ="guitar";
		String s3 ="Guitar";
		String s4 =" ";
		String s5 ="";
		String s6 ="     LOVePiaNo";
		String s7 ="�@�@�@�@�@LOVePiaNo";
		String s8 ="�s�`���[�@�s�J�`���E�@���C�`���E";
		
		//�������r
		if(s2.equals(s3)) {
			System.out.println("�܂�������������");
		}else {
			System.out.println("�������啶���Ⴄ���ǁA����ȊO�͓�������");
		}
		
		//�L�������P�[�X�܂ݕ������r
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("�������啶���Ⴄ���ǁA����ȊO�͓�������");
		}
		
		//�����̒���
		System.out.println("s1�̒�����"+s1.length()+"����");
		
		//�󂩃X�y�[�X
		if(s4.isBlank()) {
			System.out.println("�u�����N����");
		}
		
		//length��0
		if(s5.isEmpty()) {
				System.out.println("�󂾂�");
		}
		
		//���H
		System.out.println("����������������������");
		System.out.println("���H");
		
		//�啶����
		System.out.println(s2.toUpperCase());
		
		//��������
		System.out.println(s2.toLowerCase());
		
		//�󔒏���trim
		System.out.println(s6);
		System.out.println(s6.trim());
		System.out.println(s7);
		
		//�u������
		//System.out.println(s6.replace());
		
		//�܂ނ�����
		if(s8.contains("�s�J�`���E")) {
			System.out.println("�s�J�`���E���܂�ł��܂��B");
		}
		
		//�Ŏn�܂邩����
		if(s8.startsWith("�s�`���[")) {
			System.out.println("�ŏ��̓s�`���[�Ŏn�܂�܂��B");
		}
		//�ŏI��邩����
		if(s8.endsWith("���C�`���E")) {
			System.out.println("���C�`���E�ŏI���܂�");
		}
		//�������ڂœo�ꂷ�邩
		System.out.println("�s�J�`���E���o�ꂷ��ʒu��"+s8.indexOf("�s�J�`���E")+"�ł�"+"�A�i���̕������"+s8+"�B)");
		
		//��납�牽�����ڂœo�ꂷ�邩
		System.out.println("���C�`���E���Ō�ɓo�ꂷ��ʒu�́A�O���琔����"+s8.lastIndexOf("���C�`���E")+"�ł�"+"�A�i���̕������"+s8+"�B)");
		
		//�w��ʒu��1����������؂肾��
		System.out.println(s8.substring(0));
		
		//�Z�����ځ`�Z�����ڂ�؂��� �Z�ȏ�Z�����H
		System.out.println(s8.substring(0,4));
		
		//������̘A���̒���
		//�����Ă���StringBuilder���g���B�����܂�Ɏg���Ȃ�����StringBuffer�N���X
		/*
		 *�������A�����ĘA������ꍇ�ɍł��������\��
		 *��������̂�StringBuilder�N���X��p�����A���ł��B
		 *StringBuilder�C���X�^���X�́A�����ɘA�������������~���郁�����̈�i�o�b�t�@�j�������Ă��܂��B
		 *���̃N���X��p���ĘA�����s���Ƃ��́A
		 *�@append()���\�b�h�����Ńo�b�t�@�ɂ��������˂��Ă����i�K�v�ɉ������񐔂��Ăяo���j��
		 *�A�Ō��1�񂾂�toString()���ĂсA���������A���ς݂̕���������o���B
		 *�Ƃ����菇����ʓI�ł��B
		 * */	
		
		/*
		 * +���Z�q���x�����R
		 * String�C���X�^���X�̕s�ϐ�
		 * +���Z�q�ŘA�����s��ꂽ�ꍇ�A�Â��C���X�^���X�͎̂Ă��A
		 * �A����̏������V�����C���X�^���X��new�ɂ�萶���A�i�[�����B
		 * */
		
		/*
		 * StringBuilder��StringBuffer�N���X�͉σN���X�B
		 * 
		 * �Ȃ��A�����x�̕����A���ł���΁A���\�ɑ卷�͂Ȃ��̂ŁA�^�C�s���O�ʂ����Ȃ����₷��+���Z�q���g����悢�ł��傤�B
		 * */
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< 5; i++){
			sb.append("�C�[�u�C"+i+"���");
		}
		String s = sb.toString();
		System.out.println(s);
		
		String str = "����ɂ���char";
		char[] data1 = str.toCharArray();
		//byte[] data3 = str.getBytes("utf-8");
		byte[] data2 = str.getBytes();
		
		System.out.println(data1);
		System.out.println(data2);
	}
	
	//���K���\���̊��p
	//�K��8�����A�g���镶����A-Z��0�`9�����B�@�ŏ��̕����ɐ����͎g���Ȃ�
	boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	
	/*
	 * matches()�̃���
	 * 
	 * �������̕����̈Ӗ�
	 * 
	 * ���ʂ̕��������̕����łȂ���΂Ȃ�Ȃ�
	 * �s���I�h[.]���C�ӂ�1�����ł���΂悢
	 * �A�X�^���X�N[*]�����O�̕�����0��ȏ�̌J��Ԃ�
	 * ".*"�����ׂĂ̕����������
	 * s.matches("Ma.*");��Ma�Ŏn�܂��āA�ȉ��������łȂ�ł�ok��startsWith()�Ɠ���
	 * s.matches(".*ful");��full�ŏI���C�ӂ̕���=endsWith�Ɠ���
	 * �g�J�b�R���w��񐔂̌J��Ԃ�
	 * {n}�����O�̕�����n��̌J��Ԃ�
	 * {n,}�����O�̕�����n��ȏ�̌J��Ԃ�
	 * {n,m}�����O�̕�����n��ȏ�m��ȉ��̌J��Ԃ�
	 * ?�����O�̕�����0��܂���1��̌J��Ԃ�
	 * !�����O�̕�����1��ȏ�̌J��Ԃ�
	 * �p�J�b�R�������ꂩ�̕���
	 * [abc]
	 * �p�J�b�R���̃n�C�t�����w��͈͂̂����ꂩ�̕���
	 * [a-z]
	 * "url".matches("[a-z]{3}") //true
	 * [0-9]���p�^�[���ő��p�������̂́A���Ŏn�܂镶���N���X�Ƃ��Ē�`����Ă���
	 * ��d �����ꂩ�̐���[0-9]�Ɠ���
	 * ��w�@�p���E�����E�A���_�[�o�[[a-zA-Z_0-9]�Ɠ���
	 * ��s�󔒕����i�X�y�[�X�@�^�u�����@���s�����Ȃ�
	 * �����܂߂����ꍇ�́������@��[�⁏*�𒲂ׂĎg���@���ꕶ����
	 * �n�b�g�i^)�ƃ_���[($)���擪�Ɩ����@"^j.*p$"���擪��j�Ŏn�܂���p�ŏI���C�ӂ̒����̕����Asplit()��replaceAll()�Ŗ����I�ɐ擪�▖�����������߂Ɏg��
	 * */
	
	
	
///////�������\�b�h����
	boolean isValidPlayerName2(String name) {
		///NG�����������ꍇfalse��Ԃ�
		
		
		if(name.length()!=8) {//8������Ȃ�������NG
			return false;
		}
		char first = name.charAt(0);
		if(!(first >= 'A' && first <= 'Z')) {//�ŏ��̕�����A~Z�������Ȃ�������NG
			return false;
		}
		for(int i = 1; i<8; i++) {
			char c = name.charAt(i);//0~7�Ԗڂ̕��������o����
			if(!((c >='A' && c <='Z') || (c >= '0' && c <= '9')) ){//A~Z,0~9����Ȃ�������NG
				return false;
			}
		}
		return true;
	}
}
