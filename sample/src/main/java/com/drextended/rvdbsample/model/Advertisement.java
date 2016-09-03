/*
 *  Copyright Roman Donchenko. All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.drextended.rvdbsample.model;

/**
 * Advertisement model. For getting unique images used loremflickr.com
 */
public class Advertisement implements BaseModel {
    public long id;
    public String label;
    public String image;

    public Advertisement(final String label) {
        this.label = label;
        this.id = label.hashCode();
        this.image = "http://loremflickr.com/300/100/sport?random=" + this.id;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return label;
    }
}
