/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
