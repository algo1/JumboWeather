package com.lokesh.jumboweather;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lokesh.jumboweather.apiresponseobjects.AccuWeatherFivedayForecastResponse;

/**
 * Created by lokeshponnada on 7/10/16.
 */
public class DayforecastAdapter extends RecyclerView.Adapter<DayforecastAdapter.ViewHolder> {


    private AccuWeatherFivedayForecastResponse mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView day;
        public TextView minTemp;
        public TextView maxTemp;

        public ViewHolder(View v) {
            super(v);
            day = (TextView) v.findViewById(R.id.day);
            minTemp = (TextView) v.findViewById(R.id.minTemp);
            maxTemp = (TextView) v.findViewById(R.id.maxTemp);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public DayforecastAdapter(AccuWeatherFivedayForecastResponse myDataset) {
        mDataset = myDataset;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public DayforecastAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.minTemp.setText(mDataset.getDailyForecasts().get(position).getTemperature().getMinimum().getValue());
        holder.maxTemp.setText(mDataset.getDailyForecasts().get(position).getTemperature().getMaximum().getValue());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.getDailyForecasts().size();
    }
}


