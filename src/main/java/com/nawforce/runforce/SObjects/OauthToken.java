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
public class OauthToken extends SObject {
	public static SObjectType$<OauthToken> SObjectType;
	public static SObjectFields$<OauthToken> Fields;

	public com.nawforce.runforce.System.String AccessToken;
	public Id AppMenuItemId;
	public AppMenuItem AppMenuItem;
	public com.nawforce.runforce.System.String AppName;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DeleteToken;
	public Id Id;
	public Datetime LastUsedDate;
	public com.nawforce.runforce.System.String RequestToken;
	public com.nawforce.runforce.System.Integer UseCount;
	public Id UserId;
	public User User;

	public OauthToken clone$() {throw new java.lang.UnsupportedOperationException();}
	public OauthToken clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OauthToken clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OauthToken clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OauthToken clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
