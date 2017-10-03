package com.gx.po.user;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String certificatepassword;

    private Boolean ifdisable;

    private Boolean firstlogin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCertificatepassword() {
        return certificatepassword;
    }

    public void setCertificatepassword(String certificatepassword) {
        this.certificatepassword = certificatepassword == null ? null : certificatepassword.trim();
    }

    public Boolean getIfdisable() {
        return ifdisable;
    }

    public void setIfdisable(Boolean ifdisable) {
        this.ifdisable = ifdisable;
    }

    public Boolean getFirstlogin() {
        return firstlogin;
    }

    public void setFirstlogin(Boolean firstlogin) {
        this.firstlogin = firstlogin;
    }
}