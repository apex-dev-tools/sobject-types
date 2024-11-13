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
public class ContractLineOutcomeData extends SObject {
	public static SObjectType$<ContractLineOutcomeData> SObjectType;
	public static SObjectFields$<ContractLineOutcomeData> Fields;

	public Decimal CalculatedValue;
	public Datetime CaptureDate;
	public Id ContractLineOutcomeId;
	public ContractLineOutcome ContractLineOutcome;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public String KeyPerformanceIndicator;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;
	public Decimal Value;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TopicAssignment[] TopicAssignments;

	public ContractLineOutcomeData clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractLineOutcomeData clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineOutcomeData clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineOutcomeData clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractLineOutcomeData clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
