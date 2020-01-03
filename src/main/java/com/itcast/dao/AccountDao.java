package com.itcast.dao;

import com.itcast.pojo.Account;
import com.itcast.pojo.AccountVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    //查询所有账户
     List<Account> findAll();

    //根据id查询用户
    Account findAccountById(Integer id);

    //模糊查询用户名称
    List<Account> findAccountLikeName(String name);

    //根据名称和money查询用户
    Account findAccountNameMoney(@Param("name") String name,@Param("money") float money);

    //添加用户并返回主键id
    void saveAccount(Account account);

    //根据id删除用户
    void deleteAccountById(Integer id);

    //根据id更新用户
    void updateAccountById(Account account);

    //复杂的pojo包装类查询
    List<Account> findAccountVo(AccountVo account);


}
