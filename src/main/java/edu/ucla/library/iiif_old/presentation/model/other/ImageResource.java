/*
 * Copyright 2015 Ralf Eichinger.
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

package edu.ucla.library.iiif_old.presentation.model.other;

/**
 *
 * @author Ralf Eichinger
 */
public class ImageResource extends Resource {

    private int myHeight;

    private int myWidth;
    
	private String myLabel;
    
    private String myThumbnail;
    
    /**
     * Creates new image resource.
     */
    public ImageResource() {
        myType = "dctypes:Image";
    }

    /**
     * Creates new image resource with ID.
     *
     * @param aID An image resource ID
     */
    public ImageResource(final String aID) {
        this();
        myID = aID;
    }

    /**
     * Gets the height of the image resource.
     *
     * @return The height of the image resource
     */
    public int getHeight() {
        return myHeight;
    }

    /**
     * Sets the height of the image resource.
     *
     * @param aHeight An image resource height
     */
    public void setHeight(final int aHeight) {
        myHeight = aHeight;
    }

    /**
     * Gets the width of the image resource.
     *
     * @return The width of the image resource
     */
    public int getWidth() {
        return myWidth;
    }

    /**
     * Sets the width of the image resource.
     *
     * @param aWidth The width of the image resource
     */
    public void setWidth(final int aWidth) {
        myWidth = aWidth;
    }
    
	public String getLabel() {
		return myLabel;
	}
	
	public void setLabel(final String aLabel) {
		myLabel = aLabel;
	}
    
    public String getThumbnail() {
        return myThumbnail;
    }

    public void setThumbnail(final String aThumbnail) {
        myThumbnail = aThumbnail;
    }
}
