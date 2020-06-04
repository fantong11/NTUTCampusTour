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
                        case 1:
                            latitudeAndLongitude[0] = 25.043372;
                            latitudeAndLongitude[1] = 121.534505;
                            break;
                        case 2:
                            latitudeAndLongitude[0] = 25.042823;
                            latitudeAndLongitude[1] = 121.534515;
                            break;
                        case 3:
                            latitudeAndLongitude[0] = 25.042909;
                            latitudeAndLongitude[1] = 121.533806;
                            break;
                        case 4:
                            latitudeAndLongitude[0] = 25.044054;
                            latitudeAndLongitude[1] = 121.534232;
                            break;
                        case 5:
                            latitudeAndLongitude[0] = 25.043749;
                            latitudeAndLongitude[1] = 121.533902;
                            break;
                        case 6:
                            latitudeAndLongitude[0] = 25.043954;
                            latitudeAndLongitude[1] = 121.533399;
                            break;
                        case 7:
                            latitudeAndLongitude[0] = 25.043754;
                            latitudeAndLongitude[1] = 121.533400;
                            break;
                        case 8:
                            latitudeAndLongitude[0] = 25.043325;
                            latitudeAndLongitude[1] = 121.533352;
                            break;
                        case 9:
                            latitudeAndLongitude[0] = 25.042972;
                            latitudeAndLongitude[1] = 121.533454;
                            break;
                        case 10:
                            latitudeAndLongitude[0] = 25.042596;
                            latitudeAndLongitude[1] = 121.533480;
                            break;
                        case 11:
                            latitudeAndLongitude[0] = 25.044044;
                            latitudeAndLongitude[1] = 121.533916;
                            break;
                        case 12:
                            latitudeAndLongitude[0] = 25.044054;
                            latitudeAndLongitude[1] = 121.534232;
                            break;
                        case 13:
                            latitudeAndLongitude[0] = 25.043821;
                            latitudeAndLongitude[1] = 121.534434;
                            break;
                        case 14:
                            latitudeAndLongitude[0] = 25.043184;
                            latitudeAndLongitude[1] = 121.534545;
                            break;
                        case 15:
                            latitudeAndLongitude[0] = 25.042445;
                            latitudeAndLongitude[1] = 121.534401;
                            break;
                        case 16:
                            latitudeAndLongitude[0] = 25.043811;
                            latitudeAndLongitude[1] = 121.534942;
                            break;
                        case 17:
                            latitudeAndLongitude[0] = 25.043380;
                            latitudeAndLongitude[1] = 121.535099;
                            break;
                        case 18:
                            latitudeAndLongitude[0] = 25.042938;
                            latitudeAndLongitude[1] = 121.534947;
                            break;
                        case 19:
                            latitudeAndLongitude[0] = 25.042696;
                            latitudeAndLongitude[1] = 121.535127;
                            break;
                        case 20:
                            latitudeAndLongitude[0] = 25.043458;
                            latitudeAndLongitude[1] = 121.535831;
                            break;
                        case 21:
                            latitudeAndLongitude[0] = 25.042690;
                            latitudeAndLongitude[1] = 121.535927;
                            break;
                        case 22:
                            latitudeAndLongitude[0] = 25.043560;
                            latitudeAndLongitude[1] = 121.537324;
                            break;
                        case 23:
                            latitudeAndLongitude[0] = 25.043570;
                            latitudeAndLongitude[1] = 121.538091;
                            break;
                        case 24:
                            latitudeAndLongitude[0] = 25.043176;
                            latitudeAndLongitude[1] = 121.537148;
                            break;
                        case 25:
                            latitudeAndLongitude[0] = 25.043171;
                            latitudeAndLongitude[1] = 121.537517;
                            break;
                        case 26:
                            latitudeAndLongitude[0] = 25.043040;
                            latitudeAndLongitude[1] = 121.538069;
                            break;
                        case 27:
                            latitudeAndLongitude[0] = 25.042403;
                            latitudeAndLongitude[1] = 121.537500;
                            break;
                        case 28:
                            latitudeAndLongitude[0] = 25.042048;
                            latitudeAndLongitude[1] = 121.538239;
                            break;
                    }
                    intent.putExtra("NAME",mBuildings[getAdapterPosition()]);
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
