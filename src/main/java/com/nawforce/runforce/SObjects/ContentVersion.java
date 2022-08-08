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

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContentVersion extends SObject {
	public static SObjectType$<ContentVersion> SObjectType;
	public static SObjectFields$<ContentVersion> Fields;

	public com.nawforce.runforce.System.String Checksum;
	public Id ContentBodyId;
	public ContentBody ContentBody;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public com.nawforce.runforce.System.String ContentLocation;
	public Id ContentModifiedById;
	public User ContentModifiedBy;
	public Datetime ContentModifiedDate;
	public com.nawforce.runforce.System.Integer ContentSize;
	public com.nawforce.runforce.System.String ContentUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Id ExternalDataSourceId;
	public ExternalDataSource ExternalDataSource;
	public com.nawforce.runforce.System.String ExternalDocumentInfo1;
	public com.nawforce.runforce.System.String ExternalDocumentInfo2;
	public com.nawforce.runforce.System.Integer FeaturedContentBoost;
	public Date FeaturedContentDate;
	public com.nawforce.runforce.System.String FileExtension;
	public com.nawforce.runforce.System.String FileType;
	public Id FirstPublishLocationId;
	public Name FirstPublishLocation;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsAssetEnabled;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsLatest;
	public com.nawforce.runforce.System.Boolean IsMajorVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.Integer NegativeRatingCount;
	public com.nawforce.runforce.System.String Origin;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String PathOnClient;
	public com.nawforce.runforce.System.Integer PositiveRatingCount;
	public com.nawforce.runforce.System.String PublishStatus;
	public com.nawforce.runforce.System.Integer RatingCount;
	public com.nawforce.runforce.System.String ReasonForChange;
	public com.nawforce.runforce.System.String SharingOption;
	public com.nawforce.runforce.System.String SharingPrivacy;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TagCsv;
	public com.nawforce.runforce.System.String TextPreview;
	public com.nawforce.runforce.System.String Title;
	public Blob VersionData;
	public com.nawforce.runforce.System.String VersionNumber;

	public AuthorizationFormConsent[] AuthorizationFormConsents;
	public ContentVersionHistory[] Histories;

	public ContentVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentVersion clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersion clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
