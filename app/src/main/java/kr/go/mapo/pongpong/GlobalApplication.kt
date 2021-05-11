package kr.go.mapo.pongpong

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "295ad097b79243146492a4fbeb166943")
    }
}