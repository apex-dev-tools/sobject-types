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
public class DataMaskPolicyJobRunDtl extends SObject {
	public static SObjectType$<DataMaskPolicyJobRunDtl> SObjectType;
	public static SObjectFields$<DataMaskPolicyJobRunDtl> Fields;

	public String AdditionalDetail;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataMaskPolicyJobRunId;
	public DataMaskPolicyJobRun DataMaskPolicyJobRun;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ObjectReference;
	public Id OwnerId;
	public Name Owner;
	public String Subtype;
	public Datetime SystemModstamp;
	public Datetime Timestamp;
	public String Type;
	public String Value;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DataMaskPolicyJobRunDtlShare[] Shares;

	public DataMaskPolicyJobRunDtl clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataMaskPolicyJobRunDtl clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataMaskPolicyJobRunDtl clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataMaskPolicyJobRunDtl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataMaskPolicyJobRunDtl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
