/**
 * 
 */
package ch2;

/**
 * @author Kevin Zhou
 * @date 2019年4月26日 下午4:19:49
 * 类说明：扩大数据范围
 * 要点说明：
 */
public class TestDemo09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE ;	//取出最大值
		int min = Integer.MIN_VALUE ;	//取出最小值
		
		System.out.println(max) ;	//输出最大值
		System.out.println(min) ;	//输出最小值
		
		System.out.println("数据类型扩大后，数据输出正常了，未出现数据溢出！");
		System.out.println(max+1L) ;	//隐式类型转换成long类型
		System.out.println(min-(long)1) ;	//强制类型转换成long类型
		
  
	}

}
