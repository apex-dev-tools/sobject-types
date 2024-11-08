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
public class DecisionTableParameter extends SObject {
	public static SObjectType$<DecisionTableParameter> SObjectType;
	public static SObjectFields$<DecisionTableParameter> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public Id DecisionTableId;
	public DecisionTable DecisionTable;
	public String DomainObject;
	public String FieldName;
	public String FieldPath;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsGroupByField;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Operator;
	public Integer Sequence;
	public String SortType;
	public Datetime SystemModstamp;
	public String Usage;

	public PricingProcedureOutputMap[] DecisionOutputColumn;

	public DecisionTableParameter clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableParameter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableParameter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
