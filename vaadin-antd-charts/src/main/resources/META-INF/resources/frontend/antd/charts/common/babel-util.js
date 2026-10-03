import { transform } from '@babel/standalone';
import _ from 'lodash';
import React from 'react';
import * as antd from 'antd';

// /**
//  * 本模块的函数用于辅助执行java侧嵌入的tsx片段。
//  */

// function registerAntdToWindow() {
//   if (!window.Tag && !window.Space) {
//     window.Space = antd.Space;
//     window.Tag = antd.Tag;
//     window.Button = antd.Button;
//   }
// }

// export default registerAntdToWindow;


function parseToFunction(script) {
    window.antd = antd;
    window.React = React;
    //
    if (!script || typeof script != "string") {
        return null;
    }
    // if (!window.Tag) {

    //   window.Tag = antd.Tag;
    //   window.Space = antd.Space;
    //   window.Button = antd.Button;
    // }

    const code1 = transform(script, { presets: ['react'] }).code;
    //console.log("parseToFunction code1:", code1);
    const func1 = eval(code1);
    return func1;
}





export default parseToFunction;



