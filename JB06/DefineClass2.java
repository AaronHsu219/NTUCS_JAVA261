public class DefineClass2 {
	public static void main(String[] args) {
		Vehicle newCar1 = new Vehicle(); 	//����Ƥ@�����O
		Vehicle newCar2 = new Vehicle(); 	//�A����Ƥ@�����O
		Vehicle rCar; 										//�u�O�@�ӰѦ�

		rCar = newCar1; 									//rCar���VnewCar1

		newCar1.wheel = 4; 								//���w�����ܼƪ���
		newCar2.wheel = 8;
		rCar.wheel = 6; 									//�{�b�A newCar1 ���Ȥ]�|���
		System.out.println("newCar1 ���l��" + newCar1.wheel +" �ӽ��l");
		System.out.println("newCar2 ���l��" + newCar2.wheel +" �ӽ��l");		
	}
}

class Vehicle {
	int wheel; //�w�q�@�ӹ����ܼ�
}