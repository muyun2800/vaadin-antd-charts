package com.muyun.vaadin.antd.charts.liquid.event;


import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.react.ReactAdapterComponent;
import lombok.Getter;
import lombok.ToString;

/**
 *
 */
@DomEvent("liquidReady")
@Getter
@ToString
public class LiquidReadyEvent extends ComponentEvent<ReactAdapterComponent> {


    public LiquidReadyEvent(ReactAdapterComponent source, boolean fromClient) {
        super(source, fromClient);
    }


}
