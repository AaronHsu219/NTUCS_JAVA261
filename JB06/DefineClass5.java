class DefineClass5 {
	public static void main(String[] args)
	{
		Vehicle newCar1 = new Vehicle(); 		//����Ƥ@�����O
		System.out.println("newCar1 ���l��" + newCar1.getWheel() + "�ӽ��l");
	}
}

class Vehicle{ 													//�w�q�����O
	private int wheel; 										//�w�q�@�ӹ����ܼ�
	public Vehicle(){ 										//���O���غc�l
		wheel = 4;
	}
	public int getWheel() { 							//�w�q��k�A�Ǧ^wheel����
		return wheel;
	}
	public void setWheel(int n) { 				//�w�q��k�A�]�wwheel����
		if (n <= 10) {
			wheel = n;
		} else {
			wheel = 2;
		}
	}
}