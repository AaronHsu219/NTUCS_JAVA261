/***************************************************************************************
 * 物件導向程式設計的練習：HW62.java
 * 定義一個個人資料類別「Personal」，並包含以下的private資料成員：
 * 姓名(name)：String
 * 性別(gender)：boolean
 * 年紀(age)：int
 * 身份證字號(id)：String
 * 同時設計建構子以完成以下的要求：
 * 預設建構子：不需要初始任何值
 * 可傳入姓名的建構子
 * 可以傳入姓名、性別、年紀、身份證字號的建構子
 * 請再設計以下的方法：
 * public void setName(String name)											//設定姓名
 * public String getName( )													//取出姓名
 * public void setData(String name, boolean, gender, int age, String id)	//設定所有的個人資料
 * public boolean getGender( )												//取出性別
 * public int getAge( )														//取出年紀
 * public String getID( )
 * 最後建立3個物件，並初始化個人的資料。並將結果顯示出來，顯示格式自訂
***************************************************************************************/

public class HW62
{
	public static void main(String[] args)
	{

		// 物件1 - 使用空建構子
		Personal p1 = new Personal();

		// 物件2 - 使用傳入姓別當參數的建構子
		Personal p2 = new Personal("Bill");

		// 物件3 - 使用傳入姓名、性別、年齡、身份證字號當參數的建構子
		Personal p3 = new Personal("Cindy", false, 20, "12345678");

		// 物件1 因為內容是空的，使用 setName() 設定姓名
		System.out.println("p1: Personal(): ");
		p1.setName("Allan");
		// 再用 getName() 將姓名資料讀出
		System.out.println("name=" + p1.getName());
		System.out.println();

		// 物件2 只傳入姓名，因此直接使用 getName() 將姓名資料讀出
		System.out.println("p2: Personal(\"Bill\"): ");
		System.out.println("name=" + p2.getName());
		System.out.println();

		// 物件3 在實體化時便已有姓名、性別、年齡、身份證字號的資料
		System.out.println("p3: Personal(\"Cindy\", false, 20, \"12345678\"): ");
		System.out.println("name=" + p3.getName());		// 使用 getName() 將姓名資料讀出
		String sex = (p3.getGender()) ? "M" : "F";		// 使用 getGender() 將性別資料讀出
		System.out.println("gender=" + sex);			// 搭配三元運算子，true 輸出男性、false 輸出女性
		System.out.println("age=" + p3.getAge());		// 使用 getAge() 將年齡資料讀出
		System.out.println("id=" + p3.getId());			// 使用 getId() 將身份證字號資料讀出
		System.out.println();
	}
}

// Personal 類別
class Personal
{
	// 個人資料成員
	private String name;		// 姓名
	private boolean gender;		// 性別
	private int age;			// 年齡
	private String id;			// 身份證字號

	// 建構子 - 空參數
	Personal()
	{
	}

	// 建構子 - 姓名參數
	Personal(String name)
	{
		this.name = name;
	}

	// 建構子 - 姓名、性別、年齡、身份證字號參數
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