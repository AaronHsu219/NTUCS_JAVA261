public class SB2 {
	public static void main(String[] args){

		//�غcStringBuffer����
		StringBuffer sb= new StringBuffer("This is a book");
		System.out.println("�ثesb�����e���G" + sb);
		System.out.println("�}�l�e�Asb��HashCode��----" + sb.hashCode());

		//�Q��setCharAt�]�w�r��w�İϪ����e
		sb.setCharAt(2, 'a');
		sb.setCharAt(3, 't');
		System.out.println("�ϥ�setCharAt��Asb�����e���G" + sb);

		//�ϥ�append�s�W�r��w�İϪ����e
		sb.append(", or a magazine");
		System.out.println("�ϥ�append��Asb�����e���G" + sb);

		//�ϥ�insert�s�W�r���w�İϤ����S�w��m
		sb.insert(0, "I guess ");
		System.out.println("�ϥ�insert��Asb�����e���G" + sb);

		//�ϥ�delete�R���r��w�İϪ����e
		sb.delete(0, 8);
		System.out.println("�ϥ�delete��Asb�����e���G" + sb);

		//�ϥ�replace���N�r��w�İϪ����e
		//�N�uThat�v��אּ�uThis�v
		sb.replace(0, 4, "This");
		System.out.println("�ϥ�replace��Asb�����e���G" + sb);

		//�ϥ�reverse�N�r��w�İϪ����e����
		sb.reverse();
		System.out.println("�ϥ�reverse��Asb�����e���G" + sb);
		System.out.println("�ާ@��Asb��HashCode��----" + sb.hashCode());
	}
}