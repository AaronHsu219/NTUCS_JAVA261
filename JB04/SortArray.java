import java.util.*;
public class SortArray{
	public static void main(String[] args) {

		int sort[] = {3, 5, 1, 8, 9, 7, 4};

		//��ܰ}�C�����e
		showArray(sort);

		//���ϥ�Arrays.sort()�ӱƧǰ}�C�����e
		//�ĥή�w�ƧǪk���]�p�޿�A�Ѥp�ƨ�j
		int temp;

		for (int i= 0; i< sort.length-1; i++){
			for (int j=i+1; j < sort.length; j++){
				if (sort[i] > sort[j]){//�令�u<�v�N�O�Ѥj�ƨ�p�F
					temp = sort[i];//�H�U�T�沣�͸�Ƥ��������G
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
		}

		showArray(sort);//��ܰ}�C�����e

		//�ϥ�Arrays.sort()�ӱƧǰ}�C�����e
		int sort1[] = {3, 5, 1, 8, 9, 7, 4};//���s�w�q�@�ӬۦP���}�C
		showArray(sort1);//��ܰ}�C�����e
		Arrays.sort(sort1);//�Narray�����W�Ƨ�
		showArray(sort1);//�A��ܰ}�C�����e
	}
	//��ܰ}�C���e���禡
	static void showArray(int[] array){
		System.out.print("�}�C�����e�O�G");

		for (int i= 0; i< array.length; i++){
			System.out.print(array[i] + " ");
			}

		System.out.println("\n=====================");
	}
}