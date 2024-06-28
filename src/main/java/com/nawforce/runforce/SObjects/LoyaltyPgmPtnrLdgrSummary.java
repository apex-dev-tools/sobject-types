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
public class LoyaltyPgmPtnrLdgrSummary extends SObject {
	public static SObjectType$<LoyaltyPgmPtnrLdgrSummary> SObjectType;
	public static SObjectFields$<LoyaltyPgmPtnrLdgrSummary> Fields;

	public Date ActivityDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyPgmPtnrPrepaidPackId;
	public LoyaltyPgmPtnrPrepaidPack LoyaltyPgmPtnrPrepaidPack;
	public Id LoyaltyProgramPartnerId;
	public LoyaltyProgramPartner LoyaltyProgramPartner;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalPoints;
	public String Type;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyPgmPtnrLdgrSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmPtnrLdgrSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmPtnrLdgrSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmPtnrLdgrSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmPtnrLdgrSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
