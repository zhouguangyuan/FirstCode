package ch2;
/**
 * 此处为文档注释
 * @author Kevin Zhou
 */

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//此处为单行注释，编译代码时不编译
		/*
		 * 此处为多行注释编译代码时不编译。
		 * 如要要学习Java的高端课程，可以登陆www.mldnjava.cn
		 */
	
		System.out.println("Hello MLDN.");
		
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
