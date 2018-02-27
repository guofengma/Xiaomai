package com.topschool.xm.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.topschool.xm.model.UserInfo;
import org.springframework.stereotype.Component;

@Component
public interface UserInfoDao {

    int insert(@Param("pojo") UserInfo pojo);

    int insertList(@Param("pojos") List< UserInfo> pojo);

    List<UserInfo> select(@Param("pojo") UserInfo pojo);

    int update(@Param("pojo") UserInfo pojo);

    UserInfo selectById(long id);

}
