/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DynamicDataCaptureChangeEvent extends SObject {
	public static SObjectType$<DynamicDataCaptureChangeEvent> SObjectType;
	public static SObjectFields$<DynamicDataCaptureChangeEvent> Fields;

	public String ActionDefinition;
	public String ActionType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer ExecutionOrder;
	public Id Id;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public String ParentRecordType;
	public Id PausedFlowInterviewId;
	public FlowInterview PausedFlowInterview;
	public String ProcessType;
	public String ReplayId;
	public String StatusCategory;

	public DynamicDataCaptureChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DynamicDataCaptureChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DynamicDataCaptureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DynamicDataCaptureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DynamicDataCaptureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
