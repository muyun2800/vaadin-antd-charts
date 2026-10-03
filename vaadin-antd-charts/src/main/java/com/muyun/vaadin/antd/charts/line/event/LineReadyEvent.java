package com.muyun.vaadin.antd.charts.line.event;


import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.react.ReactAdapterComponent;
import lombok.Getter;
import lombok.ToString;

/**
 *
 */
@DomEvent("lineReady")
@Getter
@ToString
public class LineReadyEvent extends ComponentEvent<ReactAdapterComponent> {


    public LineReadyEvent(ReactAdapterComponent source, boolean fromClient) {
        super(source, fromClient);
    }


}
