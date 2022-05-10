package com.beckytech.faarfannaaafaanoromoo.faarsaagooftaa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.beckytech.faarfannaaafaanoromoo.OptionsMenuActivity;
import com.beckytech.faarfannaaafaanoromoo.R;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.LubbuuSiifAbbomamu;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.MaalooYaaWaaqaKoo;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.MalaanHimaaAnii;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.MuseenSoomeera;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.NanDhibinLubbuuKoo;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.NarraaBaayateeOlmaa;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.OolmaaWaaqaKoo;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.SiifanDhiiseYaaHaadhakoo;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.WaaqayyooGooftaaKoo;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.YaaManaWaaqayyoo;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.YaaNamaa;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.YaaNamaaDeebii;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.YaaUumaaKoo;
import com.beckytech.faarfannaaafaanoromoo.faarsaagaabbii.YaaWaaqayyooNuutiSikadhannaa;
import com.google.android.gms.ads.MobileAds;

public class FaarsaaGooftaa extends OptionsMenuActivity {

    ListView listView;

    String[] songTitles = {
            "Adoonayii ati waqaa jirataa", "Ana faana ta'i yaa gooftaa abbaa koo", "Baay'atus barri qoruumsaa ","Biyya koo irraanfadhee naan filadhe biyyaa lafaa",
            "Jaalalli Samiirraa Harkisee Si Buuse", "Dhiifamni baay’edha kan si waammatan hundaaf", "Dhuguma dhugaadha", "Du’a keessaa nu baaftee",
            "Du'ee du'aa koo Kan hambisee", "Dursii goftaa duraa koo", "Eenyumtu hin jiruu kan akka kee", "Eyyee Qaraaniyootti eyyee  dhiiga dhangala’een",
            "Galanni galanni haa ta’uf sillaaseef", "Galanni haata’u Waaqa keenyaaf fayyiisaa kenyaaf", "Galanni isaa kan amalummaasaa", "Galanni Sillaseef kan addunyaa hundaa uumeef",
            "Galata Kee Waaqa Koo","Galatakee yaa Waaqayyoo koo", "Galatan galchaafii waaqakoofii", "Galata Waaqayyoo", "Galata Waaqayyoo guyyaa har’aa ebbisee nu kennee",
            "Galata Waaqayyoo yeroo hundumaatti", "Galateeffamaadha hamma bara baraatti","Galma koo galgala iddoo boqonnaa koo","Gammannerra baayyee gammmanneerra",
            "Gochi Gooftaa keenyaa nu baay’ata jira", "Guyyaan kee guyyaa qaba an maafan ariifadhaa", "Haa dhufaan ijoolleen hin dhoowwinaa narraa",
            "Haa galateeffamu waaqni har’aan nu ga’ee", "Haa galateeffannu guddaa hanga xiqqaa hundumti keenya", "Haa galateeffannu Amaanu’eliin Goofta isaa nuuf du’ee",
            "Haa galateeffanu Waaqayyoni", "Haammenya fageessi nu irraa", "Haa galateeffanu Waaqayyoni", " Hojiin kee raajiidha bahaa hamma", "Hundaa dabarsitee Kan yoonan nu geessee",
            "Hundumaa dandeessa homtuu hinjiruu kan ati dadhabduu", "Hunduu kan darbuu kan darbuu jireenyis qabeenyis kan darbuu", "Ifa kan uffate samiirra kan jiru",
            "Israa'eelidha maqaan koo", "Itti qaana’u gochasaa laaleetoo", "Iyyasuus kiristoos waaqayyoodha jettee", "Iyyerusaalem nugalchuudhaaf biyya haaraa",
            "Iyyesuus kiristoos mootii jireenya koo", "Jaalalaan Hunda goote ", "Jaalalli harkise jabaa ilmasaa teessoo isaa irraa", "Jaalatamaadha maqaan kee",
            "Jajjabaadha amanti keessanitti", "Jechakee dhaga’uuf Gooftaa ", "Kan akka koo hin jiru kan akka koo cubbuu kan hojjate hin jiru", "Kanan ittin boonee eenyuree Gooftaa koo malee",
            "Kan kaleessa darbe isa har'a dhufu beeka waaqni keenya", "Kan na filtee kan naa waamtees waaqaekoo", "Kan waaqni jaallatee  jaalal yaa namaa",
            "Koottu Miikaa’eel koottu", "Koottu yaa waaqa koo yaa qooricha koo", "Madani Alem nu Fayyisee jecha isaatin", "Maqaa abbaa kan Ilmaa Afuura Qulqulluu",
            "Maqaa isaa faarfadhaa ", "Mee dubbadhaa ajaa’ibasaa isin ragaa bahaa", "Miilla koo kufaatiirraa lubbuu koos du'arraa", "Mootichi kana mootichi nagaa ",
            "Mootichi Yihudaa Iyyesuus Gooftaadha", "Mootummaan  isaa kan bara baraatii", "Nageenyi waaqayyoo nurraa fagaatinii", "Namatu hin beekne malee jaalallikee addaa",
            "Namoota haa deemnuu mana waaqa keenya", "Nan beeka iddoo koo kaleessaa", "Nu gargaara Gooftaa keenya", "Nuuf kenni Waaqayyoo sammuuf qalbii yeroo hundaa kan siyaadu ",
            "Qalbii haajijjirrannu cubbuu irraa haa fagaannu", "Qaraaniyoo irratti kan nuuf fannifamee", "Qulqullu Waaqayyo galani siif haata’u",
            "Reebamuun kan siif hin taane gooftaa ni reebamte", "Si waamnaa amaanu’eelii ", "Si Waamnaa Kiristoosii", "Teessuma Sillaasee qulqulloonni marsanii",
            "Tokkummaa nuuf kenni  yaa Gooftaa yaadan tokko taanaa", "Uggum raajiidha dhiifamni kee", "Waa'ee keen hima gocha keen hima",
            "Waan naaf goote hundaaf gooftaa galatoomii", "Gidiraaf dhiphina yeroo rakkina koo", "Waaqa jaalalaa waaqa jaalalaa", "Waaqayyoo nudhaga’i baay’isnee sikadhanna",
            "Waaqayyoo qulqulluu uumaa uumamtootaa", "Waltajjiiwwan Isaa namoota guutaman", "Yaa nama dafitii  deebi’i gara waaqatti", "Yaa waaqayyo nagaadhaan nu bulchi",
            "Yaa Waaqayyoo si yaa galatu ", " Yakka keenya isa darbee nutti hin lakkahinii"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI("Faarsaa Gooftaa");

        MobileAds.initialize(this, initializationStatus -> {
        });

        listView = findViewById(R.id.list_item);

        CustomAdapter adapter = new CustomAdapter(this, songTitles);
        listView.setAdapter(adapter);
        listView.setSmoothScrollbarEnabled(true);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch (i) {
                case 0:
                    startActivity(new Intent(this, AdoonayiiAtiWaaqaJirataa.class));
                    break;
                case 1:
                    startActivity(new Intent(this, AnaTaanaTai.class));
                    break;
                case 2:
                    startActivity(new Intent(this, BaayatusBarriQoruumsaa.class));
                    break;
                case 3:
                    startActivity(new Intent(this, BiyyaKooIrraanfadhee.class));
                    break;
                case 4:
                    startActivity(new Intent(this, DabarsiteeOfLaatteAtiNuFayyiste.class));
                    break;
                case 5:
                    startActivity(new Intent(this, DhiifamniBaayeedha.class));
                    break;
                case 6:
                    startActivity(new Intent(this, DhugumaDhugaadhaGalateefameeraa.class));
                    break;
                case 7:
                    startActivity(new Intent(this, DhugumaDhuguma.class));
                    break;
                case 8:
                    startActivity(new Intent(this, DuaKeessaa.class));
                    break;
                case 9:
                    startActivity(new Intent(this, Dueeduaakookanhambisee.class));
                    break;
                case 10:
                    startActivity(new Intent(this, DursiiGooftaaDuraaKoo.class));
                    break;
                case 11:
                    startActivity(new Intent(this, Eenyumtuhinjiruu.class));
                    break;
                case 12:
                    startActivity(new Intent(this, EyyeeQaraaniyootti.class));
                    break;
                case 13:
                    startActivity(new Intent(this, Galannigalannihaataufsillaaseef.class));
                    break;
                case 14:
                    startActivity(new Intent(this, GalannihaatauWaaqa.class));
                    break;
                case 15:
                    startActivity(new Intent(this, Galanniisaakanamalummaasaa.class));
                    break;
                case 16:
                    startActivity(new Intent(this, GalanniSillaseef.class));
                    break;
                case 17:
                    startActivity(new Intent(this, GalatakeeWaaqakoo.class));
                    break;
                case 18:
                    startActivity(new Intent(this, GalatakeeyaaWaaqayyoo.class));
                    break;
                case 19:
                    startActivity(new Intent(this, Galatangalchaafiiwaaqakoofii.class));
                    break;
                case 20:
                    startActivity(new Intent(this, GalataWaaqayyoo.class));
                    break;
                case 21:
                    startActivity(new Intent(this, GalataWaaqayyooguyyaaharaaebbisee.class));
                    break;
                case 22:
                    startActivity(new Intent(this, GalataWaaqayyooyeroohundumaatti.class));
                    break;
                case 23:
                    startActivity(new Intent(this, Galateeffamaadhahammabarabaraatti.class));
                    break;
                case 24:
                    startActivity(new Intent(this, Galmakoogalgala.class));
                    break;
                case 25:
                    startActivity(new Intent(this, Gammannerrabaayyee.class));
                    break;
                case 26:
                    startActivity(new Intent(this, GochiGooftaaKeenyaa.class));
                    break;
                case 27:
                    startActivity(new Intent(this, Guyyaankeeguyyaaqaba.class));
                    break;
                case 28:
                    startActivity(new Intent(this, Haadhufaanijoolleen.class));
                    break;
                case 29:
                    startActivity(new Intent(this, HaaGalateeffamuWaaqni.class));
                    break;
                case 30:
                    startActivity(new Intent(this, HaaGalateeffannu.class));
                    break;
                case 31:
                    startActivity(new Intent(this, HaaGalateeffannuAmaanueliin.class));
                    break;
                case 32:
                    startActivity(new Intent(this, HaagalateeffanuWaaqayyoni.class));
                    break;
                case 33:
                    startActivity(new Intent(this, HaammenyaFageessi.class));
                    break;
                case 34:
                    startActivity(new Intent(this, Hindandeessa.class));
                    break;
                case 35:
                    startActivity(new Intent(this, Hojiinkeeraajiidha.class));
                    break;
                case 36:
                    startActivity(new Intent(this, HundaaDabarsitee.class));
                    break;
                case 37:
                    startActivity(new Intent(this, Hundumaadandeessahomtuu.class));
                    break;
                case 38:
                    startActivity(new Intent(this, HunduuKanDarbuu.class));
                    break;
                case 39:
                    startActivity(new Intent(this, Ifakanuffate.class));
                    break;
                case 40:
                    startActivity(new Intent(this, Israaeelidhamaqaankoo.class));
                    break;
                case 41:
                    startActivity(new Intent(this, Ittiqaanaugochasaalaaleetoo.class));
                    break;
                case 42:
                    startActivity(new Intent(this, Iyyasuuskiristooswaaqayyoodha.class));
                    break;
                case 43:
                    startActivity(new Intent(this, Iyyerusaalemgaluufjajjabaadha.class));
                    break;
                case 44:
                    startActivity(new Intent(this, Iyyesuuskiristoosmootii.class));
                    break;
                case 45:
                    startActivity(new Intent(this, JaalalaanHundagoote.class));
                    break;
                case 46:
                    startActivity(new Intent(this, JaalalliHarkise.class));
                    break;
                case 47:
                    startActivity(new Intent(this, Jaalatamaadhamaqaankee.class));
                    break;
                case 48:
                    startActivity(new Intent(this, Jajjabaadhaamantikeessanitti.class));
                    break;
                case 49:
                    startActivity(new Intent(this, Jechakeedhagauuf.class));
                    break;
                case 50:
                    startActivity(new Intent(this, Kanakkakoohinjiru.class));
                    break;
                case 51:
                    startActivity(new Intent(this, Kananittinboonee.class));
                    break;
                case 52:
                    startActivity(new Intent(this, Kankaleessadarbe.class));
                    break;
                case 53:
                    startActivity(new Intent(this, Kannafiltee.class));
                    break;
                case 54:
                    startActivity(new Intent(this, KanWaaqnijaallatee.class));
                    break;
                case 55:
                    startActivity(new Intent(this, KoottuMiikaaeel.class));
                    break;
                case 56:
                    startActivity(new Intent(this, Koottuyaawaaqakoo.class));
                    break;
                case 57:
                    startActivity(new Intent(this, MadaniAlemNuFayyiseeJechaIsaatin.class));
                    break;
                case 58:
                    startActivity(new Intent(this, MaqaaabbaakanIlmaaAfuuraQulqulluu.class));
                    break;
                case 59:
                    startActivity(new Intent(this, MaqaaIsaaFaarfadhaa.class));
                    break;
                case 60:
                    startActivity(new Intent(this, MeeDubbadhaa.class));
                    break;
                case 61:
                    startActivity(new Intent(this, MiillaKooKufaatiirraa.class));
                    break;
                case 62:
                    startActivity(new Intent(this, Mootichikanamootichi.class));
                    break;
                case 63:
                    startActivity(new Intent(this, MootichiYihudaaIyyesuus.class));
                    break;
                case 64:
                    startActivity(new Intent(this, MootummaanIsaaKanbara.class));
                    break;
                case 65:
                    startActivity(new Intent(this, Nageenyiwaaqayyoonurraafagaatinii.class));
                    break;
                case 66:
                    startActivity(new Intent(this, Namatuhinbeeknemalee.class));
                    break;
                case 67:
                    startActivity(new Intent(this, NamootaHaaDeemnuuManaWaaqaKeenya.class));
                    break;
                case 68:
                    startActivity(new Intent(this, Nanbeekaiddookookaleessaa.class));
                    break;
                case 69:
                    startActivity(new Intent(this, NugargaaraGooftaakeenya.class));
                    break;
                case 70:
                    startActivity(new Intent(this, NuufkenniWaaqayyoosammuufqalbii.class));
                    break;
                case 71:
                    startActivity(new Intent(this, Qalbiihaajijjirrannu.class));
                    break;
                case 72:
                    startActivity(new Intent(this, QaraaniyooIrratti.class));
                    break;

                case 73:
                    startActivity(new Intent(this, QulqulluWaaqayyogalanisiifhaatau.class));
                    break;
                case 74:
                    startActivity(new Intent(this, Reebamuunkansiifhintaane.class));
                    break;
                case 75:
                    startActivity(new Intent(this, SiwaamnaaAmaanueelii.class));
                    break;
                case 76:
                    startActivity(new Intent(this, SiWaamnaaKiristoosii.class));
                    break;
                case 77:
                    startActivity(new Intent(this, TeessumaSillaasee.class));
                    break;
                case 78:
                    startActivity(new Intent(this, TokkummaaNuufKenniYaaGooftaa.class));
                    break;
                case 79:
                    startActivity(new Intent(this, Uggumraajiidhadhiifamnikee.class));
                    break;
                case 80:
                    startActivity(new Intent(this, WaaeekeenhimaGochakeenhima.class));
                    break;
                case 81:
                    startActivity(new Intent(this, Waannaafgootehundaafgooftaagalatoomii.class));
                    break;
                case 82:
                    startActivity(new Intent(this, WaannagargaareefiWaaqni.class));
                    break;
                case 83:
                    startActivity(new Intent(this, Waaqajaalalaawaaqajaalalaa.class));
                    break;
                case 84:
                    startActivity(new Intent(this, Waaqayyoonudhagaibaayisneesikadhanna.class));
                    break;
                case 85:
                    startActivity(new Intent(this, WaaqayyooQulqulluuUumaaUumamtootaa.class));
                    break;
                case 86:
                    startActivity(new Intent(this, YaaWaaqayyoNagaadhaanNuBulchi.class));
                    break;
                case 87:
                    startActivity(new Intent(this, YaaWaaqayyoosiyaagalatu.class));
                    break;
                case 88:
                    startActivity(new Intent(this, Yakkakeenyaisadarbeenuttihinlakkahinii.class));
                    break;
            }
        });
    }

    static class CustomAdapter extends ArrayAdapter<String> {
        Context context;
        String[] title;

        CustomAdapter(Context context, String[] title) {
            super(context, R.layout.listitem, title);
            this.context = context;
            this.title = title;
        }

        @SuppressLint("SetTextI18n")
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = inflater.inflate(R.layout.listitem, parent, false);
            TextView textView = row.findViewById(R.id.textView1);
            String symbolSign = "\uD83C\uDF39✝\uD83C\uDF39";
            textView.setText(symbolSign +" "+ title[position]);
            return row;
        }

    }
}