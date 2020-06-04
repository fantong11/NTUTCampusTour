package com.example.currentplacedetailsonmap;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BuildingListAdapter extends RecyclerView.Adapter<BuildingListAdapter.ViewHolder> {

    private String[] mBuildings;
    private Context mContext;

    BuildingListAdapter(Context context, String[] buildings) {
        mContext = context;
        mBuildings = buildings;
    }

    // 建立ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder{
        // 宣告元件
        private TextView txtItem;

        ViewHolder(View itemView) {
            super(itemView);
            txtItem = (TextView) itemView.findViewById(R.id.txtItem);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double[] latitudeAndLongitude = new double[2];
                    Toast.makeText(view.getContext(),
                            mBuildings[getAdapterPosition()] +getAdapterPosition(),Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, MapsActivityCurrentPlace.class);
                    switch (getAdapterPosition()) {
                        case 0:
                            latitudeAndLongitude[0] = 25.043416;
                            latitudeAndLongitude[1] = 121.533834;
                            break;
                    }
                    intent.putExtra("EXTRA", latitudeAndLongitude);
                    mContext.startActivity(intent);
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 連結項目布局檔list_item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.building_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // 設置txtItem要顯示的內容
        holder.txtItem.setText(mBuildings[position]);
    }

    @Override
    public int getItemCount() {
        return mBuildings.length;
    }
}
