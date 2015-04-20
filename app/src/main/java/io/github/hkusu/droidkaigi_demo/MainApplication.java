package io.github.hkusu.droidkaigi_demo;

import android.app.Application;

import io.github.hkusu.droidkaigi_demo.common.FragmentList;
import io.github.hkusu.droidkaigi_demo.common.FragmentManager;
import io.github.hkusu.droidkaigi_demo.common.ModelList;
import io.github.hkusu.droidkaigi_demo.common.ModelManager;
import io.github.hkusu.droidkaigi_demo.common.ObjectManager;
import io.github.hkusu.droidkaigi_demo.fragment.ListFragment;
import io.github.hkusu.droidkaigi_demo.model.QiitaItemModel;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // ModelManager に各モデルの参照を登録
        ModelManager.register(ModelList.QIITA_ITEM, new QiitaItemModel());

        // FragmentManager に各Fragmentのクラス名を登録(ここではインスタンス化しない)
        FragmentManager.register(FragmentList.LIST, ListFragment.class);

        // ObjectManager を利用すると、任意のインスタンスの参照を保持できる。どこからでも利用可
        //ObjectManager.register("hoge", "あああ");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}