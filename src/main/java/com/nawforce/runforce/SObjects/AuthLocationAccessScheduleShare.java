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
public class AuthLocationAccessScheduleShare extends SObject {
	public static SObjectType$<AuthLocationAccessScheduleShare> SObjectType;
	public static SObjectFields$<AuthLocationAccessScheduleShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public AuthLocationAccessSchedule Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public AuthLocationAccessScheduleShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthLocationAccessScheduleShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthLocationAccessScheduleShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthLocationAccessScheduleShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthLocationAccessScheduleShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
