public class SB1 {
public static void main(String[] args){
StringBuffersb= new StringBuffer();//sb���w�İϦ�16�Ӧr��
System.out.println("�ثesb���w�İϬ��G" + sb.capacity());
sb.append("Hello");//�x�s�F5�Ӧr��
System.out.println("sb�����׬��G" + sb.length());
System.out.println("�{�bsb���w�İϬ��G" + sb.capacity());
}
}