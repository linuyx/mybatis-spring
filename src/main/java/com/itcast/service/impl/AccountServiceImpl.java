package com.itcast.service.impl;

import com.itcast.dao.AccountDao;
import com.itcast.pojo.Account;
import com.itcast.pojo.AccountVo;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    //查找所有用户
    public List<Account> findAll(){
        return accountDao.findAll();
    }

    //根据id查找用户
    public Account findAccountById(Integer id){
        return accountDao.findAccountById(id);
    }

    ////根据名称和money查询用户
    public Account findAccountNameMoney(String name,float money){
        return accountDao.findAccountNameMoney(name,money);
    }

    //根据模糊名称查询用户
   public  List<Account> findAccountLikeName(String name){
        return accountDao.findAccountLikeName(name);
    }

    //添加用户并返回主键id
    public void saveAccount(Account account){

        accountDao.saveAccount(account);
    }

    //根据id删除用户
    public void deleteAccountById(Integer id){
        accountDao.deleteAccountById(id);
    }

    //根据id更新用户
    public void updateAccountById(Account account){
        accountDao.updateAccountById(account);
    }

    //复杂的pojo包装类查询
    public List<Account> findAccountVo(AccountVo accountVo){
        return accountDao.findAccountVo(accountVo);
    }
}
