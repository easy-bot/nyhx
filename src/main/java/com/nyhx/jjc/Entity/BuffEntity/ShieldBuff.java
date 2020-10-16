/**
 * 
 */
package com.nyhx.jjc.Entity.BuffEntity;

import com.nyhx.jjc.Entity.Buff;
import com.nyhx.jjc.Entity.MyStudent;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 深巷明朝
 * <p>Description:护盾buff，同时只能存在一个护盾，后来的护盾直接覆盖前面一个</p>
 * @date 2020年9月22日
 */
@Data
@AllArgsConstructor
public class ShieldBuff extends Buff{
	private int shieldNum;
	
	/** (non-Javadoc)  
	 * <p>Title: method</p>  
	 * <p>Description:护盾，进行伤害抵消</p>
	 * @param num 伤害数值
	 * @return 护盾值 - 伤害数值    
	 * @see com.nyhx.jjc.Entity.Buff#method()  
	 */
	@Override
	public int method(int num) {
		// TODO Auto-generated method stub
		this.shieldNum -= num;
		return this.shieldNum;
	}

}
