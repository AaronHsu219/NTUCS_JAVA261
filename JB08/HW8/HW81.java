import java.io.*;

public class HW81 {
	public static void main(String[] args) throws IOException {

		// int stock;
		// int sell;

		// �ϥ� InputStreamReader ���O�A�����ϥΪ���L��J����T
		InputStreamReader ir = new InputStreamReader(System.in);

		// �A�ϥ� BufferedReader ���O�N�ϥΪ���L��J����T��m�b�w�İϤ�
		BufferedReader br = new BufferedReader(ir);

		System.out.print("�п�J�w�s�q:");
		int stock = Integer.parseInt(br.readLine());

		System.out.print("�п�J�ݨD�q:");
		int sell = Integer.parseInt(br.readLine());

		// checkInput(stock, sell);

		if (stock < 0) {
			try {
				throw new NegativeStockException(0);
			} catch (NegativeStockException e) {
				System.out.println(e.toString());
			}
		} else if (stock < sell) {
			try {
				throw new ShortStockExctpion(0);
			} catch (ShortStockExctpion e) {
				System.out.println(e.toString());
			}
		} else {
			System.out.println("Input OK!");
		}
	}
}

class NegativeStockException extends Exception {
	private int value;
	NegativeStockException (int value){
		this.value = value;
	}
	public String toString(){
		String s = "�w�s�ƶq���o�p��0!";
		return s;
	}
}

class ShortStockExctpion extends Exception {
	private int value;
	ShortStockExctpion (int value){
		this.value = value;
	}
	public String toString(){
		String s = "�ݭn���X���f�~�ƶq���o�j��w�s�q!";
		return s;
	}
}