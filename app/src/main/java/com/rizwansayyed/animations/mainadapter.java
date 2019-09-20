package com.rizwansayyed.animations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rizwan.animations.Anims;

import java.util.List;

public class mainadapter extends RecyclerView.Adapter<mainadapter.mainviewholder> {

    Context context;
    List<users> data;

    public mainadapter(Context context, List<users> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public mainviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.commentlayout, null);
        return new mainviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull mainviewholder holder, int position) {

        Anims.leftApperance(context, holder.relativelay);

        Anims.fadeApperance(context, holder.imageview);


        holder.imageview.setImageResource(data.get(position).getImg());
        holder.username.setText(data.get(position).getName());
        holder.usercomment.setText(data.get(position).getComment());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class mainviewholder extends RecyclerView.ViewHolder {

        ImageView imageview;
        TextView username, usercomment;
        RelativeLayout relativelay;

        public mainviewholder(@NonNull View itemView) {
            super(itemView);

            imageview = itemView.findViewById(R.id.imageview);
            username = itemView.findViewById(R.id.username);
            usercomment = itemView.findViewById(R.id.usercomment);
            relativelay = itemView.findViewById(R.id.relativelay);

        }
    }
}
