package com.topschool.xm.service;

import com.topschool.xm.exception.UserNameNotFoundException;

import javax.naming.NoPermissionException;
import java.util.List;
import java.util.Map;

public interface PartnerService {

    void register(String uid, String username, String invitationCode, String openId, int area);

    String getUsername(Integer uid, String password) throws UserNameNotFoundException, NoPermissionException;

    List<Map> getAllPartner();

    void deletePartner(String uid);

    boolean uidExist(String uid);
}
