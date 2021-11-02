package com.Lyle.myfirstandroidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter {
    private List<String>  mItems = new ArrayList<>();
    private Context context;

    public SearchAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SearchViewHolder(
                LayoutInflater.from(context).inflate(R.layout.search_list, null));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //if (mItems.size() > position) {
        SearchViewHolder searchHolder = (SearchViewHolder) holder;
        searchHolder.setText(mItems.get(position));
        //}
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
    public void notifyItems(List<String> items) {
        mItems.clear();
        mItems.addAll(items);
        notifyDataSetChanged();
    }
}
