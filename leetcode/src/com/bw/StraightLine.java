package com.bw;
/**
 * 
 * @version:
 * @Description:https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 * @author bw
 * @date 2019年10月22日 下午4:50:12
 *
 */
public class StraightLine {

	public static void main(String[] args) {
		StraightLine s = new StraightLine();
		int[][] coordinates = new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		System.out.println(s.checkStraightLine(coordinates));
	}
	//斜率避免除以0；改为乘法
	public boolean checkStraightLine(int[][] coordinates) {
		for (int i = 2; i < coordinates.length; i++) {
			if (((coordinates[i][0]-coordinates[0][0])*(coordinates[1][1]-coordinates[0][1]))
					!=((coordinates[1][0]-coordinates[0][0])*(coordinates[i][1]-coordinates[0][1]))) {
				return false;
			}
		}
        return true;
    }
}
