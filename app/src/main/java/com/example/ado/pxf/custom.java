package com.example.ado.pxf;


import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class custom  extends PagerAdapter{
    int amb;
    int[][] slide = {
            /*0*//*준비물*/{R.drawable.draifing1,R.drawable.draifing2,R.drawable.draifing3,R.drawable.draifing4,R.drawable.draifing5,R.drawable.draifing6,R.drawable.draifing7,R.drawable.draifing8},
            /*1*/{R.drawable.draifting1,R.drawable.draifting2,R.drawable.draifting3,R.drawable.draifting4,R.drawable.draifting5,R.drawable.draifting6,R.drawable.draifting7,R.drawable.draifting8},
            /*2*//*기본원형*/{R.drawable.bodice1_draifing,R.drawable.bodice2_draifing,R.drawable.bodice3_draifing,R.drawable.bodice4_draifing,R.drawable.bodice5_draifing,R.drawable.bodice6_draifing, R.drawable.bodice7_draifing,R.drawable.bodice8_draifing,R.drawable.bodice9_draifing},
            /*3*/{R.drawable.bodice1_draifting,R.drawable.bodice2_draifting,R.drawable.bodice3_draifting,R.drawable.bodice4_draifting,R.drawable.bodice5_draifting},
            /*4*/{R.drawable.coat1_draifting,R.drawable.coat2_draifting,R.drawable.coat3_draifting,R.drawable.coat4_draifting},
            /*5*/{R.drawable.pants1_draifting,R.drawable.pants2_draifting,R.drawable.pants3_draifting,R.drawable.pants4_draifting,R.drawable.pants5_draifting},
            /*6*/{R.drawable.skirt1_draifting,R.drawable.skirt2_draifting,R.drawable.skirt3_draifting,R.drawable.skirt4_draifting},
            /*7*/{R.drawable.sleeve1_draifting,R.drawable.sleeve2_draifting,R.drawable.sleeve4_draifting,R.drawable.sleeve5_draifting},
            /*8*/{R.drawable.torso1_draifting,R.drawable.torso2_draifting,R.drawable.torso3_draifting},
            /*9*//*치수*/{R.drawable.size1,R.drawable.size2},
            /*10*//*2/하의*/{R.drawable.goard1_draifing,R.drawable.goard2_draifing,R.drawable.goard3_draifing,R.drawable.goard4_draifing},
            /*11*//*바디선치기*/{R.drawable.line1_drafing,R.drawable.line2_drafing,R.drawable.line3_drafing,R.drawable.line4_drafing,R.drawable.line5_drafing,R.drawable.line6_drafing,R.drawable.line7_drafing,R.drawable.line8_drafing,R.drawable.line9_drafing,R.drawable.line10_drafing},
            /*12*//*카라다트*/{R.drawable.collar1_draifing,R.drawable.collar2_draifing},
            /*13*//*2/상의*/{R.drawable.gather1_draifing,R.drawable.gather2_draifing,R.drawable.gather3_draifing},
            /*14*/{R.drawable.skirt1_draifing,R.drawable.skirt2_draifing,R.drawable.skirt3_draifing,R.drawable.skirt4_draifing,R.drawable.skirt5_draifing,R.drawable.skirt6_draifing,R.drawable.skirt7_draifing},
            /*15*//*3/하의*/{R.drawable.highskirt1_draifting,R.drawable.highskirt2_draifting},
            /*16*/{R.drawable.pantalonpants1_draifting,R.drawable.pantalonpants2_draifting},
            /*17*/{R.drawable.tailoredpants1_draifting,R.drawable.tailoredpants2_draifting},
            /*18*/{R.drawable.tightskirt1_draifting,R.drawable.tightskirt2_draifting},
            /*19*//*원피스*/{R.drawable.drapedonepiece1_draifting,R.drawable.drapedonepiece2_draifting,R.drawable.drapedonepiece3_draifting},
            /*20*/{R.drawable.highneckonepiece1_draifting,R.drawable.highneckonepiece2_draifting,R.drawable.highneckonepiece3_draifting},
            /*21*//*소매*/{R.drawable.raglansleevecoat1_draifting,R.drawable.raglansleevecoat2_draifting,R.drawable.raglansleevecoat3_draifting,R.drawable.raglansleevecoat4_draifting},
            /*22*/{R.drawable.trenchcoat1_draifting,R.drawable.trenchcoat2_draifting,R.drawable.trenchcoat3_draifting,R.drawable.trenchcoat4_draifting},
            /*23*//*3/상의*/{R.drawable.rollcollarblouse1_draifting,R.drawable.rollcollarblouse2_draifting,R.drawable.rollcollarblouse3_draifting},
            /*24*/{R.drawable.yshirtsblouse1_draifting,R.drawable.yshirtsblouse2_draifting,R.drawable.yshirtsblouse3_draifting},
            /*25*//*악세사리*/{R.drawable.bag_acce},
            /*26*/{R.drawable.pouch1_acce,R.drawable.pouch2_acce},
            /*27*//*홈패션*/{R.drawable.making1_homefashion,R.drawable.making2_homefashion,R.drawable.making3_homefashion,R.drawable.making4_homefashion,R.drawable.making5_homefashion,R.drawable.making6_homefashion,R.drawable.making7_homefashion},
            /*28*/{R.drawable.slippers_homefashion},
            /*29*/{R.drawable.sofa1_homefashion,R.drawable.sofa2_homefashion}
    };



    LayoutInflater inflater;
    public custom(LayoutInflater inflater, int img){
        amb = img;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        switch (amb){
            case 0:
                return 8;
            case 1:
                return 8;
            case 2:
                return 9;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 4;
            case 7:
                return 4;
            case 8:
                return 3;
            case 9:
                return 2;
            case 10:
                return 4;
            case 11:
                return 10;
            case 12:
                return 2;
            case 13:
                return 3;
            case 14:
                return 7;
            case 15:
                return 2;
            case 16:
                return 2;
            case 17:
                return 2;
            case 18:
                return 2;
            case 19:
                return 3;
            case 20:
                return 3;
            case 21:
                return 4;
            case 22:
                return 4;
            case 23:
                return 3;
            case 24:
                return 3;
            case 25:
                return 1;
            case 26:
                return 2;
            case 27:
                return 7;
            case 28:
                return 1;
            case 29:
                return 2;
            default:
                return 0;
        }

    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = null;
        view = inflater.inflate(R.layout.viewpager, null);
        ImageView imageView = (ImageView)view.findViewById(R.id.img_viewpager);
        switch (amb){
            case 0:
                imageView.setImageResource(slide[0][position]);
                break;
            case 1:
                imageView.setImageResource(slide[1][position]);
                break;
            case 2:
                imageView.setImageResource(slide[2][position]);
                break;
            case 3:
                imageView.setImageResource(slide[3][position]);
                break;
            case 4:
                imageView.setImageResource(slide[4][position]);
                break;
            case 5:
                imageView.setImageResource(slide[5][position]);
                break;
            case 6:
                imageView.setImageResource(slide[6][position]);
                break;
            case 7:
                imageView.setImageResource(slide[7][position]);
                break;
            case 8:
                imageView.setImageResource(slide[8][position]);
                break;
            case 9:
                imageView.setImageResource(slide[9][position]);
                break;
            case 10:
                imageView.setImageResource(slide[10][position]);
                break;
            case 11:
                imageView.setImageResource(slide[11][position]);
                break;
            case 12:
                imageView.setImageResource(slide[12][position]);
                break;
            case 13:
                imageView.setImageResource(slide[13][position]);
                break;
            case 14:
                imageView.setImageResource(slide[14][position]);
                break;
            case 15:
                imageView.setImageResource(slide[15][position]);
                break;
            case 16:
                imageView.setImageResource(slide[16][position]);
                break;
            case 17:
                imageView.setImageResource(slide[17][position]);
                break;
            case 18:
                imageView.setImageResource(slide[18][position]);
                break;
            case 19:
                imageView.setImageResource(slide[19][position]);
                break;
            case 20:
                imageView.setImageResource(slide[20][position]);
                break;
            case 21:
                imageView.setImageResource(slide[21][position]);
                break;
            case 22:
                imageView.setImageResource(slide[22][position]);
                break;
            case 23:
                imageView.setImageResource(slide[23][position]);
                break;
            case 24:
                imageView.setImageResource(slide[24][position]);
                break;
            case 25:
                imageView.setImageResource(slide[25][position]);
                break;
            case 26:
                imageView.setImageResource(slide[26][position]);
                break;
            case 27:
                imageView.setImageResource(slide[27][position]);
                break;
            case 28:
                imageView.setImageResource(slide[28][position]);
                break;
            case 29:
                imageView.setImageResource(slide[29][position]);
                break;

        }

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View)object);

    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return  view == object;
    }
}

