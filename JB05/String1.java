public class String1 {
	public static void main(String[] args){
		String str1 = "�o�O�@�զr��";//�Q�Φr��`�ƫإߦr��
		String str2 = "�o�O�@�զr��";//�A�Q�Φr��`�ƫإߦr��
		String str3 = new String("�o�O�@�զr��");
		String str4 = new String("�o�O�@�զr��");
		System.out.println("str1�Mstr2�O�_�ѦҨ�P�@����G" + (str1 == str2));
		System.out.println("str1�Mstr3�O�_�ѦҨ�P�@����G" + (str1 == str3));
		System.out.println("str3�Mstr4�O�_�ѦҨ�P�@����G" + (str3 == str4));
		System.out.println("str1�Mstr2�����e�O�_�ۦP�G" + str1.equals(str2));
		System.out.println("str1�Mstr3�����e�O�_�ۦP�G" + str1.equals(str3));
		System.out.println("str3�Mstr4�����e�O�_�ۦP�G" + str3.equals(str4));
	}
}