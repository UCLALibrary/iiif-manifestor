/*
 * Copyright 2015 Ralf Eichinger
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

package edu.ucla.library.iiif_old.presentation.model;

/**
 * Recommended URI pattern: {scheme}://{host}/{prefix}/{identifier}/list/{name}
 *
 * @author Ralf Eichinger
 */
public class OtherContent extends Content {

    private String label; // optional

    /**
     * Creates IIIF other content.
     *
     * @param id The other content ID
     */
    public OtherContent(final String id) {
        super(id);
        myType = "oa:Annotation";
    }

    /**
     * Gets the IIIF other content label.
     *
     * @return The other content label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the IIIF other content label
     *
     * @param label The other content label
     */
    public void setLabel(final String label) {
        this.label = label;
    }

}
