//import { ReactAdapterElement, RenderHooks } from 'Frontend/generated/flow/ReactAdapter';
import { ReactAdapterElement, RenderHooks } from '../common/ReactAdapter';
import { ReactElement } from 'react';
import { Chart, Liquid } from '@ant-design/charts';
import useCommonProps from '../common/common-props';

class AntdLiquidElement extends ReactAdapterElement {
    protected override render(hooks: RenderHooks): ReactElement | null {
        const [percent, setPercent] = hooks.useState<number>('percent');
        const [title, setTitle] = hooks.useState<string>('title');
        const [chartStyle, setChartStyle] = hooks.useState<string>('chartStyle');
        //const [animate, setAnimate] = hooks.useState<any>('animate');
        const [annotations, setAnnotations] = hooks.useState<any>('annotations');

        // event
        const fireReadyEvent = hooks.useCustomEvent<unknown>('liquidReady');
        const onReady = (e: Chart) => {
            fireReadyEvent({});
        };

        const { commonGetters, commonSetters } = useCommonProps(hooks);

        return (
        <Liquid
        percent={percent}
        title={title}
        style={chartStyle}
        //animate={animate}
        annotations={annotations}
        // reactNode
        // event
        onReady={onReady}
        // 公共的属性
    {...commonGetters}></Liquid>
);
}
}

customElements.define('antd-charts-liquid', AntdLiquidElement);
