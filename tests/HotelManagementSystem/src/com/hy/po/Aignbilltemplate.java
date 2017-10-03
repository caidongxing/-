package com.hy.po;

public class Aignbilltemplate {
    private Integer signbilltemplateid;

    private String templatename;

    private String comment;

    public Integer getSignbilltemplateid() {
        return signbilltemplateid;
    }

    public void setSignbilltemplateid(Integer signbilltemplateid) {
        this.signbilltemplateid = signbilltemplateid;
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename == null ? null : templatename.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}