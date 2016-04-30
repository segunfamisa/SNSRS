package io.snsrs.android.adapters;

import android.content.Context;

/**
 * Base Adapter
 *
 * Created by segun.famisa on 30/04/2016.
 */
public abstract class BaseAdapter extends android.widget.BaseAdapter{
    Context mContext;

    public BaseAdapter(Context context) {
        super();

        mContext = context;
    }

}
