/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ProcedurePlanVariable extends SObject {
	public static SObjectType$<ProcedurePlanVariable> SObjectType;
	public static SObjectFields$<ProcedurePlanVariable> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String DefaultValue;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ProcedurePlanVersionId;
	public ProcedurePlanDefinitionVersion ProcedurePlanVersion;
	public Datetime SystemModstamp;

	public ProcedurePlanVariable clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanVariable clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanVariable clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanVariable clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanVariable clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
