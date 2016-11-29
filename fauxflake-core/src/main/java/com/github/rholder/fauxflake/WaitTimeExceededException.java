/*
 * Copyright 2012-2014 Ray Holder
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.rholder.fauxflake;

/**
 * This is thrown when we've waited beyond the specified wait time to generate
 * an identifier.
 */
public class WaitTimeExceededException extends RuntimeException {

    /**
     * Construct a new {@code WaitTimeExceededException}.
     *
     * @param message a more detailed description of what happened
     */
    public WaitTimeExceededException(String message) {
        super(message);
    }
}