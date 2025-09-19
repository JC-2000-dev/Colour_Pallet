package com.example.jc.color_pallet;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int r = 255, g = 255, b = 255;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LinearLayout cLayout = (LinearLayout) findViewById(R.id.viewColor);
        cLayout.setBackgroundColor(Color.rgb(r, g, b));



//////////////////////////////////////////***********  R  **********///////////
        final TextView rView = (TextView)findViewById(R.id.rNumView);

        final Button rbutton1 = (Button)findViewById(R.id.rButton1);
        final Button rbutton2 = (Button)findViewById(R.id.rButton2);
        final Button rbutton3 = (Button)findViewById(R.id.rButton3);
        final Button rbutton4 = (Button)findViewById(R.id.rButton4);
        final Button rResetbutton = (Button)findViewById(R.id.rResetButton);



        ///////rButton1(-10)
        assert rbutton1 != null;
        rbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                r = r -10;
                if (r<0){r = 0;}
                assert rView != null;
                String srtR = String.valueOf(r);
                rView.setText(srtR);

                ChangeColour();

            }

        });

        ///////rButton2(-1)
        assert rbutton2 != null;
        rbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                r = r -1;
                if (r<0){r = 0;}
                assert rView != null;
                String srtR = String.valueOf(r);
                rView.setText(srtR);

                ChangeColour();

            }

        });

        ///////rButton3(+1)
        assert rbutton3 != null;
        rbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                r = r + 1;
                if (r > 255){r = 255;}
                assert rView != null;
                String srtR = String.valueOf(r);
                rView.setText(srtR);

                ChangeColour();

            }

        });

        ///////rButton4(+10)
        assert rbutton4 != null;
        rbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                r = r + 10;
                if (r > 255){r = 255;}
                assert rView != null;
                String srtR = String.valueOf(r);
                rView.setText(srtR);

                ChangeColour();

            }

        });

        ///////rButton3(+1)
        assert rResetbutton != null;
        rResetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                r = 255;

                assert rView != null;
                String srtR = String.valueOf(r);
                rView.setText(srtR);

                ChangeColour();

            }

        });

//////////////////////////////////////////***********  R  **********///////////
        final TextView gView = (TextView)findViewById(R.id.gNumView);

        final Button gbutton1 = (Button)findViewById(R.id.gButton1);
        final Button gbutton2 = (Button)findViewById(R.id.gButton2);
        final Button gbutton3 = (Button)findViewById(R.id.gButton3);
        final Button gbutton4 = (Button)findViewById(R.id.gButton4);
        final Button gResetbutton = (Button)findViewById(R.id.gResetButton);

        ///////gButton1(-10)
        assert gbutton1 != null;
        gbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                g = g -10;
                if (g < 0){g = 0;}
                assert gView != null;
                String srtG = String.valueOf(g);
                gView.setText(srtG);

                ChangeColour();

            }

        });

        ///////gButton2(-1)
        assert gbutton2 != null;
        gbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                g = g -1;
                if (g <0){g = 0;}
                assert gView != null;
                String srtG = String.valueOf(g);
                gView.setText(srtG);

                ChangeColour();

            }

        });

        ///////rButton3(+1)
        assert gbutton3 != null;
        gbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                g = g + 1;
                if (g > 255){g = 255;}
                assert gView != null;
                String srtG = String.valueOf(g);
                gView.setText(srtG);

                ChangeColour();

            }

        });

        ///////gButton4(+10)
        assert gbutton4 != null;
        gbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                g = g + 10;
                if (g > 255){g = 255;}
                assert gView != null;
                String srtG = String.valueOf(g);
                gView.setText(srtG);

                ChangeColour();

            }

        });

        ///////rButton3(+1)
        assert gResetbutton != null;
        gResetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                g = 255;

                assert gView != null;
                String srtG = String.valueOf(g);
                gView.setText(srtG);

                ChangeColour();

            }

        });


