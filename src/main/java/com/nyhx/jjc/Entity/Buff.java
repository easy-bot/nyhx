/**
 * 
 */
package com.nyhx.jjc.Entity;

/**
 * @author 深巷明朝
 * <p>Description:用来编写各种奇怪的buff</p>
 * @date 2020年9月21日
 */
public abstract class Buff {
	//主键
	private String uid;
	//buff名称
	private String name;
	//剩余回合
	private int restRound;
	//效果
	public abstract int method(int num);
}
