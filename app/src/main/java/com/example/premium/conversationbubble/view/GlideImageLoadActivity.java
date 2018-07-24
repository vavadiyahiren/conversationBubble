package com.example.premium.conversationbubble.view;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;

import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.RequestBuilder;
import com.example.premium.conversationbubble.R;
import com.example.premium.conversationbubble.adapter.ConversationListAdapter;
import com.example.premium.conversationbubble.adapter.GlideListAdapter;

import java.util.ArrayList;

public class GlideImageLoadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_image_load);

        ArrayList<String> list=new ArrayList<String> ();

        for(int i=0 ; i<70 ; i++){

            String url= "https://randomuser.me/api/portraits/med/men/"+i+".jpg";
            list.add(url);

        }

        RecyclerView recyclerView =  findViewById(R.id.rv);
        GlideListAdapter adapter=new GlideListAdapter(getApplicationContext(), list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

/*    private class MyPreloadModelProvider implements ListPreloader.PreloadModelProvider {
        @Override
        @NonNull
        public List<U> getPreloadItems(int position) {
            String url = myUrls.get(position);
            if (TextUtils.isEmpty(url)) {
                return Collections.emptyList();
            }
            return Collections.singletonList(url);
        }

        @Override
        @Nullable
        public RequestBuilder getPreloadRequestBuilder(String url) {
            return
                    GlideApp.with(fragment)
                            .load(url)
                            .override(imageWidthPixels, imageHeightPixels);
        }
    }*/
}
