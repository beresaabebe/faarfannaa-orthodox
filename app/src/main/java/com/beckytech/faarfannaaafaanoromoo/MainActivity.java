package com.beckytech.faarfannaaafaanoromoo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AbbaafIlma;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AfuurriiQulqulluunBuheeActivity;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AkkamiinTareeActivity;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AlfaafiOmeegaaActivity;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AmmaIfatuuNuufActivity;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AmmaReefuTolee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AnaafWaaqayyodhaActivity;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AndariiKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AniifManniKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AraarsituuMaariyaamii;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.Arseemaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AtiBeteliheem;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.acontents.AyyaanaArgattee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BaayeeNaYaaddeessa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BagaGammaddanMisiroon;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BagaGammaddanii;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BagaIsiinGahee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BakkaAaraGalfiiKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BaraDargaggummaaKeenya;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BirraanGahee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BiyyaKeenya;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BiyyaKeenyaaf;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BoqonnaaLubbuu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BoqonnaaNaaf;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.bcontents.BoruKanGooftaatii;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ccontents.CubbuunKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ccontents.CuuphamuunKee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents.DahooKeenya;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents.DeemeIyyesuusi;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents.DhaabachuDadhabee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents.DhufeJechi;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents.DhugumaDhugaadha;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents.DuaaKaeera;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents.DubartootaaKeessaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.dcontents.DursiiGooftaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.EebbifamaadhaKanEebbifamee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.EebbifamtudhaIsheen;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.EenyumtuuHinJiru;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.EenyuuAbdiinKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.EenyuuOgeessiAkkaKee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.EeyyeeNuuDhalatee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.Eeyyeennii;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.Ergamaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.ErgamaaGabrieel;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.ErgamaaGabrieelin;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.econtents.ErgamooniFaarfaataaniiru;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.fcontents.FannoonHumnaKeenya;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.fcontents.FuulaNamatti;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GalaanaDhaabe;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GalataJedhee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GalataKee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GalataWaaqayyo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GalatanGalchaaf;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.Galateeffamaadhaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GalmaKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GammadaaMartinuu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GammadiiKaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.Gammanneerra;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GannaSodomatti;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GarraKoofJedhee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GochiGooftaaKeenyaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GooftaanCuuphamee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GooftaanNuufCuuphameera;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GugeeJiraattu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GurguddootaDhiise;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.gcontents.GuyyaanKeeGuyyaaQaba;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.hcontents.HaadhaWaaqaKanMadaanalamii;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.hcontents.HalleeLuyyaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.hcontents.HarkaYohaannisiinCuuphame;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.hcontents.HoolichaDhugaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.hcontents.HunduumaCaaltiHaatiGooftaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.icontents.IttiFufaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.icontents.IyyesuusCuuphame;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.icontents.IyyesuusKiristoos;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.jcontents.JaalalliKeeAddaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.jcontents.JireenyaLubbuuKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KaakuAraara;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KanAkkaWaaqayyo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KanAkkaWaaqayyoEessaatti;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KanFayyuuBarbaadu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KananIttiinBoonee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KennaaGuyyaaJimaata;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KennaanKeeJabaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KidaaneMihiraat;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.Koottuu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.kcontents.KoottuuHaadhaKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.lcontents.Lakkaame;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.lcontents.LapheenKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.lcontents.LatiinJirmaQabaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MaalJedheenDubbaadha;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MaalNamaGootee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MaaliinFakkeessina;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.Maaramiin;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.Maariyaam;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MaariyaamNiCaalti;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.Maariyaamiidhaaf;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.Madanialem;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MallattooNagaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MaqaanKeeAjaaiba;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MikaaeelNaafDhufee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MikaaeelNidhaabbataa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MootichiYihuudaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MucaaKee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.mcontents.MucaaKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NaMiladhu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NagaaNaafLabsee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NageenyaKeenya;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NamatuHinBeknee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NanYaadadha;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NattiYaahafu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NiBueIlmi;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NiDhalatee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NuufDhalatee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ncontents.NuufKadhatu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ocontents.ObsiNidarba;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ocontents.OfIrraattinArgee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ocontents.OfummaMiti;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ocontents.OlNaaQabdeta;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ocontents.OoMaariyaam;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.qcontents.QabsurriKee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.qcontents.QorichaFoonKeenya;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.rcontents.Raagueel;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.rcontents.RaajiiGiyoorgisii;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.rcontents.Rakkanneerraa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.SagaltamiiSaglanuu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.SiGalateeffanna;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.SiMalee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.Sillaasee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.SillaaseeUumaaKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.SinFaarfadhaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.SinTaee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.SinbooKoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.scontents.SittiWaamameera;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.tcontents.TabootaMusee;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.tcontents.TikseeGaariidha;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.tcontents.TikseeGaariinQabaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.tcontents.TokkummaaNuufKenni;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ucontents.UlfinaToloota;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ucontents.UlfinaWaaqayyof;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ucontents.UraaelKoottu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.wcontents.WaaeeKeenHima;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.wcontents.WaaqattiHaaAmannuu;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.wcontents.WaaqayyoAddunyaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.wcontents.WaaqayyoRafeeHin;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.wcontents.WangeelaIsaatti;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.YaaHaadhaWaaqayyo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.YaaMaariyaam;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.YaaMikaaeelii;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.YaaWaaqayyoo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.YaaredLubichaa;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.Yoordaanoos;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.YoordaanoosDhaloonniKooo;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.Yoordaanoosii;
import com.beckytech.faarfannaaafaanoromoo.atozsorted.ycontents.Yoordaanositti;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class MainActivity extends OptionsMenuActivity {

    ListView listView;

    String[] mezmurName = {"Abbaaf Ilmi", "Afuurri qulqulluun bu’ee", "Akkamiin taree jedhe ",
            "Alfaa fi omeegaadha","Ammaa ifatuu nuuf ba’ee","Amma reefu tolee","Anaaf waaqayyodha",
            "Andarii koo","Aniif manni koo","Araarsituu maariyaamii","Arseemaa","Ati beteliheem",
            "Ayyaana argattee",
            "Baay'ee na yaaddeessa","Baga gammaddanii","Baga gammaddan misirroon","Baga isiin ga'ee",
            "Bakka aara galfii koo", "Bara dargaggummaa keenya","Brain ga'ee",
            "Biyya keenya","Biyya keenyaaf arara kadhaatee","Boqonnaa lubbuu koo",
            "Boqonnaa naaf kenni", "Boru kan gooftaatii",
            "Cubbuun koo baay'attee","Cuuphamuun kee nuuf ta'ee fayyinaa",
            "Dahoo keenya isheen", "Deeme iyyesuusi", "Dhaabachu dadhabee", "Dhufe jechi ",
            "Dhuguma dhugaadha", "Du'aa ka'eera", "Dubartootaa keessaa", "Dursii goftaa duraa koo",
            "Eebbifamaadha kan eebbifamee", "Eebbifamtudha isheen",
            "Eenyumtuu hin jiru", "Eenyuu abdiin koo","Eenyu ogeessi akka kee", "Eeyyeennii",
            "Eeyyee nuu dhalatee", "Ergamaa", "Ergamaa Gabri'eel", "Ergamaa Gabri'eelin",
            "Ergamooni faarfaataaniiru",
            "Fannoon humna keenya", "Fuula namatti",
            "Galaana dhaabe","Galata jedhee", "Galata kee ", "Galatan galchaafi", "Galata waaqayyo",
            "Galateeffamaadhaa", "Galma koo", "Gammadaa martinuu", "Gammadiikaa",
            "Gammanneerra", "Ganna sodomatti ", "Garaa koof jedhee ", "Gochi gooftaa keenyaa",
            "Gooftaan cuuphamee", "Gooftaan nuuf cuuphameera ", "Gugee jiraattu",
            "Gurguddoota dhiise", "Guyyaan kee guyyaa qaba",
            "Hadhaa waaqa kan madaanalamii","Hallee luyyaa", "Harka yohaannisiin cuuphame", "Hoolicha dhugaa",
            "Hunduuma caalti haati gooftaa",
            "Itti fufaa", "Iyyasuus kiristoos", "Iyyesuus cuuphame",
            "Jaalalli kee addaa", "Jireenya lubbuu koo",
            "Kaaku araaraa", "Kan akka waaqayyoo","Kan akka waaqayyo arjooman","Kanan ittin boonee",
            "Kan fayyuu barbaaduu","Kennaa guyyaa jimaataa", "Kennaan kee jabaa", "Kidaane mihiraat",
            "Koottuu","Kottuu haadhakoo maariyaami",
            "Lakka'ame", "Lapheen koo", "Latiin jirma qabaa",
            "Maaliin fakkeessina", "Maal jedheen dubbaadha", "Maal nama gootee", "Maaramiin",
            "Maariyaam", "Maariyaamiidhaafi", "Maariyaam ni caalti", "Madani'alem",
            "Mallattoo nagaa", "Maqaan kee ajaa’iba","Mikaa'eel naaf dhufee",
            "Mikaa’eliin ni dhaabbataa cinaa koo","Mootichi yihuudaa","Mucaa kee hammadhuuti",
            "Mucaa koo",
            "Nagaa naaf labsee", "Nageenya keenya","Namatu hin beknee", "Naa miladhu","Naa yaadadha",
            "Natti yaa hafu ","Ni amanna abbatti ","Ni bu'e ilmi",
            "Ni dhalattee", "Nuuf dhalatee", "Nuuf kadhatu ",
            "Obsi ni darba", "Of irraattin argee", "Ofumaa miti", "Ol na qabdeta",
            "Oo Maariyaam nu si jaalanna",
            "Qabsurri kee", "Qoricha foon keenya",
            "Ragu'eel", "Raajii giyoorgisii", "Rakkanneerraa",
            "Sagaltamii saglanuu", "Si galateeffanna ", "Sillaasee", "Sillaasee uumaa koo ",
            "Si malee","Sinboo koo", "Siin farfaadhaa waaqa koo", "Sin ta’ee",
            "Sitti waamameera",
            "Taboota musee (tsilat ze muse)",
            "Tiksee gaaridha ati", "Tiksee gaariin qabaa", "Tokkummaa nuuf kenni",
            "Ulfina tolootaa (ሙዳየ መና)", "Ulfina waaqayyoof", "Uraa'el koottu",
            "Waa'ee keen hima", "Waaqatti haa amannuu", "Waaqayyo addunyaa daawwatee",
            "Waaqayyo rafee hin beekuu", "Wangeela isaatti",
            "Yaa haadha waaqayyoo", "Yaa maariyaam", "Yaa mikaa’eelii", "Yaared lubichaa",
            "Yaa waaqayyoo","Yoordaanoos", "Yoordaanoosi dhaloonni koo","Yoordaanoosii",
            "Yoordaanositti" };

    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI(" Faarsaa Tartiiban bakka tokkootti ");

        MobileAds.initialize(this, initializationStatus -> {});

        setAds();

        listView = findViewById(R.id.list_item);


        CustomMainAdapter adapter = new CustomMainAdapter(this, mezmurName);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((parentView, view, position, l) -> {

            switch (position) {
                case  0:
                    startActivity(new Intent(MainActivity.this, AbbaafIlma.class));
                    overridePendingTransition(R.anim.slide_out_bottom, R.anim.no_anim);
                    break;
                case  1:
                    startActivity(new Intent(MainActivity.this, AfuurriiQulqulluunBuheeActivity.class));
                    overridePendingTransition(R.anim.slide_out_bottom, R.anim.no_anim);
                    break;
                case  2:
                    startActivity(new Intent(MainActivity.this, AkkamiinTareeActivity.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  3:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, AlfaafiOmeegaaActivity.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, AlfaafiOmeegaaActivity.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  4:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, AmmaIfatuuNuufActivity.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, AmmaIfatuuNuufActivity.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  5:
                    startActivity(new Intent(MainActivity.this, AmmaReefuTolee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  6:
                    startActivity(new Intent(MainActivity.this, AnaafWaaqayyodhaActivity.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  7:
                    startActivity(new Intent(MainActivity.this, AndariiKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  8:
                    startActivity(new Intent(MainActivity.this, AniifManniKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  9:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, AraarsituuMaariyaamii.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, AraarsituuMaariyaamii.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  10:
                    startActivity(new Intent(MainActivity.this, Arseemaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  11:
                    startActivity(new Intent(MainActivity.this, AtiBeteliheem.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  12:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, AyyaanaArgattee.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, AyyaanaArgattee.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  13:
                    startActivity(new Intent(MainActivity.this, BaayeeNaYaaddeessa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  14:
                    startActivity(new Intent(MainActivity.this, BagaGammaddanii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  15:
                    startActivity(new Intent(MainActivity.this, BagaGammaddanMisiroon.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  16:
                    startActivity(new Intent(MainActivity.this, BagaIsiinGahee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  17:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, BakkaAaraGalfiiKoo.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, BakkaAaraGalfiiKoo.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  18:
                    startActivity(new Intent(MainActivity.this, BaraDargaggummaaKeenya.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  19:
                    startActivity(new Intent(MainActivity.this, BirraanGahee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  20:
                    startActivity(new Intent(MainActivity.this, BiyyaKeenya.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  21:
                    startActivity(new Intent(MainActivity.this, BiyyaKeenyaaf.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  22:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, BoqonnaaLubbuu.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, BoqonnaaLubbuu.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  23:
                    startActivity(new Intent(MainActivity.this, BoqonnaaNaaf.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  24:
                    startActivity(new Intent(MainActivity.this, BoruKanGooftaatii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  25:
                    startActivity(new Intent(MainActivity.this, CubbuunKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  26:
                    startActivity(new Intent(MainActivity.this, CuuphamuunKee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  27:
                    startActivity(new Intent(MainActivity.this, DahooKeenya.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  28:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, DeemeIyyesuusi.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, DeemeIyyesuusi.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  29:
                    startActivity(new Intent(MainActivity.this, DhaabachuDadhabee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  30:
                    startActivity(new Intent(MainActivity.this, DhufeJechi.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  31:
                    startActivity(new Intent(MainActivity.this, DhugumaDhugaadha.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  32:
                    startActivity(new Intent(MainActivity.this, DuaaKaeera.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  33:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, DubartootaaKeessaa.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, DubartootaaKeessaa.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  34:
                    startActivity(new Intent(MainActivity.this, DursiiGooftaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  35:
                    startActivity(new Intent(MainActivity.this, EebbifamaadhaKanEebbifamee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  36:
                    startActivity(new Intent(MainActivity.this, EebbifamtudhaIsheen.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  37:
                    startActivity(new Intent(this, EenyumtuuHinJiru.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  38:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, EenyuuAbdiinKoo.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, EenyuuAbdiinKoo.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  39:
                    startActivity(new Intent(MainActivity.this, EenyuuOgeessiAkkaKee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  40:
                    startActivity(new Intent(MainActivity.this, Eeyyeennii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  41:
                    startActivity(new Intent(MainActivity.this, EeyyeeNuuDhalatee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  42:
                    startActivity(new Intent(MainActivity.this, Ergamaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  43:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, ErgamaaGabrieel.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, ErgamaaGabrieel.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  44:
                    startActivity(new Intent(MainActivity.this, ErgamaaGabrieelin.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  45:
                    startActivity(new Intent(MainActivity.this, ErgamooniFaarfaataaniiru.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  46:
                    startActivity(new Intent(MainActivity.this, FannoonHumnaKeenya.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  47:
                    startActivity(new Intent(MainActivity.this, FuulaNamatti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  48:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, GalaanaDhaabe.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, GalaanaDhaabe.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  49:
                    startActivity(new Intent(MainActivity.this, GalataJedhee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  50:
                    startActivity(new Intent(MainActivity.this, GalataKee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  51:
                    startActivity(new Intent(MainActivity.this, GalatanGalchaaf.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  52:
                    startActivity(new Intent(MainActivity.this, GalataWaaqayyo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  53:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, Galateeffamaadhaa.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, Galateeffamaadhaa.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  54:
                    startActivity(new Intent(MainActivity.this, GalmaKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  55:
                    startActivity(new Intent(MainActivity.this, GammadaaMartinuu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  56:
                    startActivity(new Intent(MainActivity.this, GammadiiKaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  57:
                    startActivity(new Intent(MainActivity.this, Gammanneerra.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  58:
                    startActivity(new Intent(MainActivity.this, GannaSodomatti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  59:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, GarraKoofJedhee.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, GarraKoofJedhee.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  60:
                    startActivity(new Intent(MainActivity.this, GochiGooftaaKeenyaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  61:
                    startActivity(new Intent(MainActivity.this, GooftaanCuuphamee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  62:
                    startActivity(new Intent(MainActivity.this, GooftaanNuufCuuphameera.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  63:
                    startActivity(new Intent(MainActivity.this, GugeeJiraattu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  64:
                    startActivity(new Intent(MainActivity.this, GurguddootaDhiise.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  65:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, GuyyaanKeeGuyyaaQaba.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, GuyyaanKeeGuyyaaQaba.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  66:
                    startActivity(new Intent(MainActivity.this, HaadhaWaaqaKanMadaanalamii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  67:
                    startActivity(new Intent(MainActivity.this, HalleeLuyyaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  68:
                    startActivity(new Intent(MainActivity.this, HarkaYohaannisiinCuuphame.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  69:
                    startActivity(new Intent(MainActivity.this, HoolichaDhugaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  70:
                    startActivity(new Intent(MainActivity.this, HunduumaCaaltiHaatiGooftaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  71:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, IttiFufaa.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, IttiFufaa.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  72:
                    startActivity(new Intent(MainActivity.this, IyyesuusCuuphame.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  73:
                    startActivity(new Intent(MainActivity.this, IyyesuusKiristoos.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  74:
                    startActivity(new Intent(MainActivity.this, JaalalliKeeAddaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  75:
                    startActivity(new Intent(MainActivity.this, JireenyaLubbuuKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  76:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, KaakuAraara.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, KaakuAraara.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  77:
                    startActivity(new Intent(MainActivity.this, KanAkkaWaaqayyo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  78:
                    startActivity(new Intent(MainActivity.this, KanAkkaWaaqayyoEessaatti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  79:
                    startActivity(new Intent(MainActivity.this, KananIttiinBoonee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  80:
                    startActivity(new Intent(MainActivity.this, KanFayyuuBarbaadu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  81:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, KennaaGuyyaaJimaata.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, KennaaGuyyaaJimaata.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  82:
                    startActivity(new Intent(MainActivity.this, KennaanKeeJabaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  83:
                    startActivity(new Intent(MainActivity.this, KidaaneMihiraat.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  84:
                    startActivity(new Intent(MainActivity.this, Koottuu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  85:
                    startActivity(new Intent(MainActivity.this, KoottuuHaadhaKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  86:
                    startActivity(new Intent(MainActivity.this, Lakkaame.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  87:
                    startActivity(new Intent(MainActivity.this, LapheenKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  88:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, LatiinJirmaQabaa.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, LatiinJirmaQabaa.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  89:
                    startActivity(new Intent(MainActivity.this, MaaliinFakkeessina.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  90:
                    startActivity(new Intent(MainActivity.this, MaalJedheenDubbaadha.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  91:
                    startActivity(new Intent(MainActivity.this, MaalNamaGootee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  92:
                    startActivity(new Intent(MainActivity.this, Maaramiin.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  93:
                    startActivity(new Intent(MainActivity.this, Maariyaam.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  94:
                    startActivity(new Intent(MainActivity.this, Maariyaamiidhaaf.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  95:
                    startActivity(new Intent(MainActivity.this, MaariyaamNiCaalti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  96:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, Madanialem.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, Madanialem.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  97:
                    startActivity(new Intent(MainActivity.this, MallattooNagaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  98:
                    startActivity(new Intent(MainActivity.this, MaqaanKeeAjaaiba.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  99:
                    startActivity(new Intent(MainActivity.this, MikaaeelNaafDhufee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  100:
                    startActivity(new Intent(MainActivity.this, MikaaeelNidhaabbataa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  101:
                    startActivity(new Intent(MainActivity.this, MootichiYihuudaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  102:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, MucaaKee.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, MucaaKee.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  103:
                    startActivity(new Intent(MainActivity.this, MucaaKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  104:
                    startActivity(new Intent(MainActivity.this, NagaaNaafLabsee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  105:
                    startActivity(new Intent(MainActivity.this, NageenyaKeenya.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  106:
                    startActivity(new Intent(MainActivity.this, NamatuHinBeknee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  107:
                    startActivity(new Intent(MainActivity.this, NaMiladhu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  108:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, NanYaadadha.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, NanYaadadha.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  109:
                    startActivity(new Intent(MainActivity.this, NattiYaahafu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  110:
                    startActivity(new Intent(MainActivity.this, NaMiladhu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  111:
                    startActivity(new Intent(MainActivity.this, NiBueIlmi.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  112:
                    startActivity(new Intent(MainActivity.this, NiDhalatee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  113:
                    startActivity(new Intent(MainActivity.this, NuufDhalatee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  114:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, NuufKadhatu.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, NuufKadhatu.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  115:
                    startActivity(new Intent(MainActivity.this, ObsiNidarba.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  116:
                    startActivity(new Intent(MainActivity.this, OfIrraattinArgee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  117:
                    startActivity(new Intent(MainActivity.this, OfummaMiti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  118:
                    startActivity(new Intent(MainActivity.this, OlNaaQabdeta.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  119:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, OoMaariyaam.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, OoMaariyaam.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  120:
                    startActivity(new Intent(MainActivity.this, QabsurriKee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  121:
                    startActivity(new Intent(MainActivity.this, QorichaFoonKeenya.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  122:
                    startActivity(new Intent(MainActivity.this, Raagueel.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  123:
                    startActivity(new Intent(MainActivity.this, RaajiiGiyoorgisii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  124:
                    startActivity(new Intent(MainActivity.this, Rakkanneerraa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  125:
                    startActivity(new Intent(MainActivity.this, SagaltamiiSaglanuu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  126:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, SiGalateeffanna.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, SiGalateeffanna.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  127:
                    startActivity(new Intent(MainActivity.this, Sillaasee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  128:
                    startActivity(new Intent(MainActivity.this, SillaaseeUumaaKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  129:
                    startActivity(new Intent(MainActivity.this, SiMalee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  130:
                    startActivity(new Intent(MainActivity.this, SinbooKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  131:
                    startActivity(new Intent(MainActivity.this, SinFaarfadhaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  132:
                    startActivity(new Intent(MainActivity.this, SinTaee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  133:
                    startActivity(new Intent(MainActivity.this, SittiWaamameera.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  134:
                    startActivity(new Intent(MainActivity.this, TabootaMusee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  135:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, TikseeGaariidha.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, TikseeGaariidha.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  136:
                    startActivity(new Intent(MainActivity.this, TikseeGaariinQabaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  137:
                    startActivity(new Intent(MainActivity.this, TokkummaaNuufKenni.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  138:
                    startActivity(new Intent(MainActivity.this, UlfinaToloota.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  139:
                    startActivity(new Intent(MainActivity.this, UlfinaWaaqayyof.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  140:
                    startActivity(new Intent(MainActivity.this, UraaelKoottu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  141:
                    startActivity(new Intent(MainActivity.this, WaaeeKeenHima.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  142:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, WaaqattiHaaAmannuu.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, WaaqattiHaaAmannuu.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  143:
                    startActivity(new Intent(MainActivity.this, WaaqayyoAddunyaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  144:
                    startActivity(new Intent(MainActivity.this, WaaqayyoRafeeHin.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  145:
                    startActivity(new Intent(MainActivity.this, WangeelaIsaatti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  146:
                    startActivity(new Intent(MainActivity.this, YaaHaadhaWaaqayyo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  147:
                    startActivity(new Intent(MainActivity.this, YaaMaariyaam.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  148:
                    startActivity(new Intent(MainActivity.this, YaaMikaaeelii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  149:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, YaaredLubichaa.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, YaaredLubichaa.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
                case  150:
                    startActivity(new Intent(MainActivity.this, YaaWaaqayyoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  151:
                    startActivity(new Intent(MainActivity.this, Yoordaanoos.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  152:
                    startActivity(new Intent(MainActivity.this, YoordaanoosDhaloonniKooo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  153:
                    startActivity(new Intent(MainActivity.this, Yoordaanoosii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  154:
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(MainActivity.this);
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                startActivity(new Intent(MainActivity.this, Yoordaanositti.class));
                                mInterstitialAd = null;
                                setAds();
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    } else {
                        startActivity(new Intent(MainActivity.this, Yoordaanositti.class));
                        overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    }
                    break;
            }
        });

    }

    private void setAds() {
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,getString(R.string.test_interstitial_ads_unit_id), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }

    static class CustomMainAdapter extends ArrayAdapter<String> {
        Context context;
        String[] title;

        CustomMainAdapter(Context context, String[] title) {
            super(context, R.layout.listitem, title);
            this.context = context;
            this.title = title;
        }

        @SuppressLint("SetTextI18n")
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = inflater.inflate(R.layout.listitem, parent, false);
            TextView textView = row.findViewById(R.id.textView1);
            String symbolSign = "\uD83C\uDF39";
            textView.setText(symbolSign +" "+ title[position]);
            return row;
        }

    }

}