package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import com.example.demo.dto.Account;

@Mapper
public interface AccountMapper {

    @Select("select * from accounts")
    List<Account> findAll();

    @Select("select * from accounts where username = #{userName}")
    Account findOne(String userName);
}
