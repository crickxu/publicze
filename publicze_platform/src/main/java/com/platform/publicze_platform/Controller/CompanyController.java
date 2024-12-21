package com.platform.publicze_platform.Controller;
import com.platform.publicze_platform.Dao.CompanyInfo;
import com.platform.publicze_platform.Dao.User;
import com.platform.publicze_platform.Service.CompanyInfoService;
import com.platform.publicze_platform.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyInfoService companyInfoService;
    @GetMapping("getCompany")
    public CompanyInfo getCompany(Integer id)
    {
        CompanyInfo companyInfo= companyInfoService.selectByPrimaryKey(id);
        return companyInfo;
    }
    @GetMapping("getCompanys")
    public List<CompanyInfo> getCompanys()
    {
        List<CompanyInfo> companyInfos= companyInfoService.selectCompanys();
        if(companyInfos!=null)
            companyInfos.forEach(x->{
                x.provinceAddrName=x.provinceAddrName+x.cityAddrName;
                x.imgPath = "http://192.168.10.139/"+x.imgPath;
            });
        return companyInfos;
    }
    @PostMapping("addCompany")
    public String addCompany(@RequestBody CompanyInfo info)
    {
        try {
            return companyInfoService.insert(info);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    @GetMapping("getCompanyByNo")
    public CompanyInfo getCompanyByNo(String companyNo)
    {
        CompanyInfo companyInfo = companyInfoService.selectByCompanyInfo(companyNo);
        return companyInfo;
    }
}
