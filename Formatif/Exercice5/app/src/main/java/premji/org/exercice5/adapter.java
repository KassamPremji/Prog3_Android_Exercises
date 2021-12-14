package premji.org.exercice5;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder>
{
    public List<Compteur> list;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView TvCompteur;
        public MyViewHolder(LinearLayout v) {
            super(v);
            TvCompteur = v.findViewById(R.id.compteur);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public adapter()
    {
        list = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public adapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType)
    {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.compteur_item, parent, false);
        return new MyViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Compteur compteurCourant = list.get(position);
        holder.TvCompteur.setText(compteurCourant.nombre + "");
    }

    // renvoie la taille de la liste
    @Override
    public int getItemCount()
    {
        return list.size();
    }
}
