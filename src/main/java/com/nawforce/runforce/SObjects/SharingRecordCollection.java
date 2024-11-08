/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SharingRecordCollection extends SObject {
	public static SObjectType$<SharingRecordCollection> SObjectType;
	public static SObjectFields$<SharingRecordCollection> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id GroupId;
	public Group Group;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastAdded;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Integer NumberOfRecords;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SharingRecordCollectionShare[] Shares;
	public SharingRecordCollectionItem[] SharingRecordCollectionItems;

	public SharingRecordCollection clone$() {throw new java.lang.UnsupportedOperationException();}
	public SharingRecordCollection clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SharingRecordCollection clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SharingRecordCollection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SharingRecordCollection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}