package com.itcast;

import com.itcast.pojo.Account;
import com.itcast.pojo.AccountVo;
import com.itcast.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:applicationContext.xml")
public class TestSpringMybatis {

    @Autowired
    private AccountService as;

    @Test
    public void testFindAll(){
       List<Account> accounts= as.findAll();
       for(Account account:accounts){
           System.out.println(account);
       }
    }

    @Test
    public void testFindAccountById(){
        Integer i=1;
        Account account =as.findAccountById(i);
        System.out.println(account);
    }

    @Test
    public void findAccountNameMoney(){
        Account account=as.findAccountNameMoney("bbb",1000f);
        System.out.println(account);
    }

    @Test
    public void testFindAccountLikeName(){
        List<Account> accounts =as.findAccountLikeName("c");
        for (Account account:accounts){
            System.out.println(account);
        }

    }

    @Test
    public void  testSaveAccount(){
        Account account =new Account();
        account.setName("ddd");
        account.setMoney(1000f);

        as.saveAccount(account);
        System.out.println(account.getId());
    }

    @Test
    public void testDeleteAccountById(){
        as.deleteAccountById(14);
    }

    @Test
    public  void testUpdateAccountById(){
        Account account=new Account();
        account.setId(13);
        account.setName("test");
        account.setMoney(999);

        as.updateAccountById(account);
    }

    @Test
    public void  testFindAccountVo(){

        AccountVo accountVo = new AccountVo();
        Account account1 = new Account();

        account1.setName("aaa");
        account1.setMoney(1000f);

        accountVo.setAccount(account1);

        List<Account> accounts=as.findAccountVo(accountVo);
        for(Account account2:accounts){
            System.out.println(account2);
        }
    }

}
