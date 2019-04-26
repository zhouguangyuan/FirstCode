package ch2;
/**
 * 此处为文档注释
 * @author Kevin Zhou
 * 类说明：数据类型溢出
 * 本程序首先利用Integer.MAX_VALUE和Integer.MIN_VALUE取得int类型的最大值和最小值，然后
 * 分别进行超过数据保存范围的数学计算。由于max或min变量都属于int型变量，而当int型变量与
 * int型常量进行计算后其结果依然是int型。但是此时由于计算超过了其保存的范围 ，就会出现一个
 * 循环的操作，最大值如果继续增加就变为最小值，随后一直向其次的最小值进行循环，反之最小值
 * 减1就变为最大值，此种现象称为数据的溢出。
 * 
 * 要点说明：如果超出了int类型的最大或最小值，结果会怎么样呢？数据类型溢出。
 */

public class TestDemo06{

	public static void main(String[] args) {
		
		int max = Integer.MAX_VALUE ; //取出最大值
		int min = Integer.MIN_VALUE ;	//取出最小值
		
		//输出最大和最小值
		System.out.println("max="+ max);
		System.out.println("min="+ min);
		
		System.out.println(max+1);
		System.out.println(min-1);
		System.out.println(min-2);
		
		

	}

}
