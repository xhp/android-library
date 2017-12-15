# android-library
android library dependencies, Android studio gradle.

# list

1.高德地图

[高德地图](https://github.com/xhp/android-library/blob/master/library/doc/amap.md)
[lbs.amap.com](http://lbs.amap.com/api/android-sdk/guide/create-project/android-studio-create-project)

2.百度地图[百度地图](http://lbsyun.baidu.com/)



3.网易IM[网易IM](http://dev.netease.im/)

[Android_SDK](https://github.com/netease-im/NIM_Android_SDK)

```
    // 添加依赖。注意，版本号必须一致。
    // 基础功能 (必需)
    compile 'com.netease.nimlib:basesdk:4.4.0'
    // 音视频和互动白板服务需要
    compile 'com.netease.nimlib:nrtc:4.4.0'
    // 音视频需要
    compile 'com.netease.nimlib:avchat:4.4.0'
    // 聊天室需要
    compile 'com.netease.nimlib:chatroom:4.4.0'
    // 互动白板服务需要
    compile 'com.netease.nimlib:rts:4.4.0'
    // 全文检索服务需要
    compile 'com.netease.nimlib:lucene:4.4.0'
```

4.okhttp - [okhttp](https://github.com/square/okhttp.git)


```
compile 'com.squareup.okhttp3:okhttp:3.9.1'
```
5.picasso - [picasso](https://github.com/square/picasso.git)
 
```
compile 'com.squareup.picasso:picasso:2.5.2'
```
6.leakcanary

```
debugCompile 'com.squareup.leakcanary:leakcanary-android:1.5.4'
releaseCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.5.4'
```

7.[zxing](https://github.com/zxing/zxing.git)

```
compile 'com.google.zxing:core:3.3.1'
```
8.glide [glide](https://github.com/bumptech/glide.git)

https://muyangmin.github.io/glide-docs-cn/
```
compile 'com.github.bumptech.glide:glide:4.3.1'
compile 'com.android.support:support-v4:23.3.0'
```

9.Android-Universal-Image-Loader [Image-Loader](https://github.com/nostra13/Android-Universal-Image-Loader.git)

```
compile 'com.nostra13.universalimageloader:universal-image-loader:1.9.3'
```
10.fresco [fresco](https://github.com/facebook/fresco.git)

```
compile 'com.facebook.fresco:fresco:1.5.0'
```
11.[Ultra-Pull-To-Refresh](https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh.git)
```
compile 'in.srain.cube:ultra-ptr:1.0.11'
```
12.SmartRefreshLayout [SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout.git)
```
compile 'com.android.support:appcompat-v7:25.3.1'//版本随意（必须）
compile 'com.android.support:design:25.3.1'//版本随意（非必须，引用可以解决无法预览问题）

//稳定版
compile 'com.scwang.smartrefresh:SmartRefreshLayout:1.0.3'
compile 'com.scwang.smartrefresh:SmartRefreshHeader:1.0.3'//没有使用特殊Header，可以不加这行
```
13.GSON [gson](https://github.com/google/gson.git)
```
compile 'com.google.code.gson:gson:2.8.2'
```

14.fastjson[fastjson](https://github.com/alibaba/fastjson.git)

```
compile 'com.alibaba:fastjson:1.2.41'
compile 'com.alibaba:fastjson:1.1.67.android'
```
15.RxAndroid[RxAndroid](https://github.com/ReactiveX/RxAndroid.git)
```
compile 'io.reactivex.rxjava2:rxandroid:2.0.1'
// Because RxAndroid releases are few and far between, it is recommended you also
// explicitly depend on RxJava's latest version for bug fixes and new features.
compile 'io.reactivex.rxjava2:rxjava:2.1.7'
```
16.retrofit[retrofit](https://github.com/square/retrofit.git)

http://square.github.io/retrofit/
```
compile 'com.squareup.retrofit2:retrofit:2.3.0'
```
17.[recyclerview]()


    compile 'com.android.support:recyclerview-v7:26.0.0-alpha1'

18.multidex
```
implementation 'com.android.support:multidex:1.0.2'
```

19.okio[okio](https://github.com/square/okio.git)
```
compile 'com.squareup.okio:okio:1.11.0'
```
20.andserver[andserver](https://github.com/yanzhenjie/AndServer.git)
```
compile 'com.yanzhenjie:andserver:1.0.3'
```
21.socket.io-client[socket.io-client](https://socket.io/blog/native-socket-io-and-android/)
```
compile 'com.github.nkzawa:socket.io-client:0.3.0'
compile 'io.socket:socket.io-client:0.8.3'
```
22.netty
```
compile 'io.netty:netty-all:4.1.17.Final'
```
23.android-gif-drawable[android-gif-drawable](https://github.com/koral--/android-gif-drawable.git)
```
compile 'pl.droidsonroids.gif:android-gif-drawable:1.2.8'
```

24.volley[volley](https://github.com/google/volley.git)
```
compile 'com.mcxiaoke.volley:library:1.0.+@aar'

```
25.android-async-http[android-async-http](http://loopj.com/android-async-http/)

```
compile 'com.loopj.android:android-async-http:1.4.9'
```
26.lottie[lottie](http://airbnb.io/lottie/)(https://github.com/airbnb/lottie-android.git)

```
compile 'com.airbnb.android:lottie:2.3.2-SNAPSHOT'
```
.