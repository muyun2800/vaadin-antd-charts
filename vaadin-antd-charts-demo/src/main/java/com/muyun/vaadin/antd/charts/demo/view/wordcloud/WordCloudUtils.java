package com.muyun.vaadin.antd.charts.demo.view.wordcloud;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * WordCloudUtils
 *
 * @author muyun
 **/
public class WordCloudUtils {

    public static List<WordCloudDataItem> getWorldCloudData() {
        return List.of(
                new WordCloudDataItem(1, "上海市", 20F),
                new WordCloudDataItem(2, "天津市", 2F),
                new WordCloudDataItem(3, "九江市", 3F),
                new WordCloudDataItem(4, "北京市", 30F),
                new WordCloudDataItem(5, "重庆市", 15F),
                new WordCloudDataItem(6, "丹东市", 5F),
                new WordCloudDataItem(7, "黄山市", 8F),
                new WordCloudDataItem(8, "安康市", 18F),
                new WordCloudDataItem(9, "菏泽市", 41F),
                new WordCloudDataItem(10, "福州市", 6F),
                new WordCloudDataItem(11, "贵阳市", 7F),
                new WordCloudDataItem(12, "广州市", 25F),
                new WordCloudDataItem(13, "深圳市", 28F),
                new WordCloudDataItem(14, "杭州市", 22F),
                new WordCloudDataItem(15, "南京市", 19F),
                new WordCloudDataItem(16, "武汉市", 17F),
                new WordCloudDataItem(17, "成都市", 21F),
                new WordCloudDataItem(18, "西安市", 16F),
                new WordCloudDataItem(19, "苏州市", 14F),
                new WordCloudDataItem(20, "青岛市", 12F),
                new WordCloudDataItem(21, "郑州市", 13F),
                new WordCloudDataItem(22, "长沙市", 11F),
                new WordCloudDataItem(23, "昆明市", 9F),
                new WordCloudDataItem(24, "大连市", 10F),
                new WordCloudDataItem(25, "厦门市", 8F),
                new WordCloudDataItem(26, "宁波市", 15F),
                new WordCloudDataItem(27, "合肥市", 12F),
                new WordCloudDataItem(28, "南昌市", 7F),
                new WordCloudDataItem(29, "石家庄市", 6F),
                new WordCloudDataItem(30, "太原市", 5F),
                new WordCloudDataItem(31, "长春市", 9F),
                new WordCloudDataItem(32, "哈尔滨市", 11F),
                new WordCloudDataItem(33, "沈阳市", 10F),
                new WordCloudDataItem(34, "济南市", 14F),
                new WordCloudDataItem(35, "唐山市", 4F),
                new WordCloudDataItem(36, "温州市", 13F),
                new WordCloudDataItem(37, "佛山市", 16F),
                new WordCloudDataItem(38, "东莞市", 18F),
                new WordCloudDataItem(39, "无锡市", 12F),
                new WordCloudDataItem(40, "常州市", 8F)
        );
    }


    @Data
    @Accessors(chain = true)
    public static class WordCloudDataItem {
        private Integer id;
        private String word;
        private Float weight;

        public WordCloudDataItem(Integer id, String word, Float weight) {
            this.id = id;
            this.word = word;
            this.weight = weight;
        }
    }
}