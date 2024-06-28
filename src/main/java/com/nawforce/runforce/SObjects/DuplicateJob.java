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
