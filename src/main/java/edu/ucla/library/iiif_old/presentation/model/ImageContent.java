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
 * Recommended URI Pattern: {scheme}://{host}/{prefix}/{identifier}/annotation/{name}
 *
 * @author Ralf Eichinger
 */
public class ImageContent extends Content {

    private String myLabel; // optional

    /**
     * Creates a new image content with the supplied ID.
     *
     * @param aID An ID for the image content
     */
    public ImageContent(final String aID) {
        super(aID);
        myType = "oa:Annotation"; // required
    }

    /**
     * Gets the image content label.
     *
     * @return The image content label
     */
    public String getLabel() {
        return myLabel;
    }

    /**
     * Sets the image content label.
     *
     * @param aLabel A content resource may have a label, and if there is a choice of content resource for the same
     *        canvas, then they must have labels. The label should be a brief description of the resource, such as
     *        “black and white” versus “color photograph”.
     */
    public void setLabel(final String aLabel) {
        myLabel = aLabel;
    }

}
