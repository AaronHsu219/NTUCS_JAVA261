public class BuildString{
	public static void main(String[] args) {

		//�ϥΦr��`�ƫإߦr��
		String str1 = new String("�Ĥ@�Ӧr��");
		System.out.println(str1);

		//�ϥΦr���}�C�إߦr��
		char[] c = {'��', '�G' , '��', '�r', '��'};
		String str2 = new String(c);
		System.out.println(str2);

		//�N�r��`�ƫ��w���r�ꪫ��
		String str3 = "�ĤT�Ӧr��";
		System.out.println(str3);
	}
}