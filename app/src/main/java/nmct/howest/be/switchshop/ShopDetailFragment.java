package nmct.howest.be.switchshop;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import nmct.howest.be.switchshop.admin.Shop;
import nmct.howest.be.switchshop.data.SwitchShops;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopDetailFragment extends Fragment {


    private static final String EXTRA_NAAM = "nmct.howest.be.switchshop.naam";

    private TextView txbShopNaam;
    private TextView txbAdresExtra;
    private TextView txbAdresStraatNr;
    private TextView txbAdresZipCity;
    private TextView txbUren;
    public Shop s;

    private ImageView imgShop;

    private OnShopDetailsFragmentListener onShopDetailsFragmentListener;

    public interface OnShopDetailsFragmentListener {
        public void onShowShop(String naam);
    }

    private Button btnShowMap;

    public ShopDetailFragment() {
        // Required empty public constructor
    }

    public static ShopDetailFragment newInstance(String sNaamShop)
    {
        ShopDetailFragment fragment = new ShopDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_NAAM, sNaamShop);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onShopDetailsFragmentListener = (OnShopDetailsFragmentListener) activity;
        } catch (ClassCastException ex){
            throw new ClassCastException(activity.toString() + " implement interface OnShopDetailsFragmentListener");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =  inflater.inflate(R.layout.fragment_shop_detail, container, false);

        txbShopNaam = (TextView) v.findViewById(R.id.txtShopNaam);
        imgShop = (ImageView) v.findViewById(R.id.imgShopDetail);
        txbAdresExtra = (TextView) v.findViewById(R.id.txbAdresExtra);
        txbAdresStraatNr = (TextView) v.findViewById(R.id.txbStraatNr);
        txbAdresZipCity = (TextView) v.findViewById(R.id.txbZipCity);
        txbUren = (TextView) v.findViewById(R.id.txbMVuren);

        String naam = getArguments().getString(EXTRA_NAAM);
        s = SwitchShops.getShop(naam);

        String adresExtra = s.getAdres_extra();
        if(adresExtra == "")
        {
            txbAdresExtra.setVisibility(View.GONE);
        }
        else
        {
            txbAdresExtra.setVisibility(View.VISIBLE);
            txbAdresExtra.setText(s.getAdres_extra());
        }
        txbAdresStraatNr.setText(s.getAdres());
        txbAdresZipCity.setText(s.getGemeente());
        txbUren.setText(s.getUren());

        txbShopNaam.setText(s.getNaam());

        switch(s.getNaam())
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

        btnShowMap = (Button) v.findViewById(R.id.btnMap);
        btnShowMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowMap();
            }
        });
        return v;
    }
    private void ShowMap(){
        if(onShopDetailsFragmentListener != null)
        {
            onShopDetailsFragmentListener.onShowShop(s.getNaam());
        }
    }

}
