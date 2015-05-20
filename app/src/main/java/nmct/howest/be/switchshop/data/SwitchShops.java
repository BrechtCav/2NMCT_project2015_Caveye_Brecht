package nmct.howest.be.switchshop.data;

import java.util.ArrayList;
import java.util.List;

import nmct.howest.be.switchshop.admin.Shop;

/**
 * Created by BrechtCaveye on 19/05/2015.
 */
public final class SwitchShops {

    private static List<Shop> shops;

    static {
        shops = new ArrayList<Shop>();

        Shop s1 = new Shop("Switch Antwerpen Noorderlaan",
                "",
                "Noorderlaan 79",
                "2030 Antwerpen",
                "10u-18u",
                "noorderlaan@switch.be");

        Shop s2 = new Shop("Switch Antwerpen Theater",
                "",
                "Oudevaartplaats 62",
                "2000 Antwerpen",
                "10u-18u",
                "theater@switch.be");

        Shop s3 = new Shop("Switch Genk",
                "Shopping 1",
                "Rootenstraat 8 bus 59",
                "3600 Genk",
                "9u30-19u",
                "genk@switch.be");

        Shop s4 = new Shop("Switch Gent",
                "",
                "Koophandelsplein 25",
                "9000 Gent",
                "10u-18u",
                "gent@switch.be");

        Shop s5 = new Shop("Switch Hasselt",
                "",
                "Diesterstraat 21",
                "3500 Hasselt",
                "10u-18u",
                "hasselt@switch.be");

        Shop s6 = new Shop("Switch Latem",
                "",
                "Kortrijksesteenweg 255a",
                "9830 Sint-Martens-Latem",
                "10u-18u",
                "latem@switch.be");

        Shop s7 = new Shop("Switch Lier",
                "",
                "Antwerpsestraat 6",
                "2500 Lier",
                "10u-18u",
                "lier@switch.be");

        Shop s8 = new Shop("Switch Oostende",
                "",
                "Kapellestraat 7",
                "8400 Oostende",
                "10u-18u",
                "oostende@switch.be");

        Shop s9 = new Shop("Switch Waasland",
                "Waasland Shopping Center n41",
                "Kapelstraat 100",
                "9100 Sint-Niklaas",
                "10u-20u",
                "waasland@switch.be");

        Shop s10 = new Shop("Switch Wijnegem",
                "Wijnegem Shop.Center n275",
                "Turnhoutsebaan 5/400",
                "2110 Wijnegem",
                "10u-20u",
                "wijnegem@switch.be");

        shops.add(s1);
        shops.add(s2);
        shops.add(s3);
        shops.add(s4);
        shops.add(s5);
        shops.add(s6);
        shops.add(s7);
        shops.add(s8);
        shops.add(s9);
        shops.add(s10);
    }
    public static List<Shop> getshops() {
        return shops;
    }
    public static Shop getStudent(String sEmailShop) {
        for (Shop shop : getshops()) {
            if (shop.getEmail().equals(sEmailShop)) return shop;
        }
        return null;
    }
}
