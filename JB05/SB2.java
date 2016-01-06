public class SB2 {
	public static void main(String[] args){

		//建構StringBuffer物件
		StringBuffer sb= new StringBuffer("This is a book");
		System.out.println("目前sb的內容為：" + sb);
		System.out.println("開始前，sb的HashCode為----" + sb.hashCode());

		//利用setCharAt設定字串緩衝區的內容
		sb.setCharAt(2, 'a');
		sb.setCharAt(3, 't');
		System.out.println("使用setCharAt後，sb的內容為：" + sb);

		//使用append新增字串緩衝區的內容
		sb.append(", or a magazine");
		System.out.println("使用append後，sb的內容為：" + sb);

		//使用insert新增字串到緩衝區中的特定位置
		sb.insert(0, "I guess ");
		System.out.println("使用insert後，sb的內容為：" + sb);

		//使用delete刪除字串緩衝區的內容
		sb.delete(0, 8);
		System.out.println("使用delete後，sb的內容為：" + sb);

		//使用replace取代字串緩衝區的內容
		//將「That」更改為「This」
		sb.replace(0, 4, "This");
		System.out.println("使用replace後，sb的內容為：" + sb);

		//使用reverse將字串緩衝區的內容反轉
		sb.reverse();
		System.out.println("使用reverse後，sb的內容為：" + sb);
		System.out.println("操作後，sb的HashCode為----" + sb.hashCode());
	}
}