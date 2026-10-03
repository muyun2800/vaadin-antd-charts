package com.muyun.vaadin.antd.charts.demo.view.line;


import com.muyun.vaadin.antd.charts.common.option.Axis;
import com.muyun.vaadin.antd.charts.common.option.data.Data;
import com.muyun.vaadin.antd.charts.line.Line;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import java.util.HashMap;
import java.util.Map;

/**
 * @author muyun
 */
@Route("demo/line4")
@SuppressWarnings("java:S1199")
public class LineView4Axis extends Div {


    public LineView4Axis() {
        Line line = new Line()
                .setData(new Data()
                        .setType("fetch")
                        .setValue("https://gw.alipayobjects.com/os/bmw-prod/55424a73-7cb8-4f79-b60d-3ab627ac5698.json"))
                .setXField("year")
                .setYField("value")
                .setSizeField("value")
                .setColorField("category");
        // 不显示坐标
        //  line .setAxis( false);
        // 不显示x坐标
        // line.setAxis(Collections.singletonMap("x", false));

        // 分别设置x和y坐标
        Map<String, Object> axisMap = new HashMap<>();
        axisMap.put("x", new Axis().setTitle(false));
        axisMap.put("y", new Axis()
                .setTitle(false)
                .setGridStroke("#ee7009")
                .setGridLineDash(null)
                .setGridOpacity(1));
        line.setAxis(axisMap);

        super.add(line);
    }

}
