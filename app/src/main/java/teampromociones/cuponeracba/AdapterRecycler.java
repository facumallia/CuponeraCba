package teampromociones.cuponeracba;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facu on 6/4/2017.
 */

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolder> {

    private ArrayList<Promocion> listaPromociones ;
    private Context context;

    public AdapterRecycler(ArrayList<Promocion> listaPromociones, Context context) {
        this.listaPromociones = listaPromociones;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View  v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_promociones_individuales,parent,false);
        ViewHolder promoviewholder = new ViewHolder(v);
        return promoviewholder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.txtTitulo.setText(listaPromociones.get(position).getTitulo());
        holder.txtDescripcion.setText(listaPromociones.get(position).getDescripcion());
        Glide.with(context).load(listaPromociones.get(position).getPromo_imagen()).into(holder.banner);


    }

    @Override
    public int getItemCount() {
        return listaPromociones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtTitulo;
        public TextView txtDescripcion;
        public ImageView banner;


        public ViewHolder(View itemView) {
            super(itemView);

            //itemView.setOnClickListener(this);

            //parametros que cargo y que despues paso en el OnClick para los detalles
            txtTitulo = (TextView) itemView.findViewById(R.id.txtTitulo);
            txtDescripcion = (TextView) itemView.findViewById(R.id.txtDescripcion);
            banner = (ImageView) itemView.findViewById(R.id.imgBanner);


        }


/*        @Override
        public void onClick(View v) {

            int posicion = getAdapterPosition();

            Promocion promoTocada = this.promociones.get(posicion);
            Intent intent = new Intent(this.contexto, DetallePromociones.class);
            //ahora tengo que pasar todos los parametros de antes en el intent para que cargue en el detallepromociones
            intent.putExtra("titulo", promoTocada.getTitulo());
            intent.putExtra("descripcion", promoTocada.getDescripcion());
            this.contexto.startActivity(intent);

        }*/
    }
}
