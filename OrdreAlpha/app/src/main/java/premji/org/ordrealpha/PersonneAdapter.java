package premji.org.ordrealpha;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class PersonneAdapter extends RecyclerView.Adapter<PersonneAdapter.MyViewHolder>
{
    public List<Personne> list;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvNom;
        public TextView btnDown;
        public TextView btnUp;
        public MyViewHolder(LinearLayout v) {
            super(v);
            tvNom = v.findViewById(R.id.nom);
            btnDown = v.findViewById(R.id.btnDown);
            btnUp = v.findViewById(R.id.btnUp);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public PersonneAdapter() {
        list = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public PersonneAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.personne_item, parent, false);
        return new MyViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Personne personneCourante = list.get(position);
        holder.tvNom.setText(personneCourante.nom);

        holder.btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == list.size() -1)
                {
                    Collections.swap(list, position, 0);
                    notifyItemMoved(position, 0);
                }
                else {
                        Collections.swap(list, position, position + 1);
                    notifyItemMoved(position, position + 1);
                }

            }
        });

        holder.btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0)
                {
                    Collections.swap(list, position, list.size() -1);
                    notifyItemMoved(position, list.size() - 1);
                }
                else
                    {
                        Collections.swap(list, position, position - 1);
                        notifyItemMoved(position, position - 1);
                    }
            }
        });
    }

    // renvoie la taille de la liste
    @Override
    public int getItemCount() {
        return list.size();
    }
}
