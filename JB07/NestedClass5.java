class NestedClass5 {
	public static void main(String[] args) {
		outerClass5 out = new outerClass5() ;
		out.showInner() ;
	}
}

//�ŧi�ΦW���O�������O
class Anonymous1 {
	String name;
	int age = 10 ;

	Anonymous1(String name) {
		this.name = name;
	}
	public void showName() {}
}

class outerClass5{
	public void showInner() {
		Anonymous1 out = new Anonymous1("Alex") { //�}�l�ŧi�ΦW���O
			String myName; //�i�H�s���~�����O������
			int myAge;

			//�ΨӼ����غc�l���\��
			{
				myName = name ;
				myAge = age ;
			}

			//�мg����k�i�H�b�ΦW���O���~���I�s
			public void showName() {
				System.out.println("�W�٬��G " + myName) ;
				showAge(); //�I�s�s�W����k
			}

			//
			public void showAge() {
				System.out.println("�~�֬��G " + myAge) ;
			}
		}; //�`�N�������n���u ; �v
		
		out.showName(); //�I�s�ΦW���O����k
		//out.showAge( ) ; / /���i�H�b�~���I�ΦW���O����k
	}
}