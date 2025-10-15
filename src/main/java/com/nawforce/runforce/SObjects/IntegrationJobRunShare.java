/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class IntegrationJobRunShare extends SObject {
	public static SObjectType$<IntegrationJobRunShare> SObjectType;
	public static SObjectFields$<IntegrationJobRunShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public IntegrationJobRun Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public IntegrationJobRunShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public IntegrationJobRunShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationJobRunShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationJobRunShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationJobRunShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
