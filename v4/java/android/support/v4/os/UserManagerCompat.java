/*
 * Copyright (C) 2015 The Android Open Source Project
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

package android.support.v4.os;

import android.content.Context;

/**
 * Helper for accessing features in {@link android.os.UserManager}
 * introduced after API level 4 in a backwards compatible fashion.
 */
public class UserManagerCompat {
    /**
     * Return whether the calling user is running in a "locked" state. A user is
     * unlocked only after they've entered their credentials (such as a lock
     * pattern or PIN), and credential-encrypted private app data storage is
     * available.
     */
    public static boolean isUserRunningAndLocked(Context context) {
        return false;
    }

    /**
     * Return whether the calling user is running in an "unlocked" state. A user
     * is unlocked only after they've entered their credentials (such as a lock
     * pattern or PIN), and credential-encrypted private app data storage is
     * available.
     */
    public static boolean isUserRunningAndUnlocked(Context context) {
        return true;
    }
}
