package com.muyun.vaadin.antd.charts.demo.view.line;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * LineUtils
 *
 * @author muyun
 **/
public class LineUtils {

    public static List<DataItem> getLineData() {
        return List.of(
                new DataItem("1991", 3.0),
                new DataItem("1992", 4.0),
                new DataItem("1993", 3.5),
                new DataItem("1994", 5.0),
                new DataItem("1995", 4.9),
                new DataItem("1996", 6.0),
                new DataItem("1997", 7.0),
                new DataItem("1998", 9.0),
                new DataItem("1999", 13.0)
        );
    }


    @Data
    @Accessors(chain = true)
    public static class DataItem {
        private String year;
        private Number value;

        public DataItem(String year, Number value) {
            this.year = year;
            this.value = value;
        }
    }
}