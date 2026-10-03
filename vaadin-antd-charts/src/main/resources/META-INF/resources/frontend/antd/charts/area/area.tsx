//import { ReactAdapterElement, RenderHooks } from 'Frontend/generated/flow/ReactAdapter';
import { ReactAdapterElement, RenderHooks } from '../common/ReactAdapter';
import { JSXElementConstructor, ReactElement, useRef } from 'react';
import React from 'react';
import { Area, Chart } from '@ant-design/charts';
import useCommonProps from '../common/common-props';

class AntdAreaElement extends ReactAdapterElement {
    protected override render(hooks: RenderHooks): ReactElement | null {
        const [data, setData] = hooks.useState<string>('data');
        const [xField, setXField] = hooks.useState<string>('xField');
        const [yField, setYField] = hooks.useState<string>('yField');
        const [seriesField, setSeriesField] = hooks.useState<string>('seriesField');
        const [colorField, setColorField] = hooks.useState<string>('colorField');
        const [shapeField, setShapeField] = hooks.useState<string>('shapeField');
        const [sizeField, setSizeField] = hooks.useState<string>('sizeField');
        const [line, setLine] = hooks.useState<any>('line');
        const [point, setPoint] = hooks.useState<any>('point');
        const [stack, setStack] = hooks.useState<boolean>('stack');
        //const [percent, setPercent] = hooks.useState<any>('percent');
        //const [symmetry, setSymmetry] = hooks.useState<boolean>('symmetry');
        // const [diff, setDiff] = hooks.useState<boolean>('diff');
        const [title, setTitle] = hooks.useState<string>('title');
        const [axis, setAxis] = hooks.useState<string>('axis');
        const [legend, setLegend] = hooks.useState<string>('legend');
        const [scrollbar, setScrollbar] = hooks.useState<string>('scrollbar');
        const [slider, setSlider] = hooks.useState<string>('slider');
        const [label, setLabel] = hooks.useState<any>('label');
        const [tooltip, setTooltip] = hooks.useState<string>('tooltip');
        const [chartStyle, setChartStyle] = hooks.useState<string>('chartStyle');
        const [theme, setTheme] = hooks.useState<string>('theme');
        const [scale, setScale] = hooks.useState<string>('scale');
        // const [animate, setAnimate] = hooks.useState<string>('animate');
        const [interaction, setInteraction] = hooks.useState<string>('interaction');
        // const [state, setState] = hooks.useState<string>('state');
        const [annotations, setAnnotations] = hooks.useState<any>('annotations');

        // event
        const fireReadyEvent = hooks.useCustomEvent<unknown>('areaReady');
        const onReady = (e: Chart) => {
            fireReadyEvent({});
        };

        const { commonGetters, commonSetters } = useCommonProps(hooks);

        return (
        <Area
        data={data}
        xField={xField}
        yField={yField}
        seriesField={seriesField}
        colorField={colorField}
        shapeField={shapeField}
        sizeField={sizeField}
        line={line}
        point={point}
        stack={stack}
        // percent={percent}
        // symmetry={symmetry}
        // diff={diff}
        title={title}
        axis={axis}
        legend={legend}
        scrollbar={scrollbar}
        slider={slider}
        label={label}
        tooltip={tooltip}
        style={chartStyle}
        theme={theme}
        scale={scale}
        //animate={animate}
        interaction={interaction}
        // state={state}
        annotations={annotations}
        // reactNode
        // event
        onReady={onReady}
        // 公共的属性
    {...commonGetters}></Area>
);
}
}

customElements.define('antd-charts-area', AntdAreaElement);
