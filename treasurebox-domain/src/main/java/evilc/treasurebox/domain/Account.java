package evilc.treasurebox.domain;

import evilc.treasurebox.annotation.dao.Column;
import evilc.treasurebox.annotation.dao.Table;

/**
 * Created by Administrator on 2016/4/21.
 */

@Table(name = "account")
public class Account extends BaseDomain {

    private String username;
    private String password;
    private String nickname;

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
