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
public class PromotionLineItemRule extends SObject {
	public static SObjectType$<PromotionLineItemRule> SObjectType;
	public static SObjectFields$<PromotionLineItemRule> Fields;

	public Id AssociatedReferenceId;
	public Name AssociatedReference;
	public String AssociatedType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OperatorType;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public String Type;
	public Id TypeReferenceId;
	public Name TypeReference;
	public String TypeValue;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PromotionLineItemRuleShare[] Shares;

	public PromotionLineItemRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionLineItemRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLineItemRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLineItemRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLineItemRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
