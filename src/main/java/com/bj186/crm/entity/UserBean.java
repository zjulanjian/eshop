package com.bj186.crm.entity;

public class UserBean {
    //  隐藏字段
    private int id;
    //  用户名
    private String username;
    //  密码
    private String password;
    //  文本域
    private String textarea;
    //  多选框 单选
    private boolean checkbox;
    //  多选框 多选
    private String [] checkboxes;
    //  单选框
    private String sex;
    //  下拉菜单
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }

    public String[] getCheckboxes() {
        return checkboxes;
    }

    public void setCheckboxes(String[] checkboxes) {
        this.checkboxes = checkboxes;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
