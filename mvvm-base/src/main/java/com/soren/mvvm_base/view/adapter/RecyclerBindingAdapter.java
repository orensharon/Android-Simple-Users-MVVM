package com.soren.mvvm_base.view.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.AbstractList;

public class RecyclerBindingAdapter<T>
        extends RecyclerView.Adapter<RecyclerBindingAdapter.BindingHolder> {

    public interface OnItemClickListener<T> {
        void onItemClick(int position, T item);
    }

    private int holderLayout, variableId;
    protected AbstractList<T> items;
    private OnItemClickListener<T> onItemClickListener;

    public RecyclerBindingAdapter(int holderLayout, int variableId, AbstractList<T> items) {
        this.holderLayout = holderLayout;
        this.variableId = variableId;
        this.items = items;
    }

    @Override
    public RecyclerBindingAdapter.BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(this.holderLayout, parent, false);
        return new BindingHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerBindingAdapter.BindingHolder holder, int position) {
        final T item = this.items.get(position);
        holder.getBinding().getRoot().setOnClickListener(v -> {
            if (this.onItemClickListener != null) {
                this.onItemClickListener.onItemClick(position, item);
            }
        });
        holder.getBinding().setVariable(this.variableId, item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setOnItemClickListener(OnItemClickListener<T> onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public AbstractList<T> getItems() {
        return items;
    }

    public T getItem(int position) {
        return this.items.get(position);
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public BindingHolder(View v) {
            super(v);
            this.binding = DataBindingUtil.bind(v);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }
}
