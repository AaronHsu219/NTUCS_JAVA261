public class AssignObject{
	public static void main(String[] args){
		int[] FirstArray= {1, 2, 3, 4};//�ŧi�@��int�}�C�A�ê�l��
		int[] SecondArray;//�ŧi�@��int�}�C�A������l��
		int i;

		SecondArray= FirstArray;
		System.out.print("�̶}�lFirstArray�����e���G");
		PrintArray(FirstArray);
		System.out.print("�̶}�lSecondArray�����e���G");
		PrintArray(SecondArray);
		FirstArray[2] = 100;//���s���wFirstArray��3�Ӥ��t���Ȭ�100
		System.out.print("���ܫ�FirstArray�����e���G");
		PrintArray(FirstArray);
		System.out.print("���ܫ�SecondArray�����e���G");
		PrintArray(SecondArray);
	}

	static void PrintArray(int[] ArrayName){
		int i;
		for(i = 0; i < ArrayName.length; i++){
			System.out.print(" " + ArrayName[i] + " ");
		}
		System.out.println();
	}
}