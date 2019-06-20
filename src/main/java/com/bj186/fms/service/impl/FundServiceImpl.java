package com.bj186.fms.service.impl;

import com.bj186.fms.mapper.FundMapper;
import com.bj186.fms.pojo.Fund;
import com.bj186.fms.service.FundService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("fundService")
public class FundServiceImpl implements FundService {

    @Resource
    private FundMapper fundMapper;

    @Override
    public List<Fund> selectAll() {
        return fundMapper.selectAll();
    }
}
