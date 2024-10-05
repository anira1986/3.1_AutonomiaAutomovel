/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.autonomiaautomovel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etConsumoMedio;
    private EditText etQuantidadeCombustivel;
    private Button btnCalcular;
    private TextView tvAutonomia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etConsumoMedio = findViewById(R.id.etConsumoMedio);
        etConsumoMedio.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        etQuantidadeCombustivel = findViewById(R.id.etQuantidadeCombustivel);
        etQuantidadeCombustivel.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tvAutonomia = findViewById(R.id.tvAutonomia);
        tvAutonomia.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(op -> calcularAutonomia());
    }

    private void calcularAutonomia() {
        double consumoMedio = Double.parseDouble(etConsumoMedio.getText().toString());
        double quantidadeCombustivel = Double.parseDouble(etQuantidadeCombustivel.getText().toString());
        double autonomiaMetros = (consumoMedio * 1000) * quantidadeCombustivel;

        String resultado = getString(R.string.autonomia) + " " + autonomiaMetros + " m";
        tvAutonomia.setText(resultado);
    }
}
