package premji.org.bingo;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BingoAdapter extends RecyclerView.Adapter<BingoAdapter.MyViewHolder>
{
    public List<Bingo> list;

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        // each data item is just a string in this case
        public TextView numeroTire;
        public TextView lettre;
        public TextView numeroTirage;
        public MyViewHolder(LinearLayout v)
        {
            super(v);
            numeroTire = v.findViewById(R.id.numeroTire);
            lettre = v.findViewById(R.id.lettre);
            numeroTirage = v.findViewById(R.id.numeroTirage);
        }
    }

    public BingoAdapter()
    {
        list = new ArrayList<>();
    }

    @Override
    public BingoAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bingo_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Bingo personneCourante = list.get(position);
        holder.lettre.setText(personneCourante.lettre);
        holder.numeroTirage.setText(personneCourante.numeroTirage);
        holder.numeroTire.setText(""+personneCourante.numeroTire);// TODO setText sur un integer crash
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

}
