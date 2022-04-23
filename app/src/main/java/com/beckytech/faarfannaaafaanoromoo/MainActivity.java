package com.beckytech.faarfannaaafaanoromoo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.beckytech.faarfannaaafaanoromoo.acontents.*;
import com.beckytech.faarfannaaafaanoromoo.bcontents.*;
import com.beckytech.faarfannaaafaanoromoo.ccontents.*;
import com.beckytech.faarfannaaafaanoromoo.dcontents.*;
import com.beckytech.faarfannaaafaanoromoo.econtents.*;
import com.beckytech.faarfannaaafaanoromoo.fcontents.*;
import com.beckytech.faarfannaaafaanoromoo.gcontents.*;
import com.beckytech.faarfannaaafaanoromoo.hcontents.*;
import com.beckytech.faarfannaaafaanoromoo.icontents.*;
import com.beckytech.faarfannaaafaanoromoo.jcontents.*;
import com.beckytech.faarfannaaafaanoromoo.kcontents.*;
import com.beckytech.faarfannaaafaanoromoo.lcontents.*;
import com.beckytech.faarfannaaafaanoromoo.mcontents.*;
import com.beckytech.faarfannaaafaanoromoo.ncontents.*;
import com.beckytech.faarfannaaafaanoromoo.ocontents.*;
import com.beckytech.faarfannaaafaanoromoo.qcontents.*;
import com.beckytech.faarfannaaafaanoromoo.rcontents.*;
import com.beckytech.faarfannaaafaanoromoo.scontents.*;
import com.beckytech.faarfannaaafaanoromoo.tcontents.*;
import com.beckytech.faarfannaaafaanoromoo.ucontents.*;
import com.beckytech.faarfannaaafaanoromoo.wcontents.*;
import com.beckytech.faarfannaaafaanoromoo.ycontents.*;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] mezmurName = {"Abbaaf Ilmi", "Afuurri qulqulluun bu’ee", "Akkamiin taree jedhe ",
            "Alfaa fi omeegaadha","Ammaa ifatuu nuuf ba’ee","Amma reefu tolee","Anaaf waaqayyodha",
            "Andarii koo","Aniif manni koo","Araarsituu maariyaamii","Arseemaa","Ati beteliheem",
            "Ayyaana argattee",
            "Baay'ee na yaaddeessa","Baga gammaddanii","Baga gammaddan misirroon","Baga isiin ga'ee",
            "Bakka aara galfii koo", "Bara dargaggummaa keenya","Birraan ga'ee",
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
            "Nagaa naaf labsee", "Nageenya keenya","Namatu hin beknee","Naa yaadadha",
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
            "Yaa haadha waaqayyoo", "Yaa maariyaam", "Yaa mikaa’eelii (o-mikaa'el)", "Yaared lubichaa",
            "Yaa waaqayyoo","Yoordaanoos", "Yoordaanoosi dhaloonni koo","Yoordaanoosii",
            "Yoordaanositti" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        listView = findViewById(R.id.list_item);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mezmurName);
        listView.setAdapter(adapter);

