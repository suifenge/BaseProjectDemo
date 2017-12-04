package com.suifeng.library.base.net;

import com.suifeng.library.base.log.LogUtil;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public abstract class BaseObserver<T> implements Observer<BaseEntity<T>> {

    protected BaseObserver() {
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(BaseEntity<T> value) {
        if (value.isSuccess()) {
            T t = value.getData();
            onHandleSuccess(t);
        } else {
            onHandleError(value.getMsg());
        }
    }

    @Override
    public void onError(Throwable e) {
        LogUtil.e("error:" + e.toString());
    }

    @Override
    public void onComplete() {
        LogUtil.e("onComplete");
    }

    protected abstract void onHandleSuccess(T t);

    protected abstract void onHandleError(String msg);
}
    /*
    use example
    private void login(String userId, String password) {
        Observable<BaseEntity<UserInfo>> observable = RetrofitFactory.getInstance().login(userId, password);
        observable.compose(RxSchedulers.compose(getProvider())).subscribe(new BaseObserver<UserInfo>(context) {
            @Override
            protected void onHandleSuccess(UserInfo userInfo) {
                // 保存用户信息等操作
            }
        });
    }
    */

