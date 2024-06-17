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
public class FinancialPlan extends SObject {
	public static SObjectType$<FinancialPlan> SObjectType;
	public static SObjectFields$<FinancialPlan> Fields;

	public Id AccountId;
	public Account Account;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal EstimatedSuccessPercent;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String SourceSystemIdentifier;
	public Date StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public FinancialGoal[] FinancialGoals;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FinancialPlanHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FinancialPlanShare[] Shares;

	public FinancialPlan clone$() {throw new java.lang.UnsupportedOperationException();}
	public FinancialPlan clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FinancialPlan clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FinancialPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FinancialPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
