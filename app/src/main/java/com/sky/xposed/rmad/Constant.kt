/*
 * Copyright (c) 2017 The sky Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sky.xposed.rmad

/**
 * Created by sky on 17-11-1.
 */
object Constant {

    object ByeAD {

        /** 网易新闻包名 */
        val PACKAGE_NAME = "com.sky.xposed.rmad"
    }

    object News {

        /** 网易新闻包名 */
        val PACKAGE_NAME = "com.netease.newsreader.activity"
    }

    object CloudMusic {

        /** 网易云音乐包名 */
        val PACKAGE_NAME = "com.netease.cloudmusic"
    }

    object MobiMail {

        /** 网易邮箱包名 */
        val PACKAGE_NAME = "com.netease.mobimail"
    }

    object Preference {

        /** 网易新闻所有广告开关 */
        val NEWS_ALL_AD = "news_all_ad"
    }

    object Action {

        val REFRESH_PREFERENCE = "com.sky.xposed.rmad.action.REFRESH_PREFERENCE"
    }

    object Key {

        val DATA = "data"
    }
}