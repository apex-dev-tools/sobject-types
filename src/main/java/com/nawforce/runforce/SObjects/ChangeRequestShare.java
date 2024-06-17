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
public class ChangeRequestShare extends SObject {
	public static SObjectType$<ChangeRequestShare> SObjectType;
	public static SObjectFields$<ChangeRequestShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public ChangeRequest Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public ChangeRequestShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
