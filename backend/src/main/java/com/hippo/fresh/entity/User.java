package com.hippo.fresh.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user") //@Table来指定和哪个数据表对应;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User<name> {

    @Id// 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long id;//用户id

    @Column
    private String username;// 用户名

    @JsonIgnore  //返回时排除掉这个字段
    @Column
    private String password;// 密码

    @Column
    private String email;// 用户邮箱

    @Column
    private String phone;// 用户电话

    @Column
    private String avatar;// 用户头像

    @Column
    private String gender;//用户性别

    @Column
    private Long age;//用户年龄

    @Column
    private String food_preference;//用户食物偏好

    @Column
    private String signature;// 用户签名

    @Column
    private String hometown;// 用户籍贯

    @Column
    private String resident_area;// 用户常住地区

    @Column
    private String label;// 用户标签

    @Column
    private Integer status;// 用户标签

    @Column(name = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;//用户创建时间

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    //用户名、用户密码、用户邮箱构造函数
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.status =1;
    }

    public User(String username, String password, String email, Timestamp createTime) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.createTime = createTime;
        this.status =1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getFoodPreference() {
        return food_preference;
    }

    public void setFoodPreference(String food_preference) {
        this.food_preference = food_preference;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getResidentArea() {
        return resident_area;
    }

    public void setResidentArea(String resident_area) {
        this.resident_area = resident_area;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
