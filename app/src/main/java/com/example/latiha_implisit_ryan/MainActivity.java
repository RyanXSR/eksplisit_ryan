package com.example.latiha_implisit_ryan;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView penerima;
    public static final String KONTAK = "REPLY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }
    public void SARA (View view) {
        Intent page1 = new Intent(MainActivity.this, page_chat.class);
        page1.putExtra(KONTAK, "Sara");
        startActivity(page1); }
    public void RINA (View view) {
        Intent page1 = new Intent(MainActivity.this, page_chat.class);
        page1.putExtra(KONTAK, "Rina");
        startActivity(page1); }
    public void ZELAN (View view) {
        Intent page1 = new Intent(MainActivity.this, page_chat.class);
        page1.putExtra(KONTAK, "Zelan");
        startActivity(page1); }
}