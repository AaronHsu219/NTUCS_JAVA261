/**************************************************************
 * ン旧祘Α絤策PT61.java
 * ノ篶芠├糶祘Α琵柑摸だパ
 * ﹃篶俱计篶疊翴计篶
 * 贺篶ミだ祘Αい
 * 硂琌パ﹃篶ミン硂琌パ俱计篶ミン硂琌パ疊翴计篶ミン
**************************************************************/

public class PT61
{
	public static void main(String[] args)
	{
		// 龟蔨て TestObj (ㄏノ俱计把计)
		TestObj obj1 = new TestObj(1);

		// 龟蔨て TestObj (ㄏノ疊翴计把计)
		TestObj obj2 = new TestObj(1.0);

		// 龟蔨て TestObj (ㄏノ﹃把计)
		TestObj obj3 = new TestObj("﹃");
	}
}

// TestObj 摸
class TestObj
{
	// 钡Μ俱计把计篶
	public TestObj(int n)
	{
		System.out.println("俱计篈篶");
	}

	// 钡Μ疊翴计把计篶
	public TestObj(double n)
	{
		System.out.println("疊翴计篈篶");
	}

	// 钡Μ﹃把计篶
	public TestObj(String n)
	{
		System.out.println("﹃篈篶");
	}
}