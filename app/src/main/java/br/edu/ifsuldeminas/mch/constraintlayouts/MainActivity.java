package br.edu.ifsuldeminas.mch.constraintlayouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnBlog, btnSerie, btnConcurso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBlog     = findViewById(R.id.buttonCL1);
        btnSerie    = findViewById(R.id.buttonCL2);
        btnConcurso = findViewById(R.id.buttonCL3);

        btnBlog.setOnClickListener(v -> {
            startActivity(new Intent(this, BlogPostActivity.class));
        });

        btnSerie.setOnClickListener(v -> {
            startActivity(new Intent(this, SerieActivity.class));
        });

        btnConcurso.setOnClickListener(v -> {
            startActivity(new Intent(this, ConcursoTextosActivity.class));
        });
    }
}
