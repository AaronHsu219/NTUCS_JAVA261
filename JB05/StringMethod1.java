public class StringMethod1 {
	public static void main(String[] args) {
		String str= "�r�ꪺ�ާ@ABc";//�ŧiString����A�ë��w���e
		int i;
		int slength= str.length();
		System.out.println("str�r�ꪺ���׬��G" + slength);
		char[] tmpChar= str.toCharArray();//�Nstr�ഫ��char�}�C
		System.out.print("tmpChar�}�C�����e���G");
		for (i = 0; i < tmpChar.length; i++){
			System.out.print(tmpChar[i]);
		}
		System.out.println();
		byte[] tmpByte= str.getBytes();//�Nstr�ഫ��byte�}�C
		System.out.print("tmpByter�}�C�����e���G");
		for (i = 0; i < tmpByte.length; i++){
			System.out.print(tmpByte[i] + " ");//�`�N��C�Ӥ���r�����byte
		}
		System.out.println();
		String tmpLower= str.toLowerCase();//�N�r�ꤤ���^��r�ର�p�g
		System.out.println("�^��r�ର�p�g�᪺���e�G" + tmpLower);
		String tmpUpper= str.toUpperCase();//�N�r�ꤤ���^��r�ର�j�g
		System.out.println("�^��r�ର�j�g�᪺���e�G" + tmpUpper);
	}
}