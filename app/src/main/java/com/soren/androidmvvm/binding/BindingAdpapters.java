package com.soren.androidmvvm.binding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.soren.androidmvvm.R;
import com.soren.mvvm_base.tranformation.CircleTransform;
import com.squareup.picasso.Picasso;

public class BindingAdpapters {

    @BindingAdapter("android:src")
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .transform(new CircleTransform())
                .into(view);
    }

}