//        CustomAdapter adapter = new CustomAdapter(this, mezmurName);
//        listView.setAdapter(adapter);
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
                    startActivity(new Intent(MainActivity.this, AlfaafiOmeegaaActivity.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  4:
                    startActivity(new Intent(MainActivity.this, AmmaIfatuuNuufActivity.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, AraarsituuMaariyaamii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, AyyaanaArgattee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, BakkaAaraGalfiiKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, BoqonnaaLubbuu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, DeemeIyyesuusi.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, DubartootaaKeessaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, EenyuuAbdiinKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, ErgamaaGabrieel.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, GalaanaDhaabe.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, Galateeffamaadhaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, GarraKoofJedhee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, GuyyaanKeeGuyyaaQaba.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, IttiFufaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, KaakuAraara.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, KennaaGuyyaaJimaata.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, LatiinJirmaQabaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, Madanialem.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, MucaaKee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
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
                    startActivity(new Intent(MainActivity.this, NanYaadadha.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  108:
                    startActivity(new Intent(MainActivity.this, NattiYaahafu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  109:
                    startActivity(new Intent(MainActivity.this, NaMiladhu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  110:
                    startActivity(new Intent(MainActivity.this, NiBueIlmi.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  111:
                    startActivity(new Intent(MainActivity.this, NiDhalatee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  112:
                    startActivity(new Intent(MainActivity.this, NuufDhalatee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  113:
                    startActivity(new Intent(MainActivity.this, NuufKadhatu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  114:
                    startActivity(new Intent(MainActivity.this, ObsiNidarba.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  115:
                    startActivity(new Intent(MainActivity.this, OfIrraattinArgee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  116:
                    startActivity(new Intent(MainActivity.this, OfummaMiti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  117:
                    startActivity(new Intent(MainActivity.this, OlNaaQabdeta.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  118:
                    startActivity(new Intent(MainActivity.this, OoMaariyaam.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  119:
                    startActivity(new Intent(MainActivity.this, QabsurriKee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  120:
                    startActivity(new Intent(MainActivity.this, QorichaFoonKeenya.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  121:
                    startActivity(new Intent(MainActivity.this, Raagueel.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  122:
                    startActivity(new Intent(MainActivity.this, RaajiiGiyoorgisii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  123:
                    startActivity(new Intent(MainActivity.this, Rakkanneerraa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  124:
                    startActivity(new Intent(MainActivity.this, SagaltamiiSaglanuu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  125:
                    startActivity(new Intent(MainActivity.this, SiGalateeffanna.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  126:
                    startActivity(new Intent(MainActivity.this, Sillaasee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  127:
                    startActivity(new Intent(MainActivity.this, SillaaseeUumaaKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  128:
                    startActivity(new Intent(MainActivity.this, SiMalee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  129:
                    startActivity(new Intent(MainActivity.this, SinbooKoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  130:
                    startActivity(new Intent(MainActivity.this, SinFaarfadhaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  131:
                    startActivity(new Intent(MainActivity.this, SinTaee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  132:
                    startActivity(new Intent(MainActivity.this, SittiWaamameera.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  133:
                    startActivity(new Intent(MainActivity.this, TabootaMusee.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  134:
                    startActivity(new Intent(MainActivity.this, TikseeGaariidha.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  135:
                    startActivity(new Intent(MainActivity.this, TikseeGaariinQabaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  136:
                    startActivity(new Intent(MainActivity.this, TokkummaaNuufKenni.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  137:
                    startActivity(new Intent(MainActivity.this, UlfinaToloota.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  138:
                    startActivity(new Intent(MainActivity.this, UlfinaWaaqayyof.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  139:
                    startActivity(new Intent(MainActivity.this, UraaelKoottu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  140:
                    startActivity(new Intent(MainActivity.this, WaaeeKeenHima.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  141:
                    startActivity(new Intent(MainActivity.this, WaaqattiHaaAmannuu.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  142:
                    startActivity(new Intent(MainActivity.this, WaaqayyoAddunyaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  143:
                    startActivity(new Intent(MainActivity.this, WaaqayyoRafeeHin.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  144:
                    startActivity(new Intent(MainActivity.this, WangeelaIsaatti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  145:
                    startActivity(new Intent(MainActivity.this, YaaHaadhaWaaqayyo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  146:
                    startActivity(new Intent(MainActivity.this, YaaMaariyaam.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  147:
                    startActivity(new Intent(MainActivity.this, YaaMikaaeelii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  148:
                    startActivity(new Intent(MainActivity.this, YaaredLubichaa.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  149:
                    startActivity(new Intent(MainActivity.this, YaaWaaqayyoo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  150:
                    startActivity(new Intent(MainActivity.this, Yoordaanoos.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  151:
                    startActivity(new Intent(MainActivity.this, YoordaanoosDhaloonniKooo.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  152:
                    startActivity(new Intent(MainActivity.this, Yoordaanoosii.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
                case  153:
                    startActivity(new Intent(MainActivity.this, Yoordaanositti.class));
                    overridePendingTransition(R.anim.slide_in_bottom, R.anim.no_anim);
                    break;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (item.getItemId() == R.id.aboutusmenu) {
            startActivity(new Intent(this, AboutUs.class));
        }

        if (item.getItemId() == R.id.sharemenu) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            intent.putExtra(Intent.EXTRA_TEXT, "Download this useful app's from Google play \n https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo");
            startActivity(Intent.createChooser(intent,"Share app's link via "));
        }

        if (item.getItemId() == R.id.starmenu) {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        if (item.getItemId() == R.id.checkUpdateMenu) {
            String url = "https://play.google.com/store/apps/details?id=com.beckytech.faarfannaaafaanoromoo";
            Intent  intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        if (id == R.id.exitmenu) {
            Intent close = new Intent(Intent.ACTION_MAIN);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Cufu barbaade?")
                    .setCancelable(false)
                    .setPositiveButton("Eeyyeen", (dialogInterface, i) -> {
                        close.addCategory(Intent.CATEGORY_HOME);
                        close.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(close);
                        finish();
                    })
                    .setNegativeButton("Lakki", (dialogInterface, i) -> dialogInterface.cancel()).create().show();
        }

        if (id == R.id.moreappmenu) {
            startActivity(new Intent(this, MoreApps.class));
        }

        if (id == R.id.aboutappmenu) {
            startActivity(new Intent(this, WaaeeApp.class));
        }

        if(id == R.id.galatamenu) {
            startActivity(new Intent(this, GalataActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private void initUI() {
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setIcon(R.drawable.ic_launcher_foreground);
        mActionBar.setDisplayShowCustomEnabled(true);
        mActionBar.setCustomView(R.layout.custom_actionbar_layout);
        mActionBar.setTitle("Abbaafi Ilma");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#0A6E73"));
        mActionBar.setBackgroundDrawable(colorDrawable);
    }

    static class CustomAdapter extends ArrayAdapter<String> {
        Context context;
        String[] title;

        CustomAdapter(Context c, String[] title) {
            super(c, R.layout.listitem, title);
            this.context = c;
            this.title = title;
        }

        @SuppressLint("SetTextI18n")
        public View getView (int position, View convertView, ViewGroup parent) {
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = vi.inflate(R.layout.listitem, parent, false);
            TextView titles = (TextView) row.findViewById(R.id.textView1);
            titles.setText(title[position]);
            return row;
        }
    }

}