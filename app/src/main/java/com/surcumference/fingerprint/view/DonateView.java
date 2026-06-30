package com.surcumference.fingerprint.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.hjq.toast.Toaster;
import com.surcumference.fingerprint.Lang;
import com.surcumference.fingerprint.R;
import com.surcumference.fingerprint.adapter.PreferenceAdapter;
import com.surcumference.fingerprint.util.DpUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2017/9/9.
 */

public class DonateView extends DialogFrameLayout implements AdapterView.OnItemClickListener {

    private List<PreferenceAdapter.Data> mSettingsDataList = new ArrayList<>();
    private PreferenceAdapter mListAdapter;
    private ListView mListView;

    public DonateView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public DonateView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public DonateView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LinearLayout rootVerticalLayout = new LinearLayout(context);
        rootVerticalLayout.setOrientation(LinearLayout.VERTICAL);
        rootVerticalLayout.setGravity(Gravity.CENTER);

        int defVPadding = DpUtils.dip2px(context, 24);

        TextView textView = new TextView(context);
        textView.setText("已删除赞助");
        textView.setTextSize(18);
        textView.setTextColor(Color.BLACK);
        textView.setPadding(0, defVPadding, 0, defVPadding);

        rootVerticalLayout.addView(textView);

        this.addView(rootVerticalLayout);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
    }
}
