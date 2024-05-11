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


import com.dao.JiazhengayiDao;
import com.entity.JiazhengayiEntity;
import com.service.JiazhengayiService;
import com.entity.vo.JiazhengayiVO;
import com.entity.view.JiazhengayiView;

@Service("jiazhengayiService")
public class JiazhengayiServiceImpl extends ServiceImpl<JiazhengayiDao, JiazhengayiEntity> implements JiazhengayiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhengayiEntity> page = this.selectPage(
                new Query<JiazhengayiEntity>(params).getPage(),
                new EntityWrapper<JiazhengayiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhengayiEntity> wrapper) {
		  Page<JiazhengayiView> page =new Query<JiazhengayiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhengayiVO> selectListVO(Wrapper<JiazhengayiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhengayiVO selectVO(Wrapper<JiazhengayiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhengayiView> selectListView(Wrapper<JiazhengayiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhengayiView selectView(Wrapper<JiazhengayiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
