/**
 * 
 */
package ch2;

/**
 * @author Kevin Zhou
 * @date 2019��4��26�� ����4:19:49
 * ��˵�����������ݷ�Χ
 * Ҫ��˵������ʽ����ת����ǿ������ת
 */
public class TestDemo09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE ;	//ȡ�����ֵ
		int min = Integer.MIN_VALUE ;	//ȡ����Сֵ
		
		System.out.println(max) ;	//������ֵ
		System.out.println(min) ;	//�����Сֵ
		
		System.out.println("�������������������������ˣ�δ�������������");
		System.out.println(max+1L) ;	//��ʽ����ת����long����
		System.out.println(min-(long)1) ;	//ǿ������ת����long����
		
  
	}

}