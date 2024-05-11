package com.entity.view;

import com.entity.PingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:28:51
 */
@TableName("pingjia")
public class PingjiaView  extends PingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PingjiaView(){
	}
 
 	public PingjiaView(PingjiaEntity pingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, pingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
