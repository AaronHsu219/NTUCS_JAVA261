/**************************************************************
 * 禣ん计 (HW33.java)
 * 禣ん计パ 0 ㎝ 1 秨﹍ぇ玒计パぇ玡ㄢ计
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
 * 叫砞璸祘Α衡材 25 玒计ぶ
**************************************************************/

public class HW33
{
	public static void main(String[] args)
	{
		// ㄢ俱计跑计ㄓㄏノ块计籔禣Α计璸衡挡狦
		int input, result;

		input = 25;
		result = fibonacci(input);

		System.out.println("材"+ input +"禣ん计琌" + result);
	}

	// 禣Α计ㄧΑ - 患癹郸菠
	public static int fibonacci(int num)
	{
		// 砞﹚沧翴讽把计 1 
		if (num == 1)
		{
			return 0;
		}

		// 砞﹚沧翴讽把计 2 
		else if (num == 2)
		{
			return 1;
		}

		// 把计獶 1 ┪獶 2 玥磅︽患癹
		// 禣Α计琘计 n 玡ㄢ计羆㎝珿 n = (n-1) + (n-2)
		else
		{
			return (fibonacci(num - 1) + fibonacci(num - 2));
		}
	}
}

/**************************************************************
 も笆秆
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368
**************************************************************/












