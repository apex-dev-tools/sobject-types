/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContentDocumentChangeEvent extends SObject {
	public static SObjectType$<ContentDocumentChangeEvent> SObjectType;
	public static SObjectFields$<ContentDocumentChangeEvent> Fields;

	public Id ArchivedById;
	public User ArchivedBy;
	public Date ArchivedDate;
	public Object ChangeEventHeader;
	public Id ContentAssetId;
	public ContentAsset ContentAsset;
	public Datetime ContentModifiedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Division;
	public Id Id;
	public Boolean IsArchived;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LatestPublishedVersionId;
	public ContentVersion LatestPublishedVersion;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public ContentWorkspace Parent;
	public String PublishStatus;
	public String ReplayId;
	public String Title;

	public ContentDocumentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
