package com.example.premium.conversationbubble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.premium.conversationbubble.adapter.ConversationListAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView conversation_rc_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
        setMessageData();
    }

    private void setMessageData() {
       // ConversationListAdapter adapter=new ConversationListAdapter(getApplicationContext(), 8);
        ConversationListAdapter adapter=new ConversationListAdapter(getApplicationContext(), 8);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        conversation_rc_view.setLayoutManager(mLayoutManager);
        conversation_rc_view.setItemAnimator(new DefaultItemAnimator());
        conversation_rc_view.setAdapter(adapter);
    }

    private void initialization() {
        conversation_rc_view=(RecyclerView)findViewById(R.id.conversation_rc_view);
    }
}
