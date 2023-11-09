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
public class DataUseLegalBasis extends SObject {
	public static SObjectType$<DataUseLegalBasis> SObjectType;
	public static SObjectFields$<DataUseLegalBasis> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Source;
	public Datetime SystemModstamp;

	public DataUsePurpose[] DataUsePurposes;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DataUseLegalBasisHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DataUseLegalBasisShare[] Shares;

	public DataUseLegalBasis clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataUseLegalBasis clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataUseLegalBasis clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataUseLegalBasis clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataUseLegalBasis clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
