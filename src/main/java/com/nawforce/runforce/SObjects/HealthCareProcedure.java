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
public class HealthCareProcedure extends SObject {
	public static SObjectType$<HealthCareProcedure> SObjectType;
	public static SObjectFields$<HealthCareProcedure> Fields;

	public String Category;
	public String Code;
	public String CodeDescription;
	public String CodeShortDescription;
	public String CodeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveDate;
	public Date EndDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CareInterventionType[] CareInterventionHealthCareProcedure;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public HealthCareProcedureHistory[] Histories;
	public CareRequestItem[] ModifiedProcedureItemCodes;
	public CareRequestItem[] ProcedureItemCodes;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public HealthCareProcedureShare[] Shares;

	public HealthCareProcedure clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthCareProcedure clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareProcedure clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareProcedure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareProcedure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
