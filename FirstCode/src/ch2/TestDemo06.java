package ch2;
/**
 * �˴�Ϊ�ĵ�ע��
 * @author Kevin Zhou
 * ��˵���������������
 * ��������������Integer.MAX_VALUE��Integer.MIN_VALUEȡ��int���͵����ֵ����Сֵ��Ȼ��
 * �ֱ���г������ݱ��淶Χ����ѧ���㡣����max��min����������int�ͱ���������int�ͱ�����
 * int�ͳ������м����������Ȼ��int�͡����Ǵ�ʱ���ڼ��㳬�����䱣��ķ�Χ ���ͻ����һ��
 * ѭ���Ĳ��������ֵ����������Ӿͱ�Ϊ��Сֵ�����һֱ����ε���Сֵ����ѭ������֮��Сֵ
 * ��1�ͱ�Ϊ���ֵ�����������Ϊ���ݵ������
 * 
 * Ҫ��˵�������������int���͵�������Сֵ���������ô���أ��������������
 */

public class TestDemo06{

	public static void main(String[] args) {
		
		int max = Integer.MAX_VALUE ; //ȡ�����ֵ
		int min = Integer.MIN_VALUE ;	//ȡ����Сֵ
		
		//���������Сֵ
		System.out.println("max="+ max);
		System.out.println("min="+ min);
		
		System.out.println(max+1);
		System.out.println(min-1);
		System.out.println(min-2);
		
		

	}

}
