package com.bw.easy;
/**
 * 
 * 
 * @version:
 * @Description:https://leetcode-cn.com/problems/play-with-chips/
 * @author bw
 * @date 2019年10月23日 下午3:53:48
 *
 */
public class PlayWithChips {

	public static void main(String[] args) {
		
		PlayWithChips pwc = new PlayWithChips();
		int[] chips = {2,2,2,3,3};
		System.out.println(pwc.minCostToMoveChips(chips));
	}
	public int minCostToMoveChips(int[] chips) {
		int[] counts = new int[2];
        if (chips.length > 0) {
			for (int i = 0; i < chips.length; i++) {
				if (chips[i] % 2 == 0) {
					counts[0]++;
				} else {
					counts[1]++;
				}
			}
			return Math.min(counts[0], counts[1]);
		}
		return 0;
    }
}
