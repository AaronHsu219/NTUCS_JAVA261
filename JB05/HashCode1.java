public class SB1 {
public static void main(String[] args){
StringBuffersb= new StringBuffer();//sb的緩衝區有16個字元
System.out.println("目前sb的緩衝區為：" + sb.capacity());
sb.append("Hello");//儲存了5個字元
System.out.println("sb的長度為：" + sb.length());
System.out.println("現在sb的緩衝區為：" + sb.capacity());
}
}