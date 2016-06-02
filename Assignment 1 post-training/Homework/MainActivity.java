package com.mobileapps.jera.recyclerviewcustom;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Recycler_View_Adapter.ClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        //add my decorator
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(
                getApplicationContext()
        ));

        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // change layout to gridlayout in landscape orientation
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        }

    }


    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("Mario Bros", "Mario was created by Shigeru Miyamoto (pictured right), Nintendo's gaming genius who also unleashed Luigi, Link and a hundred other console superstars.  ", R.drawable.gamer));
        data.add(new Data("Link", "Link is one of gaming's most enduring heroes and star of The Legend Of Zelda: Ocarina Of Time, one of the greatest videogames ever made. ", R.drawable.gamer));
        data.add(new Data("Master Chief", "Halo's gruff protagonist is a relative newbie on the scene.  ", R.drawable.gamer));
        data.add(new Data("Kratos", "the hero of god of war", R.drawable.gamer));
        data.add(new Data("Sonic", "Sonic's just your regular, blue teenage hedgehog. ", R.drawable.gamer));
        data.add(new Data("Pikachu", "Pokemon with a lot of popularity  ", R.drawable.gamer));
        data.add(new Data("Charizard", "Pokemon with a lot of popularity  ", R.drawable.gamer));
        data.add(new Data("Luigi ", "Brother of Mario ", R.drawable.gamer));
        data.add(new Data("Snake", "character of metal gear", R.drawable.gamer));
        data.add(new Data("sub-zero", "mortal combat character ", R.drawable.gamer));
        data.add(new Data("shadow", "nemesis of sonic ", R.drawable.gamer));
        data.add(new Data("yoshi", "Marios and Luigis friend ", R.drawable.gamer));
        data.add(new Data("cloud", "Final fantasy character ", R.drawable.gamer));
        data.add(new Data("pacman", "retro game character ", R.drawable.gamer));
        data.add(new Data("Megaman", "super robot of megaman series ", R.drawable.gamer));
        data.add(new Data("donkey kong", "the kong character ok donkey kong ", R.drawable.gamer));
        data.add(new Data("duch hunt dog", "dog of retro game ", R.drawable.gamer));
        return data;
    }


    @Override
    public void itemClicked(View view, int position) {
        Toast.makeText(this, "Text", Toast.LENGTH_LONG).show();
    }
}
