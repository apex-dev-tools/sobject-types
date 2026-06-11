/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PromptAction extends SObject {
	public static SObjectType$<PromptAction> SObjectType;
	public static SObjectFields$<PromptAction> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastDisplayDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastResult;
	public Datetime LastResultDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PromptVersionId;
	public PromptVersion PromptVersion;
	public Datetime SnoozeUntil;
	public Integer StepCount;
	public Integer StepNumber;
	public Datetime SystemModstamp;
	public Integer TimesActionTaken;
	public Integer TimesDismissed;
	public Integer TimesDisplayed;
	public Integer TimesSnoozed;
	public Id UserId;
	public User User;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PromptActionShare[] Shares;

	public PromptAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
