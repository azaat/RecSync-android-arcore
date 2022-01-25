/**
 * Copyright 2019 The Google Research Authors.
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

package com.googleresearch.recsyncar.softwaresync;

import android.os.SystemClock;

/** Simple implementation of Ticker interface using the SystemClock elapsed realtime clock. */
public class SystemTicker implements Ticker {
  @Override
  public long read() {
    return SystemClock.elapsedRealtimeNanos();
  }
}