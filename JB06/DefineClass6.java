class DefineClass6 {
	public static void main(String[] args){
		Vehicle newCar1 = new Vehicle(); 		//����Ƥ@�����O
		Vehicle newCar2 = new Vehicle(6); 	//����Ƥ@�����O�A�öǤJ�Ѽ�

		System.out.println("newCar1 ���l��" + newCar1.getWheel() + "�ӽ��l");
		System.out.println("newCar2 ���l��" + newCar2.getWheel() + "�ӽ��l");
	}
}

class Vehicle { 												//�w�q�����O
	private int wheel; 										//�w�q�@�ӹ����ܼ�
	Vehicle(){ 														//���O���غc�l	
		wheel = 4;
	}
	Vehicle(int n){ 											//�w�q���Ѽƪ��غc�l
		wheel = n;
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