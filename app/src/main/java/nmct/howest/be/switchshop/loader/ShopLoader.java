package nmct.howest.be.switchshop.loader;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.BaseColumns;

import nmct.howest.be.switchshop.admin.Shop;
import nmct.howest.be.switchshop.data.SwitchShops;

/**
 * Created by BrechtCaveye on 20/05/2015.
 */
    public class ShopLoader extends AsyncTaskLoader<Cursor> {
        private Cursor mCursor;

        private final String[] mColumnNames = new String[]{
                BaseColumns._ID,
                ShopInfo.ShopColumns.COLUMN_SHOP_NAAM};

        private static Object lock = new Object();

        public ShopLoader (Context context){
            super(context);
        }

        @Override
        protected void onStartLoading()
        {
            if(mCursor !=null)
            {
                deliverResult(mCursor);
            }
            if(takeContentChanged() || mCursor ==null)
            {
                forceLoad();
            }
        }

        @Override
        public Cursor loadInBackground(){
            if(mCursor == null){
                loadCursor();
            }
            return mCursor;
        }
        private void loadCursor()
        {
            synchronized (lock){
                if(mCursor != null) return;

                MatrixCursor cursor = new MatrixCursor(mColumnNames);
                int id = 1;

                for(Shop shop: SwitchShops.getshops()){
                    MatrixCursor.RowBuilder row = cursor.newRow();
                    row.add(id);
                    row.add(shop.getNaam());
                    id++;
                }
                mCursor = cursor;
            }
        }

    }
