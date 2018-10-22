/*
 * Copyright (C) 2019 AOSP
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.squid.settings;

import android.os.Bundle;

import com.android.settings.R;
import com.android.settings.squid.CustomSettingsPreferenceFragment;

public class ButtonsSettings extends CustomSettingsPreferenceFragment {
    private static final String VOLUME_BUTTON_MUSIC_CONTROL = "volume_button_music_control";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.squid_settings_buttons);
        addCustomPreference(findPreference(VOLUME_BUTTON_MUSIC_CONTROL), SYSTEM_TWO_STATE, STATE_OFF);
    }
}
