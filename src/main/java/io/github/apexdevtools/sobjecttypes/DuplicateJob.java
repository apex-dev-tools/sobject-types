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
public class DuplicateJob extends SObject {
	public static SObjectType$<DuplicateJob> SObjectType;
	public static SObjectFields$<DuplicateJob> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DuplicateJobDefinitionId;
	public DuplicateJobDefinition DuplicateJobDefinition;
	public String DuplicateJobStatus;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Integer NumDuplicateRecordItems;
	public Integer NumDuplicateRecordSets;
	public Integer NumRecordsScanned;
	public Id ResultListViewId;
	public ListView ResultListView;
	public Datetime StartDateTime;
	public Datetime SystemModstamp;

	public DuplicateRecordSet[] AllDuplicateRecordSets;
	public DuplicateJobMatchingRule[] DuplicateJobMatchingRules;

	public DuplicateJob clone$() {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJob clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJob clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
