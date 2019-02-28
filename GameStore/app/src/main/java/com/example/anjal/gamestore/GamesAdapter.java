package com.example.anjal.gamestore;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.GamesView> {

    List<GameTitle> GameList = Collections.emptyList();
    Context context;


    public GamesAdapter(List<GameTitle> GameList, Context context) {
        this.GameList = GameList;
        this.context = context;
    }

    public class GamesView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;


        public GamesView (View view) {
            super(view);
            imageView = view.findViewById(R.id.imageview);
            textView1 = view.findViewById(R.id.textview1);
            textView2 = view.findViewById(R.id.textview2);
        }
    }

    @NonNull
    @Override
    public GamesAdapter.GamesView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View GameItems = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gameslist, viewGroup, false);
        return new GamesView(GameItems);
    }

    @Override
    public void onBindViewHolder(@NonNull GamesAdapter.GamesView gamesView, final int i) {
        gamesView.imageView.setImageResource(GameList.get(i).imageId);
        gamesView.textView1.setText(GameList.get(i).title);
        gamesView.textView2.setText(GameList.get(i).genre);


        gamesView.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String list1 = GameList.get(i).title.toString();
//                String list2 = GameList.get(i).genre.toString();
//                String list3 = GameList.get(i).descrption.toString();
               // Toast.makeText(MainActivity.this, list1, Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(this, GameDescription.class);
//                startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return GameList.size();
    }
}
