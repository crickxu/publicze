package com.platform.publicze_platform.Service.ServiceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.platform.publicze_platform.Dao.CompanyInfo;
import com.platform.publicze_platform.Pojo.CompanyInfoMapper;
import com.platform.publicze_platform.Service.CompanyInfoService;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Resource
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return companyInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CompanyInfo record) {
        return companyInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(CompanyInfo record) {
        return companyInfoMapper.insertSelective(record);
    }

    @Override
    public CompanyInfo selectByPrimaryKey(Integer id) {
        return companyInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CompanyInfo record) {
        return companyInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CompanyInfo record) {
        return companyInfoMapper.updateByPrimaryKey(record);
    }

}

