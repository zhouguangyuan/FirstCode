/**
 * 
 */
package ch2;

/**
 * @author Kevin Zhou
 * @date 2019年4月26日 上午11:33:22
 * 类说明:观察变量与常量的区别
 * 要点说明：实际上变量与常量最大的区别只有一个：常量的内容是固定的，而
 * 变量的内容 是可以改变的。
 */
public class TestDemo08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//所有的变量名称在同一代码块中只允许声明一次
		int num = 10 ;	//10是常量，常量默认类型是int
		//取出num变量的内容乘以2，并且将其设置给num变量
		num = num * 2 ;
		System.out.println(num);
	}

}
