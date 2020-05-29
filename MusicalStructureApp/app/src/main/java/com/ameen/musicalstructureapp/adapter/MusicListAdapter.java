package com.ameen.musicalstructureapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ameen.musicalstructureapp.R;
import com.ameen.musicalstructureapp.data.GenerateSomeData;
import com.ameen.musicalstructureapp.data.SongData;

import java.util.ArrayList;
import java.util.List;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.MyViewHolder> {

    private Context mContext;
    private List<SongData> mList;

    public MusicListAdapter(Context mContext) {
        this.mContext = mContext;
        mList = new ArrayList<>();
        mList = new GenerateSomeData().getmData();
    }

    @NonNull
    @Override
    public MusicListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_music, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicListAdapter.MyViewHolder holder, int position) {
        setData(holder, position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView musicTextView;
        TextView artistTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            musicTextView = itemView.findViewById(R.id.nameTextView);
            artistTextView = itemView.findViewById(R.id.artistTextView);
        }
    }

    private void setData(MyViewHolder holder, int position) {
        holder.artistTextView.setText(mList.get(position).getSongArtist());
        holder.musicTextView.setText(mList.get(position).getSongName());
    }

}
