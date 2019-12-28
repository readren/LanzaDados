package readren.lanzadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	final ConocedorEstado estado = ConocedorEstado.instance;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button lanzarButton = findViewById(R.id.lanzarButton);
		final TextView iteracionView = findViewById(R.id.iteracionView);
		final TextView resultadoView = findViewById(R.id.resultadoView);

		iteracionView.setText(String.valueOf(estado.iteracion));

		lanzarButton.setOnClickListener(v -> {
			resultadoView.setText(estado.lanzar().toString());
			iteracionView.setText(String.valueOf(estado.iteracion));
		});

	}
}
