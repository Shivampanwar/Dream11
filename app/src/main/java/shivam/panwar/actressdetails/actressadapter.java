package shivam.panwar.actressdetails;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by panwa on 10/26/2016.
 */
public class actressadapter extends RecyclerView.Adapter <actressadapter.MyViewHolder> {
    private List<Actress> al;
    //private Actress actress, mActress;
    public static final String str = "shivam.panwar.actressdetails.actressadapter.str";
    public static final String str1 = "shivam.panwar.actressdetails.actressadapter.str1";



    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView naam, desh;
        Actress actress;

        public MyViewHolder(View view) {
            super(view);
            view.setOnClickListener(this);
            naam = (TextView) view.findViewById(R.id.name);
            desh= (TextView) view.findViewById(R.id.country);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),"Clicked",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(v.getContext(),Actressview.class);
            intent.putExtra(str,actress.getName());
            intent.putExtra(str1,actress.getCountry());
            v.getContext().startActivity(intent);
        }

        public void bindactress(Actress mActress) {
            this.actress = mActress;
            naam.setText(mActress.getName());
            desh.setText(mActress.getCountry());
        }
    }


    public actressadapter(List<Actress> al) {
        this.al = al;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.actress_list_row, parent, false);


        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        //actress = al.get(position);
        //holder.naam.setText(actress.getName());
        //holder.desh.setText(actress.getCountry());


        holder.bindactress(al.get(position));
    }


    @Override
    public int getItemCount() {
        return al.size();
    }
}