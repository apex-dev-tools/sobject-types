/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SetupDataSynchronization extends SObject {
	public static SObjectType$<SetupDataSynchronization> SObjectType;
	public static SObjectFields$<SetupDataSynchronization> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastSynchronizationDateTime;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RecordIdentifierId;
	public ProductCatalog RecordIdentifier;
	public String SynchronizationStatus;
	public Datetime SystemModstamp;
	public String TargetRecordType;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SetupDataSynchronizationShare[] Shares;

	public SetupDataSynchronization clone$() {throw new java.lang.UnsupportedOperationException();}
	public SetupDataSynchronization clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SetupDataSynchronization clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SetupDataSynchronization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SetupDataSynchronization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
