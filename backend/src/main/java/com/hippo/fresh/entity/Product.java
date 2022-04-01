package com.hippo.fresh.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
    @Table(name = "product") //@Table来指定和哪个数据表对应;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long id;//商品id

    @Column
    private String categoryFirst;//商品一级目录

    @Column
    private String categorySecond;//商品二级目录

    @Column
    private String name;//商品名称

    @Column
    private String picture;//商品图片

    @Column
    private String pictureUrl;//商品图片url

    @Column
    private String pictureUrlTwo;//商品图片url2

    @Column
    private String pictureUrlThree;//商品图片url3

    @Column
    private String pictureUrlFour;//商品图片url4

    @Column
    private String originPlace;//商品产地

    @Column
    private Double price;//商品单价

    @Column
    private Long stock;//商品库存

    @Column
    private String detail;//商品详细信息

    @Column
    private Integer status;//商品状态，1-在售 2-下架

    @Column
//    @Field(type = FieldType.Long, name = "salesAmount")
    private Long salesAmount;//商品销售量

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp create_time;//商品创建时间

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp updateTime;//商品更新时间

    @Column
    private Long commentNum;//评论数

    @Column
    private Long  commentScore;//总评分

    @Column
    private Double score;//评分

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryFirst() {
        return categoryFirst;
    }

    public void setCategoryFirst(String categoryFirst) {
        this.categoryFirst = categoryFirst;
    }

    public String getCategorySecond() {
        return categorySecond;
    }

    public void setCategorySecond(String categorySecond) {
        this.categorySecond = categorySecond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPictureUrlTwo() {
        return pictureUrlTwo;
    }

    public void setPictureUrlTwo(String pictureUrlTwo) {
        this.pictureUrlTwo = pictureUrlTwo;
    }

    public String getPictureUrlThree() {
        return pictureUrlThree;
    }

    public void setPictureUrlThree(String pictureUrlThree) {
        this.pictureUrlThree = pictureUrlThree;
    }

    public String getPictureUrlFour() {
        return pictureUrlFour;
    }

    public void setPictureUrlFour(String pictureUrlFour) {
        this.pictureUrlFour = pictureUrlFour;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
    }

    public Timestamp getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Timestamp createTime) {
        this.create_time = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Long commentNum) {
        this.commentNum = commentNum;
    }

    public Long getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(Long commentScore) {
        this.commentScore = commentScore;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
