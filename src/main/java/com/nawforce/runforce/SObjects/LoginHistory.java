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
public class LoginHistory extends SObject {
	public static SObjectType$<LoginHistory> SObjectType;
	public static SObjectFields$<LoginHistory> Fields;

	public com.nawforce.runforce.System.String ApiType;
	public com.nawforce.runforce.System.String ApiVersion;
	public com.nawforce.runforce.System.String Application;
	public com.nawforce.runforce.System.String AuthMethodReference;
	public Id AuthenticationServiceId;
	public SObject AuthenticationService;
	public com.nawforce.runforce.System.String Browser;
	public com.nawforce.runforce.System.String CipherSuite;
	public com.nawforce.runforce.System.String ClientVersion;
	public com.nawforce.runforce.System.String CountryIso;
	public Id Id;
	public Id LoginGeoId;
	public LoginGeo LoginGeo;
	public Datetime LoginTime;
	public com.nawforce.runforce.System.String LoginType;
	public com.nawforce.runforce.System.String LoginUrl;
	public com.nawforce.runforce.System.Boolean OptionsIsGet;
	public com.nawforce.runforce.System.Boolean OptionsIsPost;
	public com.nawforce.runforce.System.String Platform;
	public com.nawforce.runforce.System.String SourceIp;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String TlsProtocol;
	public Id UserId;
	public User User;

	public LoginHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginHistory clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginHistory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginHistory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginHistory clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
