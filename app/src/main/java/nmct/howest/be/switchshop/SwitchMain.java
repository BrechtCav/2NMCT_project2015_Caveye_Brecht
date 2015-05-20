package nmct.howest.be.switchshop;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;


public class SwitchMain extends Activity implements ShopFragment.OnShopFragmentListener, ShopDetailFragment.OnShopDetailsFragmentListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_switch_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new ShopFragment())
                    .commit();
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void demandShopDetail(String sNaamShop) {
        showShopDetailFragment(sNaamShop);
    }

    private void showShopDetailFragment (String sNaamShop) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ShopDetailFragment fragment = ShopDetailFragment.newInstance(sNaamShop);
        fragmentTransaction.replace(R.id.container, fragment, "ShopDetailFragment");
        fragmentTransaction.addToBackStack("show_new_detail");
        fragmentTransaction.commit();
    }
    @Override
    public void onShowShop (String naam) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ShopMapFragment ShopMapFragment = nmct.howest.be.switchshop.ShopMapFragment.newShopMapFragment(naam);
        fragmentTransaction.replace(R.id.container, ShopMapFragment);
        fragmentTransaction.addToBackStack("ShopDetailFragment");
        fragmentTransaction.commit();
    }
}
