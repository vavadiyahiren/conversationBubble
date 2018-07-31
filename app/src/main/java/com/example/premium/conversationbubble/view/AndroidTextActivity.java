package com.example.premium.conversationbubble.view;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.premium.conversationbubble.R;
import com.example.premium.conversationbubble.utils.parser.Parser;
import com.example.premium.conversationbubble.utils.renderer.MarkdownBuilder;

public class AndroidTextActivity extends AppCompatActivity {

    EditText etMSG;
    Typeface codeBlockTypeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_text);

        final TextView tvMSG = findViewById(R.id.tvMsg);
        etMSG = findViewById(R.id.etMsg);
        Button btnSend = findViewById(R.id.btnSend);

        final int bulletPointColor = ContextCompat.getColor(this, R.color.colorAccent);
        final int codeBackgroundColor = ContextCompat.getColor(this, R.color.error_red);
         //codeBlockTypeface = ResourcesCompat.getFont(this, R.font.alef);

        etMSG.setText(R.string.display_text);



        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMSG.setText("");


                CharSequence text = new MarkdownBuilder(bulletPointColor, codeBackgroundColor,
                        null, new Parser())
                        .markdownToSpans(etMSG.getText().toString());

                tvMSG.setText(text);
               // tvMSG.setPaintFlags(tvMSG.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            }
        });
    }
}
