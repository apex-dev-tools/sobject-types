/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContentVersionRenditionContent extends SObject {
	public static SObjectType$<ContentVersionRenditionContent> SObjectType;
	public static SObjectFields$<ContentVersionRenditionContent> Fields;

	public String DownloadUrl;
	public String FileType;
	public Id Id;
	public Id ParentContentId;
	public SObject ParentContent;
	public String StdRenditionType;
	public Blob VersionData;

	public ContentVersionRenditionContent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRenditionContent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRenditionContent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRenditionContent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRenditionContent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
