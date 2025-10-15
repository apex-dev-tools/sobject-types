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
public class LoyaltyProgramMbrPromotion extends SObject {
	public static SObjectType$<LoyaltyProgramMbrPromotion> SObjectType;
	public static SObjectFields$<LoyaltyProgramMbrPromotion> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CumulativeUsageCompletePercent;
	public Integer CumulativeUsageCompleted;
	public Integer CumulativeUsageTarget;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsAutoEnrolled;
	public Boolean IsDeleted;
	public Boolean IsEnrollmentActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public String Name;
	public Id PromotionId;
	public Promotion Promotion;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public LoyaltyProgramMbrPromotionHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoyaltyProgramMbrPromotion clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMbrPromotion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMbrPromotion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMbrPromotion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMbrPromotion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
