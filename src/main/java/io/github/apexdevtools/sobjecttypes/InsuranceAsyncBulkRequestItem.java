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
public class InsuranceAsyncBulkRequestItem extends SObject {
	public static SObjectType$<InsuranceAsyncBulkRequestItem> SObjectType;
	public static SObjectFields$<InsuranceAsyncBulkRequestItem> Fields;

	public String AdditionalInformation;
	public Id BatchJobId;
	public BatchJob BatchJob;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InsuranceAsyncBulkRequestId;
	public InsuranceAsyncBulkRequest InsuranceAsyncBulkRequest;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ReferenceRecordId;
	public Name ReferenceRecord;
	public Integer SequenceNumber;
	public String Status;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public InsuranceAsyncBulkRequestItemHistory[] Histories;
	public InsuranceAsyncBulkRecordDetail[] InsuranceAsyncBulkRecordDetails;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public InsuranceAsyncBulkRequestItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRequestItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRequestItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRequestItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRequestItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
