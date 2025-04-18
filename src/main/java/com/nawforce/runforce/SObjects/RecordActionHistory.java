/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class RecordActionHistory extends SObject {
	public static SObjectType$<RecordActionHistory> SObjectType;
	public static SObjectFields$<RecordActionHistory> Fields;

	public String ActionDefinitionApiName;
	public String ActionDefinitionLabel;
	public String ActionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsMandatory;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LoggedTime;
	public Id ParentRecordId;
	public SObject ParentRecord;
	public String Pinned;
	public String RecordActionId;
	public String State;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public RecordActionHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordActionHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordActionHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordActionHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordActionHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
