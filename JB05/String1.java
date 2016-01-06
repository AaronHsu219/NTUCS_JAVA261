public class String1 {
	public static void main(String[] args){
		String str1 = "硂琌舱﹃";//ノ﹃盽计ミ﹃
		String str2 = "硂琌舱﹃";//ノ﹃盽计ミ﹃
		String str3 = new String("硂琌舱﹃");
		String str4 = new String("硂琌舱﹃");
		System.out.println("str1㎝str2琌把σン" + (str1 == str2));
		System.out.println("str1㎝str3琌把σン" + (str1 == str3));
		System.out.println("str3㎝str4琌把σン" + (str3 == str4));
		System.out.println("str1㎝str2ず甧琌" + str1.equals(str2));
		System.out.println("str1㎝str3ず甧琌" + str1.equals(str3));
		System.out.println("str3㎝str4ず甧琌" + str3.equals(str4));
	}
}