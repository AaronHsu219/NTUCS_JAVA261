import java.util.*;
public class Equals
{
	public static void main(String[] args)
	{
		char[] Array1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		char[] Array2 = {'A', 'B', 'C', 'D', 'E'};
		char[] Array3 = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println("Array1�MArray2�����e�ۦP��" + (Array1 == Array2));
		System.out.println("Array1�MArray3�����e�ۦP��" + (Array1 == Array3));

		System.out.println("===================================");
		//�p�G�n�P�_��Ӱ}�C�����e�O�_�ۦP
		//����Arrays���O���@�k
		boolean flag = true;
		if (Array1.length != Array3.length){
			flag = false;
		} else {
			for (int i = 0; i < Array1.length; i++){
				if (Array1[i] != Array3[i]){
					flag = false;
					break;
				}
			}
		}
		if (flag){
			System.out.println("Array1�MArray3�����e�����ۦP");
		} else {
			System.out.println("Array1�MArray3�����e�������ۦP");
		}

		System.out.println("===================================");
		//�p�G�n�P�_��Ӱ}�C�����e�O�_�ۦP
		//�ϥ�Arrays���O��euqals���@�k
		flag = Arrays.equals(Array1, Array3);
		if (flag){
			System.out.println("Array1�MArray3�����e�����ۦP");
		} else {
			System.out.println("Array1�MArray3�����e�������ۦP");
		}
	}
}