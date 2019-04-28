/**
 * 虽然任何一个整数都属于int型，但是java编译时，如果发现使用的数据变量类型为byte，并且设
 * 置的内容在byte范围之内，就会自动帮助用户实现数据类型的转换。反之，如果超过了byte数据
 * 范围，则依然会以int型进行操作，此时就需要进行强制类型转换了。
 */
package ch2;

/**
 * @author Kevin Zhou
 * @date 2019年4月26日 下午5:27:23
 * 类说明：观察byte自动转换的操作
 * 要点说明：
 */
public class TestDemo12 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		byte num = 100 ;	//100默認數據類型為int, 没有超过byte的保存范围, 故自動類型轉換成byte
     System.out.println(num);	//输出byte变量的内容
     
	}

}
