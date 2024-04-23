package com.example.yuxiang.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.yuxiang.R
import com.example.yuxiang.bean.BaseBean
import java.util.LinkedList

/**
 * Created by p'c on 2024/4/23.
 * Description: 主页
 * Encoding: utf-8
 */
class HomeFragment : BaseFragment() {
    private lateinit var HomeView: View
    private var TAG = "HomeFragment"
    private var mData : LinkedList<out BaseBean>? = null
    private lateinit var parentLayout: RelativeLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG , "FullPicFragment mData: $mData")
        if (mData != null) {
            updateData(mData !!)
            mData = null
        }
        //根据数据来源区分不同布局
        HomeView = inflater.inflate(R.layout.fragment_home, container, false)
        parentLayout = HomeView.findViewById(R.id.home_container)
        return HomeView
    }
    private fun updateData(dataList : LinkedList<out BaseBean>) {
    }
}