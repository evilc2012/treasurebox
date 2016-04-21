package evilc.treasurebox.service.impl;

import evilc.treasurebox.dao.IAccountDao;
import evilc.treasurebox.domain.Account;
import evilc.treasurebox.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/4/21.
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountDao accountDao;

    public Account getAccountById(long id) {
        return accountDao.getAccountById(id);
    }

}
