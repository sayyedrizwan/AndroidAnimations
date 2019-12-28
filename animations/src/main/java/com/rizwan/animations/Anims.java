package com.rizwan.animations;

/*
Copyright 202 Rizwan Sayyed(Rizwan Sayyed)
 */

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;


public class Anims {

    private static boolean visible;
    private static boolean gone;

    public static View leftApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.left_anim));

        return null;
    }


    public static View popup(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_anim));

        return null;
    }

    public static View rightApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.right_anim));

        return null;
    }


    public static View bottomApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.bottom_anim));

        return null;
    }


    public static View topApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.top_anim));

        return null;
    }

    public static View lefttopApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.lefttop_anim));

        return null;
    }

    public static View rightbottomApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.rightbottom_anim));

        return null;
    }

    public static View leftbottomApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.leftbottom_anim));

        return null;
    }

    public static View righttopApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.righttop_anim));

        return null;
    }

    public static View fadeApperance(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.popup_anim));


        return null;
    }

    public static View floatUp(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.floatup_anim));


        return null;
    }

    public static View floatLeft(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.floatleft_anim));


        return null;
    }

    public static View floatRight(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.floatright_anim));


        return null;
    }


    public static View floatBottom(Context context, View file){

        file.setAnimation(AnimationUtils.loadAnimation(context, R.anim.floatbottom_anim));


        return null;
    }


}
