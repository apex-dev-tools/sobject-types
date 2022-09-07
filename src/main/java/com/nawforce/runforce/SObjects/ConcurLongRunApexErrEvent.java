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
public class ConcurLongRunApexErrEvent extends SObject {
	public static SObjectType$<ConcurLongRunApexErrEvent> SObjectType;
	public static SObjectFields$<ConcurLongRunApexErrEvent> Fields;

	public Datetime CreatedDate;
	public com.nawforce.runforce.System.Integer CurrentValue;
	public Datetime EventDate;
	public com.nawforce.runforce.System.String EventIdentifier;
	public com.nawforce.runforce.System.String EventUuid;
	public com.nawforce.runforce.System.Integer LimitValue;
	public com.nawforce.runforce.System.String LoginKey;
	public com.nawforce.runforce.System.String Quiddity;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String RequestId;
	public com.nawforce.runforce.System.String RequestUri;
	public com.nawforce.runforce.System.String SessionKey;
	public com.nawforce.runforce.System.String SessionLevel;
	public com.nawforce.runforce.System.String SourceIp;
	public Id UserId;
	public User User;
	public com.nawforce.runforce.System.String Username;

	public ConcurLongRunApexErrEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConcurLongRunApexErrEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConcurLongRunApexErrEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConcurLongRunApexErrEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConcurLongRunApexErrEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}