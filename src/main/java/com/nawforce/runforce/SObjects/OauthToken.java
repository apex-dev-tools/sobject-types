/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OauthToken extends SObject {
	public static SObjectType$<OauthToken> SObjectType;
	public static SObjectFields$<OauthToken> Fields;

	public String AccessToken;
	public Id AppMenuItemId;
	public AppMenuItem AppMenuItem;
	public String AppName;
	public Datetime CreatedDate;
	public String DeleteToken;
	public Id Id;
	public Datetime LastUsedDate;
	public String RequestToken;
	public Integer UseCount;
	public Id UserId;
	public User User;

	public OauthToken clone$() {throw new java.lang.UnsupportedOperationException();}
	public OauthToken clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OauthToken clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OauthToken clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OauthToken clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
