package com.conncui.wheelview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kankan.wheel.R;

public class LoopAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private final Context mContext;
    private final List<String> mData;

    public LoopAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.mData = list;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_loop, parent, false);
        BaseViewHolder holder = new BaseViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        String data = mData.get(position % mData.size());
        holder.mTextView.setText(data);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}

