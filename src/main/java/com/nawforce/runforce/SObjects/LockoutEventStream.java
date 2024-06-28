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
public class LockoutEventStream extends SObject {
	public static SObjectType$<LockoutEventStream> SObjectType;
	public static SObjectFields$<LockoutEventStream> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Integer FailedLogins;
	public Datetime LockoutDate;
	public String LoginKey;
	public String ReplayId;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String Username;

	public LockoutEventStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public LockoutEventStream clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LockoutEventStream clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LockoutEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LockoutEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
