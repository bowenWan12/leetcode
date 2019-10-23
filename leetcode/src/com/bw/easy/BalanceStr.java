package com.bw.easy;
/**
 * 
 * @version:
 * @Description:https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * @author bw
 * @date 2019年10月23日 下午2:19:13
 *
 */
public class BalanceStr {

	public static void main(String[] args) {
		BalanceStr bs = new BalanceStr();
		System.out.println(bs.balancedStringSplit("LLLRRR"));
	}

	public int balancedStringSplit(String s) {
		if (s.length()>0) {
			int count = 0;
			int num = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)=='R') {
					count++;
				}
				if (s.charAt(i)=='L') {
					count--;
				}
				
				if (count == 0) {
					num++;
				}
			}
			return num;
		}
        return 0;
    }
}
