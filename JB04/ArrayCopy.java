public class ArrayCopy{
	public static void main(String[] args){
		int[] FirstArray= {1, 2, 3, 4, 5, 6};//�ŧi�@��int�}�C�A�ê�l��
		int[] SecondArray= new int[4];//�ŧi�@��int�}�C�A������l��
		int i;

		System.arraycopy(FirstArray, 2, SecondArray, 1, 2);//��ڽƻsFirstArray�����e
		System.out.println("SecondArray�����e���G");
		for(i = 0; i < SecondArray.length; i++) {
			System.out.println(SecondArray[i]);
		}
	}
}