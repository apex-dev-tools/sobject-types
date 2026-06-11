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
public class DigitalPassTemplate extends SObject {
	public static SObjectType$<DigitalPassTemplate> SObjectType;
	public static SObjectFields$<DigitalPassTemplate> Fields;

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
	public Id OwnerId;
	public Name Owner;
	public String ServiceProvider;
	public String ServicePrvdTmplIdentifier;
	public String Status;
	public String StatusReason;
	public Datetime SystemModstamp;
	public String Type;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public DigitalPassTmplParameter[] DigitalPassTmplParameters;
	public DigitalPass[] DigitalPasses;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DigitalPassTemplateHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DigitalPassTemplateShare[] Shares;

	public DigitalPassTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
