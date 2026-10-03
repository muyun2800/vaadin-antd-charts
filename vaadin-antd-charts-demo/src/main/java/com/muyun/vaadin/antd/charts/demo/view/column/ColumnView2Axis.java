package com.muyun.vaadin.antd.charts.demo.view.column;


import com.muyun.vaadin.antd.charts.column.Column;
import com.muyun.vaadin.antd.charts.common.option.Axis;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import java.util.HashMap;
import java.util.Map;

import static com.muyun.vaadin.antd.charts.demo.view.column.ColumnUtils.getColumnData;

/**
 * @author muyun
 */
@Route("demo/column2")
@SuppressWarnings("java:S1199")
public class ColumnView2Axis extends Div {

    public ColumnView2Axis() {
        Column column = new Column()
                .setData(getColumnData())
                .setXField("type")
                .setYField("value");
        //
        // 分别设置x和y坐标
        Map<String, Object> axisMap = new HashMap<>();
        axisMap.put("x", new Axis().setTitle(false));
        axisMap.put("y", new Axis().setGridStroke("#ee7009")
                                   .setGridLineDash(null)
                                   .setGridOpacity(1.0));
        column.setAxis(axisMap);

        //
        add(column);


    }
}
