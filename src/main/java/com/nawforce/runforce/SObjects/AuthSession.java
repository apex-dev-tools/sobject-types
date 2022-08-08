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
public class AuthSession extends SObject {
	public static SObjectType$<AuthSession> SObjectType;
	public static SObjectFields$<AuthSession> Fields;

	public Datetime CreatedDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsCurrent;
	public Datetime LastModifiedDate;
	public Id LoginGeoId;
	public LoginGeo LoginGeo;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public com.nawforce.runforce.System.String LoginType;
	public com.nawforce.runforce.System.String LogoutUrl;
	public com.nawforce.runforce.System.Integer NumSecondsValid;
	public Id ParentId;
	public AuthSession Parent;
	public com.nawforce.runforce.System.String SessionSecurityLevel;
	public com.nawforce.runforce.System.String SessionType;
	public com.nawforce.runforce.System.String SourceIp;
	public com.nawforce.runforce.System.String UserType;
	public Id UsersId;
	public User Users;

	public SessionPermSetActivation[] SessionPermSetActivations;

	public AuthSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthSession clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthSession clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthSession clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthSession clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
