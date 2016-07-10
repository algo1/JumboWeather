package com.lokesh.jumboweather;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lokesh.jumboweather.apiresponseobjects.AccuWeatherHourData;
import com.lokesh.jumboweather.utils.TimeUtils;

import java.util.List;


/**
 * Created by lokeshponnada on 7/11/16.
 */
public class HourforecastAdapter extends RecyclerView.Adapter<HourforecastAdapter.ViewHolder> {


    private List<AccuWeatherHourData> hourDataset;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView hour;
        public TextView temp;

        public ViewHolder(View v) {
            super(v);
            hour = (TextView) v.findViewById(R.id.hour);
            temp = (TextView) v.findViewById(R.id.temp);

        }
    }

    public HourforecastAdapter(List<AccuWeatherHourData> hourDataset) {
        this.hourDataset = hourDataset;
    }


    @Override
    public HourforecastAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hour_listitem, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.hour.setText(TimeUtils.getHourFromEpochTime(hourDataset.get(position).getEpochDateTime()));
        holder.temp.setText(hourDataset.get(position).getTemperature().getValue());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return hourDataset.size();
    }
}



