class Inheritance2 {
	public static void main(String[] args) {
		CalArea a1 = new CalArea();
		System.out.println("�����O���׬O�G " + a1.height + "�A �����O�e�׬O�G " + a1.width);

		CalRecArea a2 = new CalRecArea();
		System.out.println("�l���O���׬O�G " + a2.height + "�A �l���O�e�׬O�G " + a2.width);
		System.out.println("�l���O�W�٬O�G " + a2.name);

		CalArea a3 = new CalRecArea();
		System.out.println("�����O���׬O�G " + a3.height + "�A �����O�e�׬O�G " + a3.width);
		//System.out.println("�����O���W�٬O�G " + a3.name);

		CalRecArea a4 = (CalRecArea)a3;
		System.out.println("�l���O���׬O�G " + a4.height + "�A �l���O�e�׬O�G " + a4.width);
		System.out.println("�l���O���W�٬O�G " + a4.name);
	}
}

class CalArea{
	public int width = 10; 			//�]�w����
	public int height = 10; 		//�]�w�e��
	//public String name = "�����O";
}

class CalRecArea extends CalArea{
	public int width = 20; 			//�]�w����
	public int height = 20; 		//�]�w�e��
	public String name = "�x��";
}