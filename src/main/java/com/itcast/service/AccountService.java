package com.itcast.service;

import com.itcast.pojo.Account;
import com.itcast.pojo.AccountVo;

import java.util.List;

public interface AccountService {

     //查找所有用户
     List<Account> findAll();

     //根据id查找用户
     Account findAccountById(Integer id);

     //根据模糊名称查询用户
     List<Account> findAccountLikeName(String name);

     //根据名称和money查询用户
     Account findAccountNameMoney(String name,float money);

     //添加用户并返回主键id
     void saveAccount(Account account);

     //根据id删除用户
     void deleteAccountById(Integer id);

     //根据id更新用户
     void updateAccountById(Account account);

     //复杂的pojo包装类查询
     List<Account> findAccountVo(AccountVo accountVo);


}
