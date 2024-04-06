package com.example.cefr.utils

import android.content.SharedPreferences
import com.example.cefr.utils.BooleanPreference
import com.example.cefr.utils.StringPreference

class LocalStorage(preference: SharedPreferences) {

    var token by StringPreference(preference)

    var isLogin by BooleanPreference(preference, false)

}