/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class UserRecordAccess extends SObject {
	public static SObjectType$<UserRecordAccess> SObjectType;
	public static SObjectFields$<UserRecordAccess> Fields;

	public Boolean HasAllAccess;
	public Boolean HasDeleteAccess;
	public Boolean HasEditAccess;
	public Boolean HasReadAccess;
	public Boolean HasTransferAccess;
	public Id Id;
	public String MaxAccessLevel;
	public String RecordId;
	public Id UserId;
	public User User;

	public UserRecordAccess clone$() {throw new UnsupportedOperationException();}
	public UserRecordAccess clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public UserRecordAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public UserRecordAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public UserRecordAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
