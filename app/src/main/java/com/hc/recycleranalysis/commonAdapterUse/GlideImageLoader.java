package com.hc.recycleranalysis.commonAdapterUse;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.hc.recycleranalysis.R;
import com.hc.recycleranalysis.adapter.ViewHolder;

/**
 * Created by Darren on 2016/12/28.
 * Email: 240336124@qq.com
 * Description:
 */

public class GlideImageLoader extends ViewHolder.HolderImageLoader {

    public GlideImageLoader(String imagePath) {
        super(imagePath);
    }

    @Override
    public void displayImage(Context context, ImageView imageView, String imagePath) {
        Glide.with(context).load(imagePath).placeholder(R.drawable.ic_discovery_default_channel).centerCrop().into(imageView);
    }
}
