import java.io.File;
import java.util.Date;

class File2{
	public static void main(String[] args) {
		File f = new File("Test.java");
		System.out.println("f����O�_�s�b�G"+ f.exists());
		System.out.println("f����O�_���ɮסG"+ f.isFile());
		System.out.println("f����O�_�i�HŪ���G"+ f.canRead());
		System.out.println("f����O�_�i�H�g�J�G"+ f.canWrite());
		System.out.println("f���󪺹�ڦW�٬��G"+ f.getName());
		System.out.println("f���󪺭ק������G"+ new Date(f.lastModified()));
		System.out.println("f���󪺹�ڤj�p���G"+ f.length() +"Bytes");
		System.out.println("f���󪺵�����|���G"+ f.getAbsolutePath());
		System.out.println("f���󪺸��|���G"+ f.getParent());
	}
}