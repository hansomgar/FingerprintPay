

![1](./app/src/main/res/mipmap-xhdpi/ic_launcher.png)
# FingerprintPay
让微信、支付宝、淘宝、腾讯QQ、云闪付在支持指纹识别的手机上使用指纹支付.

## 请注意: 支付宝支持刷脸支付, 体验感官跟苹果的Face ID差不多, 请考虑优先使用

## 最低要求
* 有指纹硬件
* Android 6.0+
* Android 5.1+(部分魅族机型)
* Android 4.4+(部分三星机型)
* [Magisk](https://github.com/topjohnwu/Magisk)、[Zygisk](https://github.com/topjohnwu/Magisk) 、 [Xposed](https://github.com/ElderDrivers/EdXposed) 或 [APatch](https://github.com/bmax121/APatch) + [Zygisk Next](https://github.com/Dr-TSNG/ZygiskNext)

## 实现原理
1. 利用 [Magisk](https://github.com/topjohnwu/Magisk) 的 [Riru](https://github.com/RikkaApps/Riru)模块 或 Zygisk 加载指纹支付模块
2. 在指纹支付模块中录入应用的"支付密码"
3. 使用[TEE](https://source.android.com/docs/security/features/trusty?hl=zh-cn)(v5.0+)将"支付密码"加密保存
4. 对应程序在支付界面时, 验证手机指纹, 验证成功解密"支付密码"
5. 自动替代用户输入"支付密码", 完成支付操作

## 国内镜像
- [夸克网盘](https://pan.quark.cn/s/dae9bc84d64f)
- [镜像网盘](https://file.xdow.net/fingerprintpay/)
- [加群下载](#提示)

## 使用步骤 Magisk + Zygisk
1. 确认 Magisk Manager 应用设置中启用 Zygisk功能
2. 下载插件: [zygisk-module-xfingerprint-pay-all-release.zip](https://github.com/eritpchy/FingerprintPay/releases)
3. 进入 Magisk Manager, 模块, 安装这几个模块, 不要重启
4. 确认启用模块, 重启手机
5. Enjoy

## 使用步骤 Apatch + Zygisk Next
1. 下载插件: [Zygisk-Next-release.zip](https://github.com/Dr-TSNG/ZygiskNext/releases)
2. 下载插件: [zygisk-module-xfingerprint-pay-all-release.zip](https://github.com/eritpchy/FingerprintPay/releases)
3. 进入 Apatch 管理器, 模块, 安装这几个模块, 没装完不要重启, 安装完毕后再重启手机
4. 开机后确认模块工作是否正常, 若不正常再次重启手机
5. Enjoy

## 使用步骤 Magisk + Riru
<details> 
<summary>点击展开(过时, Riru已停止维护)</summary>

1. 下载插件: [riru-release.zip](https://github.com/RikkaApps/Riru/releases)
2. 下载插件: [riru-module-xfingerprint-pay-all-release.zip](https://github.com/eritpchy/FingerprintPay/releases)
3. 进入 Magisk Manager, 模块, 安装这几个模块, 不要重启
4. 确认启用模块, 重启手机
5. Enjoy
</details>

## 使用步骤 Xposed 
> (2025.03.13, 不推荐, Xposed框架会导致大概率触发面部识别验证)

> (2023.12.25 面部识别验证暂未发现可行解决方案, 建议不使用本插件)
1. 下载并安装插件: [xposed.com.surcumference.fingerprintpay.release.apk](https://github.com/eritpchy/FingerprintPay/releases/latest)
2. 在Xposed管理器启用插件
3. 重启手机
4. Enjoy

## 设置入口
| 软件名称 | 路径 |
| ----- | -------------------------------- |
| 支付宝 | 我的 --> 设置 --> 支付设置 --> 指纹设置 |
| 淘宝   | 我的淘宝 --> 设置 --> 支付设置 --> 指纹设置|
| 微信   | 我 --> 设置 --> 指纹设置 |
| QQ     | 头像 --> 设置 --> 指纹设置|
| 云闪付 | 我的 --> 设置 --> 指纹设置 |


## 详细教程
1. [支付宝](https://github.com/eritpchy/FingerprintPay/tree/main/doc/Alipay)
2. [淘宝](https://github.com/eritpchy/FingerprintPay/tree/main/doc/Taobao)
3. [微信](https://github.com/eritpchy/FingerprintPay/tree/main/doc/WeChat)
4. [QQ](https://github.com/eritpchy/FingerprintPay/tree/main/doc/QQ)
5. [云闪付](https://github.com/eritpchy/FingerprintPay/tree/main/doc/UnionPay)

## 常见问题
1. 插件已安装, 但在微信或支付宝中看不见菜单?\
   3.1 请逐个检查支付宝、淘宝、微信的菜单项， 是否有任何一个已激活\
   3.2 请同时安装其它插件, 确保框架是正常的工作的\
   3.3 尝试, 取消勾选插件, 再次勾选插件, 关机, 再开机(仅旧版Xposed需要, LSPosed 以及 Magisk模块不需要)
2. Xposed版只能使用play版本云闪付, 否则打开闪退! riru, zygisk版本暂未发现相关问题

## 致谢
* [Riru](https://github.com/RikkaApps/Riru)
* [EdXposed](https://github.com/ElderDrivers/EdXposed)
* [Magisk](https://github.com/topjohnwu/Magisk)
* [WechatFp](https://github.com/dss16694/WechatFp)
* [Zygisk Next](https://github.com/Dr-TSNG/ZygiskNext)
* [APatch](https://github.com/bmax121/APatch)
* [Magisk Delta](https://huskydg.github.io/magisk-files/)
* [LSPosed](https://github.com/LSPosed/LSPosed)

## 提示
1. 本软件的网络功能仅限检查自己软件更新功能, 如不放心, 欢迎REVIEW代码.
2. 支付宝、淘宝、微信、QQ、云闪付支持版本请参考镜像站的适配版本, 随意升级新版本可能不兼容
3. 自4.7.4版本开始, 为减少打扰, 非紧急更新暂缓推送
4. Magisk Delta + Zygisk Next 组合 截止2023年11月8日目前这两软件尚未互相适配, 切勿尝试!
5. Magisk 本身自带Zygisk功能, 切勿尝试 Magisk + Zygisk Next 这么无聊的组合
6. 自5.0.0版本开始, 如果您**每次**(请注意, 是**每次**!)都识别出错第一次, 属于不正常现象, 正常现象应为首次出错一次,后续正常, 您可以删除系统指纹再重新添加并重新录入支付密码尝试
7. Zygisk Next 需要开启"遵守排除列表", 如果取消, 会导致框架全局排除列表失效. 不保证每个框架都如上述表现, 具体以自己测试结果为准
8. 目前已知人脸出现的概率会随着你的设备的风控等级升高而增加, 比如启用了LSPosed而没对指定应用加入排除列表
9. 由于本人主用APatch进行开发测试, 因此优先推荐使用APatch, KSU相关问题只能延后处理, 或者看社区有没有解决方案, 理论上他们都是同一个东西

<img src="./doc/qq_group.jpg" alt="QQ交流群: [665167891]" width="500">

#### QQ交流群: [665167891](https://h5.qun.qq.com/h5/qun-share-page/?_wv=1027&k=fCZf_WEKL1Rj_N0gi9JgkH7bfnKj11Wy&authKey=acNcoIs325Uco7v2JZY4NObRFA3sJU%2FWI1%2FH64DkP50cn6HBRUzBZ9cvZGNqmzGi&market_channel_source=665167891_1&noverify=0&group_code=665167891)

---

## 2026年7月1日 项目定制化修改总结 (hansomgar)

### 已完成的修改

1. **删除友盟相关功能**
   - 删除了 `Umeng.java` 文件
   - 移除了 `HomeActivity.java` 中的友盟初始化和调用
   - 移除了所有插件（magisk和xposed）中的友盟调用

2. **删除赞助功能，改为显示"已删除赞助"**
   - 修改了 `DonateView.java`，移除了所有赞助按钮和逻辑
   - 修改了 `DonateUtils.java`，清空了所有赞助相关代码
   - 修改了 `HomeActivity.java` 中的赞助入口

3. **删除自动网络请求，仅保留手动检查更新**
   - 删除了 `HomeActivity.java` 第66行的自动更新检查
   - 删除了 `UpdateFactory.java` 中的 `lazyUpdateWhenActivityAlive()` 方法
   - 移除了所有插件中的自动更新调用

4. **修改作者信息为 hansomgar**
   - 修改了 `Constant.java` 中的作者信息：
     - ALIPAY_AUTHOR: "hansomgar"
     - WECHAT_AUTHOR: "hansomgar"
     - QQ_AUTHOR: "hansomgar"
     - QQ_AUTHOR_NAME: "hansomgar"
   - 清空了赞助二维码链接

5. **修改加密加盐值**
   - 修改了 `Config.java` 第36-38行，在获取设备ID的基础上，前后添加 "hansomgar"
   - 原代码：`int passwordEncKey = String.valueOf(deviceId).hashCode();`
   - 新代码：`String saltedDeviceId = "hansomgar" + deviceId + "hansomgar"; int passwordEncKey = saltedDeviceId.hashCode();`

6. **修改版本号**
   - versionName: 6.1.0 → 6.1.1
   - versionCode: 37 → 38

7. **修改模块文件名格式**
   - 修改了 `module/build.sh` 第11行，在模块名称后添加 `-hansomgar`
   - 修改了 `app/update-json.gradle` 第9行，在更新链接中添加 `-hansomgar`
   - 修改了 `app/debug.gradle` 第73行，在调试文件名中添加 `-hansomgar`
   - 新格式：`riru-module-xfingerprint-pay-wechat-hansomgar-v6.1.1-release`

---

## 完整修改Prompt（以后使用）

```
这是一个 FingerprintPay 项目，请帮我完成以下所有修改：

1. 删除所有友盟相关功能
   - 删除 app/src/main/java/com/surcumference/fingerprint/util/Umeng.java 文件
   - 在 HomeActivity.java 中删除所有 Umeng.init()、Umeng.onResume()、Umeng.onPause() 调用
   - 在所有插件文件（magisk和xposed目录下的插件）中删除所有 Umeng 相关调用

2. 删除所有赞助相关功能，改为显示"已删除赞助"
   - 修改 DonateView.java，移除所有赞助按钮，只显示一个TextView显示"已删除赞助"
   - 清空 DonateUtils.java 中的所有赞助相关代码
   - 修改 HomeActivity.java 中的赞助入口

3. 删除所有自动网络请求，仅保留用户手动点击检查更新的功能
   - 删除 HomeActivity.java 中的自动更新检查（通常在onCreate或onResume中）
   - 删除 UpdateFactory.java 中的 lazyUpdateWhenActivityAlive() 方法及其所有调用
   - 在所有插件文件中删除自动更新调用

4. 修改作者信息为 hansomgar
   - 修改 Constant.java 中的作者信息：
     - ALIPAY_AUTHOR: "hansomgar"
     - WECHAT_AUTHOR: "hansomgar"
     - QQ_AUTHOR: "hansomgar"
     - QQ_AUTHOR_NAME: "hansomgar"
     - 清空所有赞助二维码链接（设置为空字符串）

5. 修改加密加盐值
   - 修改 Config.java 中 passwordEncKey 的生成逻辑
   - 在获取 deviceId 后，前后添加 "hansomgar"
   - 示例：String saltedDeviceId = "hansomgar" + deviceId + "hansomgar";
   - 然后计算 saltedDeviceId.hashCode() 作为 passwordEncKey

6. 修改版本号
   - 在 app/build.gradle 中：
     - versionCode: 在原基础上 +1
     - versionName: 在原基础上 +0.0.1（例如从6.1.0改为6.1.1）

7. 修改模块文件名格式，添加 -hansomgar 后缀
   - 修改 module/build.sh 第11行：在 $APP_PRODUCT_TARGET 后添加 -hansomgar
     原格式：MODULE_LIB_NAME="...-pay-$APP_PRODUCT_TARGET"
     新格式：MODULE_LIB_NAME="...-pay-$APP_PRODUCT_TARGET-hansomgar"
   - 修改 app/update-json.gradle 第9行：在 zipUrl 中 $name 后添加 -hansomgar
   - 修改 app/debug.gradle 第73行：在文件名中 $name.toLowerCase() 后添加 -hansomgar

请确保所有修改都正确完成，并检查没有遗漏的地方。
```

---
