package com.inducesmile.androiddatabinding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by mukeshjha on 2/13/18.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder>{
    private Context context;
    private List<CategoryObject> categoryObjectList;
    public CategoryAdapter(Context context, List<CategoryObject> categoryObjectList) {
        this.context = context;
        this.categoryObjectList = categoryObjectList;
    }
    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_list, parent, false);
        return new CategoryViewHolder(view);
    }
    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        final CategoryObject categoryObject = categoryObjectList.get(position);
        holder.getBindings().setVariable(BR.category, categoryObject);
        holder.getBindings().executePendingBindings();
    }
    @Override
    public int getItemCount() {
        return categoryObjectList.size();
    }}
