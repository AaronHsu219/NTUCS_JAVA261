class DefineClass3 {
	public static void main(String[] args){
		Vehicle newCar1 = new Vehicle(); 	//����Ƥ@�����O

		newCar1.setWheel(6); 							//�]�wwheel����

		System.out.println("newCar1 ���l�� " + newCar1.getWheel() + " �ӽ��l");
	}
}

class Vehicle { 												//�w�q�����O
	int wheel; 													//�w�q�@�ӹ����ܼ�
	public int getWheel() { 						//�w�q��k�A�Ǧ^wheel����
		return wheel;
	}
	public void setWheel(int n) { 			//�w�q��k�A�]�wwheel����
		if (n <= 10) {
			wheel = n;
		} else {
			wheel = 2;
		}
	}
}