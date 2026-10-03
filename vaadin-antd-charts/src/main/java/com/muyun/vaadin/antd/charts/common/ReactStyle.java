//package com.muyun.vaadin.antd.charts.common;
//
//import cn.hutool.core.text.CharSequenceUtil;
//import com.vaadin.flow.component.react.ReactAdapterComponent;
//import com.vaadin.flow.dom.Style;
//import com.vaadin.flow.internal.JsonUtils;
//
//import java.util.HashMap;
//import java.util.stream.Stream;
//
///**
// * 它对应 React.CSSProperties
// *
// * @author muyun
// **/
//public class ReactStyle implements Style {
//
//
//    HashMap<String, Object> styleMap = new HashMap<>();
//
//    ReactAdapterComponent adapterComponent;
//
//    public ReactStyle(ReactAdapterComponent adapterComponent) {
//        this.adapterComponent = adapterComponent;
//    }
//
//    public ReactStyle() {
//    }
//
//
//    public HashMap<String, Object> getStyleMap() {
//        return styleMap;
//    }
//
//
//    @Override
//    public String get(String name) {
//        return styleMap.getOrDefault(name, "").toString();
//    }
//
//    @Override
//    public Style set(String name, String value) {
//        // 由于 tsx侧的 key是驼峰命名，所以这里需要做一下转换
//        String newKey = CharSequenceUtil.toCamelCase(name, '-');
//        styleMap.put(newKey, value);
//        if (adapterComponent != null) {
//            adapterComponent.getElement().setPropertyJson("reactStyle", JsonUtils.writeValue(styleMap));
//        }
//        return this;
//    }
//
//    @Override
//    public Style remove(String name) {
//        styleMap.remove(name);
//        return this;
//    }
//
//    @Override
//    public Style clear() {
//        styleMap.clear();
//        return this;
//    }
//
//    @Override
//    public boolean has(String name) {
//        return styleMap.containsKey(name);
//    }
//
//    @Override
//    public Stream<String> getNames() {
//        return styleMap.keySet().stream();
//    }
//}