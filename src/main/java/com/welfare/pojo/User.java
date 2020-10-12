package com.welfare.pojo;

import java.util.Date;

public class User {
    private int id;
    private Date createTime;
    private int create_by;
    private Date update_time;
    private int update_by;
    private int is_deleted;
    private String nickname;
    private String username;
    private String password;
    private int sex;
    private String email;
    private String phone_number;
    private String user_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCreate_by() {
        return create_by;
    }

    public void setCreate_by(int create_by) {
        this.create_by = create_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public int getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(int update_by) {
        this.update_by = update_by;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public User() {
    }

    public User(int id, Date createTime, int create_by, Date update_time, int update_by, int is_deleted, String nickname, String username, String password, int sex, String email, String phone_number, String user_code) {
        this.id = id;
        this.createTime = createTime;
        this.create_by = create_by;
        this.update_time = update_time;
        this.update_by = update_by;
        this.is_deleted = is_deleted;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.email = email;
        this.phone_number = phone_number;
        this.user_code = user_code;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", create_by=" + create_by +
                ", update_time=" + update_time +
                ", update_by=" + update_by +
                ", is_deleted=" + is_deleted +
                ", nickname='" + nickname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", user_code='" + user_code + '\'' +
                '}';
    }

}
