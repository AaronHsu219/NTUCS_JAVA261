public publicclass CheckPersonalID
{
	public static void main(String[] args)
	{
		booleancheck = false;
		String input = args[0];
		if (input.matches("[a-zA-Z]{1}[0-9]{9}")) {
			check = checkPID(input);
		}
		if (check) { System.out.println("�����Ҧr�����T�I"); }
		else { System.out.println("�����Ҧr�����~�I���ˬd�ݬݡI"); }
	}
	public static booleancheckPID(String input)
	{
		// �Ĥ@�Ӧr���������Ʀr��
		int[] num= {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 33};
		// ��Ĥ@�Ӧr���ন�j�g
		String inputToUpper= input.toUpperCase();
		byte[] idToByte= inputToUpper.getBytes();
		int[] idToCount= new int[idToByte.length+ 1];
		// �B�z�Ĥ@�Ӧr
		intfirstChar= num[idToByte[0] -65]; // ���X�Ĥ@�Ӧr���������Ʀr
		idToCount[0] = (int)Math.floor(firstChar/ 10); // �Ĥ@�Ӧr�����Ĥ@�ӼƦr
		idToCount[1] = (firstChar% 10); // �Ĥ@�Ӧr�����ĤG�ӼƦr
		// �Ĥ@�ӼƦr�}�l�ΥH�᪺�Ʀr
		for (inti =1; i < idToByte.length; i++) {
			idToCount[i+1] = (idToByte[i] -48);
		}
		// �}�l�p���`�M
		inttotal = idToCount[0];
		for (inti = 1; i < idToCount.length-1; i++) {
			total += (idToCount[i] * (10 -i));
		}
		// �M�w�^�ǭ�
		if (idToCount[idToCount.length-1] == 0 && (total % 10) == 0) { return true; } // �̫�@�X��0 �Btotal % 10 �]��0
		else { return (idToCount[idToCount.length-1] == (10 -(total % 10))) ? true : false; } // �̫�@�X����0 �ɭn��10 �Vtotal % 10
	}
}