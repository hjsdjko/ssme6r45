package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhengayiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhengayiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhengayiView;


/**
 * 家政阿姨
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:28:51
 */
public interface JiazhengayiService extends IService<JiazhengayiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhengayiVO> selectListVO(Wrapper<JiazhengayiEntity> wrapper);
   	
   	JiazhengayiVO selectVO(@Param("ew") Wrapper<JiazhengayiEntity> wrapper);
   	
   	List<JiazhengayiView> selectListView(Wrapper<JiazhengayiEntity> wrapper);
   	
   	JiazhengayiView selectView(@Param("ew") Wrapper<JiazhengayiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhengayiEntity> wrapper);
   	
}

