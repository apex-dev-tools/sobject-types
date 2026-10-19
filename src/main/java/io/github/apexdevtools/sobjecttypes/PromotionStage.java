/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PromotionStage extends SObject {
	public static SObjectType$<PromotionStage> SObjectType;
	public static SObjectFields$<PromotionStage> Fields;

	public String ApiName;
	public String Configuration;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id PromotionId;
	public Promotion Promotion;
	public Id ReferredPartyJournalSubTypeId;
	public JournalSubType ReferredPartyJournalSubType;
	public Id ReferrerJournalSubTypeId;
	public JournalSubType ReferrerJournalSubType;
	public Integer SequenceNumber;
	public Datetime SystemModstamp;
	public String Type;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public LoyaltyProgramWidget[] PromotionStage;
	public PromotionStageEmailTemplate[] PromotionStages;

	public PromotionStage clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionStage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionStage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionStage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionStage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
