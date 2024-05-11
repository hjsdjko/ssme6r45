package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhenggongsiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhenggongsiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhenggongsiView;


/**
 * 家政公司
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:28:51
 */
public interface JiazhenggongsiService extends IService<JiazhenggongsiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhenggongsiVO> selectListVO(Wrapper<JiazhenggongsiEntity> wrapper);
   	
   	JiazhenggongsiVO selectVO(@Param("ew") Wrapper<JiazhenggongsiEntity> wrapper);
   	
   	List<JiazhenggongsiView> selectListView(Wrapper<JiazhenggongsiEntity> wrapper);
   	
   	JiazhenggongsiView selectView(@Param("ew") Wrapper<JiazhenggongsiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhenggongsiEntity> wrapper);
   	
}

