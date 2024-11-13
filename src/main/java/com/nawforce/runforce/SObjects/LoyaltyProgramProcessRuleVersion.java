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
public class LoyaltyProgramProcessRuleVersion extends SObject {
	public static SObjectType$<LoyaltyProgramProcessRuleVersion> SObjectType;
	public static SObjectFields$<LoyaltyProgramProcessRuleVersion> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramProcessRuleId;
	public LoyaltyProgramProcessRule LoyaltyProgramProcessRule;
	public String Name;
	public Id NextProcessRuleId;
	public LoyaltyProgramProcessRuleVersion NextProcessRule;
	public Id PreviousProcessRuleId;
	public LoyaltyProgramProcessRuleVersion PreviousProcessRule;
	public Date StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public Integer VersionNumber;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyProgramProcessRuleVersion[] NextProcessRules;
	public LoyaltyProgramProcessRuleVersion[] PreviousProcessRules;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyProgramProcessRuleVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramProcessRuleVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramProcessRuleVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramProcessRuleVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramProcessRuleVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
