package com.hippo.fresh.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "notice") //@Table来指定和哪个数据表对应;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Notice {
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long id;//通知id

    @Column
    private Long userId;//用户id

    @Column
    private String message;//通知消息

    @Column
    private Long productId;//商品id

    @Column
    private String productName;//商品名称

    @Column
    private String productPicture;//商品图片

    @Column
    private Double oldPrice;//商品加入购物车价格

    @Column
    private Double currentPrice;//商品当前价格

    @Column
    private BigDecimal percentage;//商品降价百分比

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;//通知创建时间

    @Column
    private Integer isread;//消息是否已读 0：已读，1：未读

    public Notice(Long userId, String message, Timestamp createTime, Integer isread) {
        this.userId = userId;
        this.message = message;
        this.createTime = createTime;
        this.isread = isread;
    }

    public Notice(Long userId, String message, Long productId,String productName,String productPicture, Double oldPrice,
                  Double currentPrice,BigDecimal percentage,Timestamp createTime, Integer isread) {
        this.userId = userId;
        this.message = message;
        this.productId = productId;
        this.productName = productName;
        this.productPicture = productPicture;
        this.oldPrice = oldPrice;
        this.currentPrice = currentPrice;
        this.percentage = percentage;
        this.createTime = createTime;
        this.isread = isread;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }
}
