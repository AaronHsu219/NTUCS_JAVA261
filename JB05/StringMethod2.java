public class StringMethod2 {
	public static void main(String[] args) {
		String str= "�r�ꪺ�ާ@ABc�A�r���k���ϥ�";//�ŧiString����A�ë��w���e
		int i;
		System.out.println("str�r�ꪺ���e�O�G" + str);
		i = 2;//�]�windex���Ȭ�2
		char find = str.charAt(i);//��X�ĤT�Ӧr
		System.out.println("str�r�ꪺ�ĤT�Ӧr���G" + find);
		String findStr= "�r��";//�]�w�ݭn�j�M���r�ꤺ�e
		i = str.indexOf(findStr);//��M�u�r��v����m
		System.out.println("�u�r��v�bstr�����Ĥ@�ӥX�{����m�O�G" + i);
		i = str.lastIndexOf(findStr);//��M�u�r��v�̫�X�{����m
		System.out.println("�u�r��v�bstr�����̫�@�ӥX�{����m�O�G" + i);
		findStr= "Java";//���s�]�w�r�ꪺ���e
		i = str.indexOf(findStr);//��M�uJava�v����m�A�o���䤣��
		System.out.println("�uJava�v�bstr�����Ĥ@�ӥX�{����m�O�G" + i);
	}
}