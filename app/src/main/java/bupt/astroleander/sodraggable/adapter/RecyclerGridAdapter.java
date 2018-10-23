package bupt.astroleander.sodraggable.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bupt.astroleander.sodraggable.R;

/**
 * <h1> ${className} </h1>
 * <p>Created by Astroleander on 2018/10/23<p>.
 * <p>
 * <p>
 *
 * @author Astroleander
 * @version 1.0.0
 * <p>A simple of recycler adapter</p>
 *
 * Every recycler view has an adapter acts as a bridge between an AdapterView and underlying data for that view
 * The Adapter provides access to the data items.
 * The Adapter is also responsible for making a View for each item in the data set.
 */
public class RecyclerGridAdapter extends RecyclerView.Adapter<RecyclerGridAdapter.ColorfulViewHolder> {
    // if
    // 1. you wanna using activities context at adapter,
    // 2. you cannot or you are not pleasure to pass whole activity in adapters
    // you can set a interface like that:
//    public interface ColorSetter{
//        public int[] colorCallback();
//    }
//    public ColorSetter colorSetter;
    // and don't forget call it at your listener


    // we need context of parent view's context to create view
    private Context context;

    // in normal case, adapter will accept a 'dataset' which is usually a list, array, map etc.
    // at that case, every item in dataset will display as a item in recycler
    // a data item in dataset will link to an ViewHolder to display
    //
    // but in this case, we just use an int variable to control item counts and an array to set all items colour
    private int[] colors;
    private int count = 2;


    public RecyclerGridAdapter(Context context){
        this.context = context;
//        this.colorSetter = colorSetter;
        this.colors = new int[]{0,0,0};
    }

    public void setColors(int[] colors) {
        this.colors = colors;
        for (int i = 0; i < count; i++) {
            // call all item iterable to change color
            // `notifyItemChanged ` belongs to adapter and every time be called it will call up `onBindViewHolder`
            this.notifyItemChanged(i);
        }

    }

    // an adapter must override
    // 1. `onCreateViewHolder` to inflater a view as container
    // 2. `onBindViewHolder` to bind data to view holder
    // 3. `getItemCount` to maintain list
    @NonNull
    @Override
    public ColorfulViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ColorfulViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recycler,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ColorfulViewHolder holder, int position) {
        Log.d("[onBindViewHolder]:\t","Each time 'notifyItemChanged' be called will call this. And pos is "+ position);
        holder.setColors(this.colors);
    }

    @Override
    public int getItemCount() {
        return this.count;
    }

    // viewholder for each item in dataset
    // decide how the data in item will be displayed
    class ColorfulViewHolder extends RecyclerView.ViewHolder{
        private int[] colors;
        FloatingActionButton fab;
        public ColorfulViewHolder(final View itemView) {
            super(itemView);
            // bind view
            this.fab = itemView.findViewById(R.id.fab);
            // register listener
            this.fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // if click 5th fab, delete all previous fab
                    if(getLayoutPosition() == 4){
                        RecyclerGridAdapter.this.count = 1;
                        RecyclerGridAdapter.this.notifyItemRangeRemoved(0,4);
                    }
                    // else add fab, if already has 5 fab, delete the last one
                    else {
                        RecyclerGridAdapter.this.count++;
                        RecyclerGridAdapter.this.notifyItemInserted(0);
                        if(count>5){
                            RecyclerGridAdapter.this.count--;
                            RecyclerGridAdapter.this.notifyItemRemoved(RecyclerGridAdapter.this.count);
                        }
                    }
                }
            });
        }

        // change fab color
        public void setColors(int[] colors) {
            this.colors = colors;
            ColorStateList list = ColorStateList.valueOf(Color.rgb(this.colors[0],this.colors[1],this.colors[2]));

            this.fab.setForegroundTintList(list);
            this.fab.setBackgroundTintList(list);

            // its a bad sample, carefully using Log.e, which means log ERROR
            Log.e("[ViewHolder]","been trigger! and colors is\t" + this.colors[0]+"\t"+this.colors[1]+"\t"+this.colors[2]);
        }
    }
}
