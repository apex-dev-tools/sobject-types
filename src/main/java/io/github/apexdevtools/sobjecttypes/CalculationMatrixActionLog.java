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
public class CalculationMatrixActionLog extends SObject {
	public static SObjectType$<CalculationMatrixActionLog> SObjectType;
	public static SObjectFields$<CalculationMatrixActionLog> Fields;

	public String ActionType;
	public Id CalculationMatrixId;
	public CalculationMatrix CalculationMatrix;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DurationInMilliseconds;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastSyncDate;
	public String Name;
	public Integer RecordsProcessed;
	public String RelatedFileIdentifier;
	public String Status;
	public String StatusMessage;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public CalculationMatrixActionLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixActionLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixActionLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixActionLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixActionLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
