/**
 * 
 */
package com.nyhx.jjc.Entity;

import java.util.List;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月21日
 */
public abstract class Skill {
		//主键	
		private String uid;
		//名称
		private String name;
		//触发几率
		private int probability;
		//需求
		private String require;
		//是否可用
		private boolean available;
		//效果
		public abstract void Method(List<MyStudent> list,int i);
}
