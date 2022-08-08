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
public class ContentDistribution extends SObject {
	public static SObjectType$<ContentDistribution> SObjectType;
	public static SObjectFields$<ContentDistribution> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public com.nawforce.runforce.System.String ContentDownloadUrl;
	public Id ContentVersionId;
	public ContentVersion ContentVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DistributionPublicUrl;
	public Datetime ExpiryDate;
	public Datetime FirstViewDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastViewDate;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String Password;
	public com.nawforce.runforce.System.String PdfDownloadUrl;
	public com.nawforce.runforce.System.Boolean PreferencesAllowOriginalDownload;
	public com.nawforce.runforce.System.Boolean PreferencesAllowPDFDownload;
	public com.nawforce.runforce.System.Boolean PreferencesAllowViewInBrowser;
	public com.nawforce.runforce.System.Boolean PreferencesExpires;
	public com.nawforce.runforce.System.Boolean PreferencesLinkLatestVersion;
	public com.nawforce.runforce.System.Boolean PreferencesNotifyOnVisit;
	public com.nawforce.runforce.System.Boolean PreferencesNotifyRndtnComplete;
	public com.nawforce.runforce.System.Boolean PreferencesPasswordRequired;
	public Id RelatedRecordId;
	public Name RelatedRecord;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.Integer ViewCount;

	public ContentDistributionView[] ContentDistributionViews;

	public ContentDistribution clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDistribution clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistribution clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistribution clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistribution clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
