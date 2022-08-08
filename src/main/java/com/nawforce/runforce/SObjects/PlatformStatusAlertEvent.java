/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PlatformStatusAlertEvent extends SObject {
	public static SObjectType$<PlatformStatusAlertEvent> SObjectType;
	public static SObjectFields$<PlatformStatusAlertEvent> Fields;

	public com.nawforce.runforce.System.String ApiErrorCode;
	public com.nawforce.runforce.System.String ComponentName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventDate;
	public com.nawforce.runforce.System.String EventIdentifier;
	public com.nawforce.runforce.System.String EventUuid;
	public com.nawforce.runforce.System.String ExtendedErrorCode;
	public com.nawforce.runforce.System.String RelatedEventIdentifier;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String RequestId;
	public com.nawforce.runforce.System.String ServiceJobId;
	public com.nawforce.runforce.System.String ServiceName;
	public com.nawforce.runforce.System.String StatusType;
	public com.nawforce.runforce.System.String SubComponentName;
	public com.nawforce.runforce.System.String Subject;
	public Id UserId;
	public User User;
	public com.nawforce.runforce.System.String Username;

	public PlatformStatusAlertEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlatformStatusAlertEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlatformStatusAlertEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlatformStatusAlertEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlatformStatusAlertEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
