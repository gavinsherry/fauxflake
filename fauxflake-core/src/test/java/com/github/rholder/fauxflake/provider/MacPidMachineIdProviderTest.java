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

package com.github.rholder.fauxflake.provider;

import org.junit.Assert;
import org.junit.Test;

public class MacPidMachineIdProviderTest {

    @Test
    public void validateProvider() {
        Assert.assertEquals("Machine id's are not deterministic",
                new MacPidMachineIdProvider().getMachineId(),
                new MacPidMachineIdProvider().getMachineId());

        if(new MacPidMachineIdProvider().getMachineId() == 0L) {
            System.err.println("Could not detect MAC address");
        }
    }
}
