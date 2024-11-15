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
public class AuthorizationForm extends SObject {
	public static SObjectType$<AuthorizationForm> SObjectType;
	public static SObjectFields$<AuthorizationForm> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DefaultAuthFormTextId;
	public AuthorizationFormText DefaultAuthFormText;
	public Date EffectiveFromDate;
	public Date EffectiveToDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSignatureRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String RevisionNumber;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AuthorizationFormText[] AuthorizationForms;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthorizationFormHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorizationFormShare[] Shares;

	public AuthorizationForm clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationForm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationForm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationForm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationForm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
