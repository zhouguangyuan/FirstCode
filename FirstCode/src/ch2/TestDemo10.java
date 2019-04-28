/**
 * 
 */
package ch2;

/**
 * @author Kevin Zhou
 * @date 2019年4月26日 下午4:55:06
 * 类说明：将范围大的数据类型转为范围小的数据类型
 * 要点说明：
 */
public class TestDemo10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        long num = 1000 ;	//1000常量是int型，使用long接受，发生了向大范围转型
        int x = (int) num ;	//把long变为int
        System.out.println(x);
	}

}
