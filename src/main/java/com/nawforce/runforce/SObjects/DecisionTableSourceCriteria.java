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
public class DecisionTableSourceCriteria extends SObject {
	public static SObjectType$<DecisionTableSourceCriteria> SObjectType;
	public static SObjectFields$<DecisionTableSourceCriteria> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DecisionTableId;
	public DecisionTable DecisionTable;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Operator;
	public Integer SequenceNumber;
	public String SourceFieldName;
	public Datetime SystemModstamp;
	public String Value;
	public String ValueType;

	public DecisionTableSourceCriteria clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableSourceCriteria clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableSourceCriteria clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableSourceCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableSourceCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
