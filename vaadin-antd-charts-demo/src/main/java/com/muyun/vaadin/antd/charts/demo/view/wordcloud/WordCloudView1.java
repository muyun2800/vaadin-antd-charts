package com.muyun.vaadin.antd.charts.demo.view.wordcloud;


import com.muyun.vaadin.antd.charts.wordcloud.WordCloud;
import com.muyun.vaadin.antd.charts.wordcloud.WordCloudLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import static com.muyun.vaadin.antd.charts.demo.view.wordcloud.WordCloudUtils.getWorldCloudData;

/**
 * @author muyun
 */
@Route("demo/word-cloud1")
@SuppressWarnings("java:S1199")
public class WordCloudView1 extends Div {

    public WordCloudView1() {
        WordCloud wordCloud = new WordCloud()
                .setData(getWorldCloudData())
                .setHeight(200)
                .setWidth(200)
                .setTextField("word")
                .setColorField("word")
                .setLayout(new WordCloudLayout()
                        .setSpiral("rectangular")
                        .setFontSize(new Integer[]{10, 20}));
        // layout={{ spiral: "rectangular", fontSize: [10, 20] }}
        //
        add(wordCloud);


    }


}
