class Final1 {
	public static void main(String[] args) {
		final Animal a = new Animal();
		a.leg = 10; //�i�H���ܪ����ܼƪ���Ƥ��e
		System.out.println("�ʪ����}�� " + a.leg + " ��");
		a.leg = 20; //�i�H���ܪ����ܼƪ���Ƥ��e
		System.out.println("�ʪ����}�� " + a.leg + " ��");

		Animal b = new Animal();
		//a = b; //���i�H���ܪ����ܼơA�o��|���ͽsĶ�ɪ����~
	}
}

class Animal {
	public int leg;
}