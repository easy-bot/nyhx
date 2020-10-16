/**
 * 
 */
package com.nyhx.jjc.Entity;

import javax.persistence.Column;

/**
 * 
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月18日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")		//启动jpa主键自动注册
public class Student {
	
	@Id		//设置为主键id
	@Column(name = "uid")
	@GeneratedValue(generator = "jpa-uuid")		//启动jpa主键自动注册
	private String uid;	//主键id
	
	//基本信息
	@Column(name = "college")
	private String college;	//学院 pets
	@Column(name = "col_num")
	private int colNum;		//学院编号
	@Column(name = "name")
	private String name;	//学员名称
	@Column(name = "race")
	private String race;	//学员种族
	@Column(name = "cost")
	private String cost;	//cost 5,6,7,9
	@Column(name = "rare")
	private int rare;		//星级  2~5
	@Column(name = "type")
	private String type;	//角色属性
	
	//战斗属性
	@Column(name = "attack")
	private int attack;		//攻击力
	@Column(name = "defanse")
	private int defanse;	//防御
	@Column(name = "speed")
	private int speed;		//速度
	@Column(name = "hp")
	private int hp;			//生命值
	
	//带%属性存储时都去掉了%，如79%存储为79
	@Column(name = "increase")
	private int increase;	//增伤
	@Column(name = "reduction")
	private int reduction;	//免伤
	@Column(name = "crit")
	private int crit;		//暴击几率
	@Column(name = "crit_magnification")
	private int critMagnification;	//暴击倍率,爆伤
	@Column(name = "luck")
	private int luck;		//幸运
	@Column(name = "dodge")
	private int dodge;		//闪避
	
	//抗性
	@Column(name = "dark_resistance")
	private int darkResistance;		//暗属性抗性
	@Column(name = "light_resistance")
	private int lightResistance;	//光属性抗性
	@Column(name = "wind_resistance")
	private int windResistance;		//风属性抗性
	@Column(name = "water_resistance")
	private int waterResistance;	//水属性抗性
	@Column(name = "fire_resistance")
	private int fireResistance;		//火属性抗性
	
	//强化能力上限
	@Column(name = "add_attack")
	private int addAttack;	//强化攻击
	@Column(name = "add_defanse")
	private int addDefanse;	//强化防御
	@Column(name = "add_hp")
	private int addHp;		//强化生命
	@Column(name = "add_speed")
	private int addSpeed;	//强化速度
	
	//成长属性
	@Column(name = "level_attack")
	private float levelAttack;	//每级攻击成长
	@Column(name = "level_defanse")
	private float levelDefanse;	//每级防御成长
	@Column(name = "level_hp")
	private float levelHp;		//每级生命成长
	@Column(name = "level_speed")
	private float levelSpeed;	//每级速度成长
}

