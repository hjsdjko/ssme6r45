package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiazhenggongsiDao;
import com.entity.JiazhenggongsiEntity;
import com.service.JiazhenggongsiService;
import com.entity.vo.JiazhenggongsiVO;
import com.entity.view.JiazhenggongsiView;

@Service("jiazhenggongsiService")
public class JiazhenggongsiServiceImpl extends ServiceImpl<JiazhenggongsiDao, JiazhenggongsiEntity> implements JiazhenggongsiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhenggongsiEntity> page = this.selectPage(
                new Query<JiazhenggongsiEntity>(params).getPage(),
                new EntityWrapper<JiazhenggongsiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhenggongsiEntity> wrapper) {
		  Page<JiazhenggongsiView> page =new Query<JiazhenggongsiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhenggongsiVO> selectListVO(Wrapper<JiazhenggongsiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhenggongsiVO selectVO(Wrapper<JiazhenggongsiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhenggongsiView> selectListView(Wrapper<JiazhenggongsiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhenggongsiView selectView(Wrapper<JiazhenggongsiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
