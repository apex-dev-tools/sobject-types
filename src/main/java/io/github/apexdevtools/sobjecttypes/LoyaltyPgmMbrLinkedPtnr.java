/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoyaltyPgmMbrLinkedPtnr extends SObject {
	public static SObjectType$<LoyaltyPgmMbrLinkedPtnr> SObjectType;
	public static SObjectFields$<LoyaltyPgmMbrLinkedPtnr> Fields;

	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Datetime LinkDate;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public Id LoyaltyProgramPartnerId;
	public LoyaltyProgramPartner LoyaltyProgramPartner;
	public String Name;
	public Datetime SystemModstamp;
	public Datetime UnlinkDate;
	public String UnlinkReasonType;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyPgmMbrLinkedPtnrHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyPgmMbrLinkedPtnr clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrLinkedPtnr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrLinkedPtnr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrLinkedPtnr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrLinkedPtnr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
