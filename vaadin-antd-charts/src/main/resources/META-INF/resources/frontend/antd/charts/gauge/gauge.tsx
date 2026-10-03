//import { ReactAdapterElement, RenderHooks } from 'Frontend/generated/flow/ReactAdapter';
import { ReactAdapterElement, RenderHooks } from '../common/ReactAdapter';
import { ReactElement } from 'react';
import { Chart, Gauge } from '@ant-design/charts';
import useCommonProps from '../common/common-props';

class AntdGaugeElement extends ReactAdapterElement {
    protected override render(hooks: RenderHooks): ReactElement | null {
        const [data, setData] = hooks.useState<string>('data');
        const [chartStyle, setChartStyle] = hooks.useState<string>('chartStyle');
        const [title, setTitle] = hooks.useState<string>('title');
        const [legend, setLegend] = hooks.useState<string>('legend');
        const [label, setLabel] = hooks.useState<string>('label');
        const [tooltip, setTooltip] = hooks.useState<string>('tooltip');
        const [theme, setTheme] = hooks.useState<string>('theme');
        const [scale, setScale] = hooks.useState<string>('scale');
        const [animate, setAnimate] = hooks.useState<string>('animate');
        const [interaction, setInteraction] = hooks.useState<string>('interaction');
        const [state, setState] = hooks.useState<string>('state');
        const [annotations, setAnnotations] = hooks.useState<string>('annotations');

        // event
        const fireReadyEvent = hooks.useCustomEvent<unknown>('gaugeReady');
        const onReady = (e: Chart) => {
            fireReadyEvent({});
        };

        const { commonGetters, commonSetters } = useCommonProps(hooks);

        return (
        <Gauge
        data={data}
        style={chartStyle}
        title={title}
        legend={legend}
        label={label}
        tooltip={tooltip}
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
    {...commonGetters}></Gauge>
);
}
}

customElements.define('antd-charts-gauge', AntdGaugeElement);
