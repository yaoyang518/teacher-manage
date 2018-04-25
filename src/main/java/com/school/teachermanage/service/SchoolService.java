package com.school.teachermanage.service;

import com.school.teachermanage.bean.DataResult;
import com.school.teachermanage.constants.MsgConstants;
import com.school.teachermanage.entity.*;
import com.school.teachermanage.enumeration.ErrorCode;
import com.school.teachermanage.repository.AddressReposity;
import com.school.teachermanage.repository.DistrictReposity;
import com.school.teachermanage.repository.SchoolReposity;
import com.school.teachermanage.util.StringUtil;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yaoyang
 * @Description:
 * @date 2018/4/25
 */
@Service
public class SchoolService {

    @Resource
    private DistrictReposity districtReposity;
    @Resource
    private AddressReposity addressReposity;
    @Resource
    private SchoolReposity schoolReposity;

    public DataResult  createSchool(JSONObject json,DataResult result){

        Long districtId = json.getLong("districtId");
        String name = json.getString("name");
        if(StringUtil.isNullOrEmpty(name)){
            result.setMsg(MsgConstants.OPT_FAIL);
            result.setDataMsg(ErrorCode.ILLEGAL_PARAMETER);
            return result;
        }
        District district = districtReposity.findOne(districtId);
        City city = district.getCity();
        Province province = city.getProvince();
        Address address = new Address();
        address.setDistrict(district);
        address.setCity(city);
        address.setProvince(province);
        addressReposity.save(address);
        School school = new School();
        school.setAddress(address);
        school.setName(name);
        schoolReposity.save(school);
        result.setMsg(MsgConstants.OPT_SUCCESS);
        return result;
    }
}