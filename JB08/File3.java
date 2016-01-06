import java.io.File;

class File3{
	public static void main(String[] args){
		File f = new File("./");
		File[] lists = f.listFiles();
		int i ;

		for (i = 0 ; i < lists.length; i++) {
			if (lists[i].isDirectory())
			{
				System.out.println("<Dir>\t");
			} 
			else 
			{
				System.out.println(lists[i].getName()+"\t"+lists[i].length()+"Bytes");
			}			
		}
	}
}