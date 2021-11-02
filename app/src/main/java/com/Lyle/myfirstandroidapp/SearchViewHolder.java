package com.Lyle.myfirstandroidapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SearchViewHolder extends RecyclerView.ViewHolder {
    private String mText;
    private TextView mTextView;
    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.list1);
    }
    public String getText() {return mText;}
    public void setText(String str) {
        if(mTextView != null)
            mTextView.setText(str);
    }
}
