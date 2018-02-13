package com.inducesmile.androiddatabinding;

import android.view.View;

/**
 * Created by mukeshjha on 2/13/18.
 */

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
public class CategoryViewHolder extends RecyclerView.ViewHolder {
    private ViewDataBinding bindings;
    public CategoryViewHolder(View itemView) {
        super(itemView);
        bindings = DataBindingUtil.bind(itemView);
    }
    public ViewDataBinding getBindings(){
        return bindings;
    }
}