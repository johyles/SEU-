package com.hippo.fresh.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//指定ES中index名
@Document(indexName = "suggestion")
@Setting(settingPath = "ESSetting.json")
public class SearchSuggestion {
    @Id // 主键
    private String id;//id

    @Field(type = FieldType.Text, name = "name", analyzer = "ik_pinyin_analyzer")
    private String name;//商品名

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
