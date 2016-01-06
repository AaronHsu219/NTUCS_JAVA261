/***************************************************************************************
 * ����ɦV�{���]�p���m�ߡGHW62.java
 * �w�q�@�ӭӤH������O�uPersonal�v�A�å]�t�H�U��private��Ʀ����G
 * �m�W(name)�GString
 * �ʧO(gender)�Gboolean
 * �~��(age)�Gint
 * �����Ҧr��(id)�GString
 * �P�ɳ]�p�غc�l�H�����H�U���n�D�G
 * �w�]�غc�l�G���ݭn��l�����
 * �i�ǤJ�m�W���غc�l
 * �i�H�ǤJ�m�W�B�ʧO�B�~���B�����Ҧr�����غc�l
 * �ЦA�]�p�H�U����k�G
 * public void setName(String name)											//�]�w�m�W
 * public String getName( )													//���X�m�W
 * public void setData(String name, boolean, gender, int age, String id)	//�]�w�Ҧ����ӤH���
 * public boolean getGender( )												//���X�ʧO
 * public int getAge( )														//���X�~��
 * public String getID( )
 * �̫�إ�3�Ӫ���A�ê�l�ƭӤH����ơC�ñN���G��ܥX�ӡA��ܮ榡�ۭq
***************************************************************************************/

public class HW62
{
	public static void main(String[] args)
	{

		// ����1 - �ϥΪūغc�l
		Personal p1 = new Personal();

		// ����2 - �ϥζǤJ�m�O��Ѽƪ��غc�l
		Personal p2 = new Personal("Bill");

		// ����3 - �ϥζǤJ�m�W�B�ʧO�B�~�֡B�����Ҧr����Ѽƪ��غc�l
		Personal p3 = new Personal("Cindy", false, 20, "12345678");

		// ����1 �]�����e�O�Ū��A�ϥ� setName() �]�w�m�W
		System.out.println("p1: Personal(): ");
		p1.setName("Allan");
		// �A�� getName() �N�m�W���Ū�X
		System.out.println("name=" + p1.getName());
		System.out.println();

		// ����2 �u�ǤJ�m�W�A�]�������ϥ� getName() �N�m�W���Ū�X
		System.out.println("p2: Personal(\"Bill\"): ");
		System.out.println("name=" + p2.getName());
		System.out.println();

		// ����3 �b����ƮɫK�w���m�W�B�ʧO�B�~�֡B�����Ҧr�������
		System.out.println("p3: Personal(\"Cindy\", false, 20, \"12345678\"): ");
		System.out.println("name=" + p3.getName());		// �ϥ� getName() �N�m�W���Ū�X
		String sex = (p3.getGender()) ? "M" : "F";		// �ϥ� getGender() �N�ʧO���Ū�X
		System.out.println("gender=" + sex);			// �f�t�T���B��l�Atrue ��X�k�ʡBfalse ��X�k��
		System.out.println("age=" + p3.getAge());		// �ϥ� getAge() �N�~�ָ��Ū�X
		System.out.println("id=" + p3.getId());			// �ϥ� getId() �N�����Ҧr�����Ū�X
		System.out.println();
	}
}

// Personal ���O
class Personal
{
	// �ӤH��Ʀ���
	private String name;		// �m�W
	private boolean gender;		// �ʧO
	private int age;			// �~��
	private String id;			// �����Ҧr��

	// �غc�l - �ŰѼ�
	Personal()
	{
	}

	// �غc�l - �m�W�Ѽ�
	Personal(String name)
	{
		this.name = name;
	}

	// �غc�l - �m�W�B�ʧO�B�~�֡B�����Ҧr���Ѽ�
	Personal(String name, boolean gender, int age, String id)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setData(String name, boolean gender, int age, String id)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}
	public boolean getGender()
	{
		return this.gender;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getId()
	{
		return this.id;
	}
}