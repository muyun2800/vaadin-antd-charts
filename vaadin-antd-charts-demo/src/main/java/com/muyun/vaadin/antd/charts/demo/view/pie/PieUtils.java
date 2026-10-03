package com.muyun.vaadin.antd.charts.demo.view.pie;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * PieUtils
 *
 * @author muyun
 **/
public class PieUtils {
    public List<DataItem> getPieData() {
        return List.of(
                new DataItem("分类一", 27.0),
                new DataItem("分类二", 25.0),
                new DataItem("分类三", 18.0),
                new DataItem("分类四", 15.0),
                new DataItem("分类五", 10.0),
                new DataItem("其他", 5.0)
        );
    }


    @Data
    @Accessors(chain = true)
    public class DataItem {
        private String type;
        private Number value;

        public DataItem(String type, Number value) {
            this.type = type;
            this.value = value;
        }
    }
}