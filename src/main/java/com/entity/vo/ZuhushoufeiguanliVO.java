package com.entity.vo;

import com.entity.ZuhushoufeiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 租户收费管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 21:23:57
 */
public class ZuhushoufeiguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 楼房号
	 */
	
	private String loufanghao;
		
	/**
	 * 租房时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zufangshijian;
		
	/**
	 * 租金
	 */
	
	private Integer zujin;
		
	/**
	 * 水电费
	 */
	
	private Integer shuidianfei;
		
	/**
	 * 卫生清理费
	 */
	
	private Integer weishengqinglifei;
		
	/**
	 * 停车费
	 */
	
	private Integer tingchefei;
		
	/**
	 * 维修费
	 */
	
	private Integer weixiufei;
		
	/**
	 * 需缴金额
	 */
	
	private Integer xujiaojine;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：楼房号
	 */
	 
	public void setLoufanghao(String loufanghao) {
		this.loufanghao = loufanghao;
	}
	
	/**
	 * 获取：楼房号
	 */
	public String getLoufanghao() {
		return loufanghao;
	}
				
	
	/**
	 * 设置：租房时间
	 */
	 
	public void setZufangshijian(Date zufangshijian) {
		this.zufangshijian = zufangshijian;
	}
	
	/**
	 * 获取：租房时间
	 */
	public Date getZufangshijian() {
		return zufangshijian;
	}
				
	
	/**
	 * 设置：租金
	 */
	 
	public void setZujin(Integer zujin) {
		this.zujin = zujin;
	}
	
	/**
	 * 获取：租金
	 */
	public Integer getZujin() {
		return zujin;
	}
				
	
	/**
	 * 设置：水电费
	 */
	 
	public void setShuidianfei(Integer shuidianfei) {
		this.shuidianfei = shuidianfei;
	}
	
	/**
	 * 获取：水电费
	 */
	public Integer getShuidianfei() {
		return shuidianfei;
	}
				
	
	/**
	 * 设置：卫生清理费
	 */
	 
	public void setWeishengqinglifei(Integer weishengqinglifei) {
		this.weishengqinglifei = weishengqinglifei;
	}
	
	/**
	 * 获取：卫生清理费
	 */
	public Integer getWeishengqinglifei() {
		return weishengqinglifei;
	}
				
	
	/**
	 * 设置：停车费
	 */
	 
	public void setTingchefei(Integer tingchefei) {
		this.tingchefei = tingchefei;
	}
	
	/**
	 * 获取：停车费
	 */
	public Integer getTingchefei() {
		return tingchefei;
	}
				
	
	/**
	 * 设置：维修费
	 */
	 
	public void setWeixiufei(Integer weixiufei) {
		this.weixiufei = weixiufei;
	}
	
	/**
	 * 获取：维修费
	 */
	public Integer getWeixiufei() {
		return weixiufei;
	}
				
	
	/**
	 * 设置：需缴金额
	 */
	 
	public void setXujiaojine(Integer xujiaojine) {
		this.xujiaojine = xujiaojine;
	}
	
	/**
	 * 获取：需缴金额
	 */
	public Integer getXujiaojine() {
		return xujiaojine;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
