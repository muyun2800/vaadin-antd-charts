//import { ReactAdapterElement, RenderHooks } from 'Frontend/generated/flow/ReactAdapter';
import { ReactAdapterElement, RenderHooks } from '../common/ReactAdapter';
import { ReactElement } from 'react';
import { Chart, Column } from '@ant-design/charts';
import useCommonProps from '../common/common-props';
class AntdColumnElement extends ReactAdapterElement {
    protected override render(hooks: RenderHooks): ReactElement | null {
        const [data, setData] = hooks.useState<string>('data');
        const [xField, setXField] = hooks.useState<string>('xField');
        const [yField, setYField] = hooks.useState<string>('yField');
        const [seriesField, setSeriesField] = hooks.useState<string>('seriesField');
        const [colorField, setColorField] = hooks.useState<string>('colorField');
        const [stack, setStack] = hooks.useState<boolean>('stack');
        const [group, setGroup] = hooks.useState<boolean>('group');
        const [percent, setPercent] = hooks.useState<boolean>('percent');
        const [conversionTag, setConversionTag] = hooks.useState<string>('conversionTag');
        const [markBackground, setMarkBackground] = hooks.useState<string>('markBackground');
        const [title, setTitle] = hooks.useState<string>('title');
        const [axis, setAxis] = hooks.useState<string>('axis');
        const [legend, setLegend] = hooks.useState<string>('legend');
        const [scrollbar, setScrollbar] = hooks.useState<string>('scrollbar');
        const [slider, setSlider] = hooks.useState<string>('slider');
        const [label, setLabel] = hooks.useState<string>('label');
        const [tooltip, setTooltip] = hooks.useState<string>('tooltip');
        const [chartStyle, setChartStyle] = hooks.useState<string>('chartStyle');
        const [theme, setTheme] = hooks.useState<string>('theme');
        const [scale, setScale] = hooks.useState<string>('scale');
        const [animate, setAnimate] = hooks.useState<string>('animate');
        const [interaction, setInteraction] = hooks.useState<string>('interaction');
        const [state, setState] = hooks.useState<string>('state');
        const [annotations, setAnnotations] = hooks.useState<string>('annotations');

        // event
        const fireReadyEvent = hooks.useCustomEvent<unknown>('columnReady');
        const onReady = (e: Chart) => {
            fireReadyEvent({});
        };

        const { commonGetters, commonSetters } = useCommonProps(hooks);

        return (
        <Column
        data={data}
        xField={xField}
        yField={yField}
        seriesField={seriesField}
        colorField={colorField}
        stack={stack}
        group={group}
        percent={percent}
        conversionTag={conversionTag}
        markBackground={markBackground}
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
        animate={animate}
        interaction={interaction}
        state={state}
        annotations={annotations}
        // reactNode
        // event
        onReady={onReady}
        // 公共的属性
    {...commonGetters}
></Column>
);
}
}

customElements.define('antd-charts-column', AntdColumnElement);
