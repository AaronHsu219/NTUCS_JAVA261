public class StringMethod3 {
	public static void main(String[] args){
		String str= " �\�áA�Ѿ�A���~�A";//�ŧiString����A�ë��w���e
		String resultStr;
		System.out.println("str�r�ꪺ���e�O�G" + str);
		resultStr= str.trim();//�N��r��e�᪺�ťէR��
		System.out.println("====�N�r�ꪺ�e��ťղM��=======");
		System.out.println(" �s�r�ꪺ���e�O�G" + resultStr+ "\n");
		String addStr= "�p���A�y���A�H�a";
		System.out.println("====�N��r��A�s���s���r��=======");
		resultStr= resultStr.concat(addStr);//�A�s���@�զr��
		System.out.println("�s����A�r�ꪺ���e�O�G" + resultStr+ "\n");
		System.out.println("====���X��r���4�Ӧr�}�l�����e=======");
		String tmpStr= resultStr.substring(3);//���X��4�Ӧr(�t)���᪺�Ҧ����e
		System.out.println("���X��A�s�r�ꪺ���e�O�G" + tmpStr+ "\n");
		System.out.println("====���X��r���4�A5�Ӧr�����e=======");
		tmpStr= resultStr.substring(3, 5);//���X��4~5��m�Ӧr(�t)���᪺�Ҧ����e
		System.out.println("���X��A�s�r�ꪺ���e�O�G" + tmpStr+ "\n");
		System.out.println("====�N�r�ꤤ���u�A�v���N���u�C�v=======");
		tmpStr= resultStr.replace("�A", "�C");
		System.out.println("���N��A�s�r�ꪺ���e�O�G" + tmpStr+ "\n");
		String[] splitStr;
		System.out.println("====�b��r�ꤤ���u�C�v��m�A�����r��}�C=======");
		splitStr= tmpStr.split("�C");
		int i;
		for(i = 0; i < splitStr.length; i++){
			System.out.println(splitStr[i]);
		}
	}
}