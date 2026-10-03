package com.muyun.vaadin.antd.charts.demo.view.column;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * ColumnUtils
 *
 * @author muyun
 **/
public class ColumnUtils {

    public static List<DataItem> getColumnData() {
        return List.of(
                new DataItem("1-3秒", 0.6),
                new DataItem("4-10秒", 1.0),
                new DataItem("11-30秒", 0.7),
                new DataItem("31-60秒", 0.5),
                new DataItem("1-3分", 0.2),
                new DataItem("3-10分", 0.5),
                new DataItem("10-30分", 0.3),
                new DataItem("30+分", 0.25)

        );
    }


    @Data
    @Accessors(chain = true)
    public static class DataItem {
        private String type;
        private Number value;

        public DataItem(String type, Number value) {
            this.type = type;
            this.value = value;
        }
    }
}