//////////////////////////////////////////***********  B  **********///////////
        final TextView bView = (TextView)findViewById(R.id.bNumView);

        final Button bbutton1 = (Button)findViewById(R.id.bButton1);
        final Button bbutton2 = (Button)findViewById(R.id.bButton2);
        final Button bbutton3 = (Button)findViewById(R.id.bButton3);
        final Button bbutton4 = (Button)findViewById(R.id.bButton4);
        final Button bResetbutton = (Button)findViewById(R.id.bResetButton);

        ///////bButton1(-10)
        assert bbutton1 != null;
        bbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b = b -10;
                if (b < 0){b = 0;}
                assert bView != null;
                String srtB = String.valueOf(b);
                bView.setText(srtB);

                ChangeColour();

            }

        });

        ///////bButton2(-1)
        assert bbutton2 != null;
        bbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b = b -1;
                if (b <0){b = 0;}
                assert bView != null;
                String srtB = String.valueOf(b);
                bView.setText(srtB);

                ChangeColour();

            }

        });

        ///////bButton3(+1)
        assert bbutton3 != null;
        bbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b = b + 1;
                if (b > 255){b = 255;}
                assert bView != null;
                String srtB = String.valueOf(b);
                bView.setText(srtB);

                ChangeColour();

            }

        });

        ///////bButton4(+10)
        assert bbutton4 != null;
        bbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b = b + 10;
                if (b > 255){b = 255;}
                assert bView != null;
                String srtB = String.valueOf(b);
                bView.setText(srtB);

                ChangeColour();

            }

        });

        ///////bButton3(+1)
        assert bResetbutton != null;
        bResetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b = 255;

                assert bView != null;
                String srtB = String.valueOf(b);
                bView.setText(srtB);

                ChangeColour();

            }

        });











    }//onCreate










