package com.muyun.vaadin.antd.charts.area.event;


import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.react.ReactAdapterComponent;
import lombok.Getter;
import lombok.ToString;

/**
 *
 */
@DomEvent("areaReady")
@Getter
@ToString
public class AreaReadyEvent extends ComponentEvent<ReactAdapterComponent> {


    public AreaReadyEvent(ReactAdapterComponent source, boolean fromClient) {
        super(source, fromClient);
    }


}
