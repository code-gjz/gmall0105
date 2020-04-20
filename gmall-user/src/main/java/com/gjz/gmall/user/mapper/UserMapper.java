package com.gjz.gmall.user.mapper;

import com.gjz.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();

    List<UmsMember> selectAll();
}

