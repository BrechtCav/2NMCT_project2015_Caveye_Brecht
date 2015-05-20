package nmct.howest.be.switchshop;


import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import nmct.howest.be.switchshop.loader.ShopInfo;
import nmct.howest.be.switchshop.loader.ShopLoader;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends ListFragment implements LoaderManager.LoaderCallbacks<Cursor> {

    private ShopAdapter mShopAdapter;
    private OnShopFragmentListener mListener;

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] columns = new String[]{
                ShopInfo.ShopColumns.COLUMN_SHOP_NAAM,
        };
        int[] textView_ids = new int[]{
                R.id.txbShopNaam
        };
        mShopAdapter = new ShopAdapter(getActivity(), R.layout.row_shop, null, columns, textView_ids, 0);
        setListAdapter(mShopAdapter);
        getLoaderManager().initLoader(0, null, this);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args)
    {
        return new ShopLoader(getActivity());
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data)
    {
        mShopAdapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader){mShopAdapter.swapCursor(null);}

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Cursor c = (Cursor) mShopAdapter.getItem(position);
        String selectedShopnaam = c.getString(c.getColumnIndex(ShopInfo.ShopColumns.COLUMN_SHOP_NAAM));
        mListener.demandShopDetail(selectedShopnaam);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnShopFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnShopFragmentListener");
        }
    }
    public interface  OnShopFragmentListener {
        public void demandShopDetail(String sNaamShop);
    }


    class ShopAdapter extends SimpleCursorAdapter{
        public ShopAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags)
        {
            super(context, layout, c, from, to, flags);
        }

        @Override
        public void bindView(View view, Context context, Cursor cursor)
        {
            super.bindView(view, context, cursor);

            ImageView imgShop = (ImageView) view.findViewById(R.id.imgShop);

            int colnr = cursor.getColumnIndex(ShopInfo.ShopColumns.COLUMN_SHOP_NAAM);
            TextView txbNaam = (TextView) view.findViewById(R.id.txbShopNaam);

           switch(txbNaam.getText().toString())
           {
               case "Switch Antwerpen Noorderlaan":
                   imgShop.setImageResource(R.drawable.noorderlaan);
                   break;
               case "Switch Antwerpen Theater":
                   imgShop.setImageResource(R.drawable.theater);
                   break;
               case "Switch Genk":
                   imgShop.setImageResource(R.drawable.genk);
                   break;
               case "Switch Gent":
                   imgShop.setImageResource(R.drawable.gent);
                   break;
               case "Switch Hasselt":
                   imgShop.setImageResource(R.drawable.hasselt);
                   break;
               case "Switch Latem":
                   imgShop.setImageResource(R.drawable.latem);
                   break;
               case "Switch Lier":
                   imgShop.setImageResource(R.drawable.lier);
                   break;
               case "Switch Oostende":
                   imgShop.setImageResource(R.drawable.oostende);
                   break;
               case "Switch Waasland":
                   imgShop.setImageResource(R.drawable.waasland);
                   break;
               case "Switch Wijnegem":
                   imgShop.setImageResource(R.drawable.wijnegem);
                   break;
           }
        }
    }


}
