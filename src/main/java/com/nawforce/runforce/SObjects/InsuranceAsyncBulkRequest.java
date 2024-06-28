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
public class InsuranceAsyncBulkRequest extends SObject {
	public static SObjectType$<InsuranceAsyncBulkRequest> SObjectType;
	public static SObjectFields$<InsuranceAsyncBulkRequest> Fields;

	public Id AccountId;
	public Account Account;
	public String AdditionalInformation;
	public Integer CancelledJobCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer ErroredJobCount;
	public Integer FailedJobCount;
	public Id Id;
	public Boolean IsDeleted;
	public Integer JobCount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer PendingJobCount;
	public String Status;
	public Integer SuccessfulJobCount;
	public Datetime SystemModstamp;
	public String Type;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public InsuranceAsyncBulkRequestHistory[] Histories;
	public InsuranceAsyncBulkRequestItem[] InsuranceAsyncBulkRequestItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public InsuranceAsyncBulkRequestShare[] Shares;

	public InsuranceAsyncBulkRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
