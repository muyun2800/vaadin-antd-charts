# vaadin-antd-charts

## 简介

### 是什么？

本项目是 **vaadin-antd-\*系列** 的核心模块，基于 [vaadin-antd](https://gitee.com/muyun2800/vaadin-antd) 基础组件库，提供 [Ant Design Charts](https://charts.ant.design/) 的 Vaadin 实现。它让 Java 开发者无需编写前端代码，即可使用折线图、柱状图、饼图等数据可视化组件快速构建中后台系统。

### vaadin-antd-\* 系列项目

vaadin-antd 系列由以下组件库组成，可按需选用：

| 项目 | 定位 | 说明 |
|------|------|------|
| [vaadin-antd](https://gitee.com/muyun2800/vaadin-antd-charts) | 基础 UI 组件库 | Button、Input、Table、Modal 等常用组件 |
| [vaadin-antd-procomponents](https://gitee.com/muyun2800/vaadin-antd-procomponents) | 企业级高级组件库 | ProTable、ProForm 等高效组件 |
| **vaadin-antd-charts**（本项目） | 数据可视化图表库 | 多种图表类型 |
| [ruoyi-vaadin](https://gitee.com/muyun2800/ruoyi-vaadin) | 完整应用示例 | 综合使用上述组件库 |

### 为什么选择 vaadin-antd 系列？

- **填补空白**：Ant Design 拥有 React、Vue、.NET Blazor 等众多实现，但缺少 Vaadin 版本。vaadin-antd 系列正是为填补这一空白而生。
- **贴合国人审美**：Vaadin 原生组件库风格偏西化，需较多样式调整；Ant Design 贴合国内用户审美，基本只需微调即可投入使用。
- **降本增效**：在前后端全栈模式日益流行的 ToB 领域，Java 开发人员无需额外学习前端技术栈，仅凭 Java 即可快速上手 Web 界面开发。
  
### 适合什么场景？

- 交互相对固定的领域，如 ERP、CRM、OA 等 ToB 系统
- 对研发效能敏感的企业和团队
- Java 团队主导的全栈开发项目

### 不适合什么场景？

- 交互极度灵活的领域，如面向消费者的 ToC 系统


## 使用说明

1. 添加依赖:

```xml
<dependency>
    <groupId>io.gitee.muyun2800</groupId>
    <artifactId>vaadin-antd-charts</artifactId>
    <version>x.y.z</version>
</dependency>
```

1. 示例代码

请参考maven子模块：`vaadin-antd-charts-demo`。这个项目是一个Springboot项目，按照常规的Springboot项目的启动方式启动即可，



## 关于 Vaadin

### 什么是 Vaadin？

[Vaadin](https://vaadin.com/) 是一个开源的全栈 Java UI 框架，让您可以**完全使用 Java 构建现代化的 Web 应用程序**，无需编写 HTML、CSS 或 JavaScript。

### 核心优势

#### 1. 全栈 Java，无需切换项目

- **告别前后端分离的繁琐**：不需要在 Java 后端项目和 Vue/React 前端项目之间来回切换
- **统一技术栈**：前后端都使用 Java，团队只需要掌握一种语言
- **单一代码库**：所有代码都在一个项目中，简化了构建、部署和维护

#### 2. 代码量更少，效率更高

根据实际项目案例统计：

| 对比项 | 传统前后端分离 | 使用 Vaadin | 提升效果 |
|--------|----------------|-------------|----------|
| 代码量 | 需要编写 HTML/CSS/JS/REST API | 只需编写 Java | **减少 40%-60%** |
| 开发时间 | 前后端分别开发、联调 | 一体化开发 | **节省 30%-50%** |
| 维护成本 | 多项目、多技术栈 | 单一项目、单一技术栈 | **降低 50%+** |

**真实案例数据**：

- **HDI 保险集团**：从 450,000 行代码减少到 250,000 行，**代码量减少 44%**
- **Virsion 初创公司**：2 人团队节省了至少 1 个月的开发时间
- **qubIT**：15 人团队管理 4,000+ 页面的企业级应用
- **South Tyrol 政府**：7 人团队交付了 16 个生产模块，支持 116 个市政机构

#### 3. 像开发桌面应用一样简单

```java
// 创建一个表格，就像使用 Swing/JavaFX 一样简单
ProTable<User> table = new ProTable<>(User.class)
    .setColumns(
        new ProColumn<User>().setTitle("姓名").setDataIndex(User::getName),
        new ProColumn<User>().setTitle("邮箱").setDataIndex(User::getEmail)
    )
    .setItems(userService.findAll());

add(table);
```

#### 4. 企业级特性

- **安全性**：服务端渲染，最小化攻击面
- **可扩展性**：支持数千并发用户
- **丰富的组件库**：表格、表单、图表、地图等 40+ 组件
- **Spring Boot 集成**：无缝集成，开箱即用
- **响应式设计**：自动适配桌面、平板、手机

### 与传统前端开发对比

| 特性 | 传统方式（Vue/React） | Vaadin |
|------|----------------------|--------|
| 开发语言 | JavaScript/TypeScript + Java | 纯 Java |
| 项目数量 | 前端项目 + 后端项目 | 单一项目 |
| 需要掌握的技术 | HTML/CSS/JS/框架/REST API | Java |
| 前后端通信 | 需要编写 REST API 和 HTTP 调用 | 自动处理 |
| 状态管理 | Redux/Vuex/Pinia 等 | 服务端状态，无需额外管理 |
| 构建工具 | Webpack/Vite + Maven/Gradle | 仅 Maven/Gradle |
| 调试 | 浏览器 DevTools + IDE | 仅 IDE |
| 部署 | 前端构建 + 后端部署 | 单一 WAR/JAR 包 |

### 适合的场景

- **企业级管理系统**：ERP、CRM、OA 等
- **数据密集型应用**：报表、仪表盘、数据分析
- **内部工具**：快速开发企业内部系统
- **Java 团队**：团队主要技能是 Java，前端经验有限
- **追求效率**：希望快速交付、降低维护成本

