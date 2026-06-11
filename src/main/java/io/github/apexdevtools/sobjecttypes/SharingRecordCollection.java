/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
