package com.example.twatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.browser.customtabs.CustomTabsIntent
import androidx.browser.customtabs.TrustedWebUtils
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.button).setOnClickListener {
            val customTabsIntent = CustomTabsIntent.Builder().build()
            customTabsIntent.intent.putExtra(
                TrustedWebUtils.EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY,
                true
            )
            customTabsIntent.intent.data = "https://www.google.com".toUri()
            startActivity(customTabsIntent.intent)
        }
    }
}