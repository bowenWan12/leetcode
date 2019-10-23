package com.bw.easy;

/**
 * 
 * @version:
 * @Description:https://leetcode-cn.com/problems/deep-dark-fraction/comments/
 * @author bw
 * @date 2019年10月22日 下午4:06:44
 *
 */
public class Fractional {
	public static void main(String[] args) {
		Fractional f = new Fractional();
		int[] i = new int[] {3, 2, 0, 2};
		int[] fraction = f.fraction(i);
		System.out.println(fraction[0]+"/"+fraction[1]);
	}

	//暴力解法
	public int[] fraction(int[] cont) {
		int[] res = new int[2];
		res[0] = 1;//分子
		res[1] = 0;//分母
		for (int i = cont.length-1; i >= 0; i--) {
			int temp=res[0];
			res[0]=cont[i]*res[0]+res[1];
			res[1]=temp;
		}
		return res;
	}
}
