package com.weike.education.mvp.presenter.mine;

import java.lang.System;

/**
 * * @author: ym  作者 E-mail: 15622113269@163.com
 * * date: 2018/11/12
 * * desc: 我的-MinePresenter
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/weike/education/mvp/presenter/mine/MinePresenter;", "Lcom/weike/education/base/RxPresenter;", "Lcom/weike/education/mvp/contract/mine/MineContract$View;", "Lcom/weike/education/mvp/contract/mine/MineContract$Presenter;", "mRetrofitHelper", "Lcom/weike/education/network/helper/RetrofitHelper;", "(Lcom/weike/education/network/helper/RetrofitHelper;)V", "getMine", "", "app_debug"})
public final class MinePresenter extends com.weike.education.base.RxPresenter<com.weike.education.mvp.contract.mine.MineContract.View> implements com.weike.education.mvp.contract.mine.MineContract.Presenter<com.weike.education.mvp.contract.mine.MineContract.View> {
    private final com.weike.education.network.helper.RetrofitHelper mRetrofitHelper = null;
    
    @java.lang.Override()
    public void getMine() {
    }
    
    @javax.inject.Inject()
    public MinePresenter(@org.jetbrains.annotations.NotNull()
    com.weike.education.network.helper.RetrofitHelper mRetrofitHelper) {
        super();
    }
}