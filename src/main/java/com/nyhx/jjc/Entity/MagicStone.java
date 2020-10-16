/**
 * 
 */
package com.nyhx.jjc.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月18日
 */
@Data
@Entity
@Table(name = "MAGICSTONE")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")		//启动jpa主键自动注册
public class MagicStone {
	
	@Id		//设置为主键id
	@Column(name = "migic_id")
	@GeneratedValue(generator = "jpa-uuid")		//启动jpa主键自动注册
	private int magicId;		//主键id
	@Column(name = "magic_type")
	private String magicType;	//石头类型
	@Column(name = "magic_attack")
	private int magicAttack;	//攻击力增加%
	@Column(name = "magic_defanse")
	private int magicDefanse;	//防御增加%
	@Column(name = "magic_speed")
	private int magicSpeed;		//速度增加具体数值
	@Column(name = "magic_hp")
	private int magicHp;		//生命增加%
	@Column(name = "magic_increase")
	private int magicIncrease;	//攻增增加%
	@Column(name = "magic_reduction")
	private int magicReduction;	//减伤增加%
	@Column(name = "magic_crit")
	private int magicCrit;		//暴击增加%
	@Column(name = "magic_critMagnification")
	private int magicCritMagnification;	//爆伤增加%
	@Column(name = "magic_luck")
	private int magicLuck;		//幸运增加
	@Column(name = "magic_dodge")
	private int magicDodge;		//闪避增加%
}
