package com.gjz.gmall.service;
import com.gjz.gmall.bean.UmsMember;
import com.gjz.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}