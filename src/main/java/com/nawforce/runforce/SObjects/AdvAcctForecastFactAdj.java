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
public class AdvAcctForecastFactAdj extends SObject {
	public static SObjectType$<AdvAcctForecastFactAdj> SObjectType;
	public static SObjectFields$<AdvAcctForecastFactAdj> Fields;

	public Id AdjustedById;
	public User AdjustedBy;
	public Id AdvAcctForecastFactId;
	public Name AdvAcctForecastFact;
	public String Comment;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Decimal InitialValue;
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
	public Decimal UpdatedValue;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AdvAcctForecastFactAdjShare[] Shares;

	public AdvAcctForecastFactAdj clone$() {throw new java.lang.UnsupportedOperationException();}
	public AdvAcctForecastFactAdj clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AdvAcctForecastFactAdj clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AdvAcctForecastFactAdj clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AdvAcctForecastFactAdj clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
