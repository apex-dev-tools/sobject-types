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
public class DigitalPassTmplParameter extends SObject {
	public static SObjectType$<DigitalPassTmplParameter> SObjectType;
	public static SObjectFields$<DigitalPassTmplParameter> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataType;
	public String DefaultValue;
	public Id DigitalPassTemplateId;
	public DigitalPassTemplate DigitalPassTemplate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DigitalPassTmplParameterHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public DigitalPassTmplParameter clone$() {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTmplParameter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTmplParameter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTmplParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassTmplParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
