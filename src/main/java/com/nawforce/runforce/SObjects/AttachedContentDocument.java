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
public class AttachedContentDocument extends SObject {
	public static SObjectType$<AttachedContentDocument> SObjectType;
	public static SObjectFields$<AttachedContentDocument> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Integer ContentSize;
	public String ContentUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalDataSourceName;
	public String ExternalDataSourceType;
	public String FileExtension;
	public String FileType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LinkedEntityId;
	public SObject LinkedEntity;
	public String SharingOption;
	public String Title;

	public AttachedContentDocument clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttachedContentDocument clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttachedContentDocument clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttachedContentDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttachedContentDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
