public class DefineClass1 {
	public static void main(String[] args){

		Vehicle newCar = new Vehicle(); //����ƪ��@�����O

		newCar.wheel = 4; 		//���w�����ܼƪ���
		System.out.println("���l�� "+ newCar.wheel + "�ӽ��l");
	}
}

class Vehicle { 					//�w�q�����O
	int wheel; 							//�w�q�@�ӹ����ܼ�
}