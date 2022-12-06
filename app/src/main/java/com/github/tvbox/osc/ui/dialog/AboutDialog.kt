package com.github.tvbox.osc.ui.dialog

import android.content.Context
import android.graphics.Color
import android.widget.TextView
import com.blankj.utilcode.util.SpanUtils
import com.github.tvbox.osc.BuildConfig
import com.github.tvbox.osc.R

class AboutDialog(context: Context) : BaseDialog(context) {
    init {
        setContentView(R.layout.dialog_about)
        val textView = findViewById<TextView>(R.id.title1)
        SpanUtils.with(textView).append("公众号 安卓哥开发").setBold().setForegroundColor(Color.RED)
            .append(BuildConfig.VERSION_NAME + "更新日志:")
            .append("\n").append(
                """  
                    1、支持mitv P2p直播格式
                    2、支持m3u直播格式
                    3、视频支持悬浮窗
                    4、增加主页长按可以刷新接口和缓存逻辑
                    5、直播缓存10L,提升加载速度
                    6、修复切换播放器会导致焦点丢失的问题

    """.trimIndent()
            ).create()
    }
}