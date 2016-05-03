package com.wx.ninegridview;

import android.content.Context;
import android.widget.ImageView;
import java.util.List;

/**
 * Description: 九宫格适配器
 *
 * Created by wangjianlei on 16/3/7.
 * Email: wangjianlei@jldaren.com
 * Phone: 13166828431
 */
public abstract class NineGridLayoutAdapter<T> {
    protected abstract void onDisplayImage(Context context, ImageView imageView, T t);

    protected void onItemImageClick(Context context, int index, List<T> list) {
    }

    protected ImageView generateImageView(Context context) {
        TouchedImageView imageView = new TouchedImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }
}