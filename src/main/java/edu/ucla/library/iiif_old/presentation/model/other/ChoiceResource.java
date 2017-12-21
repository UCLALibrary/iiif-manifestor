package edu.ucla.library.iiif_old.presentation.model.other;

import java.util.ArrayList;
import java.util.List;

/*
 * An image resource for images with alternate resources, per IIIF Presentation 2.0
 */
public class ChoiceResource extends Resource {

	private Resource myDefault;
	private final List<Resource> myItem;

	public ChoiceResource() {
		setType("oa:Choice");
		myItem = new ArrayList<Resource>();
	}

	public Resource getDefault() {
		return myDefault;
	}

	public void setDefault(final Resource aDefault) {
		myDefault = aDefault;
	}

	public List<Resource> getItem() {
		return myItem;
	}

	public void addAltItem(final Resource aItem) {
		myItem.add(aItem);
	}
}