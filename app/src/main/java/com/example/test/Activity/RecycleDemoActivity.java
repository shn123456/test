package com.example.test.Activity;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.test.R;
import com.example.test.adapter.RecycleDemoAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecycleDemoActivity extends AppCompatActivity {
    /**
     * 数据：list
     * 主体：recyclerView
     * 适配器：adapter
     */
    List<String> list = new ArrayList<>();
    RecyclerView recyclerView;
    RecycleDemoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化 主体（recyclerView）
        recyclerView = findViewById(R.id.recyclerview);
        //初始化适配器（adapter）
        adapter = new RecycleDemoAdapter(this,list);
        //配置 layoutmanger
        /**
         * recyclerView的花样全在这里，横向，纵向，各种花式布局，都是从这里来的
         * 我下面，就是做简单的纵向列表，根据自己需要选择不同的layoutManager
         * 具体有哪些layoutManager,自行百度
         */
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);//加上这句，就可以设置方向
        recyclerView.setLayoutManager(layoutManager);
        //配置adapter
        recyclerView.setAdapter(adapter);
        /**
         * 如果列表数据更新了
         * 调用这个方法，传入新的list就ok了
         */
        //adapter.update(list);
    }
}
