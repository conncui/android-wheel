package com.conncui.wheelview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import kankan.wheel.R;

/**
 * Created by cui on 17-3-31.
 */

public class BaseViewHolder extends RecyclerView.ViewHolder {
    public TextView mTextView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.text_view);
    }
}
