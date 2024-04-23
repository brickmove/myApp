package com.example.yuxiang.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yuxiang.bean.BaseBean
import androidx.fragment.app.Fragment

import java.util.LinkedList

/**
 * Created by p'c on 2024/4/23.
 * Description:
 * Encoding: utf-8
 */
open class BaseFragment : Fragment() {
    private var mRootView: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (mRootView == null) {
            mRootView = createView(inflater, container)
        }
        return mRootView
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView(savedInstanceState)
    }
    open fun createView(inflater: LayoutInflater?, container: ViewGroup?): View? {
        return null
    }

    /**
     * 初始化控件
     * @param savedInstanceState Bundle对象，存储页面异常关闭时的状态
     */
    open fun initView(savedInstanceState: Bundle?) {

    }

    /**
     * @param isRefreshImmediately 如果Fragment已经创建过，传递true，否则传递false
     * @param dataList
     */
    open fun refreshData(isRefreshImmediately: Boolean, dataList: LinkedList<out BaseBean>?) {

    }

    /**
     * @desc 在对应的Fragment中更新对应的Action数据
     * @param actionType 响应的类型 如SpeechErrorCode.TTS_QUIET_DELAY_NUM对应的msg就是倒计时的秒钟String
     * @param msg 响应的数据
     */
    open fun updateActionData(actionType: Int, msg: String) {

    }

    fun jump2HomeFragment() {

    }


}