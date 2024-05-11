package com.dao;

import com.entity.JiazhengayiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhengayiVO;
import com.entity.view.JiazhengayiView;


/**
 * 家政阿姨
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:28:51
 */
public interface JiazhengayiDao extends BaseMapper<JiazhengayiEntity> {
	
	List<JiazhengayiVO> selectListVO(@Param("ew") Wrapper<JiazhengayiEntity> wrapper);
	
	JiazhengayiVO selectVO(@Param("ew") Wrapper<JiazhengayiEntity> wrapper);
	
	List<JiazhengayiView> selectListView(@Param("ew") Wrapper<JiazhengayiEntity> wrapper);

	List<JiazhengayiView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhengayiEntity> wrapper);
	
	JiazhengayiView selectView(@Param("ew") Wrapper<JiazhengayiEntity> wrapper);
	
}