///////// CHANGE COLOR ///////////////////
    public void ChangeColour() {

        final TextView dispName = (TextView)findViewById(R.id.nameDisplay);
        assert dispName != null;
        dispName.setBackgroundColor(0xffffff);
        dispName.setText("");

        LinearLayout cLayout = (LinearLayout) findViewById(R.id.viewColor);
        cLayout.setBackgroundColor(Color.rgb(r, g, b));

        ColorName();
    }




    String [] colorRGB = {"255,250,250",
            "248,248,255",
            "245,245,245",
            "220,220,220",
            "255,250,240",
            "253,245,230",
            "250,240,230",
            "250,235,215",
            "255,239,213",
            "255,235,205",
            "255,228,196",
            "255,218,185",
            "255,222,173",
            "255,228,181",
            "255,248,220",
            "255,255,240",
            "255,250,205",
            "255,245,238",
            "240,255,240",
            "245,255,250",
            "240,255,255",
            "240,248,255",
            "230,230,250",
            "255,240,245",
            "255,228,225",
            "255,255,255",
            "0,0,0",
            "47,79,79",
            "105,105,105",
            "112,128,144",
            "119,136,153",
            "190,190,190",
            "211,211,211",
            "25,25,112",
            "0,0,128",
            "100,149,237",
            "72,61,139",
            "106,90,205",
            "123,104,238",
            "132,112,255",
            "0,0,205",
            "65,105,225",
            "0,0,255",
            "30,144,255",
            "0,191,255",
            "135,206,235",
            "135,206,250",
            "70,130,180",
            "176,196,222",
            "173,216,230",
            "176,224,230",
            "175,238,238",
            "0,206,209",
            "72,209,204",
            "64,224,208",
            "0,255,255",
            "224,255,255",
            "95,158,160",
            "102,205,170",
            "127,255,212",
            "0,100,0",
            "85,107,47",
            "143,188,143",
            "46,139,87",
            "60,179,113",
            "32,178,170",
            "152,251,152",
            "0,255,127",
            "124,252,0",
            "0,255,0",
            "127,255,0",
            "0,250,154",
            "173,255,47",
            "50,205,50",
            "154,205,50",
            "34,139,34",
            "107,142,35",
            "189,183,107",
            "240,230,140",
            "238,232,170",
            "250,250,210",
            "255,255,224",
            "255,255,0",
            "255,215,0",
            "238,221,130",
            "218,165,32",
            "184,134,11",
            "188,143,143",
            "205,92,92",
            "139,69,19",
            "160,82,45",
            "205,133,63",
            "222,184,135",
            "245,245,220",
            "245,222,179",
            "244,164,96",
            "210,180,140",
            "210,105,30",
            "178,34,34",
            "165,42,42",
            "233,150,122",
            "250,128,114",
            "255,160,122",
            "255,165,0",
            "255,140,0",
            "255,127,80",
            "240,128,128",
            "255,99,71",
            "255,69,0",
            "255,0,0",
            "255,105,180",
            "255,20,147",
            "255,192,203",
            "255,182,193",
            "219,112,147",
            "176,48,96",
            "199,21,133",
            "208,32,144",
            "255,0,255",
            "238,130,238",
            "221,160,221",
            "218,112,214",
            "186,85,211",
            "153,50,204",
            "148,0,211",
            "138,43,226",
            "160,32,240",
            "147,112,219",
            "216,191,216",
            "255,250,250",
            "238,233,233",
            "205,201,201",
            "139,137,137",
            "255,245,238",
            "238,229,222",
            "205,197,191",
            "139,134,130",
            "255,239,219",
            "238,223,204",
            "205,192,176",
            "139,131,120",
            "255,228,196",
            "238,213,183",
            "205,183,158",
            "139,125,107",
            "255,218,185",
            "238,203,173",
            "205,175,149",
            "139,119,101",
            "255,222,173",
            "238,207,161",
            "205,179,139",
            "139,121,94",
            "255,250,205",
            "238,233,191",
            "205,201,165",
            "139,137,112",
            "255,248,220",
            "238,232,205",
            "205,200,177",
            "139,136,120",
            "255,255,240",
            "238,238,224",
            "205,205,193",
            "139,139,131",
            "240,255,240",
            "224,238,224",
            "193,205,193",
            "131,139,131",
            "255,240,245",
            "238,224,229",
            "205,193,197",
            "139,131,134",
            "255,228,225",
            "238,213,210",
            "205,183,181",
            "139,125,123",
            "240,255,255",
            "224,238,238",
            "193,205,205",
            "131,139,139",
            "131,111,255",
            "122,103,238",
            "105,89,205",
            "71,60,139",
            "72,118,255",
            "67,110,238",
            "58,95,205",
            "39,64,139",
            "0,0,255",
            "0,0,238",
            "0,0,205",
            "0,0,139",
            "30,144,255",
            "28,134,238",
            "24,116,205",
            "16,78,139",
            "99,184,255",
            "92,172,238",
            "79,148,205",
            "54,100,139",
            "0,191,255",
            "0,178,238",
            "0,154,205",
            "0,104,139",
            "135,206,255",
            "126,192,238",
            "108,166,205",
            "74,112,139",
            "176,226,255",
            "164,211,238",
            "141,182,205",
            "96,123,139",
            "198,226,255",
            "185,211,238",
            "159,182,205",
            "108,123,139",
            "202,225,255",
            "188,210,238",
            "162,181,205",
            "110,123,139",
            "191,239,255",
            "178,223,238",
            "154,192,205",
            "104,131,139",
            "224,255,255",
            "209,238,238",
            "180,205,205",
            "122,139,139",
            "187,255,255",
            "174,238,238",
            "150,205,205",
            "102,139,139",
            "152,245,255",
            "142,229,238",
            "122,197,205",
            "83,134,139",
            "0,245,255",
            "0,229,238",
            "0,197,205",
            "0,134,139",
            "0,255,255",
            "0,238,238",
            "0,205,205",
            "0,139,139",
            "151,255,255",
            "141,238,238",
            "121,205,205",
            "82,139,139",
            "127,255,212",
            "118,238,198",
            "102,205,170",
            "69,139,116",
            "193,255,193",
            "180,238,180",
            "155,205,155",
            "105,139,105",
            "84,255,159",
            "78,238,148",
            "67,205,128",
            "46,139,87",
            "154,255,154",
            "144,238,144",
            "124,205,124",
            "84,139,84",
            "0,255,127",
            "0,238,118",
            "0,205,102",
            "0,139,69",
            "0,255,0",
            "0,238,0",
            "0,205,0",
            "0,139,0",
            "127,255,0",
            "118,238,0",
            "102,205,0",
            "69,139,0",
            "192,255,62",
            "179,238,58",
            "154,205,50",
            "105,139,34",
            "202,255,112",
            "188,238,104",
            "162,205,90",
            "110,139,61",
            "255,246,143",
            "238,230,133",
            "205,198,115",
            "139,134,78",
            "255,236,139",
            "238,220,130",
            "205,190,112",
            "139,129,76",
            "255,255,224",
            "238,238,209",
            "205,205,180",
            "139,139,122",
            "255,255,0",
            "238,238,0",
            "205,205,0",
            "139,139,0",
            "255,215,0",
            "238,201,0",
            "205,173,0",
            "139,117,0",
            "255,193,37",
            "238,180,34",
            "205,155,29",
            "139,105,20",
            "255,185,15",
            "238,173,14",
            "205,149,12",
            "139,101,8",
            "255,193,193",
            "238,180,180",
            "205,155,155",
            "139,105,105",
            "255,106,106",
            "238,99,99",
            "205,85,85",
            "139,58,58",
            "255,130,71",
            "238,121,66",
            "205,104,57",
            "139,71,38",
            "255,211,155",
            "238,197,145",
            "205,170,125",
            "139,115,85",
            "255,231,186",
            "238,216,174",
            "205,186,150",
            "139,126,102",
            "255,165,79",
            "238,154,73",
            "205,133,63",
            "139,90,43",
            "255,127,36",
            "238,118,33",
            "205,102,29",
            "139,69,19",
            "255,48,48",
            "238,44,44",
            "205,38,38",
            "139,26,26",
            "255,64,64",
            "238,59,59",
            "205,51,51",
            "139,35,35",
            "255,140,105",
            "238,130,98",
            "205,112,84",
            "139,76,57",
            "255,160,122",
            "238,149,114",
            "205,129,98",
            "139,87,66",
            "255,165,0",
            "238,154,0",
            "205,133,0",
            "139,90,0",
            "255,127,0",
            "238,118,0",
            "205,102,0",
            "139,69,0",
            "255,114,86",
            "238,106,80",
            "205,91,69",
            "139,62,47",
            "255,99,71",
            "238,92,66",
            "205,79,57",
            "139,54,38",
            "255,69,0",
            "238,64,0",
            "205,55,0",
            "139,37,0",
            "255,0,0",
            "238,0,0",
            "205,0,0",
            "139,0,0",
            "255,20,147",
            "238,18,137",
            "205,16,118",
            "139,10,80",
            "255,110,180",
            "238,106,167",
            "205,96,144",
            "139,58,98",
            "255,181,197",
            "238,169,184",
            "205,145,158",
            "139,99,108",
            "255,174,185",
            "238,162,173",
            "205,140,149",
            "139,95,101",
            "255,130,171",
            "238,121,159",
            "205,104,137",
            "139,71,93",
            "255,52,179",
            "238,48,167",
            "205,41,144",
            "139,28,98",
            "255,62,150",
            "238,58,140",
            "205,50,120",
            "139,34,82",
            "255,0,255",
            "238,0,238",
            "205,0,205",
            "139,0,139",
            "255,131,250",
            "238,122,233",
            "205,105,201",
            "139,71,137",
            "255,187,255",
            "238,174,238",
            "205,150,205",
            "139,102,139",
            "224,102,255",
            "209,95,238",
            "180,82,205",
            "122,55,139",
            "191,62,255",
            "178,58,238",
            "154,50,205",
            "104,34,139",
            "155,48,255",
            "145,44,238",
            "125,38,205",
            "85,26,139",
            "171,130,255",
            "159,121,238",
            "137,104,205",
            "93,71,139",
            "255,225,255",
            "238,210,238",
            "205,181,205",
            "139,123,139",
            "28,28,28",
            "54,54,54",
            "79,79,79",
            "105,105,105",
            "130,130,130",
            "156,156,156",
            "181,181,181",
            "207,207,207",
            "232,232,232",
            "169,169,169",
            "0,0,139",
            "0,139,139",
            "139,0,139",
            "139,0,0",
            "144,238,144",

    };
    String [] colorName = {"Snow",
            "GhostWhite",
            "WhiteSmoke",
            "Gainsboro",
            "FloralWhite",
            "OldLace",
            "Linen",
            "AntiqueWhite",
            "PapayaWhip",
            "BlanchedAlmond",
            "Bisque",
            "PeachPuff",
            "NavajoWhite",
            "Moccasin",
            "Cornsilk",
            "Ivory",
            "LemonChiffon",
            "Seashell",
            "Honeydew",
            "MintCream",
            "Azure",
            "AliceBlue",
            "lavender",
            "LavenderBlush",
            "MistyRose",
            "White",
            "Black",
            "DarkSlateGray",
            "DimGrey",
            "SlateGrey",
            "LightSlateGray",
            "Grey",
            "LightGray",
            "MidnightBlue",
            "NavyBlue (Navy)",
            "CornflowerBlue",
            "DarkSlateBlue",
            "SlateBlue",
            "MediumSlateBlue",
            "LightSlateBlue",
            "MediumBlue",
            "RoyalBlue",
            "Blue",
            "DodgerBlue",
            "DeepSkyBlue",
            "SkyBlue",
            "LightSkyBlue",
            "SteelBlue",
            "LightSteelBlue",
            "LightBlue",
            "PowderBlue",
            "PaleTurquoise",
            "DarkTurquoise",
            "MediumTurquoise",
            "Turquoise",
            "Cyan",
            "LightCyan",
            "CadetBlue",
            "MediumAquamarine",
            "Aquamarine",
            "DarkGreen",
            "DarkOliveGreen",
            "DarkSeaGreen",
            "SeaGreen",
            "MediumSeaGreen",
            "LightSeaGreen",
            "PaleGreen",
            "SpringGreen",
            "LawnGreen",
            "Green",
            "Chartreuse",
            "MediumSpringGreen",
            "GreenYellow",
            "LimeGreen",
            "YellowGreen",
            "ForestGreen",
            "OliveDrab",
            "DarkKhaki",
            "Khaki",
            "PaleGoldenrod",
            "LightGoldenrodYellow",
            "LightYellow",
            "Yellow",
            "Gold",
            "LightGoldenrod",
            "goldenrod",
            "DarkGoldenrod",
            "RosyBrown",
            "IndianRed",
            "SaddleBrown",
            "Sienna",
            "Peru",
            "Burlywood",
            "Beige",
            "Wheat",
            "SandyBrown",
            "Tan",
            "Chocolate",
            "Firebrick",
            "Brown",
            "DarkSalmon",
            "Salmon",
            "LightSalmon",
            "Orange",
            "DarkOrange",
            "Coral",
            "LightCoral",
            "Tomato",
            "OrangeRed",
            "Red",
            "HotPink",
            "DeepPink",
            "Pink",
            "LightPink",
            "PaleVioletRed",
            "Maroon",
            "MediumVioletRed",
            "VioletRed",
            "Magenta",
            "Violet",
            "Plum",
            "Orchid",
            "MediumOrchid",
            "DarkOrchid",
            "DarkViolet",
            "BlueViolet",
            "Purple",
            "MediumPurple",
            "Thistle",
            "Snow1",
            "Snow2",
            "Snow3",
            "Snow4",
            "Seashell1",
            "Seashell2",
            "Seashell3",
            "Seashell4",
            "AntiqueWhite1",
            "AntiqueWhite2",
            "AntiqueWhite3",
            "AntiqueWhite4",
            "Bisque1",
            "Bisque2",
            "Bisque3",
            "Bisque4",
            "PeachPuff1",
            "PeachPuff2",
            "PeachPuff3",
            "PeachPuff4",
            "NavajoWhite1",
            "NavajoWhite2",
            "NavajoWhite3",
            "NavajoWhite4",
            "LemonChiffon1",
            "LemonChiffon2",
            "LemonChiffon3",
            "LemonChiffon4",
            "Cornsilk1",
            "Cornsilk2",
            "Cornsilk3",
            "Cornsilk4",
            "Ivory1",
            "Ivory2",
            "Ivory3",
            "Ivory4",
            "Honeydew1",
            "Honeydew2",
            "Honeydew3",
            "Honeydew4",
            "LavenderBlush1",
            "LavenderBlush2",
            "LavenderBlush3",
            "LavenderBlush4",
            "MistyRose1",
            "MistyRose2",
            "MistyRose3",
            "MistyRose4",
            "Azure1",
            "Azure2",
            "Azure3",
            "Azure4",
            "SlateBlue1",
            "SlateBlue2",
            "SlateBlue3",
            "SlateBlue4",
            "RoyalBlue1",
            "RoyalBlue2",
            "RoyalBlue3",
            "RoyalBlue4",
            "Blue1",
            "Blue2",
            "Blue3",
            "Blue4",
            "DodgerBlue1",
            "DodgerBlue2",
            "DodgerBlue3",
            "DodgerBlue4",
            "SteelBlue1",
            "SteelBlue2",
            "SteelBlue3",
            "SteelBlue4",
            "DeepSkyBlue1",
            "DeepSkyBlue2",
            "DeepSkyBlue3",
            "DeepSkyBlue4",
            "SkyBlue1",
            "SkyBlue2",
            "SkyBlue3",
            "SkyBlue4",
            "LightSkyBlue1",
            "LightSkyBlue2",
            "LightSkyBlue3",
            "LightSkyBlue4",
            "SlateGray1",
            "SlateGray2",
            "SlateGray3",
            "SlateGray4",
            "LightSteelBlue1",
            "LightSteelBlue2",
            "LightSteelBlue3",
            "LightSteelBlue4",
            "LightBlue1",
            "LightBlue2",
            "LightBlue3",
            "LightBlue4",
            "LightCyan1",
            "LightCyan2",
            "LightCyan3",
            "LightCyan4",
            "PaleTurquoise1",
            "PaleTurquoise2",
            "PaleTurquoise3",
            "PaleTurquoise4",
            "CadetBlue1",
            "CadetBlue2",
            "CadetBlue3",
            "CadetBlue4",
            "Turquoise1",
            "Turquoise2",
            "Turquoise3",
            "Turquoise4",
            "Cyan1",
            "Cyan2",
            "Cyan3",
            "Cyan4",
            "DarkSlateGray1",
            "DarkSlateGray2",
            "DarkSlateGray3",
            "DarkSlateGray4",
            "Aquamarine1",
            "Aquamarine2",
            "Aquamarine3",
            "Aquamarine4",
            "DarkSeaGreen1",
            "DarkSeaGreen2",
            "DarkSeaGreen3",
            "DarkSeaGreen4",
            "SeaGreen1",
            "SeaGreen2",
            "SeaGreen3",
            "SeaGreen4",
            "PaleGreen1",
            "PaleGreen2",
            "PaleGreen3",
            "PaleGreen4",
            "SpringGreen1",
            "SpringGreen2",
            "SpringGreen3",
            "SpringGreen4",
            "Green1",
            "Green2",
            "Green3",
            "Green4",
            "Chartreuse1",
            "Chartreuse2",
            "Chartreuse3",
            "Chartreuse4",
            "OliveDrab1",
            "OliveDrab2",
            "OliveDrab3",
            "OliveDrab4",
            "DarkOliveGreen1",
            "DarkOliveGreen2",
            "DarkOliveGreen3",
            "DarkOliveGreen4",
            "Khaki1",
            "Khaki2",
            "Khaki3",
            "Khaki4",
            "LightGoldenrod1",
            "LightGoldenrod2",
            "LightGoldenrod3",
            "LightGoldenrod4",
            "LightYellow1",
            "LightYellow2",
            "LightYellow3",
            "LightYellow4",
            "Yellow1",
            "Yellow2",
            "Yellow3",
            "Yellow4",
            "Gold1",
            "Gold2",
            "Gold3",
            "Gold4",
            "Goldenrod1",
            "Goldenrod2",
            "Goldenrod3",
            "Goldenrod4",
            "DarkGoldenrod1",
            "DarkGoldenrod2",
            "DarkGoldenrod3",
            "DarkGoldenrod4",
            "RosyBrown1",
            "RosyBrown2",
            "RosyBrown3",
            "RosyBrown4",
            "IndianRed1",
            "IndianRed2",
            "IndianRed3",
            "IndianRed4",
            "Sienna1",
            "Sienna2",
            "Sienna3",
            "Sienna4",
            "Burlywood1",
            "Burlywood2",
            "Burlywood3",
            "Burlywood4",
            "Wheat1",
            "Wheat2",
            "Wheat3",
            "Wheat4",
            "Tan1",
            "Tan2",
            "Tan3",
            "Tan4",
            "Chocolate1",
            "Chocolate2",
            "Chocolate3",
            "Chocolate4",
            "Firebrick1",
            "Firebrick2",
            "Firebrick3",
            "Firebrick4",
            "Brown1",
            "Brown2",
            "Brown3",
            "Brown4",
            "Salmon1",
            "Salmon2",
            "Salmon3",
            "Salmon4",
            "LightSalmon1",
            "LightSalmon2",
            "LightSalmon3",
            "LightSalmon4",
            "Orange1",
            "Orange2",
            "Orange3",
            "Orange4",
            "DarkOrange1",
            "DarkOrange2",
            "DarkOrange3",
            "DarkOrange4",
            "Coral1",
            "Coral2",
            "Coral3",
            "Coral4",
            "Tomato1",
            "Tomato2",
            "Tomato3",
            "Tomato4",
            "OrangeRed1",
            "OrangeRed2",
            "OrangeRed3",
            "OrangeRed4",
            "Red1 ",
            "Red2 ",
            "Red3 ",
            "Red4 ",
            "DeepPink1",
            "DeepPink2",
            "DeepPink3",
            "DeepPink4",
            "HotPink1",
            "HotPink2",
            "HotPink3",
            "HotPink4",
            "Pink1",
            "Pink2",
            "Pink3",
            "Pink4",
            "LightPink1",
            "LightPink2",
            "LightPink3",
            "LightPink4",
            "PaleVioletRed1",
            "PaleVioletRed2",
            "PaleVioletRed3",
            "PaleVioletRed4",
            "Maroon1",
            "Maroon2",
            "Maroon3",
            "Maroon4",
            "VioletRed1",
            "VioletRed2",
            "VioletRed3",
            "VioletRed4",
            "Magenta1",
            "Magenta2",
            "Magenta3",
            "Magenta4",
            "Orchid1",
            "Orchid2",
            "Orchid3",
            "Orchid4",
            "Plum1",
            "Plum2",
            "Plum3",
            "Plum4",
            "MediumOrchid1",
            "MediumOrchid2",
            "MediumOrchid3",
            "MediumOrchid4",
            "DarkOrchid1",
            "DarkOrchid2",
            "DarkOrchid3",
            "DarkOrchid4",
            "Purple1",
            "Purple2",
            "Purple3",
            "Purple4",
            "MediumPurple1",
            "MediumPurple2",
            "MediumPurple3",
            "MediumPurple4",
            "Thistle1",
            "Thistle2",
            "Thistle3",
            "Thistle4",
            "grey11",
            "grey21",
            "grey31",
            "grey41",
            "grey51",
            "grey61",
            "grey71",
            "gray81",
            "gray91",
            "DarkGrey",
            "DarkBlue",
            "DarkCyan",
            "DarkMagenta",
            "DarkRed",
            "LightGreen",

    };

    int sizeRGB = colorRGB.length;
    int sizeName = colorName.length;



    /////////  GET NAME //////////////////
    public void ColorName() {

        final TextView dispName = (TextView)findViewById(R.id.nameDisplay);
        Log.d("log1","sizeRGB: "+sizeRGB);
        Log.d("log1","sizeName: "+sizeName);


        String masterRGB = r+","+g+","+b;
        Log.d("log1","******************************masterRGB: "+masterRGB);

        for (int i = 0; i < sizeRGB; i++){
            String rgb = colorRGB[i];


            if (rgb.equals(masterRGB) ){
                String name = colorName[i];
                assert dispName != null;
                dispName.setText(name);
                Log.d("log1","name: "+name);
                Log.d("log1","rgb: "+rgb);

                dispName.setBackgroundColor(0xaa6897ef);
            }
        }

    }


}//MAIN
