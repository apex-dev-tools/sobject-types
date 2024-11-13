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
public class ProcedurePlanSection extends SObject {
	public static SObjectType$<ProcedurePlanSection> SObjectType;
	public static SObjectFields$<ProcedurePlanSection> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsInherited;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ProcedurePlanVersionId;
	public ProcedurePlanDefinitionVersion ProcedurePlanVersion;
	public String ResolutionType;
	public String SectionType;
	public Integer Sequence;
	public String SubSectionType;
	public Datetime SystemModstamp;

	public ProcedurePlanOption[] ProcedurePlanSectionCanonicalMappings;

	public ProcedurePlanSection clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanSection clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanSection clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanSection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanSection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
