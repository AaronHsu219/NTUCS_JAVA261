import java.util.*;
public class SearchArray
{
	public static void main(String[] args)
	{
		char[] SearchArray= {'A', 'C', 'X', 'W', 'E', 'B'};
		for (int j = 0; j < SearchArray.length; j++){//���s��ܥثe�}�C�����e
			System.out.print(SearchArray[j] + " ");
		}
		System.out.println();
		//�p�G�n�j�M�uC�v�O�_�b�}�C��
		//����Arrays.binarySearch�@�k
		boolean flag = false;
		int i;
		for (i=0; i< SearchArray.length; i++){
			if (SearchArray[i] == 'C'){
				flag = true;
				break;
			}
		}
		if (flag){
			System.out.println("C�O�b�}�C������" + (i+1) + " �Ӧ�m");
		} else {
			System.out.println("C�b�}�C���䤣��");
		}
		//�ϥ�Arrays���O����binarySearch�@�k
		Arrays.sort(SearchArray);//�NSearchArray�����W�Ƨ�
		for (int j = 0; j < SearchArray.length; j++){//���s��ܥثe�}�C�����e
			System.out.print(SearchArray[j] + " ");
		}
		System.out.println();
		int at = Arrays.binarySearch(SearchArray, 'C');
		System.out.println("C�O�b�}�C������" + (at+1) + " �Ӧ�m");
	}
}