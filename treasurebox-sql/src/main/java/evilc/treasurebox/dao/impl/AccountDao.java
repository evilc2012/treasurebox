package evilc.treasurebox.dao.impl;

import evilc.treasurebox.dao.IAccountDao;
import evilc.treasurebox.domain.Account;
import evilc.treasurebox.extension.DaoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/4/21.
 */

@Repository
public class AccountDao extends DaoTemplate<Account> implements IAccountDao {

    public Account getAccountById(long id) {
        return queryById(id);
    }

}
