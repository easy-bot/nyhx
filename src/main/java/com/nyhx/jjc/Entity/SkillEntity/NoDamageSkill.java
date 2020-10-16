/**
 * 
 */
package com.nyhx.jjc.Entity.SkillEntity;

import java.util.List;

import com.nyhx.jjc.Entity.MyStudent;
import com.nyhx.jjc.Entity.Skill;
import com.nyhx.jjc.Entity.BuffEntity.ShieldBuff;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月21日
 */
public class NoDamageSkill extends Skill{

	/** (non-Javadoc)  
	 * <p>Title: Method</p>  
	 * <p>Description:加护盾或buff，都通过加buff的形式来实现</p>    
	 * @see com.nyhx.jjc.Entity.Skill#Method()  
	 */
	public void Method(List<MyStudent> list,int num) {
		// TODO Auto-generated method stub
		ShieldBuff shieldBuff = new ShieldBuff(num);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).getBuffList().add(shieldBuff);
		}
//		return list;
	}
		
}
