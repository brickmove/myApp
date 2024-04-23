package com.example.yuxiang.bean

import android.os.Bundle

/**
 * Created by p'c on 2024/4/23.
 * Description:
 * Encoding: utf-8
 */
class EventBusBean {
    var eventType: String? = null//1表示导航点击事件；
    var contentPosition: Int = 0//点击的位置点
    var content: String? = null//内容
    var bundle: Bundle? = null//数据

    //actionDetail：1.表示否定，2表示肯定，根据不同的eventType执行不同的操作
    //比如导航点击事件中。actionDetail = 1就是取消导航；actionDetail = 2就是开启导航
    //比如点击提示语事件EVENT_SEND_QUESTION。actionDetail = 1就是只执行命令不发送问题给主控，actionDetail = 2就是发送问题给主控
    var actionDetail: Int = 0

    constructor()

    constructor(eventType: String, contentPosition: Int, content: String, actionType: Int) {
        this.eventType = eventType
        this.contentPosition = contentPosition
        this.content = content
        this.actionDetail = actionType
    }

    override fun toString(): String {
        return "EventBusBean{" +
                "eventType=" + eventType +
                ", contentPosition=" + contentPosition +
                ", content='" + content + '\''.toString() +
                ", actionDetail=" + actionDetail +
                '}'.toString()
    }
}