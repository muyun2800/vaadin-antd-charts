package com.muyun.vaadin.antd.charts.gauge.event;


import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.react.ReactAdapterComponent;
import lombok.Getter;
import lombok.ToString;

/**
 *
 */
@DomEvent("gaugeReady")
@Getter
@ToString
public class GaugeReadyEvent extends ComponentEvent<ReactAdapterComponent> {


    public GaugeReadyEvent(ReactAdapterComponent source, boolean fromClient) {
        super(source, fromClient);
    }


}
