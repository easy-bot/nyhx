/**
 * 
 */
package com.nyhx.jjc.Entity;

import java.util.List;

import lombok.Data;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月18日
 */
@Data
public class MyStudent extends BaseStudent{
	//个体单独属性
	private String uuid;	//主键
	
	private String ownerQQ;	//拥有者qq
	
	private int level;		//等级
	
	//模型
	private Student student;
	
	//强化能力等级
	private int addAttack;	//强化攻击
	
	private int addDefanse;	//强化防御
	
	private int addHp;		//强化生命
	
	private int addSpeed;	//强化速度
	
	
	//战斗额外属性
	private int MaxHp;		//实际战斗中最大生命值
	
	private int shield;		//护盾值
	
	//魔力石和buff增幅效果
	private List<MagicStone> magicList;
	
	private List<Buff>	buffList;
	
	private int magicAttack;	//攻击力增加%
	
	private int magicDefanse;	//防御增加%
	
	private int magicSpeed;		//速度增加具体数值
	
	private int magicHp;		//生命增加%
	
	private int magicIncrease;	//攻增增加%
	
	private int magicReduction;	//减伤增加%
	
	private int magicCrit;		//暴击增加%
	
	private int magicCritMagnification;	//爆伤增加%
	
	private int magicLuck;		//幸运增加
	
	private int magicDodge;		//闪避增加%
	
	/**
	 * <p>Description:初始化数值，当buff发生变化后也应当重新计算数值</p>
	 * @date 2020年9月22日
	 * @param:
	 */
	public void initialization() {
		
	}
	/**
	 * <p>Description:</p>
	 * @date 2020年9月22日
	 * @param:
	 * @return 1级基础速度+ 速度成长*等级  + 强化等级 + 魔力石加成
	 */
	public int setAllSpeed() {
		setSpeed(student.getSpeed()+student.getAddSpeed()*level+getAddSpeed()+getMagicSpeed());
		return getSpeed();
	}
}
