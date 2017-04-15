package teampromociones.cuponeracba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetallePromociones extends AppCompatActivity {

    public TextView titulo, descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detallepromocion);

        titulo = (TextView) findViewById(R.id.tituloDetalle);
        descripcion = (TextView) findViewById(R.id.descripcionDetalle);

        titulo.setText(getIntent().getStringExtra("titulo"));
        descripcion.setText(getIntent().getStringExtra("descripcion"));
    }

}
