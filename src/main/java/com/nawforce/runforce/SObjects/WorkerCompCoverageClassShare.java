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
public class WorkerCompCoverageClassShare extends SObject {
	public static SObjectType$<WorkerCompCoverageClassShare> SObjectType;
	public static SObjectFields$<WorkerCompCoverageClassShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public WorkerCompCoverageClass Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public WorkerCompCoverageClassShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkerCompCoverageClassShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkerCompCoverageClassShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkerCompCoverageClassShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkerCompCoverageClassShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
