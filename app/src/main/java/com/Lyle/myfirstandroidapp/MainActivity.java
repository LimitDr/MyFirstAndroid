package com.Lyle.myfirstandroidapp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private SearchAdapter mSearchAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText m_edit = findViewById(R.id.textView2);
        m_edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mSearchAdapter.notifyItems(DataFactory.getFilterData(s.toString()));
            }
        });
        mRecycleView = findViewById(R.id.searchView);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mSearchAdapter = new SearchAdapter(this);
        mRecycleView.setAdapter(mSearchAdapter);
        mSearchAdapter.notifyItems(DataFactory.getFilterData(null));
    }
}