package com.muyun.vaadin.antd.charts.demo.view.area;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * AreaUtils
 *
 * @author muyun
 **/
public class AreaUtils {

    public static List<DataItem> getAreaData() {
        List<DataItem> list1 = List.of(
                new DataItem("2007-04-23T00:00:00.000Z", 93.24),
                new DataItem("2007-04-24T00:00:00.000Z", 95.35),
                new DataItem("2007-04-25T00:00:00.000Z", 98.84),
                new DataItem("2007-04-26T00:00:00.000Z", 99.92),
                new DataItem("2007-04-29T00:00:00.000Z", 99.8),
                new DataItem("2007-05-01T00:00:00.000Z", 99.47),
                new DataItem("2007-05-02T00:00:00.000Z", 100.39),
                new DataItem("2007-05-03T00:00:00.000Z", 100.4),
                new DataItem("2007-05-04T00:00:00.000Z", 100.81),
                new DataItem("2007-05-07T00:00:00.000Z", 103.92),
                new DataItem("2007-05-08T00:00:00.000Z", 105.06),
                new DataItem("2007-05-09T00:00:00.000Z", 106.88)
        );
        //
        return list1.stream().map(item ->
        {
            DateTime dateTime = DateUtil.parse(item.getDate());
            // 格式化为 月-日
            String date = DateUtil.format(dateTime, "MM-dd");
            return new DataItem(date, item.getClose());
        }).toList();
    }


    @Data
    @Accessors(chain = true)
    public static class DataItem {
        private String date;
        private Number close;

        public DataItem(String date, Number close) {
            this.date = date;
            this.close = close;
        }
    }
}