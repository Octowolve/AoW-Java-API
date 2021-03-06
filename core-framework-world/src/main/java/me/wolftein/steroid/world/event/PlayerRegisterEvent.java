/*
 * This file is part of jAoW (On Steroids), licensed under the Apache 2.0 License.
 *
 * Copyright (c) 2014 Agustin Alvarez <wolftein1@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.wolftein.steroid.world.event;

import me.wolftein.steroid.framework.event.Event;

/**
 * Encapsulate an {@link Event} that define when receive the result of the registration.
 */
public final class PlayerRegisterEvent extends Event {
    private final boolean mValid;
    private final String mMessage;

    /**
     * Default constructor for {@link PlayerRegisterEvent}.
     */
    public PlayerRegisterEvent(boolean isValid, String message) {
        super(false);
        this.mValid = isValid;
        this.mMessage = message;
    }

    /**
     * Retrieves whenever the action was valid.
     *
     * @return True if the action is valid, false otherwise.
     */
    public boolean isValid() {
        return mValid;
    }

    /**
     * Retrieves the message of the action.
     *
     * @return The message of the action.
     */
    public String getMessage() {
        return mMessage;
    }
}