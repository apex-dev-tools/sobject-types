/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContentHubItem extends SObject {
	public static SObjectType$<ContentHubItem> SObjectType;
	public static SObjectFields$<ContentHubItem> Fields;

	public Id ContentHubRepositoryId;
	public ContentHubRepository ContentHubRepository;
	public Datetime ContentModifiedDate;
	public io.github.apexdevtools.standardtypes.System.Integer ContentSize;
	public Datetime CreatedDate;
	public io.github.apexdevtools.standardtypes.System.String Description;
	public io.github.apexdevtools.standardtypes.System.String ExternalContentUrl;
	public io.github.apexdevtools.standardtypes.System.String ExternalDocumentUrl;
	public io.github.apexdevtools.standardtypes.System.String ExternalId;
	public io.github.apexdevtools.standardtypes.System.String FileExtension;
	public io.github.apexdevtools.standardtypes.System.String FileType;
	public Id Id;
	public io.github.apexdevtools.standardtypes.System.Boolean IsFolder;
	public Datetime LastModifiedDate;
	public io.github.apexdevtools.standardtypes.System.String MimeType;
	public io.github.apexdevtools.standardtypes.System.String Name;
	public io.github.apexdevtools.standardtypes.System.String Owner;
	public io.github.apexdevtools.standardtypes.System.String ParentId;
	public io.github.apexdevtools.standardtypes.System.String Title;
	public io.github.apexdevtools.standardtypes.System.String UpdatedBy;

	public ContentHubItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentHubItem clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentHubItem clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentHubItem clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentHubItem clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps, io.github.apexdevtools.standardtypes.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
