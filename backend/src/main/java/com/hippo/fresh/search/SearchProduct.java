package com.hippo.fresh.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.sql.Timestamp;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//指定ES中index名
@Document(indexName = "productindex")
@Setting(settingPath = "ESSetting.json")
public class SearchProduct{
    @Id // 主键
    private String id;//id

    @Field(type = FieldType.Long, name = "productId")
    private Long productId;//商品id

    @Field(type = FieldType.Text, name = "categoryFirst")
    private String categoryFirst;//商品一级目录

    @Field(type = FieldType.Text, name = "categorySecond")
    private String categorySecond;//商品二级目录

    @Field(type = FieldType.Text, name = "name", analyzer = "ik_pinyin_analyzer")
    private String name;//商品名

    @Field(type = FieldType.Double, name = "price")
    private Double price;//商品单价

    @Field(type = FieldType.Text, name = "detail")
    private String detail;//商品详细信息

    @Field(type = FieldType.Long, name = "salesAmount")
    private Long salesAmount;//商品销售量

    @Field(type = FieldType.Text, name = "pictureUrl")
    private String pictureUrl;

    @Field(type = FieldType.Integer, name = "status")
    private Integer status;//商品目录id

    @Field(type = FieldType.Double, name = "score")
    private Double score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
