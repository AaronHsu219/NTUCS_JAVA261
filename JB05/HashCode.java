public class HashCode{
	public static void main(String[] args){
		String str= "Hello World";//宣告String物件，並指定內容
		System.out.println("變更前，str的hash Code為：" + str.hashCode());
		str= "Hello Java";//現在更改str的內容
		System.out.println("變更後，str的hash Code為：" + str.hashCode());
	}
}