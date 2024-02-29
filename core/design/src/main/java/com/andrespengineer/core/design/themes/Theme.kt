package com.andrespengineer.core.design.themes

import android.os.Build
import android.os.Build.VERSION_CODES
import androidx.annotation.ChecksSdkIntAtLeast
import androidx.compose.runtime.Composable

@Composable
fun StreamTheme(
    darkTheme: Boolean = false,
    androidTheme: Boolean = false,
    disableDynamicTheming: Boolean = true,
    content: @Composable () -> Unit,
) {

}

@ChecksSdkIntAtLeast(api = VERSION_CODES.S)
fun supportsDynamicTheming() = Build.VERSION.SDK_INT >= VERSION_CODES.S