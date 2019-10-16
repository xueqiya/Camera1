package com.xq.camera;

import android.os.Environment;

/**
 * @author created by xq
 * @organize
 * @Date 2019/9/29 9:39
 * @descript:一些常量
 */

public class Configuration {

    //这是app内部存储 格式如下 /data/data/包名/xxx/
    public static String insidePath = "/data/data/com.xq.camera/pic/";
    //外部路径
    public static String OUTPATH = Environment.getExternalStorageDirectory() + "/拍照-相册/";
}
