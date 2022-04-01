package com.hippo.fresh.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "cart") //@Table来指定和哪个数据表对应;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Cart {

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long id;//购物车id

    @Column
    private Long userId;//用户id

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
    private Double lowestPrice;//商品加入购物车以来的最低价格

    @Column
    private Long quantity;//商品数量

    @Column
    private Integer status;//商品状态


    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;//商品创建时间

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp updateTime;//商品更新时间

    @Column
    private Integer notifyTen;//商品降价10%通知

    @Column
    private Integer notifyTwenty;//商品降价20%通知

    @Column
    private Integer notifyThirty;//商品降价30%通知

    @Column
    private Integer notifyLowest;//商品最低价格通知

    public Cart(Long id, Long productId, Long quantity) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Cart(Long userId, Long productId, String productName, String productPicture, Double oldPrice, Double currentPrice, Double lowestPrice, Long quantity, Integer status, Timestamp createTime, Timestamp updateTime, Integer notifyTen, Integer notifyTwenty, Integer notifyThirty, Integer notifyLowest) {
        this.userId = userId;
        this.productId = productId;
        this.productName = productName;
        this.productPicture = productPicture;
        this.oldPrice = oldPrice;
        this.currentPrice = currentPrice;
        this.lowestPrice = lowestPrice;
        this.quantity = quantity;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.notifyTen = notifyTen;
        this.notifyTwenty = notifyTwenty;
        this.notifyThirty = notifyThirty;
        this.notifyLowest = notifyLowest;
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

    public Double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getNotifyTen() {
        return notifyTen;
    }

    public void setNotifyTen(Integer notifyTen) {
        this.notifyTen = notifyTen;
    }

    public Integer getNotifyTwenty() {
        return notifyTwenty;
    }

    public void setNotifyTwenty(Integer notifyTwenty) {
        this.notifyTwenty = notifyTwenty;
    }

    public Integer getNotifyThirty() {
        return notifyThirty;
    }

    public void setNotifyThirty(Integer notifyThirty) {
        this.notifyThirty = notifyThirty;
    }

    public Integer getNotifyLowest() {
        return notifyLowest;
    }

    public void setNotifyLowest(Integer notifyLowest) {
        this.notifyLowest = notifyLowest;
    }
}
