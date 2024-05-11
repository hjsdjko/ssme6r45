package com.entity.view;

import com.entity.JiazhengayiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政阿姨
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:28:51
 */
@TableName("jiazhengayi")
public class JiazhengayiView  extends JiazhengayiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhengayiView(){
	}
 
 	public JiazhengayiView(JiazhengayiEntity jiazhengayiEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhengayiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
