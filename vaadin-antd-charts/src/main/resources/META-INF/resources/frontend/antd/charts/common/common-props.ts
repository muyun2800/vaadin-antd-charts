import { RenderHooks } from 'Frontend/generated/flow/ReactAdapter';


/**
 * 提取chart的公共属性
 * @param hooks
 * @returns
 */
function useCommonProps(hooks: RenderHooks) {
    const [autoFit, setAutoFit] = hooks.useState<boolean>('autoFit');
    const [width, setWidth] = hooks.useState<number>('width');
    const [height, setHeight] = hooks.useState<number>('height');
    const [viewStyle, setViewStyle] = hooks.useState<string>('viewStyle');
    const [margin, setMargin] = hooks.useState<number>('margin');
    const [marginLeft, setMarginLeft] = hooks.useState<number>('marginLeft');
    const [marginTop, setMarginTop] = hooks.useState<number>('marginTop');
    const [marginRight, setMarginRight] = hooks.useState<number>('marginRight');
    const [marginBottom, setMarginBottom] = hooks.useState<number>('marginBottom');
    const [padding, setPadding] = hooks.useState<number>('padding');
    const [paddingLeft, setPaddingLeft] = hooks.useState<number>('paddingLeft');
    const [paddingTop, setPaddingTop] = hooks.useState<number>('paddingTop');
    const [paddingRight, setPaddingRight] = hooks.useState<number>('paddingRight');
    const [paddingBottom, setPaddingBottom] = hooks.useState<number>('paddingBottom');
    const [inset, setInset] = hooks.useState<number>('inset');
    const [insetLeft, setInsetLeft] = hooks.useState<number>('insetLeft');
    const [insetTop, setInsetTop] = hooks.useState<number>('insetTop');
    const [insetRight, setInsetRight] = hooks.useState<number>('insetRight');
    const [insetBottom, setInsetBottom] = hooks.useState<number>('insetBottom');

    return {
        commonGetters: {
            autoFit, width, height, viewStyle,
            margin, marginLeft, marginTop, marginRight, marginBottom,
            padding, paddingLeft, paddingTop, paddingRight, paddingBottom,
            inset, insetLeft, insetTop, insetRight, insetBottom
        },
        commonSetters: {
            setAutoFit, setWidth, setHeight, setViewStyle,
            setMargin, setMarginLeft, setMarginTop, setMarginRight, setMarginBottom,
            setPadding, setPaddingLeft, setPaddingTop, setPaddingRight, setPaddingBottom,
            setInset, setInsetLeft, setInsetTop, setInsetRight, setInsetBottom
        }
    }
}


export default useCommonProps;



