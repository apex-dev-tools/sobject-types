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
public class ContentVersion extends SObject {
	public static SObjectType$<ContentVersion> SObjectType;
	public static SObjectFields$<ContentVersion> Fields;

	public String Checksum;
	public Id ContentBodyId;
	public ContentBody ContentBody;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public String ContentLocation;
	public Id ContentModifiedById;
	public User ContentModifiedBy;
	public Datetime ContentModifiedDate;
	public Integer ContentSize;
	public String ContentUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id ExternalDataSourceId;
	public ExternalDataSource ExternalDataSource;
	public String ExternalDocumentInfo1;
	public String ExternalDocumentInfo2;
	public Integer FeaturedContentBoost;
	public Date FeaturedContentDate;
	public String FileExtension;
	public String FileType;
	public Id FirstPublishLocationId;
	public Name FirstPublishLocation;
	public Id Id;
	public Boolean IsAssetEnabled;
	public Boolean IsDeleted;
	public Boolean IsLatest;
	public Boolean IsMajorVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer NegativeRatingCount;
	public Id NetworkId;
	public Network Network;
	public String Origin;
	public Id OwnerId;
	public User Owner;
	public String PathOnClient;
	public Integer PositiveRatingCount;
	public String PublishStatus;
	public Integer RatingCount;
	public String ReasonForChange;
	public String SharingOption;
	public String SharingPrivacy;
	public Datetime SystemModstamp;
	public String TagCsv;
	public String TextPreview;
	public String Title;
	public Blob VersionData;
	public String VersionDataUrl;
	public String VersionNumber;

	public NetworkActivityAudit[] AuditableEntities;
	public AuthorizationFormConsent[] AuthorizationFormConsents;
	public ContentVersionHistory[] Histories;

	public ContentVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
