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
                "noorderlaan@switch.be",
                "https://www.google.be/maps/place/Switch+-+Apple+Premium+Reseller/@51.254312,4.419908,17z/data=!3m1!4b1!4m2!3m1!1s0x0000000000000000:0xc6ed8945b456c75d");

        Shop s2 = new Shop("Switch Antwerpen Theater",
                "",
                "Oudevaartplaats 62",
                "2000 Antwerpen",
                "10u-18u",
                "theater@switch.be",
                "https://www.google.be/maps/place/Switch+-+Apple+Premium+Reseller/@51.213429,4.408923,17z/data=!4m6!1m3!3m2!1s0x47c3f6fb65eaf0df:0xc343843f4dc8343a!2sSwitch+-+Apple+Premium+Reseller!3m1!1s0x47c3f6fb65eaf0df:0xc343843f4dc8343a");

        Shop s3 = new Shop("Switch Genk",
                "Shopping 1",
                "Rootenstraat 8 bus 59",
                "3600 Genk",
                "9u30-19u",
                "genk@switch.be",
                "https://www.google.be/maps/place/Switch+-+Apple+Premium+Reseller/@50.964785,5.505267,17z/data=!4m5!1m2!2m1!1sswitch+genk!3m1!1s0x0000000000000000:0x0cfce6a53717dd93");

        Shop s4 = new Shop("Switch Gent",
                "",
                "Koophandelsplein 25",
                "9000 Gent",
                "10u-18u",
                "gent@switch.be",
                "https://www.google.be/maps/place/Switch/@51.0509222,3.7204009,18z/data=!4m6!1m3!3m2!1s0x47c3714389a85dd3:0xe29e908d389ddb2!2sSwitch!3m1!1s0x0000000000000000:0x0e29e908d389ddb2");

        Shop s5 = new Shop("Switch Hasselt",
                "",
                "Diesterstraat 21",
                "3500 Hasselt",
                "10u-18u",
                "hasselt@switch.be",
                "https://www.google.be/maps/place/Switch/@50.930475,5.333203,17z/data=!4m7!1m4!3m3!1s0x47c1222a84bbe689:0x7f905a72c9337ede!2sSwitch!3b1!3m1!1s0x47c1222a84bbe689:0x7f905a72c9337ede");

        Shop s6 = new Shop("Switch Latem",
                "",
                "Kortrijksesteenweg 255a",
                "9830 Sint-Martens-Latem",
                "10u-18u",
                "latem@switch.be",
                "https://www.google.be/maps/place/Switch+-+Electro/@51.008346,3.631619,17z/data=!4m7!1m4!3m3!1s0x47c36d8878d692e5:0xcf085aed1e06eb49!2sSwitch+-+Electro!3b1!3m1!1s0x47c36d8878d692e5:0xcf085aed1e06eb49");

        Shop s7 = new Shop("Switch Lier",
                "",
                "Antwerpsestraat 6",
                "2500 Lier",
                "10u-18u",
                "lier@switch.be",
                "https://www.google.be/maps/place/Switch+-+Apple+Premium+Reseller/@51.131817,4.569144,17z/data=!4m6!1m3!3m2!1s0x47c3fc8818945f91:0x49e56fc34c275dc5!2sSwitch+-+Apple+Premium+Reseller!3m1!1s0x47c3fc8818945f91:0x49e56fc34c275dc5");

        Shop s8 = new Shop("Switch Oostende",
                "",
                "Kapellestraat 7",
                "8400 Oostende",
                "10u-18u",
                "oostende@switch.be",
                "https://www.google.be/maps/place/Switch/@51.23139,2.917602,19z/data=!4m6!1m3!3m2!1s0x47dca8d5fbd8fdd9:0xaf7aac0faf0e3923!2sSwitch!3m1!1s0x47dca8d5fbd8fdd9:0xaf7aac0faf0e3923");

        Shop s9 = new Shop("Switch Waasland",
                "Waasland Shopping Center n41",
                "Kapelstraat 100",
                "9100 Sint-Niklaas",
                "10u-20u",
                "waasland@switch.be",
                "https://www.google.be/maps/place/Switch+-+Apple+Premium+Reseller/@51.1535868,4.1533867,18z/data=!4m5!1m2!2m1!1sswitch+waasland+shopping!3m1!1s0x0000000000000000:0x8d3e9b5ac0d5d209");

        Shop s10 = new Shop("Switch Wijnegem",
                "Wijnegem Shop.Center n275",
                "Turnhoutsebaan 5/400",
                "2110 Wijnegem",
                "10u-20u",
                "wijnegem@switch.be",
                "https://www.google.be/maps/place/Switch+-+Apple+Premium+Reseller/@51.221944,4.500993,17z/data=!3m1!4b1!4m2!3m1!1s0x47c3f84c66059653:0xcc7f4fad9456a0ad");

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
    public static Shop getShop(String sNaamShop) {
        for (Shop shop : getshops()) {
            if (shop.getNaam().equals(sNaamShop)) return shop;
        }
        return null;
    }
}
