/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WebCartCredit extends SObject {
	public static SObjectType$<WebCartCredit> SObjectType;
	public static SObjectFields$<WebCartCredit> Fields;

	public Decimal AppliedAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CreditReference;
	public String CreditType;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Integer LastFour;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime SystemModstamp;
	public Id WebCartId;
	public WebCart WebCart;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public WebCartCredit clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartCredit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartCredit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartCredit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartCredit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
