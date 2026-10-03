package com.muyun.vaadin.antd.charts.common;

import cn.hutool.json.JSONUtil;
import com.vaadin.flow.component.react.ReactAdapterComponent;

import java.util.HashMap;
import java.util.Map;

/**
 * AntComponent
 *
 * @author muyun
 **/
public class BaseAntdChartsComponent<T extends BaseAntdChartsComponent<T>> extends ReactAdapterComponent {

    /**
     * 开启后图表的宽高和容器保持一致
     **/
    public Boolean getAutoFit() {
        return getState("autoFit", Boolean.class);
    }

    /**
     * 开启后图表的宽高和容器保持一致
     *
     * @param autoFit 默认值：false
     **/
    //@SuppressWarnings("unchecked")
    public T setAutoFit(Boolean autoFit) {
        setState("autoFit", autoFit);
        return (T) this;
    }


    /**
     * 设置图表的宽度
     **/
    public Double getWidth() {
        return getState("width", Double.class);
    }

    /**
     * 设置图表的宽度
     *
     * @param width 默认值：640
     **/
    public T setWidth(Number width) {
        setState("width", width);
        return (T) this;
    }


    /**
     * 设置图表的高度
     **/
    public Double getHeight() {
        return getState("height", Double.class);
    }

    /**
     * 设置图表的高度
     *
     * @param height 默认值：480
     **/
    public T setHeight(Number height) {
        setState("height", height);
        return (T) this;
    }


    /**
     * 设置图表的视图样式
     **/
    public String getViewStyle() {
        return getState("viewStyle", String.class);
    }

    /**
     * 设置图表的视图样式
     *
     * @param viewStyle 默认值：详见 viewStyle
     **/
    public T setViewStyle(ViewStyle viewStyle) {
        setState("viewStyle", viewStyle);
        return (T) this;
    }


    /**
     * 设置外边距四个方向的值，优先级别比分别设置低
     **/
    public Double getMargin() {
        return getState("margin", Double.class);
    }

    /**
     * 设置外边距四个方向的值，优先级别比分别设置低
     *
     * @param margin 默认值：16
     **/
    public T setMargin(Number margin) {
        setState("margin", margin);
        return (T) this;
    }


    /**
     * 设置左外边距值
     **/
    public Double getMarginLeft() {
        return getState("marginLeft", Double.class);
    }

    /**
     * 设置左外边距值
     *
     * @param marginLeft 默认值：16
     **/
    public T setMarginLeft(Number marginLeft) {
        setState("marginLeft", marginLeft);
        return (T) this;
    }


    /**
     * 设置上外边距值
     **/
    public Double getMarginTop() {
        return getState("marginTop", Double.class);
    }

    /**
     * 设置上外边距值
     *
     * @param marginTop 默认值：16
     **/
    public T setMarginTop(Number marginTop) {
        setState("marginTop", marginTop);
        return (T) this;
    }


    /**
     * 设置右外边距值
     **/
    public Double getMarginRight() {
        return getState("marginRight", Double.class);
    }

    /**
     * 设置右外边距值
     *
     * @param marginRight 默认值：16
     **/
    public T setMarginRight(Number marginRight) {
        setState("marginRight", marginRight);
        return (T) this;
    }


    /**
     * 设置下外边距值
     **/
    public Double getMarginBottom() {
        return getState("marginBottom", Double.class);
    }

    /**
     * 设置下外边距值
     *
     * @param marginBottom 默认值：16
     **/
    public T setMarginBottom(Number marginBottom) {
        setState("marginBottom", marginBottom);
        return (T) this;
    }


    /**
     * 设置内边距四个方向的值，优先级别比分别设置低
     **/
    public Double getPadding() {
        return getState("padding", Double.class);
    }

    /**
     * 设置内边距四个方向的值，优先级别比分别设置低
     *
     * @param padding 默认值：auto
     **/
    public T setPadding(Number padding) {
        setState("padding", padding);
        return (T) this;
    }


    /**
     * 设置左内边距值
     **/
    public Double getPaddingLeft() {
        return getState("paddingLeft", Double.class);
    }

    /**
     * 设置左内边距值
     *
     * @param paddingLeft 默认值：auto
     **/
    public T setPaddingLeft(Number paddingLeft) {
        setState("paddingLeft", paddingLeft);
        return (T) this;
    }


    /**
     * 设置上内边距值
     **/
    public Double getPaddingTop() {
        return getState("paddingTop", Double.class);
    }

    /**
     * 设置上内边距值
     *
     * @param paddingTop 默认值：auto
     **/
    public T setPaddingTop(Number paddingTop) {
        setState("paddingTop", paddingTop);
        return (T) this;
    }


    /**
     * 设置右内边距值
     **/
    public Double getPaddingRight() {
        return getState("paddingRight", Double.class);
    }

    /**
     * 设置右内边距值
     *
     * @param paddingRight 默认值：auto
     **/
    public T setPaddingRight(Number paddingRight) {
        setState("paddingRight", paddingRight);
        return (T) this;
    }


    /**
     * 设置下内边距值
     **/
    public Double getPaddingBottom() {
        return getState("paddingBottom", Double.class);
    }

    /**
     * 设置下内边距值
     *
     * @param paddingBottom 默认值：auto
     **/
    public T setPaddingBottom(Number paddingBottom) {
        setState("paddingBottom", paddingBottom);
        return (T) this;
    }


    /**
     * 设置呼吸范围四个方向的值，优先级别比分别设置低
     **/
    public Double getInset() {
        return getState("inset", Double.class);
    }

    /**
     * 设置呼吸范围四个方向的值，优先级别比分别设置低
     *
     * @param inset 默认值：0
     **/
    public T setInset(Number inset) {
        setState("inset", inset);
        return (T) this;
    }


    /**
     * 设置左呼吸范围宽度
     **/
    public Double getInsetLeft() {
        return getState("insetLeft", Double.class);
    }

    /**
     * 设置左呼吸范围宽度
     *
     * @param insetLeft 默认值：0
     **/
    public T setInsetLeft(Number insetLeft) {
        setState("insetLeft", insetLeft);
        return (T) this;
    }


    /**
     * 设置上呼吸范围宽度
     **/
    public Double getInsetTop() {
        return getState("insetTop", Double.class);
    }

    /**
     * 设置上呼吸范围宽度
     *
     * @param insetTop 默认值：0
     **/
    public T setInsetTop(Number insetTop) {
        setState("insetTop", insetTop);
        return (T) this;
    }


    /**
     * 设置右呼吸范围宽度
     **/
    public Double getInsetRight() {
        return getState("insetRight", Double.class);
    }

    /**
     * 设置右呼吸范围宽度
     *
     * @param insetRight 默认值：0
     **/
    public T setInsetRight(Number insetRight) {
        setState("insetRight", insetRight);
        return (T) this;
    }


    /**
     * 设置下呼吸范围宽度
     **/
    public Double getInsetBottom() {
        return getState("insetBottom", Double.class);
    }

    /**
     * 设置下呼吸范围宽度
     *
     * @param insetBottom 默认值：0
     **/
    public T setInsetBottom(Number insetBottom) {
        setState("insetBottom", insetBottom);
        return (T) this;
    }


    /**
     * 获取属性值
     *
     * @return
     */
    public String getPropertiesJson() {
        Map<String, Object> propertyMap = new HashMap<>();
        getElement().getPropertyNames().forEach(name -> {
            Object value = getState(name, Object.class);
            propertyMap.put(name, value);
        });
        return JSONUtil.toJsonPrettyStr(propertyMap);
    }

}
