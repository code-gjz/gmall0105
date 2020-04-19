package com.gjz.gmall.user.service;
import com.gjz.gmall.user.bean.UmsMember;
import com.gjz.gmall.user.bean.UmsMemberReceiveAddress;
import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}