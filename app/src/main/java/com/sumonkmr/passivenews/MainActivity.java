package com.sumonkmr.passivenews;

import android.app.Dialog;
import android.app.NativeActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    GridView myGridView;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> newsList = new ArrayList<>();
    TextView marqueeTxt;
    String allValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HookUps();
        NewsList();
        SetMarque();


        GridViewAdapter gridViewAdapter = new GridViewAdapter();
        myGridView.setAdapter(gridViewAdapter);
    }//onCreate

    private void HookUps() {
        myGridView = findViewById(R.id.myGridView);
        marqueeTxt = findViewById(R.id.marqueeTxt);
    }

    private void SetMarque() {
        StringBuilder concatenatedValues = new StringBuilder();
        for (HashMap<String, String> value : newsList) {
            concatenatedValues.append(value.get("title")).append(" || ");
        }
        marqueeTxt.setText(concatenatedValues);
        marqueeTxt.setSelected(true);
    }

    private HashMap<String, String> DataTemplate(String category, String title, String reporting, String descriptions, String imgUrl) {
        hashMap = new HashMap<>();
        hashMap.put("cat", category);
        hashMap.put("title", title);
        hashMap.put("reporting", reporting);
        hashMap.put("des", descriptions);
        hashMap.put("imgUrl", imgUrl);
        return hashMap;
    }

    private void NewsList() {
        newsList.add(DataTemplate(
                "Technology",
                "VAT Checker: Squabble between NBR and developer jeopardizes award-winning app",
                "Shariful Islam",
                "VAT Checker is an award-winning app, financed by the Ministry of ICT, and developed to help consumers to check whether the Value-Added Tax (VAT) they pay retailers is going to the government exchequer. Facing legal charges from the revenue authorities, the app was disconnected from the National Board of Revenue (NBR) servers around three months ago. Developers claim that NBR disconnected the app without notice, which has been causing a lot of problems. On the other hand, NBR sources claim the developers illegally accessed the NBR website in order to run the application in the first place. The app is rated favourably on Google Play Store and has been downloaded around 50,000 times. But recent user reviews are complaining about the app malfunctioning, and how the NBR website provides the same services. In a country where traders routinely dodge VAT payments even though they charge their patrons for it, it is indeed useful to have an app that allows users to check the VAT registration status of traders. NBR said they have plans to make a similar app of their own that will not require illegal access to information.\n" +
                        "\n" +
                        "Developers’ side of the story\n" +
                        "VAT Checker was created by the team of Jubayer Hossain, Asif Kamal Turzo, Nishan Ishtiaque and Marzia Prova. It launched on October 16, 2015 and received the National Mobile Application Award (NMAA) that year. Jubayer claimed that VAT Checker was used by consumers to file 11,000 complaints to the NBR. Revenue authorities have allegedly realized around Tk200 crore using the app. According to the NBR sources, following up on the complaints through the app, the VAT audit and intelligence officials have unearthed VAT evasion by two renowned food enterprises in Dhaka: Iqbal Catering and Fakhruddin Catering in December 2015. In addition, five months ago the VAT officials found a popular restaurant named Sultan’s Dine had evaded Tk1 crore in VAT. Jubayed said: “Without any notice, the revenue authorities have disconnected our app from the NBR’s server.” App developers contacted the NBR, urging them to reconnect the app to the server. While NBR has reassured them, no steps have been taken so far, the developers lamented. A month ago, Jubayer called on Prime Minister Sheikh Hasina from his Facebook account asking for her intervention to revive the app.\n" +
                        "\n" +
                        "NBR’s stance\n" +
                        "When contacted, a senior NBR official on conditions of anonymity said: “VAT Checker was using NBR data by hacking into the server. The server was being maintained by a private company back then. Now, the server is under the control of a government body and is more secure, which is why the VAT Checker cannot get illegal access anymore.” He said according to Section 62 of the VAT and SD Act of 1991, taxpayers’ information cannot be made public. Hence NBR cannot give access to their server to any external personnel. However, the NBR has prepared a plan to develop an app of their own to provide different services including detecting VAT evasion, said the NBR official. “VAT Checker has some laxities as it is created by the local developers. NBR has planned to acquire it and use it by upgrading it,” he added.\n" +
                        "\n" +
                        "What is the future of the app?\n" +
                        "VAT Checker has been nominated as the best national digital solution for Bangladesh at the International World Summit Awards, which will be held on March 20-22. “What will we say about our app in front of 148 foreign countries’ representatives attending the event, if it is not of any use?” said Jubayer. VAT Checker was funded by the ICT Division. When contacted, State Minister for the ICT Division Zunaid Ahmed Palak said: “We have already sent separate letters to the finance minster and NBR chairman informing them that VAT Checker was developed with ICT Division funding. We are hoping that the app will be restored soon because of its usefulness in expediting revenue collection.”\n",
                "https://ecdn.dhakatribune.net/contents/cache/images/900x0x1/uploads/dten/2018/02/Capture-25.jpg"));

        newsList.add(DataTemplate(
                "বাংলাদেশ",
                "৩৩৮ ওসি ও ১১০ ইউএনওকে বদলির প্রস্তাব ইসিতে",
                "বিশেষ প্রতিনিধি",
                "নির্বাচন কমিশনের নির্দেশনার পরিপ্রেক্ষিতে দ্বাদশ সংসদ নির্বাচনের আগে সারাদেশের ৩৩৮ থানার ওসিকে বদলি করতে প্রস্তাব তৈরি করেছে পুলিশ সদর দপ্তর। এ প্রস্তাব আজ বুধবার নির্বাচন কমিশনে (ইসি) পাঠানো হয়েছে। সেখান থেকে অনুমোদন পাওয়া গেলে এসব ওসিকে বদলির আদেশ জারি করা হবে।\n" +
                        "এ ছাড়া ১১০ জন উপজেলা নির্বাহী কর্মকর্তাকে (ইউএনও) বদলি করতেও নির্বাচন কমিশনে আজ প্রস্তাব পাঠানো হয়েছে বলে ইসি সূত্রে জানা গেছে।\n" +
                        "পুলিশ সদর দপ্তরের অতিরিক্ত মহাপরিদর্শক (প্রশাসন) কামরুল আহসান বলেন, যেসব থানার ভারপ্রাপ্ত কর্মকর্তা (ওসি) বর্তমান কর্মস্থলে ছয় মাস বা তার চেয়ে বেশি সময় পার করেছেন, তাঁদের এই বদলির তালিকায় রাখা হয়েছে।\n" +
                        "\n" +
                        "দ্বাদশ জাতীয় সংসদ নির্বাচন সুষ্ঠু করার লক্ষ্যে যেসব ওসি বর্তমান কর্মস্থলে ছয় মাসের বেশি সময় ধরে চাকরি করছেন প্রথমে তাঁদের ও পরে পর্যায়ক্রমে সারা দেশে ওসি বদলির নির্দেশ দেয় নির্বাচন কমিশন। মন্ত্রিপরিষদ সচিব ও আইজিপিকে চিঠি পাঠিয়ে ৫ ডিসেম্বরের মধ্যে ওসিদের বদলির প্রস্তাব ইসিতে পাঠাতে নির্দেশ দেওয়া হয়েছিল। পরে নির্বাচন কমিশন বদলির প্রস্তাব পাঠাতে আরও তিন দিন সময় বাড়ায়। সারা দেশে বর্তমানে ৬৫০টির বেশি থানা রয়েছে।\n" +
                        "\n" +
                        "এর আগে রাজধানীর ৫০টি থানার মধ্যে ৩৩টির ওসিকে বদলি করতে তালিকা তৈরি গতকাল মঙ্গলবার নির্বাচন কমিশনে পাঠিয়েছে ঢাকা মেট্রোপলিটন পুলিশ (ডিএমপি)।\n" +
                        "\n" +
                        "নির্বাচন কমিশন সচিবালয়ের অতিরিক্ত সচিব অশোক কুমার দেবনাথ প্রথম আলোকে বলেন, ১১০ ইউএনওকে বদলির প্রস্তাব তাঁরা পেয়েছেন। এ বিষয়ে সিদ্ধান্ত নিতে নথি কমিশনে উপস্থাপন করা হয়েছে।\n" +
                        "\n" +
                        "এর আগে গত সোমবার প্রথম পর্যায়ে দেশের আট বিভাগের ৪৭ ইউএনওকে বদলির প্রস্তাবে সম্মতি দেয় নির্বাচন কমিশন। তাঁদের মধ্যে ঢাকা বিভাগের ১৩ জন, চট্টগ্রাম বিভাগের ৮, বরিশাল বিভাগের ২, খুলনা বিভাগের ৪, ময়মনসিংহ বিভাগের ৬, সিলেট বিভাগের ৬, রাজশাহী বিভাগের ৬ ও রংপুর বিভাগের ২ জন রয়েছেন।\n" +
                        "\n" +
                        "দ্বাদশ জাতীয় সংসদ নির্বাচন সুষ্ঠু করার লক্ষ্যে দেশের সব ইউএনওকে পর্যায়ক্রমে বদলি করার সিদ্ধান্ত নেয় ইসি। ইউএনওদের বদলির বিষয়ে ব্যবস্থা নেওয়ার নির্দেশনা দিয়ে গত ৩০ নভেম্বর জনপ্রশাসন মন্ত্রণালয়কে চিঠি দেওয়া হয়। তাতে বলা হয়, প্রথম পর্যায়ে যেসব ইউএনওর বর্তমান কর্মস্থলে দায়িত্ব পালনের মেয়াদ এক বছরের বেশি হয়ে গেছে, তাঁদের অন্য জেলায় বদলির প্রস্তাব ইসিতে পাঠানো প্রয়োজন।\n",
                "https://tds-images.thedailystar.net/sites/default/files/styles/big_2/public/feature/images/ballot_box_fb_1.jpg"
        ));

        newsList.add(DataTemplate(
                "World",
                "Voting For Bangladesh Elections Ends, 12 Killed In Violence",
                "Agence France Presse",
                "Dhaka: At least 12 people were killed in election-day clashes in Bangladesh Sunday, after a bloody campaign overshadowed by a crackdown on the opposition by Prime Minister Sheikh Hasina, who is expected to win a historic but controversial fourth term.\n" +
                        "Three men were shot by police while eight others died in clashes between activists from the ruling Awami League Party and opposition Bangladesh Nationalist Party (BNP), police said.\n" +
                        "\n" +
                        "An auxiliary police member was killed after being attacked by opposition activists armed with guns and sticks, according to officials.\n" +
                        "\n" +
                        "Voting, which ended at 4:00pm (1000 GMT), was held under tight security. Polls have predicted that Hasina will clinch a third-consecutive term and record fourth overall.\n" +
                        "\n" +
                        "Bangladesh's leader has been lauded for boosting economic growth in the poor South Asian nation during an unbroken decade in power and for welcoming Rohingya refugees fleeing a military crackdown in neighbouring Myanmar.\n" +
                        "\n" +
                        "But critics accuse her of authoritarianism and crippling the opposition -- including arch-rival Khaleda Zia who is serving 17 years in prison on graft charges -- to cling on to power.\n" +
                        "\n" +
                        "The election campaign was marred by violence between supporters of Hasina's Awami League and Zia's BNP.\n" +
                        "\n" +
                        "Some 600,000 security personnel were deployed across the South Asian country, including at 40,000 polling stations.\n" +
                        "\n" +
                        "Authorities ordered mobile operators to shut down 3G and 4G services until midnight on Sunday \"to prevent the spread of rumours\" that could trigger unrest.\n" +
                        "\n" +
                        "The election-day deaths brought to 16 the official police toll for election violence since the ballot was announced on November 8.\n" +
                        "\n" +
                        "Police said they acted \"in self-defence\" in the southern town of Bashkhali, when they opened fire on opposition supporters who attempted to storm a polling booth, killing one.\n" +
                        "\n" +
                        "In a separate incident another man was shot by police after he tried to steal a ballot box.\n" +
                        "\n" +
                        "Free and fair?\n" +
                        "\n" +
                        "Opinion polls show Hasina, who has presided over six percent GDP expansion every year since she won a landslide in 2008, heading for a comfortable victory that would extend her reign as the country's longest-serving leader.\n" +
                        "\n" +
                        "She needs 151 seats in the first-past-the-post system to control the 300-seat parliament but experts say a victory would be sullied by accusations that she hamstrung her opponents' campaign and scared people into voting for her.",
                "https://c.ndtvimg.com/2018-12/s2re5ui_bangladesh-polls_625x300_30_December_18.jpg"));

        newsList.add(DataTemplate(
                "রাজধানী",
                "ডিএমপির ৩৩ ওসিকে ঢাকার ভেতরেই রাখার প্রস্তাব",
                "বিশেষ প্রতিনিধি",
                "ঢাকা মহানগর পুলিশের (ডিএমপি) ৩৩ থানার ওসিদের রদবদলের প্রস্তাব নির্বাচন কমিশনে (ইসি) পাঠানো হয়েছে। প্রস্তাবটি ইসির অনুমোদন পেলে নতুনভাবে কে কোন থানার দায়িত্ব পাবেন, সেই প্রজ্ঞাপন আজ বুধবার জারি হতে পারে।",
                "https://samakal.com/media/imgAll/2023December/dmp-1701804841.jpg"));

        newsList.add(DataTemplate(
                "সারাদেশ",
                "ফুটবল খেলা নিয়ে সংঘর্ষে আহত ২৫",
                "জগন্নাথপুর (সুনামগঞ্জ) প্রতিনিধি",
                "সুনামগঞ্জ জেলার জগন্নাথপুর উপজেলা পল্লিতে শিশুদের ফুটবল খেলাকে কেন্দ্র করে দু’পক্ষের সংঘর্ষে ২৫ জন আহত হয়েছেন। এর মধ্যে ১৩ জনকে সিলেট ওসমানী মেডিকেল কলেজ হাসপাতালে ভর্তি করা হয়েছে। অপর আহতরা স্থানীয় উপজেলা স্বাস্থ্যকেন্দ্রে চিকিৎসাধীন রয়েছেন।",
                "https://samakal.com/media/imgAll/2023December/hospital-1701820086.jpeg"));

        newsList.add(DataTemplate(
                "রাজনীতি",
                "আজ থেকে ফের ৪৮ ঘণ্টার অবরোধ",
                "নিজেস্ব প্রতিবেদক",
                "সরকার পতনের এক দফা দাবিতে আজ বুধবার সকাল ৬টা থেকে দেশজুড়ে আবারও ৪৮ ঘণ্টা অবরোধ পালন করবে বিএনপি ও সমমনা দলগুলো। আগামী শুক্রবার সকাল ৬টা পর্যন্ত অবরোধ চলবে। এরপর মাঝখানে শুক্র ও শনিবার বিরতি দিয়ে আগামী রোববার বিএনপি সারাদেশে মানববন্ধন কর্মসূচি পালন করবে।",
                "https://samakal.com/media/imgAll/2023December/obrodh-1701819103.jpg"));

        newsList.add(DataTemplate(
                "বাংলাদেশ",
                "শ্রম আইন সংশোধনের ফয়সালা পরবর্তী সংসদে",
                "নিজেস্ব প্রতিবেদক",
                "সম্মতি না দিয়ে রাষ্ট্রপতি মো. সাহাবুদ্দিনের ফেরত পাঠানো ‘বাংলাদেশ শ্রম (সংশোধন) বিল ২০২৩’-এর ফয়সালা করতে হবে আগামী সংসদে। পরবর্তী সংসদের প্রথম অধিবেশনে উপস্থাপন করতে হবে এটি।",
                "https://samakal.com/media/imgAll/2023December/labour-1701807093.jpg"));

        newsList.add(DataTemplate(
                "বাংলাদেশ",
                "নতুন আলু-পেঁয়াজের সরবরাহ বাড়লেও কমেনি দাম",
                "নিজেস্ব প্রতিবেদক",
                "দেশে উৎপাদিত নতুন আলু ও পাতাসহ পেঁয়াজ বাজারে এসেছে। এর পরও পণ্য দুটির দামের লাগাম টানা যাচ্ছে না। মাঝে কিছুটা কমে আবারও দাম বাড়তে শুরু করেছে। গত চার-পাঁচ দিনের ব্যবধানে আলুর দাম কেজিতে সর্বোচ্চ ১০ টাকা এবং পেঁয়াজ কেজিতে ১৫ টাকা বেড়েছে। ",
                "https://samakal.com/media/imgAll/2023December/untitled-1-1701800299.jpg"));

        newsList.add(DataTemplate(
                "রাজনীতি",
                "আ.লীগ ভোট করবে জোটে, আসন বিন্যাস ১৭ ডিসেম্বরের মধ্যে",
                "নিজেস্ব প্রতিবেদক",
                "১৪ দলীয় জোটের সমন্বয়ক ও মুখপাত্র আমির হোসেন আমু বলেছেন, নির্বাচন জোটগতভাবে হবে, কাল (বুধবার) জাতীয় পার্টির সঙ্গে আলোচনা করবে আওয়ামী লীগ। জোটের আসন বিন্যাস ও প্রার্থী চূড়ান্ত করতে ১৭ ডিসেম্বর পর্যন্ত অপেক্ষা করতে হবে।",
                "https://samakal.com/media/imgAll/2023December/amu-1701782960.jpg"));

        newsList.add(DataTemplate(
                "বিনোদন",
                "বাংলা সিনেমায় অভিনয় করতে চান সালমান খান",
                "কলকাতা প্রতিনিধি",
                "বাংলা সিনেমায় অভিনয়ের ইচ্ছাও প্রকাশ করলেন সালমান খান। ২৯তম কলকাতা আন্তর্জাতিক চলচ্চিত্র উৎসবের উদ্বোধনী মঞ্চে হাজির হয়ে তার এই ইচ্ছের কথা প্রকাশ করেন বলিউড ভাইজান।",
                "https://www.samakal.com/media/imgAll/2023December/salman-1701795336.jpg"));

        newsList.add(DataTemplate(
                "বাংলাদেশ",
                "নতুন শিক্ষাক্রম বাতিল করবে এ সরকারই: আনু মুহাম্মদ ",
                "বিশ্ববিদ্যালয় প্রতিবেদক ",
                "জাহাঙ্গীরনগর বিশ্ববিদ্যালয়ের অর্থনীতি বিভাগের প্রাক্তন অধ্যাপক, চিন্তাবিদ ও গবেষক আনু মুহাম্মদ বলেছেন, শিক্ষার মানে হলো নতুন জ্ঞানের জন্য শিক্ষার্থীরা আগ্রহী হবে। বর্তমানে ক’টি স্কুলে ল্যাব আছে, লাইব্রেরি আছে? এখন তো স্কুলগুলোতে খেলার মাঠও নেই। ",
                "https://www.samakal.com/media/imgAll/2023December/anu-md-1701791919.jpg"));

        newsList.add(DataTemplate(
                "সারাদেশ",
                "মিছিল থেকে মশাল ছুড়ে বাসে আগুন, ৩ ছাত্রদল কর্মী গ্রেপ্তার",
                "চট্টগ্রাম ব্যুরো",
                "চট্টগ্রামে মশাল ছুড়ে বাসে আগুন দেওয়ার ঘটনায় ৩ যুবককে গ্রেপ্তার করেছে নগর গোয়েন্দা পুলিশ (ডিবি)। সোমবার রাতে নগরের খুলশী ও চান্দগাঁও এলাকায় অভিযান চালিয়ে তাদের গ্রেপ্তার করা হয়।",
                "https://samakal.com/media/imgAll/2023December/ctg-jcd-worker-arrested-photo-1701820962.jpeg"));

        newsList.add(DataTemplate(
                "রাজধানী",
                "ফেসবুকে ভ্রমণ প্যাকেজের নামে অর্থ আত্মসাৎ, চক্রের ৩ সদস্য গ্রেপ্তার",
                "নিজেস্ব প্রতিবেদক",
                "দেশ-বিদেশে ভ্রমণ প্যাকেজের নামে অগ্রিম টাকা নিয়ে আত্মসাৎ করে– এমন এক চক্রের ৩ জনকে গ্রেপ্তার করা হয়েছে। ঢাকা মহানগর গোয়েন্দা (ডিবি) পুলিশের সাইবার টিম সোমবার রাজধানীর কলাবাগান ও ভাটারা এলাকা থেকে তাদের গ্রেপ্তার করে।",
                "https://samakal.com/media/imgAll/2023December/arrest-1701815912.jpg"));

        newsList.add(DataTemplate(
                "সারাদেশ",
                "রোহিঙ্গা ক্যাম্পে দু’গ্রুপের গোলাগুলিতে নিহত ৩",
                "টেকনাফ (কক্সবাজার) প্রতিনিধি",
                "কক্সবাজারের উখিয়ায় শরণার্থী শিবিরে ‘আধিপত্য বিস্তারকে’ কেন্দ্র করে মিয়ানমারের সশস্ত্র সন্ত্রাসী সংগঠন আরাকান রোহিঙ্গা স্যালভেশন আর্মি (আরসা) ও রোহিঙ্গা সলিডারিটি অর্গানাইজেশনের (আরএসও) মধ্যে গুলাগুলির ঘটনা ঘটেছে।",
                "https://samakal.com/media/imgAll/2023December/camp-1701809288.jpg"));

        newsList.add(DataTemplate(
                "সারাদেশ",
                "বগুড়ায় মধ্যরাতে খড়বোঝাই ট্রাকে আগুন",
                "বগুড়া ব্যুরো",
                "বগুড়ার শাজাহানপুরে ঢাকা-রংপুর মহাসড়কে খড়বোঝাই ট্রাকে আগুন দিয়েছে দুর্বৃত্তরা। মঙ্গলবার দিবাগত রাত ১টার দিকে উপজেলার নয়মাইলে এ ঘটনা ঘটে। খবর পেয়ে ফায়ার সার্ভিস ও সিভিল ডিফেন্সের সদস্যরা প্রায় আধাঘন্টার চেষ্টায় আগুন নিয়ন্ত্রণে আনে।",
                "https://samakal.com/media/imgAll/2023December/bogra-1701808387.jpg"));

        newsList.add(DataTemplate(
                "খেলা",
                "তপু-জিকোর নিষেধাজ্ঞা কমল",
                "ক্রীড়া প্রতিবেদক",
                "মদকাণ্ডে নিষিদ্ধ হয়েছিলেন জাতীয় দলের ফুটবলার তপু বর্মণ ও আনিসুর রহমান জিকো। তাদের শাস্তি কমিয়েছে বসুন্ধরা কিংস কর্তৃপক্ষ। আগামী ১২ ডিসেম্বর তপু ও জিকোকে ক্লাবের ক্যাম্পে যোগ দিতে বলা হয়েছে।",
                "https://www.samakal.com/media/imgAll/2023December/zico-topu-1701793610.jpg"));

        newsList.add(DataTemplate(
                "বাংলাদেশ",
                "আরও বোয়িং কেনার প্রস্তাব পিটার হাসের",
                "নিজেস্ব প্রতিবেদক",
                "বিমান বাংলাদেশ এয়ারলাইন্সের কর্মকর্তাদের সঙ্গে বৈঠক করেছেন ঢাকায় নিযুক্ত যুক্তরাষ্ট্রের রাষ্ট্রদূত পিটার হাস। মঙ্গলবার বিমানের প্রধান কার্যালয় বলাকায় অনুষ্ঠিত এ বৈঠকে আরও বোয়িং কেনার প্রস্তাব দেন তিনি।",
                "https://samakal.com/media/imgAll/2023December/peter-has-1701805782.jpg"));

        newsList.add(DataTemplate(
                "সারাদেশ",
                "আটোয়ারী সীমান্তে মিলল সাড়ে ৩ কোটি টাকার স্বর্ণ",
                "পঞ্চগড় প্রতিনিধি",
                "পঞ্চগড়ের আটোয়ারী উপজেলার বাংলাদেশ-ভারত সীমান্তে এবার পরিত্যক্ত অবস্থায় ৪ কেজি ৮৬ গ্রাম ওজনের পাঁচটি স্বর্ণের বার ও ১৫টি স্বর্ণের বিস্কুট উদ্ধার করেছে বিজিবি। উদ্ধার স্বর্ণের বাজারমূল্য ৩ কোটি ৫১ লাখ ২৫ হাজার টাকা।",
                "https://samakal.com/media/imgAll/2023December/panchagarh-border-gold-pic-01-1701800461.jpg"));

        newsList.add(DataTemplate(
                "অর্থনীতি",
                "চক্রাকার অর্থনীতিতে না গেলে ঝুঁকিতে পড়বে রপ্তানি খাত",
                "নিজেস্ব প্রতিবেদক",
                "জলবায়ুর প্রতিকূল পরিস্থিতিতে পরিবেশ সচেতনতা বাড়ছে বিশ্বব্যাপী। উৎপাদন থেকে ভোক্তা সব পর্যায়েই প্রাকৃতিক সম্পদের সচেতন ব্যবহারের বিষয়ে গুরুত্ব দেওয়া হচ্ছে।",
                "https://www.samakal.com/media/imgAll/2023December/untitled-1-1701792639.jpg"));

        newsList.add(DataTemplate(
                "বিনোদন",
                "‘সিআইডি’ ধারাবাহিকের দীনেশ ফাদনিস মারা গেছেন",
                "বিনোদন ডেস্ক",
                "প্রথম ভারতীয় গোয়েন্দা ভিত্তিক টিভি সিরিজ ‘সি. আই. ডি’ এর অভিনেতা  দীনেশ ফাদনিস মারা গেছেন। সোমবার  দিবাগত রাত ১২টায় হাসপাতালে চিকিৎসাধীন অবস্থায় শেষ নিঃশ্বাস ত্যাগ করেন তিনি। তার বয়স হয়েছিল ৫৭ বছর। টাইমস অব ইন্ডিয়া এ খবর প্রকাশ করেছে।",
                "https://www.samakal.com/media/imgAll/2023December/58-1701762101.jpg"));


    }

    //===========================================================
    //===========================================================
    public class GridViewAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return newsList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.card_news_item, parent, false);

            RelativeLayout card_lay = myView.findViewById(R.id.card_lay);
            ImageView card_cover = myView.findViewById(R.id.card_cover);
            TextView card_title = myView.findViewById(R.id.card_title);
            TextView card_des = myView.findViewById(R.id.card_des);
            TextView card_cat = myView.findViewById(R.id.card_cat);

            HashMap<String, String> news = newsList.get(position);

            String cat = news.get("cat");
            String title = news.get("title");
            String reporting = news.get("reporting");
            String des = news.get("des");
            String imgUrl = news.get("imgUrl");

            Picasso.get().load(imgUrl).placeholder(R.drawable.demo_img).into(card_cover);
            card_title.setText(title);
            card_des.setText(des);
            card_cat.setText(cat);

            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
            card_lay.setAnimation(animation);


            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            card_cat.setBackgroundColor(color);

            card_lay.setOnClickListener(v -> {
                // Get current date and time
                Calendar calendar = Calendar.getInstance();
                Date currentDate = calendar.getTime();

                // Format the date and time
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm a", Locale.getDefault());

                String formattedDateTime = dateFormat.format(currentDate);
                String formattedTime = timeFormat.format(calendar.getTime());
                NewsActivity.TIME = convertTo12HourFormat(formattedTime);
                NewsActivity.DATE = formattedDateTime;

                NewsActivity.CATEGORY = cat;
                NewsActivity.TITLE = title;
                NewsActivity.REPORTING = reporting;
                NewsActivity.DESCRIPTIONS = des;
                NewsActivity.ColorBg = color;
                NewsActivity.IMG_BITMAP = ((BitmapDrawable) card_cover.getDrawable()).getBitmap();
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(intent);
            });


            return myView;
        }
    }
    //===========================================================
    //===========================================================


    private static String convertTo12HourFormat(String time24Hour) {
        SimpleDateFormat sdf24Hour = new SimpleDateFormat("HH:mm", Locale.getDefault());
        SimpleDateFormat sdf12Hour = new SimpleDateFormat("h:mm a", Locale.getDefault());

        try {
            // Parse the input time string
            Date date = sdf24Hour.parse(time24Hour);

            // Format the date in 12-hour format
            assert date != null;
            return sdf12Hour.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid time format";
        }
    }

    // Inside an activity or a context
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

}//Main Class