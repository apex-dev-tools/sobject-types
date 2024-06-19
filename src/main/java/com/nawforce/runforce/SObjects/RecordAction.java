/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class RecordAction extends SObject {
	public static SObjectType$<RecordAction> SObjectType;
	public static SObjectFields$<RecordAction> Fields;

	public String ActionDefinition;
	public String ActionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FlowDefinition;
	public Id FlowInterviewId;
	public FlowInterview FlowInterview;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsMandatory;
	public Boolean IsUiRemoveHidden;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer Order;
	public Id ParticipantRoleId;
	public ParticipantRole ParticipantRole;
	public String Pinned;
	public Id RecordId;
	public SObject Record;
	public String Status;
	public Datetime SystemModstamp;

	public AssessmentTask[] TaskDefinitions;

	public RecordAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
