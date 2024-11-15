/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContentDistribution extends SObject {
	public static SObjectType$<ContentDistribution> SObjectType;
	public static SObjectFields$<ContentDistribution> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public String ContentDownloadUrl;
	public Id ContentVersionId;
	public ContentVersion ContentVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DistributionPublicUrl;
	public Datetime ExpiryDate;
	public Datetime FirstViewDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastViewDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Password;
	public String PdfDownloadUrl;
	public Boolean PreferencesAllowOriginalDownload;
	public Boolean PreferencesAllowPDFDownload;
	public Boolean PreferencesAllowViewInBrowser;
	public Boolean PreferencesExpires;
	public Boolean PreferencesLinkLatestVersion;
	public Boolean PreferencesNotifyOnVisit;
	public Boolean PreferencesNotifyRndtnComplete;
	public Boolean PreferencesPasswordRequired;
	public Id RelatedRecordId;
	public Name RelatedRecord;
	public Datetime SystemModstamp;
	public Integer ViewCount;

	public ContentDistributionView[] ContentDistributionViews;

	public ContentDistribution clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDistribution clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistribution clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistribution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDistribution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
