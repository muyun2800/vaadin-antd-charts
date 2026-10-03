package com.muyun.vaadin.antd.charts.column.event;


import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.react.ReactAdapterComponent;
import lombok.Getter;
import lombok.ToString;

/**
 *
 */
@DomEvent("columnReady")
@Getter
@ToString
public class ColumnReadyEvent extends ComponentEvent<ReactAdapterComponent> {


    public ColumnReadyEvent(ReactAdapterComponent source, boolean fromClient) {
        super(source, fromClient);
    }


}
