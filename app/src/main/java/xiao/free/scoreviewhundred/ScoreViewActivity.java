package xiao.free.scoreviewhundred;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

/**
 * Created by robincxiao on 2018/7/3.
 */

public class ScoreViewActivity extends Activity {
    private ScoreViewHundred mScoreViewFull;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_view);

        mScoreViewFull = findViewById(R.id.scoreview);


        mScoreViewFull.setListener(new ScoreViewHundred.IAnimListener() {
            @Override
            public void onScrollStart() {
                Log.d("xiao1", "ScoreViewFull_onScrollStart");
            }

            @Override
            public void onScrollEnd() {
                Log.d("xiao1", "ScoreViewFull_onScrollEnd");
            }
        });
    }

    public void onStart1(View view){
        mScoreViewFull.start();
    }

    public void onReset(View view){
        mScoreViewFull.reset();
    }

    public void onFinishWithAnim1(View view){
        mScoreViewFull.setScore(100, true);
    }

    public void onFinishNoAnim1(View view){
        mScoreViewFull.setScore(56, false);
    }
}
