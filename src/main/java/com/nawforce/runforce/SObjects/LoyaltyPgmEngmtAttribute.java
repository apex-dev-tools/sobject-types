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
public class LoyaltyPgmEngmtAttribute extends SObject {
	public static SObjectType$<LoyaltyPgmEngmtAttribute> SObjectType;
	public static SObjectFields$<LoyaltyPgmEngmtAttribute> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultValue;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Integer MaximumResetCountPerPeriod;
	public String Name;
	public String ResetValueOn;
	public Boolean ShouldOverwriteAttrCurrVal;
	public Date StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public String TargetValue;
	public String ValueResetFrequency;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyPgmEngmtAttributeHistory[] Histories;
	public LoyaltyPgmMbrAttributeVal[] LoyaltyPgmEngagementAttributes;
	public LoyaltyPgmEngmtAttrProm[] LoyaltyPgmEngmtAttributes;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyPgmEngmtAttribute clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttribute clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttribute clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmEngmtAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
