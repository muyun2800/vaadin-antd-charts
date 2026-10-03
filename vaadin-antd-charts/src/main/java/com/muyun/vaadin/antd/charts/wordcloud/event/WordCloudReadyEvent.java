package com.muyun.vaadin.antd.charts.wordcloud.event;


import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.react.ReactAdapterComponent;
import lombok.Getter;
import lombok.ToString;

/**
 *
 */
@DomEvent("wordCloudReady")
@Getter
@ToString
public class WordCloudReadyEvent extends ComponentEvent<ReactAdapterComponent> {


    public WordCloudReadyEvent(ReactAdapterComponent source, boolean fromClient) {
        super(source, fromClient);
    }


}
