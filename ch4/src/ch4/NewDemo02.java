package ch4;

public class NewDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�����ݲ���(fun()):");
		fun();
		System.out.print("\n����1������(fun(1)):");
		fun(1);
		System.out.print("\n����5������(fun(1, 2, 3, 4, 5)):");
		fun(1, 2, 3, 4, 5);	
		
	}
	
	public static void fun(int ... arg){
		for(int x : arg ){
			System.out.print(x + "��");
		}
	}

}