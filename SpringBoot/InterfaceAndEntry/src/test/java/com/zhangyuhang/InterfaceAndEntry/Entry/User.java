package com.zhangyuhang.InterfaceAndEntry.Entry;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String userid;

    private String username;

    private String name;

    private String password;

    private String effectsign;

    private String tel;

    private Date datatime;

    private String userflg;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEffectsign() {
        return effectsign;
    }

    public void setEffectsign(String effectsign) {
        this.effectsign = effectsign == null ? null : effectsign.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public String getUserflg() {
        return userflg;
    }

    public void setUserflg(String userflg) {
        this.userflg = userflg == null ? null : userflg.trim();
    }
}