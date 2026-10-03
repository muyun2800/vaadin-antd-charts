package com.muyun.vaadin.antd.charts.pie.event;


import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.react.ReactAdapterComponent;
import lombok.Getter;
import lombok.ToString;

/**
 *
 */
@DomEvent("pieReady")
@Getter
@ToString
public class PieReadyEvent extends ComponentEvent<ReactAdapterComponent> {


    public PieReadyEvent(ReactAdapterComponent source, boolean fromClient) {
        super(source, fromClient);
    }


}
