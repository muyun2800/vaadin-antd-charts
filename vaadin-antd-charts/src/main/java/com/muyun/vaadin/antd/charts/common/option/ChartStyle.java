package com.muyun.vaadin.antd.charts.common.option;

import cn.hutool.core.text.CharSequenceUtil;

import java.util.HashMap;

/**
 * 参见：https://ant-design-charts.antgroup.com/options/plots/style
 *
 * @author muyun
 **/
public class ChartStyle extends HashMap<String, Object> {


    public ChartStyle() {
    }


    //    @Override
    public ChartStyle set(String name, Object value) {
        // 由于 tsx侧的 key是驼峰命名，所以这里需要做一下转换
        String newKey = CharSequenceUtil.toCamelCase(name, '-');
        super.put(newKey, value);
        return this;
    }


}