package com.mobileapps.jera.recyclerviewcustom;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by jera on 6/1/16.
 */
public class View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener {


    CardView cv;
    TextView title;
    TextView description;
    ImageView imageView;
    public Context context = Recycler_View_Adapter.context;
    View_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);

        itemView.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, title.getText(), Toast.LENGTH_LONG).show();
    }


}
