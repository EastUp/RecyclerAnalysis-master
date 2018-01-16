package com.hc.recycleranalysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hc.recycleranalysis.basicUse.BasicUseActivity;
import com.hc.recycleranalysis.commonAdapterUse.CommonAdapterActivity;
import com.hc.recycleranalysis.dragItemAnimatorUse.DragItemAnimatorActivity;
import com.hc.recycleranalysis.headerFooterUse.HeaderFooterActivity;
import com.hc.recycleranalysis.refreshLoad.RefreshLoadActivity;

/**
 * Created by Darren on 2016/12/29.
 * Email: 240336124@qq.com
 * Description:
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void basicUse(View view) {
        Intent intent = new Intent(this, BasicUseActivity.class);
        startActivity(intent);
    }

    public void commonAdapter(View view) {
        Intent intent = new Intent(this, CommonAdapterActivity.class);
        startActivity(intent);
    }

    public void dragItemAnimator(View view) {
        Intent intent = new Intent(this, DragItemAnimatorActivity.class);
        startActivity(intent);
    }

    public void headerFooter(View view) {
        Intent intent = new Intent(this, HeaderFooterActivity.class);
        startActivity(intent);
    }

    public void refreshLoad(View view){
        Intent intent = new Intent(this, RefreshLoadActivity.class);
        startActivity(intent);
    }
}
