class NestedClass5 {
	public static void main(String[] args) {
		outerClass5 out = new outerClass5() ;
		out.showInner() ;
	}
}

//宣告匿名類別的父類別
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
		Anonymous1 out = new Anonymous1("Alex") { //開始宣告匿名類別
			String myName; //可以存取外圍類別的成員
			int myAge;

			//用來模擬建構子的功能
			{
				myName = name ;
				myAge = age ;
			}

			//覆寫的方法可以在匿名類別的外部呼叫
			public void showName() {
				System.out.println("名稱為： " + myName) ;
				showAge(); //呼叫新增的方法
			}

			//
			public void showAge() {
				System.out.println("年齡為： " + myAge) ;
			}
		}; //注意結尾結要有「 ; 」
		
		out.showName(); //呼叫匿名類別的方法
		//out.showAge( ) ; / /不可以在外部呼匿名類別的方法
	}
}