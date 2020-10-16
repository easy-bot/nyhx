/**
 * 
 */
package com.nyhx.jjc.Entity.Battle;

import java.util.ArrayList;
import java.util.List;

import com.nyhx.jjc.Entity.MyStudent;

/**
 * @author 深巷明朝
 * <p>Description:战场</p>
 * @date 2020年9月22日
 */
public class Battlefield {
	private int round = 1;
	private MyStudent[] allStudent = new MyStudent[10];	//参与战斗的所有人    0~4为挑战者，5~9为防守者
	private int[] order = new int[10];		//出手顺序
	
	public String battle(MyStudent[] left,MyStudent[] right) {
		if (left.length>6||right.length>6) {	//队伍人数超过6个，不正常，直接结束战斗
			return null;
		}
		for (int i = 0; i < 5; i++) {			//将战斗双方塞进战场
			if (left[i]!=null) {
				allStudent[i] = left[i];
			}
			if(right[i]!=null) {
				allStudent[i+5] = right[i];
			}
		}
		while (round<15) {		//战斗开始，回合数大于15即结束战斗
			
		}
		return null;
	}
	
	/**
	 * <p>Description:判断出手顺序</p>
	 * @date 2020年9月22日
	 * @param:
	 */
	public int[] judgeOrder() {
		int[] allSpeed = new int[allStudent.length];
		for(int i = 0; i< allStudent.length;i++) {
			allSpeed[i] = allStudent[i].getSpeed();
		}
		order = Arraysort(allSpeed, true);
		return order;
	}
	
	/**
	 * 排序并返回对应原始数组的下标
	 * 
	 * @param arr	需要排序的数组
	 * @param desc	是否降序
	 * @return
	 */
	public static int[] Arraysort(int[] arr, boolean desc) {
		int temp;
		int index;
		int k = arr.length;
		int[] Index = new int[k];
		for (int i = 0; i < k; i++) {
			Index[i] = i;
		}
 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (desc) {
					if (arr[j] < arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
 
						index = Index[j];
						Index[j] = Index[j + 1];
						Index[j + 1] = index;
					}
				} else {
					if (arr[j] > arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
 
						index = Index[j];
						Index[j] = Index[j + 1];
						Index[j + 1] = index;
					}
				}
			}
		}
		return Index;
	}

}
