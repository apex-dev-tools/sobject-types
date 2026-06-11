/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AssessmentIndDefinedValue extends SObject {
	public static SObjectType$<AssessmentIndDefinedValue> SObjectType;
	public static SObjectFields$<AssessmentIndDefinedValue> Fields;

	public Id AssessmentIndicatorDefinitionId;
	public AssessmentIndicatorDefinition AssessmentIndicatorDefinition;
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
	public String Name;
	public Integer SequenceNumber;
	public Datetime SystemModstamp;
	public String Value;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssessmentIndValue[] AssessmentIndDefinedValues;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AssessmentIndDefinedValueHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public AssessmentIndDefinedValue clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssessmentIndDefinedValue clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentIndDefinedValue clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentIndDefinedValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentIndDefinedValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
