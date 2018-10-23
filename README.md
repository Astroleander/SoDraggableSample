# SoDraggableSample
An Android Sample Including Data Binding and Recycler View

# 内容
+ 包括传统的单向绑定组件写法和基于 [Google Android Architecture Components](https://developer.android.com/topic/libraries/architecture/) 的双向绑定组件写法。
+ 包括一个继承自 Observable 的 Viewmodel。
+ 包括常用的多种监听器的写法。
+ 包括 RecycleView 与其附属组件，并使用一个示例来展示。
+ 不包括 Kotlin 技术

# 使用和下载
你可以点击 `Clone or download` 下载项目的 ZIP 包，或者使用 git 下载到本地。

你可以点击 [`release`](https://github.com/Astroleander/SoDraggableSample/releases) 下载 apk。

# 在 Android Studio 中导入
或者，你可以在在 Android Studio 中导入。

在上侧菜单选择 VCS > Checkout from Version Control > Github, 在弹出的界面中 Git Repository URL 贴入项目地址(https://github.com/Astroleander/SoDraggableSample.git)

或是直接在新建项目窗口中选择 Project from version control >　Github

# 环境
API SDK > 23 (Android 6.0)

Build Tools 28.0.3

# 其它
如果在你的电脑上本项目不能运行，推荐在使用搜索引擎排除后在本项目的 issue 留言，并尽量完整地贴出错误信息。

如果 apk 在你的手机上不能运行，请检查自己手机的操作系统和系统版本，如果没有问题，请在本项目的 issue 留言并尽量完整地贴出错误信息。

有什么意见可以在 [issue](https://github.com/Astroleander/SoDraggableSample/issues) 中提出。我非常期待你们的意见和留言(和Star)。

# Notes
本项目使用了  `com.android.support:recyclerview-v7`  `com.android.support:design` 和 `com.android.support.constraint:constraint-layout`包，
这些包通过 app 下的 `build.gradle` 文件中。

# Sync
打不开项目或者提示 Sync failed 几乎都是下载和同步的问题，请尝试在 File > Settings > Proxy (通过搜索栏) > 设置代理，如果有自己的代理设置为 127.0.0.1 和对应的端口，如果没有的话请搜索「 Android Studio 代理镜像」进行配置。配置完成后可以点击 Proxy 界面下方的 Test Connection ， 输入墙外网址查看是否成功。

# 更新与贡献
如果你对这个项目有兴趣并且打算对其进行改进欢迎提交新的 pr，或者 fork 它以创建你自己的分支。
