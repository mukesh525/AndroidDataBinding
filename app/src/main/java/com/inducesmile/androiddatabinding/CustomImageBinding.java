package com.inducesmile.androiddatabinding;

/**
 * Created by mukeshjha on 2/13/18.
 */

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class CustomImageBinding {
    @BindingAdapter({"android:src"})
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }
}