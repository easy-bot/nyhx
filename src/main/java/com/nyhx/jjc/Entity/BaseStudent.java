/**
 * 
 */
package com.nyhx.jjc.Entity;

import javax.persistence.Column;

import lombok.Data;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年9月18日
 */
@Data
public class BaseStudent {
	
	//基本信息
		private String college;	//学院 pets
		
		private int colNum;		//学院编号
		
		private String name;	//学员名称
		
		private String race;	//学员种族
		
		private String cost;	//cost 5,6,7,9
		
		private int rare;		//星级  2~5
		
		private String type;	//角色属性
		
		//战斗属性
		private int attack;		//攻击力
		
		private int defanse;	//防御
		
		private int speed;		//速度
		
		private int hp;			//生命值
		
		//带%属性存储时都去掉了%，如79%存储为79
		private int increase;	//增伤
		
		private int reduction;	//免伤
		
		private int crit;		//暴击几率
		
		private int critMagnification;	//暴击倍率,爆伤
		
		private int luck;		//幸运
		
		private int dodge;		//闪避
		
		//抗性
		private int darkResistance;		//暗属性抗性
		
		private int lightResistance;	//光属性抗性
		
		private int windResistance;		//风属性抗性
		
		private int waterResistance;	//水属性抗性
		
		private int fireResistance;		//火属性抗性
}
