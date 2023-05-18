package com.example.gunapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ColdgunActivity extends AppCompatActivity {

    private ListView coldgunList;
    private TextView coldgunOut;
    private String[] arrayColdgun = {"Тычковый нож", "Нож-бабочка", "Мачете", "Кунай", "Сюрикэн", "Штык-нож"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coldgun);

        coldgunList = findViewById(R.id.coldgunList);
        coldgunOut = findViewById(R.id.coldgunOut);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayColdgun);
        coldgunList.setAdapter(adapter);
        coldgunList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedItem = arrayColdgun[position];
                coldgunOut.setText(selectedItem);
            }
        });
    }
}