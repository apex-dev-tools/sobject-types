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
public class ContentVersionChangeEvent extends SObject {
	public static SObjectType$<ContentVersionChangeEvent> SObjectType;
	public static SObjectFields$<ContentVersionChangeEvent> Fields;

	public Object ChangeEventHeader;
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
	public String FileType;
	public Id FirstPublishLocationId;
	public SObject FirstPublishLocation;
	public Id Id;
	public Boolean IsLatest;
	public Boolean IsMajorVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer NegativeRatingCount;
	public String Origin;
	public Id OwnerId;
	public User Owner;
	public String PathOnClient;
	public Integer PositiveRatingCount;
	public String PublishStatus;
	public Integer RatingCount;
	public String ReasonForChange;
	public String ReplayId;
	public String SharingOption;
	public String SharingPrivacy;
	public String TextPreview;
	public String Title;
	public String VersionNumber;

	public ContentVersionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
